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
import org.eclipse.xtext.ui.tests.editor.contentassist.bug347012TestLanguage.Bug347012TestLanguagePackage;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug347012TestLanguage.Identifier;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug347012TestLanguage.Literal;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug347012TestLanguage.MyAttribute;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug347012TestLanguage.MyAttributes;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug347012TestLanguage.MyBinding;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug347012TestLanguage.MyClass;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug347012TestLanguage.MyField;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug347012TestLanguage.MyPackage;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug347012TestLanguage.MyProgram;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.Bug347012TestLanguageGrammarAccess;

@SuppressWarnings("all")
public class Bug347012TestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Bug347012TestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Bug347012TestLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Bug347012TestLanguagePackage.IDENTIFIER:
				sequence_Identifier(context, (Identifier) semanticObject); 
				return; 
			case Bug347012TestLanguagePackage.LITERAL:
				sequence_Literal(context, (Literal) semanticObject); 
				return; 
			case Bug347012TestLanguagePackage.MY_ATTRIBUTE:
				sequence_MyAttribute(context, (MyAttribute) semanticObject); 
				return; 
			case Bug347012TestLanguagePackage.MY_ATTRIBUTES:
				sequence_MyAttributes(context, (MyAttributes) semanticObject); 
				return; 
			case Bug347012TestLanguagePackage.MY_BINDING:
				sequence_MyBinding(context, (MyBinding) semanticObject); 
				return; 
			case Bug347012TestLanguagePackage.MY_CLASS:
				sequence_MyClass(context, (MyClass) semanticObject); 
				return; 
			case Bug347012TestLanguagePackage.MY_FIELD:
				sequence_MyField(context, (MyField) semanticObject); 
				return; 
			case Bug347012TestLanguagePackage.MY_PACKAGE:
				sequence_MyPackage(context, (MyPackage) semanticObject); 
				return; 
			case Bug347012TestLanguagePackage.MY_PROGRAM:
				sequence_MyProgram(context, (MyProgram) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Identifier returns Identifier
	 *     MyPrimary returns Identifier
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Identifier(ISerializationContext context, Identifier semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Bug347012TestLanguagePackage.Literals.IDENTIFIER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug347012TestLanguagePackage.Literals.IDENTIFIER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIdentifierAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Literal returns Literal
	 *     MyPrimary returns Literal
	 *
	 * Constraint:
	 *     (num=NUMBER | str=STRING | bool='true' | bool='false')
	 * </pre>
	 */
	protected void sequence_Literal(ISerializationContext context, Literal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MyAttribute returns MyAttribute
	 *
	 * Constraint:
	 *     (PUBLIC='public' | PRIVATE='private')
	 * </pre>
	 */
	protected void sequence_MyAttribute(ISerializationContext context, MyAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MyAttributes returns MyAttributes
	 *
	 * Constraint:
	 *     attributes+=MyAttribute*
	 * </pre>
	 */
	protected void sequence_MyAttributes(ISerializationContext context, MyAttributes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MyBinding returns MyBinding
	 *
	 * Constraint:
	 *     (name=ID type=FQN? expression=MyPrimary?)
	 * </pre>
	 */
	protected void sequence_MyBinding(ISerializationContext context, MyBinding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MyClass returns MyClass
	 *
	 * Constraint:
	 *     (name=ID directives+=MyField*)
	 * </pre>
	 */
	protected void sequence_MyClass(ISerializationContext context, MyClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MyField returns MyField
	 *
	 * Constraint:
	 *     (attr=MyAttributes bindings+=MyBinding bindings+=MyBinding*)
	 * </pre>
	 */
	protected void sequence_MyField(ISerializationContext context, MyField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MyPackage returns MyPackage
	 *
	 * Constraint:
	 *     (name=FQN directives+=MyClass*)
	 * </pre>
	 */
	protected void sequence_MyPackage(ISerializationContext context, MyPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MyProgram returns MyProgram
	 *
	 * Constraint:
	 *     package=MyPackage
	 * </pre>
	 */
	protected void sequence_MyProgram(ISerializationContext context, MyProgram semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Bug347012TestLanguagePackage.Literals.MY_PROGRAM__PACKAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Bug347012TestLanguagePackage.Literals.MY_PROGRAM__PACKAGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMyProgramAccess().getPackageMyPackageParserRuleCall_2_0(), semanticObject.getPackage());
		feeder.finish();
	}
	
	
}
