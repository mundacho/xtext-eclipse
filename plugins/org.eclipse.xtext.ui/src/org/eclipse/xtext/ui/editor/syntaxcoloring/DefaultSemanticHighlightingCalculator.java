/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.syntaxcoloring;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;

/**
 * @author Stefan Oehme - Initial contribution and API
 * @since 2.6
 * @deprecated Use org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator instead.
 */
@Deprecated
public class DefaultSemanticHighlightingCalculator extends org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {
	
	/**
	 * @since 2.9
	 */
	@Override
	public void provideHighlightingFor(XtextResource resource, org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor acceptor) {
		provideHighlightingFor(resource, cast(acceptor));
	}
	
	/**
	 * @since 2.9
	 */
	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		super.provideHighlightingFor(resource, acceptor);
	}
	
	/**
	 * @since 2.9
	 */
	@Override
	protected void doProvideHighlightingFor(XtextResource resource, org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor acceptor) {
		doProvideHighlightingFor(resource, cast(acceptor));
	}

	/**
	 * @since 2.9
	 */
	@Override
	protected void searchAndHighlightElements(XtextResource resource, org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor acceptor) {
		searchAndHighlightElements(resource, cast(acceptor));
	}

	/**
	 * @since 2.9
	 */
	@Override
	protected void highlightElementRecursively(EObject element, org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor acceptor) {
		highlightElementRecursively(element, cast(acceptor));
	}

	/**
	 * @since 2.9
	 */
	@Override
	protected boolean highlightElement(EObject object, org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor acceptor) {
		return highlightElement(object, cast(acceptor));
	}

	/**
	 * @since 2.9
	 */
	@Override
	protected void highlightTasks(XtextResource resource, org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor acceptor) {
		highlightTasks(resource, cast(acceptor));
	}

	/**
	 * @since 2.9
	 */
	@Override
	protected void highlightFeature(org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor acceptor, EObject object, EStructuralFeature feature,
			String... styleIds) {
		highlightFeature(cast(acceptor), object, feature, styleIds);
	}

	/**
	 * @since 2.9
	 */
	@Override
	protected void highlightNode(org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor acceptor, INode node, String... styleIds) {
		highlightNode(cast(acceptor), node, styleIds);
	}

	private IHighlightedPositionAcceptor cast(org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor acceptor) {
		return (IHighlightedPositionAcceptor) acceptor;
	}

	/**
	 * @deprecated Use org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator instead.
	 */
	@Deprecated
	protected void doProvideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		super.doProvideHighlightingFor(resource, acceptor);
	}

	/**
	 * @deprecated Use org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator instead.
	 */
	@Deprecated
	protected void searchAndHighlightElements(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		super.searchAndHighlightElements(resource, acceptor);
	}

	/**
	 * @deprecated Use org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator instead.
	 */
	@Deprecated
	protected void highlightElementRecursively(EObject element, IHighlightedPositionAcceptor acceptor) {
		super.highlightElementRecursively(element, acceptor);
	}

	/**
	 * @deprecated Use org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator instead.
	 */
	@Deprecated
	protected boolean highlightElement(EObject object, IHighlightedPositionAcceptor acceptor) {
		return super.highlightElement(object, acceptor);
	}

	/**
	 * @deprecated Use org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator instead.
	 */
	@Deprecated
	protected void highlightTasks(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		super.highlightTasks(resource, acceptor);
	}

	/**
	 * @deprecated Use org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator instead.
	 */
	@Deprecated
	protected void highlightFeature(IHighlightedPositionAcceptor acceptor, EObject object, EStructuralFeature feature,
			String... styleIds) {
		super.highlightFeature(acceptor, object, feature, styleIds);
	}

	/**
	 * @deprecated Use org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator instead.
	 */
	@Deprecated
	protected void highlightNode(IHighlightedPositionAcceptor acceptor, INode node, String... styleIds) {
		super.highlightNode(acceptor, node, styleIds);
	}
}
