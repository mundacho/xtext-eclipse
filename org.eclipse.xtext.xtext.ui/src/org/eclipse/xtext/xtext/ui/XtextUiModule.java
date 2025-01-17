/*******************************************************************************
 * Copyright (c) 2009, 2020 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.xtext.ui;

import org.eclipse.jface.text.source.DefaultCharacterPairMatcher;
import org.eclipse.jface.text.source.ICharacterPairMatcher;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.xtext.builder.builderState.IBuilderState;
import org.eclipse.xtext.builder.clustering.CurrentDescriptions;
import org.eclipse.xtext.builder.impl.PersistentDataAwareDirtyResource;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.containers.StateBasedContainerManager;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.ui.editor.DocumentBasedDirtyResource;
import org.eclipse.xtext.ui.editor.IXtextEditorCallback;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.actions.IActionContributor;
import org.eclipse.xtext.ui.editor.autoedit.AbstractEditStrategyProvider;
import org.eclipse.xtext.ui.editor.contentassist.XtextContentAssistProcessor;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionProvider;
import org.eclipse.xtext.ui.editor.formatting2.ContentFormatterFactory;
import org.eclipse.xtext.ui.editor.formatting.IContentFormatterFactory;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkHelper;
import org.eclipse.xtext.ui.editor.outline.IOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.actions.IOutlineContribution;
import org.eclipse.xtext.ui.editor.outline.impl.IOutlineTreeStructureProvider;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineFilterAndSorter.IComparator;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineNodeLabelProvider;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ShowWhitespaceCharactersActionContributor;
import org.eclipse.xtext.ui.refactoring.IDependentElementsCalculator;
import org.eclipse.xtext.ui.refactoring.IRenameStrategy;
import org.eclipse.xtext.ui.refactoring.ui.IRenameContextFactory;
import org.eclipse.xtext.ui.validation.AbstractValidatorConfigurationBlock;
import org.eclipse.xtext.ui.wizard.IProjectCreator;
import org.eclipse.xtext.xtext.ui.editor.autoedit.XtextAutoEditStrategy;
import org.eclipse.xtext.xtext.ui.editor.folding.XtextGrammarFoldingRegionProvider;
import org.eclipse.xtext.xtext.ui.editor.outline.FilterTerminalRulesContribution;
import org.eclipse.xtext.xtext.ui.editor.outline.HideReturnTypesContribution;
import org.eclipse.xtext.xtext.ui.editor.outline.XtextOutlineNodeComparator;
import org.eclipse.xtext.xtext.ui.editor.outline.XtextOutlineNodeLabelProvider;
import org.eclipse.xtext.xtext.ui.editor.outline.XtextOutlinePage;
import org.eclipse.xtext.xtext.ui.editor.outline.XtextOutlineTreeProvider;
import org.eclipse.xtext.xtext.ui.editor.quickfix.XtextGrammarQuickfixProvider;
import org.eclipse.xtext.xtext.ui.editor.syntaxcoloring.SemanticHighlightingCalculator;
import org.eclipse.xtext.xtext.ui.editor.syntaxcoloring.SemanticHighlightingConfiguration;
import org.eclipse.xtext.xtext.ui.editor.validation.XtextValidatorConfigurationBlock;
import org.eclipse.xtext.xtext.ui.refactoring.XtextDependentElementsCalculator;
import org.eclipse.xtext.xtext.ui.refactoring.XtextRenameContextFactory;
import org.eclipse.xtext.xtext.ui.refactoring.XtextRenameStrategyProvider;
import org.eclipse.xtext.xtext.ui.wizard.project.XtextProjectCreator;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used within the IDE.
 */
