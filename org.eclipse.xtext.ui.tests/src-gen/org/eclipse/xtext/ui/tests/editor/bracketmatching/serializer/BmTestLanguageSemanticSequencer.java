/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.ui.tests.editor.bracketmatching.serializer;

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
import org.eclipse.xtext.ui.tests.editor.bracketmatching.bracketmatching.Atom;
import org.eclipse.xtext.ui.tests.editor.bracketmatching.bracketmatching.BracketmatchingPackage;
import org.eclipse.xtext.ui.tests.editor.bracketmatching.bracketmatching.File;
import org.eclipse.xtext.ui.tests.editor.bracketmatching.bracketmatching.SExpression;
import org.eclipse.xtext.ui.tests.editor.bracketmatching.services.BmTestLanguageGrammarAccess;

@SuppressWarnings("all")
public class BmTestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BmTestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BracketmatchingPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BracketmatchingPackage.ATOM:
				sequence_Atom(context, (Atom) semanticObject); 
				return; 
			case BracketmatchingPackage.FILE:
				sequence_File(context, (File) semanticObject); 
				return; 
			case BracketmatchingPackage.SEXPRESSION:
				sequence_SExpression(context, (SExpression) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns Atom
	 *     Atom returns Atom
	 *
	 * Constraint:
	 *     value=VALUE
	 * </pre>
	 */
	protected void sequence_Atom(ISerializationContext context, Atom semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BracketmatchingPackage.Literals.ATOM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BracketmatchingPackage.Literals.ATOM__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomAccess().getValueVALUEParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     File returns File
	 *
	 * Constraint:
	 *     expression+=Expression+
	 * </pre>
	 */
	protected void sequence_File(ISerializationContext context, File semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns SExpression
	 *     SExpression returns SExpression
	 *
	 * Constraint:
	 *     (element+=Expression+ | element+=Expression+)?
	 * </pre>
	 */
	protected void sequence_SExpression(ISerializationContext context, SExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
