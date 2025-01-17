/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.ui.tests.editor.contentassist.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class Bug291022TestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class RootModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug291022TestLanguage.RootModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRootModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTypeModelElementCrossReference_2_0 = (CrossReference)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cTypeModelElementIDTerminalRuleCall_2_0_1 = (RuleCall)cTypeModelElementCrossReference_2_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cElementsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cElementsModelAttributeParserRuleCall_3_1_0 = (RuleCall)cElementsAssignment_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		
		//RootModel returns ModelElement:
		//  ( {RootModel} name=ID (type=[ModelElement])?
		//    (
		//      '{'
		//        elements+=ModelAttribute*
		//      '}'
		//    )?
		//  )?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//( {RootModel} name=ID (type=[ModelElement])?
		//  (
		//    '{'
		//      elements+=ModelAttribute*
		//    '}'
		//  )?
		//)?
		public Group getGroup() { return cGroup; }
		
		//{RootModel}
		public Action getRootModelAction_0() { return cRootModelAction_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//(type=[ModelElement])?
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//[ModelElement]
		public CrossReference getTypeModelElementCrossReference_2_0() { return cTypeModelElementCrossReference_2_0; }
		
		//ID
		public RuleCall getTypeModelElementIDTerminalRuleCall_2_0_1() { return cTypeModelElementIDTerminalRuleCall_2_0_1; }
		
		//(
		//  '{'
		//    elements+=ModelAttribute*
		//  '}'
		//)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_0() { return cLeftCurlyBracketKeyword_3_0; }
		
		//elements+=ModelAttribute*
		public Assignment getElementsAssignment_3_1() { return cElementsAssignment_3_1; }
		
		//ModelAttribute
		public RuleCall getElementsModelAttributeParserRuleCall_3_1_0() { return cElementsModelAttributeParserRuleCall_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_2() { return cRightCurlyBracketKeyword_3_2; }
	}
	public class ModelElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug291022TestLanguage.ModelElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFirstReferenceAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cFirstReferenceModelElementCrossReference_0_0 = (CrossReference)cFirstReferenceAssignment_0.eContents().get(0);
		private final RuleCall cFirstReferenceModelElementIDTerminalRuleCall_0_0_1 = (RuleCall)cFirstReferenceModelElementCrossReference_0_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_1_0 = (RuleCall)cNameAssignment_1_1.eContents().get(0);
		private final Assignment cSecondReferenceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cSecondReferenceModelElementCrossReference_2_0 = (CrossReference)cSecondReferenceAssignment_2.eContents().get(0);
		private final RuleCall cSecondReferenceModelElementIDTerminalRuleCall_2_0_1 = (RuleCall)cSecondReferenceModelElementCrossReference_2_0.eContents().get(1);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_3_0 = (Keyword)cAlternatives_3.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cAlternatives_3.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cElementsAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cElementsModelAttributeParserRuleCall_3_1_1_0 = (RuleCall)cElementsAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_1_2 = (Keyword)cGroup_3_1.eContents().get(2);
		
		//ModelElement:
		//  firstReference=[ModelElement] (':' name=ID)? (secondReference=[ModelElement])?
		//  (
		//      ';'
		//    | '{' elements+=ModelAttribute* '}'
		//  )
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//firstReference=[ModelElement] (':' name=ID)? (secondReference=[ModelElement])?
		//(
		//    ';'
		//  | '{' elements+=ModelAttribute* '}'
		//)
		public Group getGroup() { return cGroup; }
		
		//firstReference=[ModelElement]
		public Assignment getFirstReferenceAssignment_0() { return cFirstReferenceAssignment_0; }
		
		//[ModelElement]
		public CrossReference getFirstReferenceModelElementCrossReference_0_0() { return cFirstReferenceModelElementCrossReference_0_0; }
		
		//ID
		public RuleCall getFirstReferenceModelElementIDTerminalRuleCall_0_0_1() { return cFirstReferenceModelElementIDTerminalRuleCall_0_0_1; }
		
		//(':' name=ID)?
		public Group getGroup_1() { return cGroup_1; }
		
		//':'
		public Keyword getColonKeyword_1_0() { return cColonKeyword_1_0; }
		
		//name=ID
		public Assignment getNameAssignment_1_1() { return cNameAssignment_1_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_1_0() { return cNameIDTerminalRuleCall_1_1_0; }
		
		//(secondReference=[ModelElement])?
		public Assignment getSecondReferenceAssignment_2() { return cSecondReferenceAssignment_2; }
		
		//[ModelElement]
		public CrossReference getSecondReferenceModelElementCrossReference_2_0() { return cSecondReferenceModelElementCrossReference_2_0; }
		
		//ID
		public RuleCall getSecondReferenceModelElementIDTerminalRuleCall_2_0_1() { return cSecondReferenceModelElementIDTerminalRuleCall_2_0_1; }
		
		//(
		//    ';'
		//  | '{' elements+=ModelAttribute* '}'
		//)
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//';'
		public Keyword getSemicolonKeyword_3_0() { return cSemicolonKeyword_3_0; }
		
		//'{' elements+=ModelAttribute* '}'
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_1_0() { return cLeftCurlyBracketKeyword_3_1_0; }
		
		//elements+=ModelAttribute*
		public Assignment getElementsAssignment_3_1_1() { return cElementsAssignment_3_1_1; }
		
		//ModelAttribute
		public RuleCall getElementsModelAttributeParserRuleCall_3_1_1_0() { return cElementsModelAttributeParserRuleCall_3_1_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_1_2() { return cRightCurlyBracketKeyword_3_1_2; }
	}
	public class ModelAttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug291022TestLanguage.ModelAttribute");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cModelElementParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAttributeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ModelAttribute:
		//  ModelElement | Attribute
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ModelElement | Attribute
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ModelElement
		public RuleCall getModelElementParserRuleCall_0() { return cModelElementParserRuleCall_0; }
		
		//Attribute
		public RuleCall getAttributeParserRuleCall_1() { return cAttributeParserRuleCall_1; }
	}
	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug291022TestLanguage.Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFeatureAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cFeatureModelElementCrossReference_0_0 = (CrossReference)cFeatureAssignment_0.eContents().get(0);
		private final RuleCall cFeatureModelElementIDTerminalRuleCall_0_0_1 = (RuleCall)cFeatureModelElementCrossReference_0_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//Attribute:
		//  feature=[ModelElement] '=' value=STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//feature=[ModelElement] '=' value=STRING
		public Group getGroup() { return cGroup; }
		
		//feature=[ModelElement]
		public Assignment getFeatureAssignment_0() { return cFeatureAssignment_0; }
		
		//[ModelElement]
		public CrossReference getFeatureModelElementCrossReference_0_0() { return cFeatureModelElementCrossReference_0_0; }
		
		//ID
		public RuleCall getFeatureModelElementIDTerminalRuleCall_0_0_1() { return cFeatureModelElementIDTerminalRuleCall_0_0_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//value=STRING
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_0() { return cValueSTRINGTerminalRuleCall_2_0; }
	}
	
	
	private final RootModelElements pRootModel;
	private final ModelElementElements pModelElement;
	private final ModelAttributeElements pModelAttribute;
	private final AttributeElements pAttribute;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Bug291022TestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRootModel = new RootModelElements();
		this.pModelElement = new ModelElementElements();
		this.pModelAttribute = new ModelAttributeElements();
		this.pAttribute = new AttributeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.ui.tests.editor.contentassist.Bug291022TestLanguage".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//RootModel returns ModelElement:
	//  ( {RootModel} name=ID (type=[ModelElement])?
	//    (
	//      '{'
	//        elements+=ModelAttribute*
	//      '}'
	//    )?
	//  )?
	//;
	public RootModelElements getRootModelAccess() {
		return pRootModel;
	}
	
	public ParserRule getRootModelRule() {
		return getRootModelAccess().getRule();
	}
	
	//ModelElement:
	//  firstReference=[ModelElement] (':' name=ID)? (secondReference=[ModelElement])?
	//  (
	//      ';'
	//    | '{' elements+=ModelAttribute* '}'
	//  )
	//;
	public ModelElementElements getModelElementAccess() {
		return pModelElement;
	}
	
	public ParserRule getModelElementRule() {
		return getModelElementAccess().getRule();
	}
	
	//ModelAttribute:
	//  ModelElement | Attribute
	//;
	public ModelAttributeElements getModelAttributeAccess() {
		return pModelAttribute;
	}
	
	public ParserRule getModelAttributeRule() {
		return getModelAttributeAccess().getRule();
	}
	
	//Attribute:
	//  feature=[ModelElement] '=' value=STRING
	//;
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
