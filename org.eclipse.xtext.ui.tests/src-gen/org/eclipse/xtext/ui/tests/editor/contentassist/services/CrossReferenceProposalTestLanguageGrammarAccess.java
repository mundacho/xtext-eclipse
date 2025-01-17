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
public class CrossReferenceProposalTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.CrossReferenceProposalTestLanguage.Model");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsClassParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//Model :
		//        (elements+=Class)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(elements+=Class)*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//Class
		public RuleCall getElementsClassParserRuleCall_0() { return cElementsClassParserRuleCall_0; }
	}
	public class ClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.CrossReferenceProposalTestLanguage.Class");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_0_0 = (Alternatives)cGroup_0.eContents().get(0);
		private final Assignment cSuperClassAssignment_0_0_0 = (Assignment)cAlternatives_0_0.eContents().get(0);
		private final CrossReference cSuperClassClassCrossReference_0_0_0_0 = (CrossReference)cSuperClassAssignment_0_0_0.eContents().get(0);
		private final Keyword cSuperClassClassObjectKeyword_0_0_0_0_1 = (Keyword)cSuperClassClassCrossReference_0_0_0_0.eContents().get(1);
		private final Assignment cSuperClassAssignment_0_0_1 = (Assignment)cAlternatives_0_0.eContents().get(1);
		private final CrossReference cSuperClassClassCrossReference_0_0_1_0 = (CrossReference)cSuperClassAssignment_0_0_1.eContents().get(0);
		private final RuleCall cSuperClassClassIDTerminalRuleCall_0_0_1_0_1 = (RuleCall)cSuperClassClassCrossReference_0_0_1_0.eContents().get(1);
		private final Assignment cSuperClassAssignment_0_0_2 = (Assignment)cAlternatives_0_0.eContents().get(2);
		private final CrossReference cSuperClassClassCrossReference_0_0_2_0 = (CrossReference)cSuperClassAssignment_0_0_2.eContents().get(0);
		private final RuleCall cSuperClassClassComplexNameParserRuleCall_0_0_2_0_1 = (RuleCall)cSuperClassClassCrossReference_0_0_2_0.eContents().get(1);
		private final Keyword cLessThanSignHyphenMinusKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cNameAlternatives_1_0 = (Alternatives)cNameAssignment_1.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_1_0_0 = (RuleCall)cNameAlternatives_1_0.eContents().get(0);
		private final RuleCall cNameComplexNameParserRuleCall_1_0_1 = (RuleCall)cNameAlternatives_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Class :
		//        ((superClass=[Class|'Object']|superClass=[Class]|superClass=[Class|ComplexName]) '<-')? name=(ID|ComplexName) '{' '}';
		@Override public ParserRule getRule() { return rule; }
		
		//((superClass=[Class|'Object']|superClass=[Class]|superClass=[Class|ComplexName]) '<-')? name=(ID|ComplexName) '{' '}'
		public Group getGroup() { return cGroup; }
		
		//((superClass=[Class|'Object']|superClass=[Class]|superClass=[Class|ComplexName]) '<-')?
		public Group getGroup_0() { return cGroup_0; }
		
		//(superClass=[Class|'Object']|superClass=[Class]|superClass=[Class|ComplexName])
		public Alternatives getAlternatives_0_0() { return cAlternatives_0_0; }
		
		//superClass=[Class|'Object']
		public Assignment getSuperClassAssignment_0_0_0() { return cSuperClassAssignment_0_0_0; }
		
		//[Class|'Object']
		public CrossReference getSuperClassClassCrossReference_0_0_0_0() { return cSuperClassClassCrossReference_0_0_0_0; }
		
		//'Object'
		public Keyword getSuperClassClassObjectKeyword_0_0_0_0_1() { return cSuperClassClassObjectKeyword_0_0_0_0_1; }
		
		//superClass=[Class]
		public Assignment getSuperClassAssignment_0_0_1() { return cSuperClassAssignment_0_0_1; }
		
		//[Class]
		public CrossReference getSuperClassClassCrossReference_0_0_1_0() { return cSuperClassClassCrossReference_0_0_1_0; }
		
		//ID
		public RuleCall getSuperClassClassIDTerminalRuleCall_0_0_1_0_1() { return cSuperClassClassIDTerminalRuleCall_0_0_1_0_1; }
		
		//superClass=[Class|ComplexName]
		public Assignment getSuperClassAssignment_0_0_2() { return cSuperClassAssignment_0_0_2; }
		
		//[Class|ComplexName]
		public CrossReference getSuperClassClassCrossReference_0_0_2_0() { return cSuperClassClassCrossReference_0_0_2_0; }
		
		//ComplexName
		public RuleCall getSuperClassClassComplexNameParserRuleCall_0_0_2_0_1() { return cSuperClassClassComplexNameParserRuleCall_0_0_2_0_1; }
		
		//'<-'
		public Keyword getLessThanSignHyphenMinusKeyword_0_1() { return cLessThanSignHyphenMinusKeyword_0_1; }
		
		//name=(ID|ComplexName)
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//(ID|ComplexName)
		public Alternatives getNameAlternatives_1_0() { return cNameAlternatives_1_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0_0() { return cNameIDTerminalRuleCall_1_0_0; }
		
		//ComplexName
		public RuleCall getNameComplexNameParserRuleCall_1_0_1() { return cNameComplexNameParserRuleCall_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class ComplexNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.CrossReferenceProposalTestLanguage.ComplexName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cColonColonKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//ComplexName:
		//    '::' ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'::' ID
		public Group getGroup() { return cGroup; }
		
		//'::'
		public Keyword getColonColonKeyword_0() { return cColonColonKeyword_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	
	
	private final ModelElements pModel;
	private final ClassElements pClass;
	private final ComplexNameElements pComplexName;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public CrossReferenceProposalTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pClass = new ClassElements();
		this.pComplexName = new ComplexNameElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.ui.tests.editor.contentassist.CrossReferenceProposalTestLanguage".equals(grammar.getName())) {
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

	
	//Model :
	//        (elements+=Class)*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Class :
	//        ((superClass=[Class|'Object']|superClass=[Class]|superClass=[Class|ComplexName]) '<-')? name=(ID|ComplexName) '{' '}';
	public ClassElements getClassAccess() {
		return pClass;
	}
	
	public ParserRule getClassRule() {
		return getClassAccess().getRule();
	}
	
	//ComplexName:
	//    '::' ID
	//;
	public ComplexNameElements getComplexNameAccess() {
		return pComplexName;
	}
	
	public ParserRule getComplexNameRule() {
		return getComplexNameAccess().getRule();
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