@SuppressWarnings("restriction")
public class XtextUiModule extends AbstractXtextUiModule {
	public XtextUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(String.class)
				.annotatedWith(Names.named(XtextContentAssistProcessor.COMPLETION_AUTO_ACTIVATION_CHARS))
				.toInstance("[{");
	}

	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return SemanticHighlightingCalculator.class;
	}

	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return SemanticHighlightingConfiguration.class;
	}

	public Class<? extends IProjectCreator> bindIProjectCreator() {
		return XtextProjectCreator.class;
	}
	
	@Override
	public ICharacterPairMatcher bindICharacterPairMatcher() {
		return new DefaultCharacterPairMatcher(new char[] { ':', ';', '{', '}', '(', ')', '[', ']' });
	}

	@Override
	public Class<? extends AbstractEditStrategyProvider> bindAbstractEditStrategyProvider() {
		return XtextAutoEditStrategy.class;
	}

	public Class<? extends IFoldingRegionProvider> bindIFoldingRegionProvider() {
		return XtextGrammarFoldingRegionProvider.class;
	}
	
	@Override
	public Class<? extends IContentOutlinePage> bindIContentOutlinePage() {
		return XtextOutlinePage.class;
	}

	public Class<? extends IOutlineTreeProvider> bindIOutlineTreeProvider() {
		return XtextOutlineTreeProvider.class;
	}

	public Class<? extends IOutlineTreeStructureProvider> bindIOutlineTreeStructureProvider() {
		return XtextOutlineTreeProvider.class;
	}
	
	@Override
	public Class<? extends IComparator> bindOutlineFilterAndSorter$IComparator() {
		return XtextOutlineNodeComparator.class;
	}
	
	public Class<? extends OutlineNodeLabelProvider> bindOutlineNodeLabelProvider() {
		return XtextOutlineNodeLabelProvider.class;
	}
	
	public void configureFilterReturnTypesContribution(Binder binder) {
		binder.bind(IOutlineContribution.class)
				.annotatedWith(HideReturnTypesContribution.Annotation.class)
				.to(HideReturnTypesContribution.class);
	}

	public void configureFilterTerminalRulesContribution(Binder binder) {
		binder.bind(IOutlineContribution.class)
				.annotatedWith(FilterTerminalRulesContribution.Annotation.class)
				.to(FilterTerminalRulesContribution.class);
	}

	@SuppressWarnings("deprecation")
	public void configureIXtext2EcorePostProcessor(Binder binder) {
		try {
			Class.forName("org.eclipse.xtend.expression.ExecutionContext");
			binder.bind(org.eclipse.xtext.xtext.ecoreInference.IXtext2EcorePostProcessor.class)
				.to(org.eclipse.xtext.xtext.ecoreInference.ProjectAwareXtendXtext2EcorePostProcessor.class);
		} catch (ClassNotFoundException e) {
		}
	}

	public Class<? extends IXtextEditorCallback> bindIXtextEditorCallback() {
		return org.eclipse.xtext.builder.nature.NatureAddingEditorCallback.class;
	}

	@Override
	public Class<? extends org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider> bindIssueResolutionProvider() {
		return XtextGrammarQuickfixProvider.class;
	}

	public Class<? extends IHyperlinkHelper> bindIHyperlinkHelper() {
		return XtextHyperlinkHelper.class;
	}
	
	public Class<? extends IDependentElementsCalculator> bindIDependentElementsCalculator() {
		return XtextDependentElementsCalculator.class;
	}

	public Class<? extends IRenameStrategy.Provider> bindIRenameStrategy$Provider() {
		return XtextRenameStrategyProvider.class;
	}

	public Class<? extends IRenameContextFactory> bindIRenameContextFactory() {
		return XtextRenameContextFactory.class;
	}
	
	public void configureIResourceDescriptionsBuilderScope(com.google.inject.Binder binder) {
		binder.bind(IResourceDescriptions.class).annotatedWith(Names.named(ResourceDescriptionsProvider.NAMED_BUILDER_SCOPE)).to(CurrentDescriptions.ResourceSetAware.class);
	}

	public void configureIResourceDescriptionsPersisted(com.google.inject.Binder binder) {
		binder.bind(IResourceDescriptions.class).annotatedWith(Names.named(ResourceDescriptionsProvider.PERSISTED_DESCRIPTIONS)).to(IBuilderState.class);
	}

	public Class<? extends DocumentBasedDirtyResource> bindDocumentBasedDirtyResource() {
		return PersistentDataAwareDirtyResource.class;
	}
	
	public Class<? extends IContainer.Manager> bindIContainer$Manager() {
		return StateBasedContainerManager.class;
	}
	
	public Class<? extends AbstractValidatorConfigurationBlock> bindAbstractValidatorConfigurationBlock() {
		return XtextValidatorConfigurationBlock.class;
	}
	
	public void configureEditorScope(Binder binder) {
		binder.bindConstant().annotatedWith(Names.named(XtextEditor.KEY_BINDING_SCOPE)).to("org.eclipse.xtext.xtext.ui.XtextEditorScope");
	}
	
	public void configureIShowWhitespaceCharactersActionContributor(Binder binder) {
		binder.bind(IActionContributor.class).annotatedWith(Names.named("Show Whitespace")).to(ShowWhitespaceCharactersActionContributor.class);
	}
	
	@Override
	public Class<? extends IContentFormatterFactory> bindIContentFormatterFactory() {
		return ContentFormatterFactory.class;
	}

}
