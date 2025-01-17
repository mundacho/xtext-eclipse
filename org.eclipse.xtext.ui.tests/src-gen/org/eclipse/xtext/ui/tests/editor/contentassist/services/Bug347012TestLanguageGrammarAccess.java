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
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class Bug347012TestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class MyProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug347012TestLanguage.MyProgram");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMyProgramAction_0 = (Action)cGroup.eContents().get(0);
		private final RuleCall cLTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cPackageAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPackageMyPackageParserRuleCall_2_0 = (RuleCall)cPackageAssignment_2.eContents().get(0);
		private final RuleCall cLTTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//MyProgram:
		//    {MyProgram} LT* package=MyPackage LT*;
		@Override public ParserRule getRule() { return rule; }
		
		//{MyProgram} LT* package=MyPackage LT*
		public Group getGroup() { return cGroup; }
		
		//{MyProgram}
		public Action getMyProgramAction_0() { return cMyProgramAction_0; }
		
		//LT*
		public RuleCall getLTTerminalRuleCall_1() { return cLTTerminalRuleCall_1; }
		
		//package=MyPackage
		public Assignment getPackageAssignment_2() { return cPackageAssignment_2; }
		
		//MyPackage
		public RuleCall getPackageMyPackageParserRuleCall_2_0() { return cPackageMyPackageParserRuleCall_2_0; }
		
		//LT*
		public RuleCall getLTTerminalRuleCall_3() { return cLTTerminalRuleCall_3; }
	}
	public class IdentifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug347012TestLanguage.Identifier");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Identifier:
		//    name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug347012TestLanguage.FQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cLTTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Keyword cFullStopKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final RuleCall cLTTerminalRuleCall_1_2 = (RuleCall)cGroup_1.eContents().get(2);
		private final RuleCall cIDTerminalRuleCall_1_3 = (RuleCall)cGroup_1.eContents().get(3);
		
		//FQN:
		//    ID (LT* '.' LT* ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID (LT* '.' LT* ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//(LT* '.' LT* ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//LT*
		public RuleCall getLTTerminalRuleCall_1_0() { return cLTTerminalRuleCall_1_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1_1() { return cFullStopKeyword_1_1; }
		
		//LT*
		public RuleCall getLTTerminalRuleCall_1_2() { return cLTTerminalRuleCall_1_2; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_3() { return cIDTerminalRuleCall_1_3; }
	}
	public class VirtualSemiElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug347012TestLanguage.VirtualSemi");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cSemicolonKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final RuleCall cLTTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//VirtualSemi:
		//    ';' | LT;
		@Override public ParserRule getRule() { return rule; }
		
		//';' | LT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//';'
		public Keyword getSemicolonKeyword_0() { return cSemicolonKeyword_0; }
		
		//LT
		public RuleCall getLTTerminalRuleCall_1() { return cLTTerminalRuleCall_1; }
	}
	public class LiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug347012TestLanguage.Literal");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cNumAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cNumNUMBERTerminalRuleCall_0_0 = (RuleCall)cNumAssignment_0.eContents().get(0);
		private final Assignment cStrAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cStrSTRINGTerminalRuleCall_1_0 = (RuleCall)cStrAssignment_1.eContents().get(0);
		private final Assignment cBoolAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final Keyword cBoolTrueKeyword_2_0 = (Keyword)cBoolAssignment_2.eContents().get(0);
		private final Assignment cBoolAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final Keyword cBoolFalseKeyword_3_0 = (Keyword)cBoolAssignment_3.eContents().get(0);
		
		//Literal:
		//    num=NUMBER | str=STRING | bool='true' | bool='false';
		@Override public ParserRule getRule() { return rule; }
		
		//num=NUMBER | str=STRING | bool='true' | bool='false'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//num=NUMBER
		public Assignment getNumAssignment_0() { return cNumAssignment_0; }
		
		//NUMBER
		public RuleCall getNumNUMBERTerminalRuleCall_0_0() { return cNumNUMBERTerminalRuleCall_0_0; }
		
		//str=STRING
		public Assignment getStrAssignment_1() { return cStrAssignment_1; }
		
		//STRING
		public RuleCall getStrSTRINGTerminalRuleCall_1_0() { return cStrSTRINGTerminalRuleCall_1_0; }
		
		//bool='true'
		public Assignment getBoolAssignment_2() { return cBoolAssignment_2; }
		
		//'true'
		public Keyword getBoolTrueKeyword_2_0() { return cBoolTrueKeyword_2_0; }
		
		//bool='false'
		public Assignment getBoolAssignment_3() { return cBoolAssignment_3; }
		
		//'false'
		public Keyword getBoolFalseKeyword_3_0() { return cBoolFalseKeyword_3_0; }
	}
	public class MyPrimaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug347012TestLanguage.MyPrimary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cLiteralParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIdentifierParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MyPrimary:
		//    Literal | Identifier;
		@Override public ParserRule getRule() { return rule; }
		
		//Literal | Identifier
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Literal
		public RuleCall getLiteralParserRuleCall_0() { return cLiteralParserRuleCall_0; }
		
		//Identifier
		public RuleCall getIdentifierParserRuleCall_1() { return cIdentifierParserRuleCall_1; }
	}
	public class MyPackageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug347012TestLanguage.MyPackage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cLTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameFQNParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final RuleCall cLTTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final RuleCall cLTTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Assignment cDirectivesAssignment_6_0 = (Assignment)cGroup_6.eContents().get(0);
		private final RuleCall cDirectivesMyClassParserRuleCall_6_0_0 = (RuleCall)cDirectivesAssignment_6_0.eContents().get(0);
		private final RuleCall cLTTerminalRuleCall_6_1 = (RuleCall)cGroup_6.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MyPackage:
		//    'package' LT* name=FQN LT* '{' LT* (directives+=MyClass LT*)* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'package' LT* name=FQN LT* '{' LT* (directives+=MyClass LT*)* '}'
		public Group getGroup() { return cGroup; }
		
		//'package'
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }
		
		//LT*
		public RuleCall getLTTerminalRuleCall_1() { return cLTTerminalRuleCall_1; }
		
		//name=FQN
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//FQN
		public RuleCall getNameFQNParserRuleCall_2_0() { return cNameFQNParserRuleCall_2_0; }
		
		//LT*
		public RuleCall getLTTerminalRuleCall_3() { return cLTTerminalRuleCall_3; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//LT*
		public RuleCall getLTTerminalRuleCall_5() { return cLTTerminalRuleCall_5; }
		
		//(directives+=MyClass LT*)*
		public Group getGroup_6() { return cGroup_6; }
		
		//directives+=MyClass
		public Assignment getDirectivesAssignment_6_0() { return cDirectivesAssignment_6_0; }
		
		//MyClass
		public RuleCall getDirectivesMyClassParserRuleCall_6_0_0() { return cDirectivesMyClassParserRuleCall_6_0_0; }
		
		//LT*
		public RuleCall getLTTerminalRuleCall_6_1() { return cLTTerminalRuleCall_6_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class MyClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug347012TestLanguage.MyClass");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPublicKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cClassKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cLTTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final RuleCall cLTTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final RuleCall cLTTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Assignment cDirectivesAssignment_7_0 = (Assignment)cGroup_7.eContents().get(0);
		private final RuleCall cDirectivesMyFieldParserRuleCall_7_0_0 = (RuleCall)cDirectivesAssignment_7_0.eContents().get(0);
		private final RuleCall cLTTerminalRuleCall_7_1 = (RuleCall)cGroup_7.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//MyClass:
		//    'public'? 'class' LT* name=ID LT* '{' LT* (directives+=MyField LT*)* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'public'? 'class' LT* name=ID LT* '{' LT* (directives+=MyField LT*)* '}'
		public Group getGroup() { return cGroup; }
		
		//'public'?
		public Keyword getPublicKeyword_0() { return cPublicKeyword_0; }
		
		//'class'
		public Keyword getClassKeyword_1() { return cClassKeyword_1; }
		
		//LT*
		public RuleCall getLTTerminalRuleCall_2() { return cLTTerminalRuleCall_2; }
		
		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }
		
		//LT*
		public RuleCall getLTTerminalRuleCall_4() { return cLTTerminalRuleCall_4; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }
		
		//LT*
		public RuleCall getLTTerminalRuleCall_6() { return cLTTerminalRuleCall_6; }
		
		//(directives+=MyField LT*)*
		public Group getGroup_7() { return cGroup_7; }
		
		//directives+=MyField
		public Assignment getDirectivesAssignment_7_0() { return cDirectivesAssignment_7_0; }
		
		//MyField
		public RuleCall getDirectivesMyFieldParserRuleCall_7_0_0() { return cDirectivesMyFieldParserRuleCall_7_0_0; }
		
		//LT*
		public RuleCall getLTTerminalRuleCall_7_1() { return cLTTerminalRuleCall_7_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class MyAttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug347012TestLanguage.MyAttribute");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cPUBLICAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cPUBLICPublicKeyword_0_0 = (Keyword)cPUBLICAssignment_0.eContents().get(0);
		private final Assignment cPRIVATEAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cPRIVATEPrivateKeyword_1_0 = (Keyword)cPRIVATEAssignment_1.eContents().get(0);
		
		//MyAttribute:
		//    PUBLIC='public' | PRIVATE='private';
		@Override public ParserRule getRule() { return rule; }
		
		//PUBLIC='public' | PRIVATE='private'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//PUBLIC='public'
		public Assignment getPUBLICAssignment_0() { return cPUBLICAssignment_0; }
		
		//'public'
		public Keyword getPUBLICPublicKeyword_0_0() { return cPUBLICPublicKeyword_0_0; }
		
		//PRIVATE='private'
		public Assignment getPRIVATEAssignment_1() { return cPRIVATEAssignment_1; }
		
		//'private'
		public Keyword getPRIVATEPrivateKeyword_1_0() { return cPRIVATEPrivateKeyword_1_0; }
	}
	public class MyAttributesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug347012TestLanguage.MyAttributes");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMyAttributesAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cAttributesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAttributesMyAttributeParserRuleCall_1_0 = (RuleCall)cAttributesAssignment_1.eContents().get(0);
		
		//MyAttributes:
		//    {MyAttributes} (attributes+=MyAttribute)*;
		@Override public ParserRule getRule() { return rule; }
		
		//{MyAttributes} (attributes+=MyAttribute)*
		public Group getGroup() { return cGroup; }
		
		//{MyAttributes}
		public Action getMyAttributesAction_0() { return cMyAttributesAction_0; }
		
		//(attributes+=MyAttribute)*
		public Assignment getAttributesAssignment_1() { return cAttributesAssignment_1; }
		
		//MyAttribute
		public RuleCall getAttributesMyAttributeParserRuleCall_1_0() { return cAttributesMyAttributeParserRuleCall_1_0; }
	}
	public class MyFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug347012TestLanguage.MyField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAttrAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAttrMyAttributesParserRuleCall_0_0 = (RuleCall)cAttrAssignment_0.eContents().get(0);
		private final Keyword cVarKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cLTTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cBindingsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cBindingsMyBindingParserRuleCall_3_0 = (RuleCall)cBindingsAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final RuleCall cLTTerminalRuleCall_4_0 = (RuleCall)cGroup_4.eContents().get(0);
		private final Keyword cCommaKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final RuleCall cLTTerminalRuleCall_4_2 = (RuleCall)cGroup_4.eContents().get(2);
		private final Assignment cBindingsAssignment_4_3 = (Assignment)cGroup_4.eContents().get(3);
		private final RuleCall cBindingsMyBindingParserRuleCall_4_3_0 = (RuleCall)cBindingsAssignment_4_3.eContents().get(0);
		private final RuleCall cVirtualSemiParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//MyField:
		//    attr=MyAttributes 'var' LT* bindings+=MyBinding (LT* ',' LT* bindings+=MyBinding)* VirtualSemi;
		@Override public ParserRule getRule() { return rule; }
		
		//attr=MyAttributes 'var' LT* bindings+=MyBinding (LT* ',' LT* bindings+=MyBinding)* VirtualSemi
		public Group getGroup() { return cGroup; }
		
		//attr=MyAttributes
		public Assignment getAttrAssignment_0() { return cAttrAssignment_0; }
		
		//MyAttributes
		public RuleCall getAttrMyAttributesParserRuleCall_0_0() { return cAttrMyAttributesParserRuleCall_0_0; }
		
		//'var'
		public Keyword getVarKeyword_1() { return cVarKeyword_1; }
		
		//LT*
		public RuleCall getLTTerminalRuleCall_2() { return cLTTerminalRuleCall_2; }
		
		//bindings+=MyBinding
		public Assignment getBindingsAssignment_3() { return cBindingsAssignment_3; }
		
		//MyBinding
		public RuleCall getBindingsMyBindingParserRuleCall_3_0() { return cBindingsMyBindingParserRuleCall_3_0; }
		
		//(LT* ',' LT* bindings+=MyBinding)*
		public Group getGroup_4() { return cGroup_4; }
		
		//LT*
		public RuleCall getLTTerminalRuleCall_4_0() { return cLTTerminalRuleCall_4_0; }
		
		//','
		public Keyword getCommaKeyword_4_1() { return cCommaKeyword_4_1; }
		
		//LT*
		public RuleCall getLTTerminalRuleCall_4_2() { return cLTTerminalRuleCall_4_2; }
		
		//bindings+=MyBinding
		public Assignment getBindingsAssignment_4_3() { return cBindingsAssignment_4_3; }
		
		//MyBinding
		public RuleCall getBindingsMyBindingParserRuleCall_4_3_0() { return cBindingsMyBindingParserRuleCall_4_3_0; }
		
		//VirtualSemi
		public RuleCall getVirtualSemiParserRuleCall_5() { return cVirtualSemiParserRuleCall_5; }
	}
	public class MyBindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug347012TestLanguage.MyBinding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cLTTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Keyword cColonKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final RuleCall cLTTerminalRuleCall_1_2 = (RuleCall)cGroup_1.eContents().get(2);
		private final Assignment cTypeAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cTypeFQNParserRuleCall_1_3_0 = (RuleCall)cTypeAssignment_1_3.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final RuleCall cLTTerminalRuleCall_2_0 = (RuleCall)cGroup_2.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final RuleCall cLTTerminalRuleCall_2_2 = (RuleCall)cGroup_2.eContents().get(2);
		private final Assignment cExpressionAssignment_2_3 = (Assignment)cGroup_2.eContents().get(3);
		private final RuleCall cExpressionMyPrimaryParserRuleCall_2_3_0 = (RuleCall)cExpressionAssignment_2_3.eContents().get(0);
		
		//MyBinding:
		//    name=ID (LT* ':' LT* type=FQN)? (LT* '=' LT* expression=MyPrimary)?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID (LT* ':' LT* type=FQN)? (LT* '=' LT* expression=MyPrimary)?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//(LT* ':' LT* type=FQN)?
		public Group getGroup_1() { return cGroup_1; }
		
		//LT*
		public RuleCall getLTTerminalRuleCall_1_0() { return cLTTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_1_1() { return cColonKeyword_1_1; }
		
		//LT*
		public RuleCall getLTTerminalRuleCall_1_2() { return cLTTerminalRuleCall_1_2; }
		
		//type=FQN
		public Assignment getTypeAssignment_1_3() { return cTypeAssignment_1_3; }
		
		//FQN
		public RuleCall getTypeFQNParserRuleCall_1_3_0() { return cTypeFQNParserRuleCall_1_3_0; }
		
		//(LT* '=' LT* expression=MyPrimary)?
		public Group getGroup_2() { return cGroup_2; }
		
		//LT*
		public RuleCall getLTTerminalRuleCall_2_0() { return cLTTerminalRuleCall_2_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2_1() { return cEqualsSignKeyword_2_1; }
		
		//LT*
		public RuleCall getLTTerminalRuleCall_2_2() { return cLTTerminalRuleCall_2_2; }
		
		//expression=MyPrimary
		public Assignment getExpressionAssignment_2_3() { return cExpressionAssignment_2_3; }
		
		//MyPrimary
		public RuleCall getExpressionMyPrimaryParserRuleCall_2_3_0() { return cExpressionMyPrimaryParserRuleCall_2_3_0; }
	}
	
	
	private final MyProgramElements pMyProgram;
	private final IdentifierElements pIdentifier;
	private final FQNElements pFQN;
	private final VirtualSemiElements pVirtualSemi;
	private final LiteralElements pLiteral;
	private final MyPrimaryElements pMyPrimary;
	private final MyPackageElements pMyPackage;
	private final MyClassElements pMyClass;
	private final MyAttributeElements pMyAttribute;
	private final MyAttributesElements pMyAttributes;
	private final MyFieldElements pMyField;
	private final MyBindingElements pMyBinding;
	private final TerminalRule tID;
	private final TerminalRule tLT;
	private final TerminalRule tWS;
	private final TerminalRule tSTRING;
	private final TerminalRule tNUMBER;
	private final TerminalRule tDigit;
	private final TerminalRule tHex;
	private final TerminalRule tEscape;
	private final TerminalRule tIdPlainChar;
	
	private final Grammar grammar;

	@Inject
	public Bug347012TestLanguageGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pMyProgram = new MyProgramElements();
		this.pIdentifier = new IdentifierElements();
		this.pFQN = new FQNElements();
		this.pVirtualSemi = new VirtualSemiElements();
		this.pLiteral = new LiteralElements();
		this.pMyPrimary = new MyPrimaryElements();
		this.pMyPackage = new MyPackageElements();
		this.pMyClass = new MyClassElements();
		this.pMyAttribute = new MyAttributeElements();
		this.pMyAttributes = new MyAttributesElements();
		this.pMyField = new MyFieldElements();
		this.pMyBinding = new MyBindingElements();
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug347012TestLanguage.ID");
		this.tLT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug347012TestLanguage.LT");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug347012TestLanguage.WS");
		this.tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug347012TestLanguage.STRING");
		this.tNUMBER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug347012TestLanguage.NUMBER");
		this.tDigit = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug347012TestLanguage.digit");
		this.tHex = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug347012TestLanguage.hex");
		this.tEscape = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug347012TestLanguage.escape");
		this.tIdPlainChar = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.Bug347012TestLanguage.idPlainChar");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.ui.tests.editor.contentassist.Bug347012TestLanguage".equals(grammar.getName())) {
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
	

	
	//MyProgram:
	//    {MyProgram} LT* package=MyPackage LT*;
	public MyProgramElements getMyProgramAccess() {
		return pMyProgram;
	}
	
	public ParserRule getMyProgramRule() {
		return getMyProgramAccess().getRule();
	}
	
	//Identifier:
	//    name=ID;
	public IdentifierElements getIdentifierAccess() {
		return pIdentifier;
	}
	
	public ParserRule getIdentifierRule() {
		return getIdentifierAccess().getRule();
	}
	
	//FQN:
	//    ID (LT* '.' LT* ID)*;
	public FQNElements getFQNAccess() {
		return pFQN;
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}
	
	//VirtualSemi:
	//    ';' | LT;
	public VirtualSemiElements getVirtualSemiAccess() {
		return pVirtualSemi;
	}
	
	public ParserRule getVirtualSemiRule() {
		return getVirtualSemiAccess().getRule();
	}
	
	//Literal:
	//    num=NUMBER | str=STRING | bool='true' | bool='false';
	public LiteralElements getLiteralAccess() {
		return pLiteral;
	}
	
	public ParserRule getLiteralRule() {
		return getLiteralAccess().getRule();
	}
	
	//MyPrimary:
	//    Literal | Identifier;
	public MyPrimaryElements getMyPrimaryAccess() {
		return pMyPrimary;
	}
	
	public ParserRule getMyPrimaryRule() {
		return getMyPrimaryAccess().getRule();
	}
	
	//MyPackage:
	//    'package' LT* name=FQN LT* '{' LT* (directives+=MyClass LT*)* '}';
	public MyPackageElements getMyPackageAccess() {
		return pMyPackage;
	}
	
	public ParserRule getMyPackageRule() {
		return getMyPackageAccess().getRule();
	}
	
	//MyClass:
	//    'public'? 'class' LT* name=ID LT* '{' LT* (directives+=MyField LT*)* '}';
	public MyClassElements getMyClassAccess() {
		return pMyClass;
	}
	
	public ParserRule getMyClassRule() {
		return getMyClassAccess().getRule();
	}
	
	//MyAttribute:
	//    PUBLIC='public' | PRIVATE='private';
	public MyAttributeElements getMyAttributeAccess() {
		return pMyAttribute;
	}
	
	public ParserRule getMyAttributeRule() {
		return getMyAttributeAccess().getRule();
	}
	
	//MyAttributes:
	//    {MyAttributes} (attributes+=MyAttribute)*;
	public MyAttributesElements getMyAttributesAccess() {
		return pMyAttributes;
	}
	
	public ParserRule getMyAttributesRule() {
		return getMyAttributesAccess().getRule();
	}
	
	//MyField:
	//    attr=MyAttributes 'var' LT* bindings+=MyBinding (LT* ',' LT* bindings+=MyBinding)* VirtualSemi;
	public MyFieldElements getMyFieldAccess() {
		return pMyField;
	}
	
	public ParserRule getMyFieldRule() {
		return getMyFieldAccess().getRule();
	}
	
	//MyBinding:
	//    name=ID (LT* ':' LT* type=FQN)? (LT* '=' LT* expression=MyPrimary)?;
	public MyBindingElements getMyBindingAccess() {
		return pMyBinding;
	}
	
	public ParserRule getMyBindingRule() {
		return getMyBindingAccess().getRule();
	}
	
	//    // terminal rules
	//terminal ID:
	//    idPlainChar (idPlainChar | digit)*;
	public TerminalRule getIDRule() {
		return tID;
	}
	
	//terminal LT:
	//    '\r' '\n' | '\r' | '\n';
	public TerminalRule getLTRule() {
		return tLT;
	}
	
	//terminal WS:
	//    (' ' | '\t')+;
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//terminal STRING:
	//    '"' ('\\' escape | !('\\' | '"'))* '"';
	public TerminalRule getSTRINGRule() {
		return tSTRING;
	}
	
	//terminal NUMBER returns ecore::EDouble:
	//    digit+ ('.' digit+)? | '.' digit+;
	public TerminalRule getNUMBERRule() {
		return tNUMBER;
	}
	
	///* SuppressWarnings[InvalidTerminalRuleName] */
	//terminal fragment digit:
	//    '0'..'9';
	public TerminalRule getDigitRule() {
		return tDigit;
	}
	
	///* SuppressWarnings[InvalidTerminalRuleName] */
	//terminal fragment hex:
	//    digit | 'A'..'F' | 'a'..'f';
	public TerminalRule getHexRule() {
		return tHex;
	}
	
	///* SuppressWarnings[InvalidTerminalRuleName] */
	//terminal fragment escape:
	//    ('b' | 't' | 'n' | 'f' | 'v' | 'r' | '"' | "'" | '\\' | 'u' hex hex hex hex);
	public TerminalRule getEscapeRule() {
		return tEscape;
	}
	
	///* SuppressWarnings[InvalidTerminalRuleName] */
	//terminal fragment idPlainChar:
	//    '$' | 'A'..'Z' | '_' | 'a'..'z';
	public TerminalRule getIdPlainCharRule() {
		return tIdPlainChar;
	}
}
