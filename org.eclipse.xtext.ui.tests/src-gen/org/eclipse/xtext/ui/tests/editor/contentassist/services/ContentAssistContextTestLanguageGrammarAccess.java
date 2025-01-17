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
import org.eclipse.xtext.Assignment;
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
public class ContentAssistContextTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class FirstLevelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.ContentAssistContextTestLanguage.FirstLevel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSecondLevelAAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSecondLevelASecondLevelAParserRuleCall_0_0 = (RuleCall)cSecondLevelAAssignment_0.eContents().get(0);
		private final Assignment cSecondLevelBAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSecondLevelBSecondLevelBParserRuleCall_1_0 = (RuleCall)cSecondLevelBAssignment_1.eContents().get(0);
		
		//FirstLevel :
		//    (secondLevelA+=SecondLevelA)*
		//    (secondLevelB+=SecondLevelB)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(secondLevelA+=SecondLevelA)*
		//(secondLevelB+=SecondLevelB)*
		public Group getGroup() { return cGroup; }
		
		//(secondLevelA+=SecondLevelA)*
		public Assignment getSecondLevelAAssignment_0() { return cSecondLevelAAssignment_0; }
		
		//SecondLevelA
		public RuleCall getSecondLevelASecondLevelAParserRuleCall_0_0() { return cSecondLevelASecondLevelAParserRuleCall_0_0; }
		
		//(secondLevelB+=SecondLevelB)*
		public Assignment getSecondLevelBAssignment_1() { return cSecondLevelBAssignment_1; }
		
		//SecondLevelB
		public RuleCall getSecondLevelBSecondLevelBParserRuleCall_1_0() { return cSecondLevelBSecondLevelBParserRuleCall_1_0; }
	}
	public class SecondLevelAElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.ContentAssistContextTestLanguage.SecondLevelA");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cThirdLevelA1Assignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cThirdLevelA1ThirdLevelA1ParserRuleCall_0_0 = (RuleCall)cThirdLevelA1Assignment_0.eContents().get(0);
		private final Assignment cThirdLevelA2Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cThirdLevelA2ThirdLevelA2ParserRuleCall_1_0 = (RuleCall)cThirdLevelA2Assignment_1.eContents().get(0);
		
		//SecondLevelA :
		//    (thirdLevelA1+=ThirdLevelA1)+
		//    (thirdLevelA2+=ThirdLevelA2)+;
		@Override public ParserRule getRule() { return rule; }
		
		//(thirdLevelA1+=ThirdLevelA1)+
		//(thirdLevelA2+=ThirdLevelA2)+
		public Group getGroup() { return cGroup; }
		
		//(thirdLevelA1+=ThirdLevelA1)+
		public Assignment getThirdLevelA1Assignment_0() { return cThirdLevelA1Assignment_0; }
		
		//ThirdLevelA1
		public RuleCall getThirdLevelA1ThirdLevelA1ParserRuleCall_0_0() { return cThirdLevelA1ThirdLevelA1ParserRuleCall_0_0; }
		
		//(thirdLevelA2+=ThirdLevelA2)+
		public Assignment getThirdLevelA2Assignment_1() { return cThirdLevelA2Assignment_1; }
		
		//ThirdLevelA2
		public RuleCall getThirdLevelA2ThirdLevelA2ParserRuleCall_1_0() { return cThirdLevelA2ThirdLevelA2ParserRuleCall_1_0; }
	}
	public class SecondLevelBElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.ContentAssistContextTestLanguage.SecondLevelB");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cThirdLevelB1Assignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cThirdLevelB1ThirdLevelB1ParserRuleCall_0_0 = (RuleCall)cThirdLevelB1Assignment_0.eContents().get(0);
		private final Assignment cThirdLevelB2Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cThirdLevelB2ThirdLevelB2ParserRuleCall_1_0 = (RuleCall)cThirdLevelB2Assignment_1.eContents().get(0);
		
		//SecondLevelB :
		//    (thirdLevelB1+=ThirdLevelB1)+
		//    (thirdLevelB2+=ThirdLevelB2)+;
		@Override public ParserRule getRule() { return rule; }
		
		//(thirdLevelB1+=ThirdLevelB1)+
		//(thirdLevelB2+=ThirdLevelB2)+
		public Group getGroup() { return cGroup; }
		
		//(thirdLevelB1+=ThirdLevelB1)+
		public Assignment getThirdLevelB1Assignment_0() { return cThirdLevelB1Assignment_0; }
		
		//ThirdLevelB1
		public RuleCall getThirdLevelB1ThirdLevelB1ParserRuleCall_0_0() { return cThirdLevelB1ThirdLevelB1ParserRuleCall_0_0; }
		
		//(thirdLevelB2+=ThirdLevelB2)+
		public Assignment getThirdLevelB2Assignment_1() { return cThirdLevelB2Assignment_1; }
		
		//ThirdLevelB2
		public RuleCall getThirdLevelB2ThirdLevelB2ParserRuleCall_1_0() { return cThirdLevelB2ThirdLevelB2ParserRuleCall_1_0; }
	}
	public class ThirdLevelA1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.ContentAssistContextTestLanguage.ThirdLevelA1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cA1Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cThirdLevelA1Action_1 = (Action)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//ThirdLevelA1:
		//    'A1' {ThirdLevelA1} name=ID?;
		@Override public ParserRule getRule() { return rule; }
		
		//'A1' {ThirdLevelA1} name=ID?
		public Group getGroup() { return cGroup; }
		
		//'A1'
		public Keyword getA1Keyword_0() { return cA1Keyword_0; }
		
		//{ThirdLevelA1}
		public Action getThirdLevelA1Action_1() { return cThirdLevelA1Action_1; }
		
		//name=ID?
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
	}
	public class ThirdLevelA2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.ContentAssistContextTestLanguage.ThirdLevelA2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cA2Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cThirdLevelA2Action_1 = (Action)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//ThirdLevelA2:
		//    'A2' {ThirdLevelA2} name=ID?;
		@Override public ParserRule getRule() { return rule; }
		
		//'A2' {ThirdLevelA2} name=ID?
		public Group getGroup() { return cGroup; }
		
		//'A2'
		public Keyword getA2Keyword_0() { return cA2Keyword_0; }
		
		//{ThirdLevelA2}
		public Action getThirdLevelA2Action_1() { return cThirdLevelA2Action_1; }
		
		//name=ID?
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
	}
	public class ThirdLevelB1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.ContentAssistContextTestLanguage.ThirdLevelB1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cB1Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cThirdLevelB1Action_1 = (Action)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//ThirdLevelB1:
		//    'B1' {ThirdLevelB1} name=ID?;
		@Override public ParserRule getRule() { return rule; }
		
		//'B1' {ThirdLevelB1} name=ID?
		public Group getGroup() { return cGroup; }
		
		//'B1'
		public Keyword getB1Keyword_0() { return cB1Keyword_0; }
		
		//{ThirdLevelB1}
		public Action getThirdLevelB1Action_1() { return cThirdLevelB1Action_1; }
		
		//name=ID?
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
	}
	public class ThirdLevelB2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.ContentAssistContextTestLanguage.ThirdLevelB2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cB2Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cThirdLevelB2Action_1 = (Action)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//ThirdLevelB2:
		//    'B2' {ThirdLevelB2} name=ID?;
		@Override public ParserRule getRule() { return rule; }
		
		//'B2' {ThirdLevelB2} name=ID?
		public Group getGroup() { return cGroup; }
		
		//'B2'
		public Keyword getB2Keyword_0() { return cB2Keyword_0; }
		
		//{ThirdLevelB2}
		public Action getThirdLevelB2Action_1() { return cThirdLevelB2Action_1; }
		
		//name=ID?
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
	}
	
	
	private final FirstLevelElements pFirstLevel;
	private final SecondLevelAElements pSecondLevelA;
	private final SecondLevelBElements pSecondLevelB;
	private final ThirdLevelA1Elements pThirdLevelA1;
	private final ThirdLevelA2Elements pThirdLevelA2;
	private final ThirdLevelB1Elements pThirdLevelB1;
	private final ThirdLevelB2Elements pThirdLevelB2;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ContentAssistContextTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pFirstLevel = new FirstLevelElements();
		this.pSecondLevelA = new SecondLevelAElements();
		this.pSecondLevelB = new SecondLevelBElements();
		this.pThirdLevelA1 = new ThirdLevelA1Elements();
		this.pThirdLevelA2 = new ThirdLevelA2Elements();
		this.pThirdLevelB1 = new ThirdLevelB1Elements();
		this.pThirdLevelB2 = new ThirdLevelB2Elements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.ui.tests.editor.contentassist.ContentAssistContextTestLanguage".equals(grammar.getName())) {
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

	
	//FirstLevel :
	//    (secondLevelA+=SecondLevelA)*
	//    (secondLevelB+=SecondLevelB)*;
	public FirstLevelElements getFirstLevelAccess() {
		return pFirstLevel;
	}
	
	public ParserRule getFirstLevelRule() {
		return getFirstLevelAccess().getRule();
	}
	
	//SecondLevelA :
	//    (thirdLevelA1+=ThirdLevelA1)+
	//    (thirdLevelA2+=ThirdLevelA2)+;
	public SecondLevelAElements getSecondLevelAAccess() {
		return pSecondLevelA;
	}
	
	public ParserRule getSecondLevelARule() {
		return getSecondLevelAAccess().getRule();
	}
	
	//SecondLevelB :
	//    (thirdLevelB1+=ThirdLevelB1)+
	//    (thirdLevelB2+=ThirdLevelB2)+;
	public SecondLevelBElements getSecondLevelBAccess() {
		return pSecondLevelB;
	}
	
	public ParserRule getSecondLevelBRule() {
		return getSecondLevelBAccess().getRule();
	}
	
	//ThirdLevelA1:
	//    'A1' {ThirdLevelA1} name=ID?;
	public ThirdLevelA1Elements getThirdLevelA1Access() {
		return pThirdLevelA1;
	}
	
	public ParserRule getThirdLevelA1Rule() {
		return getThirdLevelA1Access().getRule();
	}
	
	//ThirdLevelA2:
	//    'A2' {ThirdLevelA2} name=ID?;
	public ThirdLevelA2Elements getThirdLevelA2Access() {
		return pThirdLevelA2;
	}
	
	public ParserRule getThirdLevelA2Rule() {
		return getThirdLevelA2Access().getRule();
	}
	
	//ThirdLevelB1:
	//    'B1' {ThirdLevelB1} name=ID?;
	public ThirdLevelB1Elements getThirdLevelB1Access() {
		return pThirdLevelB1;
	}
	
	public ParserRule getThirdLevelB1Rule() {
		return getThirdLevelB1Access().getRule();
	}
	
	//ThirdLevelB2:
	//    'B2' {ThirdLevelB2} name=ID?;
	public ThirdLevelB2Elements getThirdLevelB2Access() {
		return pThirdLevelB2;
	}
	
	public ParserRule getThirdLevelB2Rule() {
		return getThirdLevelB2Access().getRule();
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
