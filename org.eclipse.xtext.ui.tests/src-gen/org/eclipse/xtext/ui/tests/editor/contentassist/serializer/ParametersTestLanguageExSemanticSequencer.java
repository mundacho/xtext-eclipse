/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.ui.tests.editor.contentassist.serializer;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.ui.tests.editor.contentassist.parametersTestLanguage.ParametersTestLanguagePackage;
import org.eclipse.xtext.ui.tests.editor.contentassist.parametersTestLanguage.ParserRuleParameters;
import org.eclipse.xtext.ui.tests.editor.contentassist.parametersTestLanguage.Scenario;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.ParametersTestLanguageExGrammarAccess;

@SuppressWarnings("all")
public class ParametersTestLanguageExSemanticSequencer extends ParametersTestLanguageSemanticSequencer {

	@Inject
	private ParametersTestLanguageExGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ParametersTestLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ParametersTestLanguagePackage.PARSER_RULE_PARAMETERS:
				sequence_ParserRuleParameters(context, (ParserRuleParameters) semanticObject); 
				return; 
			case ParametersTestLanguagePackage.SCENARIO:
				if (rule == grammarAccess.getScenario1Rule() && (parameters.isEmpty())
						|| rule == grammarAccess.getParametersTestLanguageScenario1Rule() && (parameters.isEmpty())) {
					sequence_Scenario1$Param$false$(context, (Scenario) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getScenario1Rule() && (ImmutableSet.of(grammarAccess.getScenario1Rule().getParameters().get(0/*Param*/)).equals(parameters))
						|| rule == grammarAccess.getParametersTestLanguageScenario1Rule() && (ImmutableSet.of(grammarAccess.getParametersTestLanguageScenario1Rule().getParameters().get(0/*Param*/)).equals(parameters))) {
					sequence_Scenario1$Param$true$(context, (Scenario) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getScenario2Rule()) {
					sequence_Scenario2(context, (Scenario) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getScenario3Rule()) {
					sequence_Scenario3(context, (Scenario) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getScenario4Rule()) {
					sequence_Scenario4(context, (Scenario) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getScenario5Rule()) {
					sequence_Scenario5(context, (Scenario) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
}
