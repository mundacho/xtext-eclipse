/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.ui.tests.editor.bracketmatching.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
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
public class BmTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class FileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.bracketmatching.BmTestLanguage.File");
		private final Assignment cExpressionAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cExpressionExpressionParserRuleCall_0 = (RuleCall)cExpressionAssignment.eContents().get(0);
		
		//File :
		//    (expression+=Expression)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(expression+=Expression)*
		public Assignment getExpressionAssignment() { return cExpressionAssignment; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_0() { return cExpressionExpressionParserRuleCall_0; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.bracketmatching.BmTestLanguage.Expression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAtomParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cExpressionParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final Keyword cRightSquareBracketKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		
		//Expression :
		//  SExpression |
		//  Atom |
		//  "[" Expression "]";
		@Override public ParserRule getRule() { return rule; }
		
		//SExpression |
		//Atom |
		//"[" Expression "]"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//SExpression
		public RuleCall getSExpressionParserRuleCall_0() { return cSExpressionParserRuleCall_0; }
		
		//Atom
		public RuleCall getAtomParserRuleCall_1() { return cAtomParserRuleCall_1; }
		
		//"[" Expression "]"
		public Group getGroup_2() { return cGroup_2; }
		
		//"["
		public Keyword getLeftSquareBracketKeyword_2_0() { return cLeftSquareBracketKeyword_2_0; }
		
		//Expression
		public RuleCall getExpressionParserRuleCall_2_1() { return cExpressionParserRuleCall_2_1; }
		
		//"]"
		public Keyword getRightSquareBracketKeyword_2_2() { return cRightSquareBracketKeyword_2_2; }
	}
	public class SExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.bracketmatching.BmTestLanguage.SExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSExpressionAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cElementAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cElementExpressionParserRuleCall_1_0_1_0 = (RuleCall)cElementAssignment_1_0_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_0_2 = (Keyword)cGroup_1_0.eContents().get(2);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cBeginKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cElementAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cElementExpressionParserRuleCall_1_1_1_0 = (RuleCall)cElementAssignment_1_1_1.eContents().get(0);
		private final Keyword cEndKeyword_1_1_2 = (Keyword)cGroup_1_1.eContents().get(2);
		
		//SExpression:
		//    {SExpression}
		//    ("("
		//      element+=Expression*
		//    ")" |
		//    "begin"
		//      element+=Expression*
		//    "end"
		//    );
		@Override public ParserRule getRule() { return rule; }
		
		//{SExpression}
		//("("
		//  element+=Expression*
		//")" |
		//"begin"
		//  element+=Expression*
		//"end"
		//)
		public Group getGroup() { return cGroup; }
		
		//{SExpression}
		public Action getSExpressionAction_0() { return cSExpressionAction_0; }
		
		//("("
		//  element+=Expression*
		//")" |
		//"begin"
		//  element+=Expression*
		//"end"
		//)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//"("
		//      element+=Expression*
		//    ")"
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_1_0_0() { return cLeftParenthesisKeyword_1_0_0; }
		
		//element+=Expression*
		public Assignment getElementAssignment_1_0_1() { return cElementAssignment_1_0_1; }
		
		//Expression
		public RuleCall getElementExpressionParserRuleCall_1_0_1_0() { return cElementExpressionParserRuleCall_1_0_1_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_1_0_2() { return cRightParenthesisKeyword_1_0_2; }
		
		//"begin"
		//  element+=Expression*
		//"end"
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//"begin"
		public Keyword getBeginKeyword_1_1_0() { return cBeginKeyword_1_1_0; }
		
		//element+=Expression*
		public Assignment getElementAssignment_1_1_1() { return cElementAssignment_1_1_1; }
		
		//Expression
		public RuleCall getElementExpressionParserRuleCall_1_1_1_0() { return cElementExpressionParserRuleCall_1_1_1_0; }
		
		//"end"
		public Keyword getEndKeyword_1_1_2() { return cEndKeyword_1_1_2; }
	}
	public class AtomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.bracketmatching.BmTestLanguage.Atom");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueVALUEParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//Atom :
		//  value=VALUE;
		@Override public ParserRule getRule() { return rule; }
		
		//value=VALUE
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//VALUE
		public RuleCall getValueVALUEParserRuleCall_0() { return cValueVALUEParserRuleCall_0; }
	}
	public class VALUEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.bracketmatching.BmTestLanguage.VALUE");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//VALUE : ID|INT|STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//ID|INT|STRING
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_2() { return cSTRINGTerminalRuleCall_2; }
	}
	
	
	private final FileElements pFile;
	private final ExpressionElements pExpression;
	private final SExpressionElements pSExpression;
	private final AtomElements pAtom;
	private final VALUEElements pVALUE;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public BmTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pFile = new FileElements();
		this.pExpression = new ExpressionElements();
		this.pSExpression = new SExpressionElements();
		this.pAtom = new AtomElements();
		this.pVALUE = new VALUEElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.ui.tests.editor.bracketmatching.BmTestLanguage".equals(grammar.getName())) {
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

	
	//File :
	//    (expression+=Expression)*;
	public FileElements getFileAccess() {
		return pFile;
	}
	
	public ParserRule getFileRule() {
		return getFileAccess().getRule();
	}
	
	//Expression :
	//  SExpression |
	//  Atom |
	//  "[" Expression "]";
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//SExpression:
	//    {SExpression}
	//    ("("
	//      element+=Expression*
	//    ")" |
	//    "begin"
	//      element+=Expression*
	//    "end"
	//    );
	public SExpressionElements getSExpressionAccess() {
		return pSExpression;
	}
	
	public ParserRule getSExpressionRule() {
		return getSExpressionAccess().getRule();
	}
	
	//Atom :
	//  value=VALUE;
	public AtomElements getAtomAccess() {
		return pAtom;
	}
	
	public ParserRule getAtomRule() {
		return getAtomAccess().getRule();
	}
	
	//VALUE : ID|INT|STRING;
	public VALUEElements getVALUEAccess() {
		return pVALUE;
	}
	
	public ParserRule getVALUERule() {
		return getVALUEAccess().getRule();
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
