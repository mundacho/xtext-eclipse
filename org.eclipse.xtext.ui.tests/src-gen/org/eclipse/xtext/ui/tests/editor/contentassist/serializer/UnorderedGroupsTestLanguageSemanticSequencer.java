/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.ui.tests.editor.contentassist.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.UnorderedGroupsTestLanguageGrammarAccess;
import org.eclipse.xtext.ui.tests.editor.contentassist.unorderedGroupsTest.Bug304681Attribute;
import org.eclipse.xtext.ui.tests.editor.contentassist.unorderedGroupsTest.Bug304681Model;
import org.eclipse.xtext.ui.tests.editor.contentassist.unorderedGroupsTest.Bug304681Reference;
import org.eclipse.xtext.ui.tests.editor.contentassist.unorderedGroupsTest.GroupLoopedModel;
import org.eclipse.xtext.ui.tests.editor.contentassist.unorderedGroupsTest.LoopedAlternativeModel;
import org.eclipse.xtext.ui.tests.editor.contentassist.unorderedGroupsTest.LoopedModel;
import org.eclipse.xtext.ui.tests.editor.contentassist.unorderedGroupsTest.MandatoryModel;
import org.eclipse.xtext.ui.tests.editor.contentassist.unorderedGroupsTest.Model;
import org.eclipse.xtext.ui.tests.editor.contentassist.unorderedGroupsTest.SimpleModel;
import org.eclipse.xtext.ui.tests.editor.contentassist.unorderedGroupsTest.UnorderedGroupsTestPackage;

@SuppressWarnings("all")
public class UnorderedGroupsTestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private UnorderedGroupsTestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == UnorderedGroupsTestPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case UnorderedGroupsTestPackage.BUG304681_ATTRIBUTE:
				sequence_Bug304681Attribute(context, (Bug304681Attribute) semanticObject); 
				return; 
			case UnorderedGroupsTestPackage.BUG304681_MODEL:
				sequence_Bug304681Model(context, (Bug304681Model) semanticObject); 
				return; 
			case UnorderedGroupsTestPackage.BUG304681_REFERENCE:
				sequence_Bug304681Reference(context, (Bug304681Reference) semanticObject); 
				return; 
			case UnorderedGroupsTestPackage.GROUP_LOOPED_MODEL:
				sequence_GroupLoopedModel(context, (GroupLoopedModel) semanticObject); 
				return; 
			case UnorderedGroupsTestPackage.LOOPED_ALTERNATIVE_MODEL:
				sequence_LoopedAlternativeModel(context, (LoopedAlternativeModel) semanticObject); 
				return; 
			case UnorderedGroupsTestPackage.LOOPED_MODEL:
				sequence_LoopedModel(context, (LoopedModel) semanticObject); 
				return; 
			case UnorderedGroupsTestPackage.MANDATORY_MODEL:
				sequence_MandatoryModel(context, (MandatoryModel) semanticObject); 
				return; 
			case UnorderedGroupsTestPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case UnorderedGroupsTestPackage.SIMPLE_MODEL:
				sequence_SimpleModel(context, (SimpleModel) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Bug304681Feature returns Bug304681Attribute
	 *     Bug304681Attribute returns Bug304681Attribute
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Bug304681Attribute(ISerializationContext context, Bug304681Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UnorderedGroupsTestPackage.Literals.BUG304681_FEATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UnorderedGroupsTestPackage.Literals.BUG304681_FEATURE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBug304681AttributeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Bug304681Model returns Bug304681Model
	 *
	 * Constraint:
	 *     (shortDescription=STRING | longDescription=STRING | uid=STRING | flag?='flag' | features+=Bug304681Feature)*
	 * </pre>
	 */
	protected void sequence_Bug304681Model(ISerializationContext context, Bug304681Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Bug304681Feature returns Bug304681Reference
	 *     Bug304681Reference returns Bug304681Reference
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Bug304681Reference(ISerializationContext context, Bug304681Reference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UnorderedGroupsTestPackage.Literals.BUG304681_FEATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UnorderedGroupsTestPackage.Literals.BUG304681_FEATURE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBug304681ReferenceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     GroupLoopedModel returns GroupLoopedModel
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             visibility+='public' | 
	 *             visibility+='private' | 
	 *             visibility+='protected' | 
	 *             static+='static' | 
	 *             synchronized+='synchronized' | 
	 *             abstract+='abstract' | 
	 *             final+='final'
	 *         )* 
	 *         name=ID
	 *     )
	 * </pre>
	 */
	protected void sequence_GroupLoopedModel(ISerializationContext context, GroupLoopedModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     LoopedAlternativeModel returns LoopedAlternativeModel
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             visibility+='public' | 
	 *             visibility+='private' | 
	 *             visibility+='protected' | 
	 *             static+='static' | 
	 *             synchronized+='synchronized' | 
	 *             abstract+='abstract' | 
	 *             final+='final'
	 *         )* 
	 *         name=ID
	 *     )
	 * </pre>
	 */
	protected void sequence_LoopedAlternativeModel(ISerializationContext context, LoopedAlternativeModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     LoopedModel returns LoopedModel
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             visibility+='public' | 
	 *             visibility+='private' | 
	 *             visibility+='protected' | 
	 *             static+='static' | 
	 *             synchronized+='synchronized' | 
	 *             abstract+='abstract' | 
	 *             final+='final'
	 *         )* 
	 *         name=ID
	 *     )
	 * </pre>
	 */
	protected void sequence_LoopedModel(ISerializationContext context, LoopedModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MandatoryModel returns MandatoryModel
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             visibility='public' | 
	 *             visibility='private' | 
	 *             visibility='protected' | 
	 *             static?='static' | 
	 *             synchronized?='synchronized' | 
	 *             abstract?='abstract' | 
	 *             final?='final'
	 *         )* 
	 *         name=ID
	 *     )
	 * </pre>
	 */
	protected void sequence_MandatoryModel(ISerializationContext context, MandatoryModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (
	 *         first=SimpleModel | 
	 *         second=MandatoryModel | 
	 *         thrird=LoopedModel | 
	 *         forth=GroupLoopedModel | 
	 *         fifth=LoopedAlternativeModel | 
	 *         model=Bug304681Model
	 *     )
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SimpleModel returns SimpleModel
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             visibility='public' | 
	 *             visibility='private' | 
	 *             visibility='protected' | 
	 *             static?='static' | 
	 *             synchronized?='synchronized' | 
	 *             abstract?='abstract' | 
	 *             final?='final'
	 *         )* 
	 *         name=ID
	 *     )
	 * </pre>
	 */
	protected void sequence_SimpleModel(ISerializationContext context, SimpleModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
