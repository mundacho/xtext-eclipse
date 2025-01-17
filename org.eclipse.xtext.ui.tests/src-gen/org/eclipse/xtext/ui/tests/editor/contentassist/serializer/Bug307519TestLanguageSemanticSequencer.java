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
import org.eclipse.xtext.ui.tests.editor.contentassist.bug307519TestLanguage.Bug307519TestLanguagePackage;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug307519TestLanguage.Elem1;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug307519TestLanguage.Elem2;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug307519TestLanguage.Model;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.Bug307519TestLanguageGrammarAccess;

@SuppressWarnings("all")
public class Bug307519TestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Bug307519TestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Bug307519TestLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Bug307519TestLanguagePackage.ELEM1:
				sequence_Elem1(context, (Elem1) semanticObject); 
				return; 
			case Bug307519TestLanguagePackage.ELEM2:
				sequence_Elem2(context, (Elem2) semanticObject); 
				return; 
			case Bug307519TestLanguagePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Elem1 returns Elem1
	 *
	 * Constraint:
	 *     value=EnumT
	 * </pre>
	 */
	protected void sequence_Elem1(ISerializationContext context, Elem1 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Bug307519TestLanguagePackage.Literals.ELEM1__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug307519TestLanguagePackage.Literals.ELEM1__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getElem1Access().getValueEnumTEnumRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Elem2 returns Elem2
	 *
	 * Constraint:
	 *     value=EnumT
	 * </pre>
	 */
	protected void sequence_Elem2(ISerializationContext context, Elem2 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Bug307519TestLanguagePackage.Literals.ELEM2__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug307519TestLanguagePackage.Literals.ELEM2__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getElem2Access().getValueEnumTEnumRuleCall_0_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (e1+=Elem1 | e2+=Elem2)+
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
