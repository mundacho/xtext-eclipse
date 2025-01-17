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
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class BacktrackingContentAssistTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class DocumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Document");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cPackagesAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cPackagesPackageDeclarationParserRuleCall_0_0 = (RuleCall)cPackagesAssignment_0.eContents().get(0);
		private final Assignment cContextsAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cContextsContextDeclParserRuleCall_1_0 = (RuleCall)cContextsAssignment_1.eContents().get(0);
		
		//Document :
		//    (packages+=PackageDeclaration | contexts+=ContextDecl)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//(packages+=PackageDeclaration | contexts+=ContextDecl)*
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//packages+=PackageDeclaration
		public Assignment getPackagesAssignment_0() { return cPackagesAssignment_0; }
		
		//PackageDeclaration
		public RuleCall getPackagesPackageDeclarationParserRuleCall_0_0() { return cPackagesPackageDeclarationParserRuleCall_0_0; }
		
		//contexts+=ContextDecl
		public Assignment getContextsAssignment_1() { return cContextsAssignment_1; }
		
		//ContextDecl
		public RuleCall getContextsContextDeclParserRuleCall_1_0() { return cContextsContextDeclParserRuleCall_1_0; }
	}
	public class BodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Body");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBodyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cConstraintNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConstraintNameIdentifierParserRuleCall_1_0 = (RuleCall)cConstraintNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpressionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpressionExpressionParserRuleCall_3_0 = (RuleCall)cExpressionAssignment_3.eContents().get(0);
		
		//Body:
		//    'body' (constraintName=Identifier)? ':' expression=Expression
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'body' (constraintName=Identifier)? ':' expression=Expression
		public Group getGroup() { return cGroup; }
		
		//'body'
		public Keyword getBodyKeyword_0() { return cBodyKeyword_0; }
		
		//(constraintName=Identifier)?
		public Assignment getConstraintNameAssignment_1() { return cConstraintNameAssignment_1; }
		
		//Identifier
		public RuleCall getConstraintNameIdentifierParserRuleCall_1_0() { return cConstraintNameIdentifierParserRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//expression=Expression
		public Assignment getExpressionAssignment_3() { return cExpressionAssignment_3; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_3_0() { return cExpressionExpressionParserRuleCall_3_0; }
	}
	public class ClassifierContextDeclElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.ClassifierContextDecl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContextKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cSelfNameAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cSelfNameIdentifierParserRuleCall_1_0_0 = (RuleCall)cSelfNameAssignment_1_0.eContents().get(0);
		private final Keyword cColonKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cClassifierAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cClassifierClassifierRefParserRuleCall_2_0 = (RuleCall)cClassifierAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cInvariantsAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cInvariantsInvariantParserRuleCall_3_0_0 = (RuleCall)cInvariantsAssignment_3_0.eContents().get(0);
		private final Assignment cDefinitionsAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cDefinitionsDefinitionParserRuleCall_3_1_0 = (RuleCall)cDefinitionsAssignment_3_1.eContents().get(0);
		
		//ClassifierContextDecl:
		//    'context' (selfName=Identifier ':' )? classifier=ClassifierRef
		//        (invariants+=Invariant | definitions+=Definition)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'context' (selfName=Identifier ':' )? classifier=ClassifierRef
		//    (invariants+=Invariant | definitions+=Definition)*
		public Group getGroup() { return cGroup; }
		
		//'context'
		public Keyword getContextKeyword_0() { return cContextKeyword_0; }
		
		//(selfName=Identifier ':' )?
		public Group getGroup_1() { return cGroup_1; }
		
		//selfName=Identifier
		public Assignment getSelfNameAssignment_1_0() { return cSelfNameAssignment_1_0; }
		
		//Identifier
		public RuleCall getSelfNameIdentifierParserRuleCall_1_0_0() { return cSelfNameIdentifierParserRuleCall_1_0_0; }
		
		//':'
		public Keyword getColonKeyword_1_1() { return cColonKeyword_1_1; }
		
		//classifier=ClassifierRef
		public Assignment getClassifierAssignment_2() { return cClassifierAssignment_2; }
		
		//ClassifierRef
		public RuleCall getClassifierClassifierRefParserRuleCall_2_0() { return cClassifierClassifierRefParserRuleCall_2_0; }
		
		//(invariants+=Invariant | definitions+=Definition)*
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//invariants+=Invariant
		public Assignment getInvariantsAssignment_3_0() { return cInvariantsAssignment_3_0; }
		
		//Invariant
		public RuleCall getInvariantsInvariantParserRuleCall_3_0_0() { return cInvariantsInvariantParserRuleCall_3_0_0; }
		
		//definitions+=Definition
		public Assignment getDefinitionsAssignment_3_1() { return cDefinitionsAssignment_3_1; }
		
		//Definition
		public RuleCall getDefinitionsDefinitionParserRuleCall_3_1_0() { return cDefinitionsDefinitionParserRuleCall_3_1_0; }
	}
	public class ClassifierRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.ClassifierRef");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cQualifiedClassifierRefParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSimpleClassifierRefParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ClassifierRef:
		//    QualifiedClassifierRef | SimpleClassifierRef
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedClassifierRef | SimpleClassifierRef
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//QualifiedClassifierRef
		public RuleCall getQualifiedClassifierRefParserRuleCall_0() { return cQualifiedClassifierRefParserRuleCall_0; }
		
		//SimpleClassifierRef
		public RuleCall getSimpleClassifierRefParserRuleCall_1() { return cSimpleClassifierRefParserRuleCall_1; }
	}
	public class ContextDeclElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.ContextDecl");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPropertyContextDeclParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cClassifierContextDeclParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cOperationContextDeclParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//ContextDecl:
		//    PropertyContextDecl
		//|    ClassifierContextDecl
		//|    OperationContextDecl
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//    PropertyContextDecl
		//|    ClassifierContextDecl
		//|    OperationContextDecl
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//PropertyContextDecl
		public RuleCall getPropertyContextDeclParserRuleCall_0() { return cPropertyContextDeclParserRuleCall_0; }
		
		//ClassifierContextDecl
		public RuleCall getClassifierContextDeclParserRuleCall_1() { return cClassifierContextDeclParserRuleCall_1; }
		
		//OperationContextDecl
		public RuleCall getOperationContextDeclParserRuleCall_2() { return cOperationContextDeclParserRuleCall_2; }
	}
	public class DefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Definition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cStaticAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cStaticStaticKeyword_0_0 = (Keyword)cStaticAssignment_0.eContents().get(0);
		private final Keyword cDefKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cConstraintNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cConstraintNameIdentifierParserRuleCall_2_0 = (RuleCall)cConstraintNameAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cConstrainedNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cConstrainedNameIdentifierParserRuleCall_4_0 = (RuleCall)cConstrainedNameAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cLeftParenthesisKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Group cGroup_5_1 = (Group)cGroup_5.eContents().get(1);
		private final Assignment cParametersAssignment_5_1_0 = (Assignment)cGroup_5_1.eContents().get(0);
		private final RuleCall cParametersParameterParserRuleCall_5_1_0_0 = (RuleCall)cParametersAssignment_5_1_0.eContents().get(0);
		private final Group cGroup_5_1_1 = (Group)cGroup_5_1.eContents().get(1);
		private final Keyword cCommaKeyword_5_1_1_0 = (Keyword)cGroup_5_1_1.eContents().get(0);
		private final Assignment cParametersAssignment_5_1_1_1 = (Assignment)cGroup_5_1_1.eContents().get(1);
		private final RuleCall cParametersParameterParserRuleCall_5_1_1_1_0 = (RuleCall)cParametersAssignment_5_1_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5_2 = (Keyword)cGroup_5.eContents().get(2);
		private final Keyword cColonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cTypeAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cTypeTypeExpParserRuleCall_7_0 = (RuleCall)cTypeAssignment_7.eContents().get(0);
		private final Keyword cEqualsSignKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cExpressionAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cExpressionExpressionParserRuleCall_9_0 = (RuleCall)cExpressionAssignment_9.eContents().get(0);
		
		//Definition:
		//    (static?='static')? 'def' (constraintName=Identifier)? ':' constrainedName=Identifier
		//    ('(' (parameters+=Parameter (',' parameters+=Parameter)*)? ')')?
		//    ':' (type=TypeExp)? '=' expression=Expression
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//(static?='static')? 'def' (constraintName=Identifier)? ':' constrainedName=Identifier
		//('(' (parameters+=Parameter (',' parameters+=Parameter)*)? ')')?
		//':' (type=TypeExp)? '=' expression=Expression
		public Group getGroup() { return cGroup; }
		
		//(static?='static')?
		public Assignment getStaticAssignment_0() { return cStaticAssignment_0; }
		
		//'static'
		public Keyword getStaticStaticKeyword_0_0() { return cStaticStaticKeyword_0_0; }
		
		//'def'
		public Keyword getDefKeyword_1() { return cDefKeyword_1; }
		
		//(constraintName=Identifier)?
		public Assignment getConstraintNameAssignment_2() { return cConstraintNameAssignment_2; }
		
		//Identifier
		public RuleCall getConstraintNameIdentifierParserRuleCall_2_0() { return cConstraintNameIdentifierParserRuleCall_2_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//constrainedName=Identifier
		public Assignment getConstrainedNameAssignment_4() { return cConstrainedNameAssignment_4; }
		
		//Identifier
		public RuleCall getConstrainedNameIdentifierParserRuleCall_4_0() { return cConstrainedNameIdentifierParserRuleCall_4_0; }
		
		//('(' (parameters+=Parameter (',' parameters+=Parameter)*)? ')')?
		public Group getGroup_5() { return cGroup_5; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_5_0() { return cLeftParenthesisKeyword_5_0; }
		
		//(parameters+=Parameter (',' parameters+=Parameter)*)?
		public Group getGroup_5_1() { return cGroup_5_1; }
		
		//parameters+=Parameter
		public Assignment getParametersAssignment_5_1_0() { return cParametersAssignment_5_1_0; }
		
		//Parameter
		public RuleCall getParametersParameterParserRuleCall_5_1_0_0() { return cParametersParameterParserRuleCall_5_1_0_0; }
		
		//(',' parameters+=Parameter)*
		public Group getGroup_5_1_1() { return cGroup_5_1_1; }
		
		//','
		public Keyword getCommaKeyword_5_1_1_0() { return cCommaKeyword_5_1_1_0; }
		
		//parameters+=Parameter
		public Assignment getParametersAssignment_5_1_1_1() { return cParametersAssignment_5_1_1_1; }
		
		//Parameter
		public RuleCall getParametersParameterParserRuleCall_5_1_1_1_0() { return cParametersParameterParserRuleCall_5_1_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5_2() { return cRightParenthesisKeyword_5_2; }
		
		//':'
		public Keyword getColonKeyword_6() { return cColonKeyword_6; }
		
		//(type=TypeExp)?
		public Assignment getTypeAssignment_7() { return cTypeAssignment_7; }
		
		//TypeExp
		public RuleCall getTypeTypeExpParserRuleCall_7_0() { return cTypeTypeExpParserRuleCall_7_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_8() { return cEqualsSignKeyword_8; }
		
		//expression=Expression
		public Assignment getExpressionAssignment_9() { return cExpressionAssignment_9; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_9_0() { return cExpressionExpressionParserRuleCall_9_0; }
	}
	public class DerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Der");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDeriveKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExpressionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpressionExpressionParserRuleCall_2_0 = (RuleCall)cExpressionAssignment_2.eContents().get(0);
		
		//Der:
		//    'derive' ':' expression=Expression
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'derive' ':' expression=Expression
		public Group getGroup() { return cGroup; }
		
		//'derive'
		public Keyword getDeriveKeyword_0() { return cDeriveKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//expression=Expression
		public Assignment getExpressionAssignment_2() { return cExpressionAssignment_2; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_2_0() { return cExpressionExpressionParserRuleCall_2_0; }
	}
	public class InitElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Init");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInitKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExpressionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpressionExpressionParserRuleCall_2_0 = (RuleCall)cExpressionAssignment_2.eContents().get(0);
		
		//Init:
		//    'init' ':' expression=Expression
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'init' ':' expression=Expression
		public Group getGroup() { return cGroup; }
		
		//'init'
		public Keyword getInitKeyword_0() { return cInitKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//expression=Expression
		public Assignment getExpressionAssignment_2() { return cExpressionAssignment_2; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_2_0() { return cExpressionExpressionParserRuleCall_2_0; }
	}
	public class InvariantElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Invariant");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInvKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cConstraintNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConstraintNameIdentifierParserRuleCall_1_0 = (RuleCall)cConstraintNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpressionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpressionExpressionParserRuleCall_3_0 = (RuleCall)cExpressionAssignment_3.eContents().get(0);
		
		//Invariant:
		//    'inv' (constraintName=Identifier)? ':' expression=Expression
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'inv' (constraintName=Identifier)? ':' expression=Expression
		public Group getGroup() { return cGroup; }
		
		//'inv'
		public Keyword getInvKeyword_0() { return cInvKeyword_0; }
		
		//(constraintName=Identifier)?
		public Assignment getConstraintNameAssignment_1() { return cConstraintNameAssignment_1; }
		
		//Identifier
		public RuleCall getConstraintNameIdentifierParserRuleCall_1_0() { return cConstraintNameIdentifierParserRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//expression=Expression
		public Assignment getExpressionAssignment_3() { return cExpressionAssignment_3; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_3_0() { return cExpressionExpressionParserRuleCall_3_0; }
	}
	public class OperationContextDeclElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.OperationContextDecl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContextKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cOperationAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOperationOperationRefParserRuleCall_1_0 = (RuleCall)cOperationAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cParametersAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cParametersParameterParserRuleCall_3_0_0 = (RuleCall)cParametersAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cParametersAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cParametersParameterParserRuleCall_3_1_1_0 = (RuleCall)cParametersAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cColonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cTypeAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cTypeTypeExpParserRuleCall_6_0 = (RuleCall)cTypeAssignment_6.eContents().get(0);
		private final Alternatives cAlternatives_7 = (Alternatives)cGroup.eContents().get(7);
		private final Assignment cPresAssignment_7_0 = (Assignment)cAlternatives_7.eContents().get(0);
		private final RuleCall cPresPreParserRuleCall_7_0_0 = (RuleCall)cPresAssignment_7_0.eContents().get(0);
		private final Assignment cPostsAssignment_7_1 = (Assignment)cAlternatives_7.eContents().get(1);
		private final RuleCall cPostsPostParserRuleCall_7_1_0 = (RuleCall)cPostsAssignment_7_1.eContents().get(0);
		private final Assignment cBodiesAssignment_7_2 = (Assignment)cAlternatives_7.eContents().get(2);
		private final RuleCall cBodiesBodyParserRuleCall_7_2_0 = (RuleCall)cBodiesAssignment_7_2.eContents().get(0);
		
		//OperationContextDecl:
		//    'context' operation=OperationRef '('
		//    (parameters+=Parameter (',' parameters+=Parameter)*)?
		//    ')' ':' (type=TypeExp)?
		//    ((pres+=Pre) | (posts+=Post) | (bodies+=Body))*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'context' operation=OperationRef '('
		//(parameters+=Parameter (',' parameters+=Parameter)*)?
		//')' ':' (type=TypeExp)?
		//((pres+=Pre) | (posts+=Post) | (bodies+=Body))*
		public Group getGroup() { return cGroup; }
		
		//'context'
		public Keyword getContextKeyword_0() { return cContextKeyword_0; }
		
		//operation=OperationRef
		public Assignment getOperationAssignment_1() { return cOperationAssignment_1; }
		
		//OperationRef
		public RuleCall getOperationOperationRefParserRuleCall_1_0() { return cOperationOperationRefParserRuleCall_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//(parameters+=Parameter (',' parameters+=Parameter)*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//parameters+=Parameter
		public Assignment getParametersAssignment_3_0() { return cParametersAssignment_3_0; }
		
		//Parameter
		public RuleCall getParametersParameterParserRuleCall_3_0_0() { return cParametersParameterParserRuleCall_3_0_0; }
		
		//(',' parameters+=Parameter)*
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//','
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }
		
		//parameters+=Parameter
		public Assignment getParametersAssignment_3_1_1() { return cParametersAssignment_3_1_1; }
		
		//Parameter
		public RuleCall getParametersParameterParserRuleCall_3_1_1_0() { return cParametersParameterParserRuleCall_3_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
		
		//':'
		public Keyword getColonKeyword_5() { return cColonKeyword_5; }
		
		//(type=TypeExp)?
		public Assignment getTypeAssignment_6() { return cTypeAssignment_6; }
		
		//TypeExp
		public RuleCall getTypeTypeExpParserRuleCall_6_0() { return cTypeTypeExpParserRuleCall_6_0; }
		
		//((pres+=Pre) | (posts+=Post) | (bodies+=Body))*
		public Alternatives getAlternatives_7() { return cAlternatives_7; }
		
		//(pres+=Pre)
		public Assignment getPresAssignment_7_0() { return cPresAssignment_7_0; }
		
		//Pre
		public RuleCall getPresPreParserRuleCall_7_0_0() { return cPresPreParserRuleCall_7_0_0; }
		
		//(posts+=Post)
		public Assignment getPostsAssignment_7_1() { return cPostsAssignment_7_1; }
		
		//Post
		public RuleCall getPostsPostParserRuleCall_7_1_0() { return cPostsPostParserRuleCall_7_1_0; }
		
		//(bodies+=Body)
		public Assignment getBodiesAssignment_7_2() { return cBodiesAssignment_7_2; }
		
		//Body
		public RuleCall getBodiesBodyParserRuleCall_7_2_0() { return cBodiesBodyParserRuleCall_7_2_0; }
	}
	public class OperationRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.OperationRef");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cQualifiedOperationRefParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSimpleOperationRefParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//OperationRef:
		//    QualifiedOperationRef | SimpleOperationRef
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedOperationRef | SimpleOperationRef
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//QualifiedOperationRef
		public RuleCall getQualifiedOperationRefParserRuleCall_0() { return cQualifiedOperationRefParserRuleCall_0; }
		
		//SimpleOperationRef
		public RuleCall getSimpleOperationRefParserRuleCall_1() { return cSimpleOperationRefParserRuleCall_1; }
	}
	public class PackageDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.PackageDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPackageAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPackagePackageRefParserRuleCall_1_0 = (RuleCall)cPackageAssignment_1.eContents().get(0);
		private final Assignment cContextsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cContextsContextDeclParserRuleCall_2_0 = (RuleCall)cContextsAssignment_2.eContents().get(0);
		private final Keyword cEndpackageKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//PackageDeclaration :
		//    'package' package=PackageRef (contexts+=ContextDecl)* 'endpackage'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'package' package=PackageRef (contexts+=ContextDecl)* 'endpackage'
		public Group getGroup() { return cGroup; }
		
		//'package'
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }
		
		//package=PackageRef
		public Assignment getPackageAssignment_1() { return cPackageAssignment_1; }
		
		//PackageRef
		public RuleCall getPackagePackageRefParserRuleCall_1_0() { return cPackagePackageRefParserRuleCall_1_0; }
		
		//(contexts+=ContextDecl)*
		public Assignment getContextsAssignment_2() { return cContextsAssignment_2; }
		
		//ContextDecl
		public RuleCall getContextsContextDeclParserRuleCall_2_0() { return cContextsContextDeclParserRuleCall_2_0; }
		
		//'endpackage'
		public Keyword getEndpackageKeyword_3() { return cEndpackageKeyword_3; }
	}
	public class PackageRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.PackageRef");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cQualifiedPackageRefParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSimplePackageRefParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//PackageRef:
		//    QualifiedPackageRef | SimplePackageRef
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedPackageRef | SimplePackageRef
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//QualifiedPackageRef
		public RuleCall getQualifiedPackageRefParserRuleCall_0() { return cQualifiedPackageRefParserRuleCall_0; }
		
		//SimplePackageRef
		public RuleCall getSimplePackageRefParserRuleCall_1() { return cSimplePackageRefParserRuleCall_1; }
	}
	public class ParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Parameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cNameIdentifierParserRuleCall_0_0_0 = (RuleCall)cNameAssignment_0_0.eContents().get(0);
		private final Keyword cColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeTypeExpParserRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		
		//Parameter:
		//    (name=Identifier ':')? type=TypeExp
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//(name=Identifier ':')? type=TypeExp
		public Group getGroup() { return cGroup; }
		
		//(name=Identifier ':')?
		public Group getGroup_0() { return cGroup_0; }
		
		//name=Identifier
		public Assignment getNameAssignment_0_0() { return cNameAssignment_0_0; }
		
		//Identifier
		public RuleCall getNameIdentifierParserRuleCall_0_0_0() { return cNameIdentifierParserRuleCall_0_0_0; }
		
		//':'
		public Keyword getColonKeyword_0_1() { return cColonKeyword_0_1; }
		
		//type=TypeExp
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//TypeExp
		public RuleCall getTypeTypeExpParserRuleCall_1_0() { return cTypeTypeExpParserRuleCall_1_0; }
	}
	public class PostElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Post");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPostKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cConstraintNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConstraintNameIdentifierParserRuleCall_1_0 = (RuleCall)cConstraintNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpressionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpressionExpressionParserRuleCall_3_0 = (RuleCall)cExpressionAssignment_3.eContents().get(0);
		
		//Post:
		//    'post' (constraintName=Identifier)? ':' expression=Expression
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'post' (constraintName=Identifier)? ':' expression=Expression
		public Group getGroup() { return cGroup; }
		
		//'post'
		public Keyword getPostKeyword_0() { return cPostKeyword_0; }
		
		//(constraintName=Identifier)?
		public Assignment getConstraintNameAssignment_1() { return cConstraintNameAssignment_1; }
		
		//Identifier
		public RuleCall getConstraintNameIdentifierParserRuleCall_1_0() { return cConstraintNameIdentifierParserRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//expression=Expression
		public Assignment getExpressionAssignment_3() { return cExpressionAssignment_3; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_3_0() { return cExpressionExpressionParserRuleCall_3_0; }
	}
	public class PreElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Pre");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPreKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cConstraintNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConstraintNameIdentifierParserRuleCall_1_0 = (RuleCall)cConstraintNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpressionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpressionExpressionParserRuleCall_3_0 = (RuleCall)cExpressionAssignment_3.eContents().get(0);
		
		//Pre:
		//    'pre' (constraintName=Identifier)? ':' expression=Expression
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'pre' (constraintName=Identifier)? ':' expression=Expression
		public Group getGroup() { return cGroup; }
		
		//'pre'
		public Keyword getPreKeyword_0() { return cPreKeyword_0; }
		
		//(constraintName=Identifier)?
		public Assignment getConstraintNameAssignment_1() { return cConstraintNameAssignment_1; }
		
		//Identifier
		public RuleCall getConstraintNameIdentifierParserRuleCall_1_0() { return cConstraintNameIdentifierParserRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//expression=Expression
		public Assignment getExpressionAssignment_3() { return cExpressionAssignment_3; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_3_0() { return cExpressionExpressionParserRuleCall_3_0; }
	}
	public class PropertyContextDeclElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.PropertyContextDecl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContextKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPropertyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPropertyPropertyRefParserRuleCall_1_0 = (RuleCall)cPropertyAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeTypeExpParserRuleCall_3_0 = (RuleCall)cTypeAssignment_3.eContents().get(0);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cAlternatives_4.eContents().get(0);
		private final Assignment cInitAssignment_4_0_0 = (Assignment)cGroup_4_0.eContents().get(0);
		private final RuleCall cInitInitParserRuleCall_4_0_0_0 = (RuleCall)cInitAssignment_4_0_0.eContents().get(0);
		private final Assignment cDerAssignment_4_0_1 = (Assignment)cGroup_4_0.eContents().get(1);
		private final RuleCall cDerDerParserRuleCall_4_0_1_0 = (RuleCall)cDerAssignment_4_0_1.eContents().get(0);
		private final Group cGroup_4_1 = (Group)cAlternatives_4.eContents().get(1);
		private final Assignment cDerAssignment_4_1_0 = (Assignment)cGroup_4_1.eContents().get(0);
		private final RuleCall cDerDerParserRuleCall_4_1_0_0 = (RuleCall)cDerAssignment_4_1_0.eContents().get(0);
		private final Assignment cInitAssignment_4_1_1 = (Assignment)cGroup_4_1.eContents().get(1);
		private final RuleCall cInitInitParserRuleCall_4_1_1_0 = (RuleCall)cInitAssignment_4_1_1.eContents().get(0);
		
		//PropertyContextDecl:
		//    'context' property=PropertyRef ':' type=TypeExp
		//    ((init=Init (der=Der)?)? | (der=Der (init=Init)?))
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'context' property=PropertyRef ':' type=TypeExp
		//((init=Init (der=Der)?)? | (der=Der (init=Init)?))
		public Group getGroup() { return cGroup; }
		
		//'context'
		public Keyword getContextKeyword_0() { return cContextKeyword_0; }
		
		//property=PropertyRef
		public Assignment getPropertyAssignment_1() { return cPropertyAssignment_1; }
		
		//PropertyRef
		public RuleCall getPropertyPropertyRefParserRuleCall_1_0() { return cPropertyPropertyRefParserRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//type=TypeExp
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }
		
		//TypeExp
		public RuleCall getTypeTypeExpParserRuleCall_3_0() { return cTypeTypeExpParserRuleCall_3_0; }
		
		//((init=Init (der=Der)?)? | (der=Der (init=Init)?))
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//(init=Init (der=Der)?)?
		public Group getGroup_4_0() { return cGroup_4_0; }
		
		//init=Init
		public Assignment getInitAssignment_4_0_0() { return cInitAssignment_4_0_0; }
		
		//Init
		public RuleCall getInitInitParserRuleCall_4_0_0_0() { return cInitInitParserRuleCall_4_0_0_0; }
		
		//(der=Der)?
		public Assignment getDerAssignment_4_0_1() { return cDerAssignment_4_0_1; }
		
		//Der
		public RuleCall getDerDerParserRuleCall_4_0_1_0() { return cDerDerParserRuleCall_4_0_1_0; }
		
		//(der=Der (init=Init)?)
		public Group getGroup_4_1() { return cGroup_4_1; }
		
		//der=Der
		public Assignment getDerAssignment_4_1_0() { return cDerAssignment_4_1_0; }
		
		//Der
		public RuleCall getDerDerParserRuleCall_4_1_0_0() { return cDerDerParserRuleCall_4_1_0_0; }
		
		//(init=Init)?
		public Assignment getInitAssignment_4_1_1() { return cInitAssignment_4_1_1; }
		
		//Init
		public RuleCall getInitInitParserRuleCall_4_1_1_0() { return cInitInitParserRuleCall_4_1_1_0; }
	}
	public class PropertyRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.PropertyRef");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cQualifiedPropertyRefParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSimplePropertyRefParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//PropertyRef:
		//    QualifiedPropertyRef | SimplePropertyRef
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedPropertyRef | SimplePropertyRef
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//QualifiedPropertyRef
		public RuleCall getQualifiedPropertyRefParserRuleCall_0() { return cQualifiedPropertyRefParserRuleCall_0; }
		
		//SimplePropertyRef
		public RuleCall getSimplePropertyRefParserRuleCall_1() { return cSimplePropertyRefParserRuleCall_1; }
	}
	public class QualifiedClassifierRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.QualifiedClassifierRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNamespaceAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNamespaceIdentifierParserRuleCall_0_0 = (RuleCall)cNamespaceAssignment_0.eContents().get(0);
		private final Keyword cColonColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cElementAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cElementClassifierRefParserRuleCall_2_0 = (RuleCall)cElementAssignment_2.eContents().get(0);
		
		//QualifiedClassifierRef:
		//    namespace=Identifier
		//    '::' element=ClassifierRef
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//namespace=Identifier
		//'::' element=ClassifierRef
		public Group getGroup() { return cGroup; }
		
		//namespace=Identifier
		public Assignment getNamespaceAssignment_0() { return cNamespaceAssignment_0; }
		
		//Identifier
		public RuleCall getNamespaceIdentifierParserRuleCall_0_0() { return cNamespaceIdentifierParserRuleCall_0_0; }
		
		//'::'
		public Keyword getColonColonKeyword_1() { return cColonColonKeyword_1; }
		
		//element=ClassifierRef
		public Assignment getElementAssignment_2() { return cElementAssignment_2; }
		
		//ClassifierRef
		public RuleCall getElementClassifierRefParserRuleCall_2_0() { return cElementClassifierRefParserRuleCall_2_0; }
	}
	public class QualifiedOperationRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.QualifiedOperationRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNamespaceAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNamespaceIdentifierParserRuleCall_0_0 = (RuleCall)cNamespaceAssignment_0.eContents().get(0);
		private final Keyword cColonColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cElementAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cElementOperationRefParserRuleCall_2_0 = (RuleCall)cElementAssignment_2.eContents().get(0);
		
		//QualifiedOperationRef :
		//    namespace=Identifier
		//    '::' element=OperationRef
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//namespace=Identifier
		//'::' element=OperationRef
		public Group getGroup() { return cGroup; }
		
		//namespace=Identifier
		public Assignment getNamespaceAssignment_0() { return cNamespaceAssignment_0; }
		
		//Identifier
		public RuleCall getNamespaceIdentifierParserRuleCall_0_0() { return cNamespaceIdentifierParserRuleCall_0_0; }
		
		//'::'
		public Keyword getColonColonKeyword_1() { return cColonColonKeyword_1; }
		
		//element=OperationRef
		public Assignment getElementAssignment_2() { return cElementAssignment_2; }
		
		//OperationRef
		public RuleCall getElementOperationRefParserRuleCall_2_0() { return cElementOperationRefParserRuleCall_2_0; }
	}
	public class QualifiedPropertyRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.QualifiedPropertyRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNamespaceAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNamespaceIdentifierParserRuleCall_0_0 = (RuleCall)cNamespaceAssignment_0.eContents().get(0);
		private final Keyword cColonColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cElementAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cElementPropertyRefParserRuleCall_2_0 = (RuleCall)cElementAssignment_2.eContents().get(0);
		
		//QualifiedPropertyRef :
		//    namespace=Identifier
		//    '::' element=PropertyRef
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//namespace=Identifier
		//'::' element=PropertyRef
		public Group getGroup() { return cGroup; }
		
		//namespace=Identifier
		public Assignment getNamespaceAssignment_0() { return cNamespaceAssignment_0; }
		
		//Identifier
		public RuleCall getNamespaceIdentifierParserRuleCall_0_0() { return cNamespaceIdentifierParserRuleCall_0_0; }
		
		//'::'
		public Keyword getColonColonKeyword_1() { return cColonColonKeyword_1; }
		
		//element=PropertyRef
		public Assignment getElementAssignment_2() { return cElementAssignment_2; }
		
		//PropertyRef
		public RuleCall getElementPropertyRefParserRuleCall_2_0() { return cElementPropertyRefParserRuleCall_2_0; }
	}
	public class QualifiedPackageRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.QualifiedPackageRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNamespaceAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNamespaceIdentifierParserRuleCall_0_0 = (RuleCall)cNamespaceAssignment_0.eContents().get(0);
		private final Keyword cColonColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cElementAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cElementPackageRefParserRuleCall_2_0 = (RuleCall)cElementAssignment_2.eContents().get(0);
		
		//QualifiedPackageRef :
		//    namespace=Identifier
		//    '::' element=PackageRef
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//namespace=Identifier
		//'::' element=PackageRef
		public Group getGroup() { return cGroup; }
		
		//namespace=Identifier
		public Assignment getNamespaceAssignment_0() { return cNamespaceAssignment_0; }
		
		//Identifier
		public RuleCall getNamespaceIdentifierParserRuleCall_0_0() { return cNamespaceIdentifierParserRuleCall_0_0; }
		
		//'::'
		public Keyword getColonColonKeyword_1() { return cColonColonKeyword_1; }
		
		//element=PackageRef
		public Assignment getElementAssignment_2() { return cElementAssignment_2; }
		
		//PackageRef
		public RuleCall getElementPackageRefParserRuleCall_2_0() { return cElementPackageRefParserRuleCall_2_0; }
	}
	public class SimpleClassifierRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.SimpleClassifierRef");
		private final Assignment cClassifierAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cClassifierIdentifierParserRuleCall_0 = (RuleCall)cClassifierAssignment.eContents().get(0);
		
		//SimpleClassifierRef :
		//    classifier=Identifier
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//classifier=Identifier
		public Assignment getClassifierAssignment() { return cClassifierAssignment; }
		
		//Identifier
		public RuleCall getClassifierIdentifierParserRuleCall_0() { return cClassifierIdentifierParserRuleCall_0; }
	}
	public class SimpleOperationRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.SimpleOperationRef");
		private final Assignment cOperationAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cOperationIdentifierParserRuleCall_0 = (RuleCall)cOperationAssignment.eContents().get(0);
		
		//SimpleOperationRef :
		//    operation=Identifier
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//operation=Identifier
		public Assignment getOperationAssignment() { return cOperationAssignment; }
		
		//Identifier
		public RuleCall getOperationIdentifierParserRuleCall_0() { return cOperationIdentifierParserRuleCall_0; }
	}
	public class SimplePackageRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.SimplePackageRef");
		private final Assignment cPackageAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cPackageIdentifierParserRuleCall_0 = (RuleCall)cPackageAssignment.eContents().get(0);
		
		//SimplePackageRef :
		//    package=Identifier
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//package=Identifier
		public Assignment getPackageAssignment() { return cPackageAssignment; }
		
		//Identifier
		public RuleCall getPackageIdentifierParserRuleCall_0() { return cPackageIdentifierParserRuleCall_0; }
	}
	public class SimplePropertyRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.SimplePropertyRef");
		private final Assignment cFeatureAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cFeatureIdentifierParserRuleCall_0 = (RuleCall)cFeatureAssignment.eContents().get(0);
		
		//SimplePropertyRef :
		//    feature=Identifier
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//feature=Identifier
		public Assignment getFeatureAssignment() { return cFeatureAssignment; }
		
		//Identifier
		public RuleCall getFeatureIdentifierParserRuleCall_0() { return cFeatureIdentifierParserRuleCall_0; }
	}
	public class NavigationExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.NavigationExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSubNavigationExpParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Action cInfixExpSourceAction_1_0_0 = (Action)cGroup_1_0.eContents().get(0);
		private final Assignment cOpAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final Alternatives cOpAlternatives_1_0_1_0 = (Alternatives)cOpAssignment_1_0_1.eContents().get(0);
		private final Keyword cOpFullStopKeyword_1_0_1_0_0 = (Keyword)cOpAlternatives_1_0_1_0.eContents().get(0);
		private final Keyword cOpHyphenMinusGreaterThanSignKeyword_1_0_1_0_1 = (Keyword)cOpAlternatives_1_0_1_0.eContents().get(1);
		private final Assignment cArgumentAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cArgumentNavigatingExpParserRuleCall_1_0_2_0 = (RuleCall)cArgumentAssignment_1_0_2.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Action cOclMessageSourceAction_1_1_0 = (Action)cGroup_1_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final Alternatives cOpAlternatives_1_1_1_0 = (Alternatives)cOpAssignment_1_1_1.eContents().get(0);
		private final Keyword cOpCircumflexAccentCircumflexAccentKeyword_1_1_1_0_0 = (Keyword)cOpAlternatives_1_1_1_0.eContents().get(0);
		private final Keyword cOpCircumflexAccentKeyword_1_1_1_0_1 = (Keyword)cOpAlternatives_1_1_1_0.eContents().get(1);
		private final Assignment cMessageNameAssignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final RuleCall cMessageNameIdentifierParserRuleCall_1_1_2_0 = (RuleCall)cMessageNameAssignment_1_1_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_1_3 = (Keyword)cGroup_1_1.eContents().get(3);
		private final Group cGroup_1_1_4 = (Group)cGroup_1_1.eContents().get(4);
		private final Assignment cArgumentsAssignment_1_1_4_0 = (Assignment)cGroup_1_1_4.eContents().get(0);
		private final RuleCall cArgumentsOclMessageArgParserRuleCall_1_1_4_0_0 = (RuleCall)cArgumentsAssignment_1_1_4_0.eContents().get(0);
		private final Group cGroup_1_1_4_1 = (Group)cGroup_1_1_4.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_4_1_0 = (Keyword)cGroup_1_1_4_1.eContents().get(0);
		private final Assignment cArgumentsAssignment_1_1_4_1_1 = (Assignment)cGroup_1_1_4_1.eContents().get(1);
		private final RuleCall cArgumentsOclMessageArgParserRuleCall_1_1_4_1_1_0 = (RuleCall)cArgumentsAssignment_1_1_4_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_1_5 = (Keyword)cGroup_1_1.eContents().get(5);
		
		////---------------------------------------------------------------------------------
		////    EssentialOCL overrides
		////---------------------------------------------------------------------------------
		//NavigationExp returns Expression:
		//    SubNavigationExp
		//    (
		//        ({InfixExp.source=current} op=('.'|'->') argument=NavigatingExp)
		//    |    ({OclMessage.source=current} op=('^^'|'^') messageName=Identifier
		//            '(' (arguments+=OclMessageArg (',' arguments+=OclMessageArg)*)? ')')
		//    )?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//SubNavigationExp
		//(
		//    ({InfixExp.source=current} op=('.'|'->') argument=NavigatingExp)
		//|    ({OclMessage.source=current} op=('^^'|'^') messageName=Identifier
		//        '(' (arguments+=OclMessageArg (',' arguments+=OclMessageArg)*)? ')')
		//)?
		public Group getGroup() { return cGroup; }
		
		//SubNavigationExp
		public RuleCall getSubNavigationExpParserRuleCall_0() { return cSubNavigationExpParserRuleCall_0; }
		
		//(
		//    ({InfixExp.source=current} op=('.'|'->') argument=NavigatingExp)
		//|    ({OclMessage.source=current} op=('^^'|'^') messageName=Identifier
		//        '(' (arguments+=OclMessageArg (',' arguments+=OclMessageArg)*)? ')')
		//)?
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//({InfixExp.source=current} op=('.'|'->') argument=NavigatingExp)
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{InfixExp.source=current}
		public Action getInfixExpSourceAction_1_0_0() { return cInfixExpSourceAction_1_0_0; }
		
		//op=('.'|'->')
		public Assignment getOpAssignment_1_0_1() { return cOpAssignment_1_0_1; }
		
		//('.'|'->')
		public Alternatives getOpAlternatives_1_0_1_0() { return cOpAlternatives_1_0_1_0; }
		
		//'.'
		public Keyword getOpFullStopKeyword_1_0_1_0_0() { return cOpFullStopKeyword_1_0_1_0_0; }
		
		//'->'
		public Keyword getOpHyphenMinusGreaterThanSignKeyword_1_0_1_0_1() { return cOpHyphenMinusGreaterThanSignKeyword_1_0_1_0_1; }
		
		//argument=NavigatingExp
		public Assignment getArgumentAssignment_1_0_2() { return cArgumentAssignment_1_0_2; }
		
		//NavigatingExp
		public RuleCall getArgumentNavigatingExpParserRuleCall_1_0_2_0() { return cArgumentNavigatingExpParserRuleCall_1_0_2_0; }
		
		//({OclMessage.source=current} op=('^^'|'^') messageName=Identifier
		//        '(' (arguments+=OclMessageArg (',' arguments+=OclMessageArg)*)? ')')
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//{OclMessage.source=current}
		public Action getOclMessageSourceAction_1_1_0() { return cOclMessageSourceAction_1_1_0; }
		
		//op=('^^'|'^')
		public Assignment getOpAssignment_1_1_1() { return cOpAssignment_1_1_1; }
		
		//('^^'|'^')
		public Alternatives getOpAlternatives_1_1_1_0() { return cOpAlternatives_1_1_1_0; }
		
		//'^^'
		public Keyword getOpCircumflexAccentCircumflexAccentKeyword_1_1_1_0_0() { return cOpCircumflexAccentCircumflexAccentKeyword_1_1_1_0_0; }
		
		//'^'
		public Keyword getOpCircumflexAccentKeyword_1_1_1_0_1() { return cOpCircumflexAccentKeyword_1_1_1_0_1; }
		
		//messageName=Identifier
		public Assignment getMessageNameAssignment_1_1_2() { return cMessageNameAssignment_1_1_2; }
		
		//Identifier
		public RuleCall getMessageNameIdentifierParserRuleCall_1_1_2_0() { return cMessageNameIdentifierParserRuleCall_1_1_2_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_1_3() { return cLeftParenthesisKeyword_1_1_3; }
		
		//(arguments+=OclMessageArg (',' arguments+=OclMessageArg)*)?
		public Group getGroup_1_1_4() { return cGroup_1_1_4; }
		
		//arguments+=OclMessageArg
		public Assignment getArgumentsAssignment_1_1_4_0() { return cArgumentsAssignment_1_1_4_0; }
		
		//OclMessageArg
		public RuleCall getArgumentsOclMessageArgParserRuleCall_1_1_4_0_0() { return cArgumentsOclMessageArgParserRuleCall_1_1_4_0_0; }
		
		//(',' arguments+=OclMessageArg)*
		public Group getGroup_1_1_4_1() { return cGroup_1_1_4_1; }
		
		//','
		public Keyword getCommaKeyword_1_1_4_1_0() { return cCommaKeyword_1_1_4_1_0; }
		
		//arguments+=OclMessageArg
		public Assignment getArgumentsAssignment_1_1_4_1_1() { return cArgumentsAssignment_1_1_4_1_1; }
		
		//OclMessageArg
		public RuleCall getArgumentsOclMessageArgParserRuleCall_1_1_4_1_1_0() { return cArgumentsOclMessageArgParserRuleCall_1_1_4_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_1_5() { return cRightParenthesisKeyword_1_1_5; }
	}
	public class NavigatingExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.NavigatingExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSubNavigatingExpParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Action cInfixExpSourceAction_1_0_0 = (Action)cGroup_1_0.eContents().get(0);
		private final Assignment cOpAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final Alternatives cOpAlternatives_1_0_1_0 = (Alternatives)cOpAssignment_1_0_1.eContents().get(0);
		private final Keyword cOpFullStopKeyword_1_0_1_0_0 = (Keyword)cOpAlternatives_1_0_1_0.eContents().get(0);
		private final Keyword cOpHyphenMinusGreaterThanSignKeyword_1_0_1_0_1 = (Keyword)cOpAlternatives_1_0_1_0.eContents().get(1);
		private final Assignment cArgumentAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cArgumentNavigatingExpParserRuleCall_1_0_2_0 = (RuleCall)cArgumentAssignment_1_0_2.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Action cOclMessageSourceAction_1_1_0 = (Action)cGroup_1_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final Alternatives cOpAlternatives_1_1_1_0 = (Alternatives)cOpAssignment_1_1_1.eContents().get(0);
		private final Keyword cOpCircumflexAccentCircumflexAccentKeyword_1_1_1_0_0 = (Keyword)cOpAlternatives_1_1_1_0.eContents().get(0);
		private final Keyword cOpCircumflexAccentKeyword_1_1_1_0_1 = (Keyword)cOpAlternatives_1_1_1_0.eContents().get(1);
		private final Assignment cMessageNameAssignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final RuleCall cMessageNameIdentifierParserRuleCall_1_1_2_0 = (RuleCall)cMessageNameAssignment_1_1_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_1_3 = (Keyword)cGroup_1_1.eContents().get(3);
		private final Group cGroup_1_1_4 = (Group)cGroup_1_1.eContents().get(4);
		private final Assignment cArgumentsAssignment_1_1_4_0 = (Assignment)cGroup_1_1_4.eContents().get(0);
		private final RuleCall cArgumentsOclMessageArgParserRuleCall_1_1_4_0_0 = (RuleCall)cArgumentsAssignment_1_1_4_0.eContents().get(0);
		private final Group cGroup_1_1_4_1 = (Group)cGroup_1_1_4.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_4_1_0 = (Keyword)cGroup_1_1_4_1.eContents().get(0);
		private final Assignment cArgumentsAssignment_1_1_4_1_1 = (Assignment)cGroup_1_1_4_1.eContents().get(1);
		private final RuleCall cArgumentsOclMessageArgParserRuleCall_1_1_4_1_1_0 = (RuleCall)cArgumentsAssignment_1_1_4_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_1_5 = (Keyword)cGroup_1_1.eContents().get(5);
		
		//// Follows ., ->, ^
		//NavigatingExp :
		//    SubNavigatingExp
		//    (
		//        ({InfixExp.source=current} op=('.'|'->') argument=NavigatingExp)
		//    |    ({OclMessage.source=current} op=('^^'|'^') messageName=Identifier
		//            '(' (arguments+=OclMessageArg (',' arguments+=OclMessageArg)*)? ')')
		//    )?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//SubNavigatingExp
		//(
		//    ({InfixExp.source=current} op=('.'|'->') argument=NavigatingExp)
		//|    ({OclMessage.source=current} op=('^^'|'^') messageName=Identifier
		//        '(' (arguments+=OclMessageArg (',' arguments+=OclMessageArg)*)? ')')
		//)?
		public Group getGroup() { return cGroup; }
		
		//SubNavigatingExp
		public RuleCall getSubNavigatingExpParserRuleCall_0() { return cSubNavigatingExpParserRuleCall_0; }
		
		//(
		//    ({InfixExp.source=current} op=('.'|'->') argument=NavigatingExp)
		//|    ({OclMessage.source=current} op=('^^'|'^') messageName=Identifier
		//        '(' (arguments+=OclMessageArg (',' arguments+=OclMessageArg)*)? ')')
		//)?
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//({InfixExp.source=current} op=('.'|'->') argument=NavigatingExp)
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{InfixExp.source=current}
		public Action getInfixExpSourceAction_1_0_0() { return cInfixExpSourceAction_1_0_0; }
		
		//op=('.'|'->')
		public Assignment getOpAssignment_1_0_1() { return cOpAssignment_1_0_1; }
		
		//('.'|'->')
		public Alternatives getOpAlternatives_1_0_1_0() { return cOpAlternatives_1_0_1_0; }
		
		//'.'
		public Keyword getOpFullStopKeyword_1_0_1_0_0() { return cOpFullStopKeyword_1_0_1_0_0; }
		
		//'->'
		public Keyword getOpHyphenMinusGreaterThanSignKeyword_1_0_1_0_1() { return cOpHyphenMinusGreaterThanSignKeyword_1_0_1_0_1; }
		
		//argument=NavigatingExp
		public Assignment getArgumentAssignment_1_0_2() { return cArgumentAssignment_1_0_2; }
		
		//NavigatingExp
		public RuleCall getArgumentNavigatingExpParserRuleCall_1_0_2_0() { return cArgumentNavigatingExpParserRuleCall_1_0_2_0; }
		
		//({OclMessage.source=current} op=('^^'|'^') messageName=Identifier
		//        '(' (arguments+=OclMessageArg (',' arguments+=OclMessageArg)*)? ')')
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//{OclMessage.source=current}
		public Action getOclMessageSourceAction_1_1_0() { return cOclMessageSourceAction_1_1_0; }
		
		//op=('^^'|'^')
		public Assignment getOpAssignment_1_1_1() { return cOpAssignment_1_1_1; }
		
		//('^^'|'^')
		public Alternatives getOpAlternatives_1_1_1_0() { return cOpAlternatives_1_1_1_0; }
		
		//'^^'
		public Keyword getOpCircumflexAccentCircumflexAccentKeyword_1_1_1_0_0() { return cOpCircumflexAccentCircumflexAccentKeyword_1_1_1_0_0; }
		
		//'^'
		public Keyword getOpCircumflexAccentKeyword_1_1_1_0_1() { return cOpCircumflexAccentKeyword_1_1_1_0_1; }
		
		//messageName=Identifier
		public Assignment getMessageNameAssignment_1_1_2() { return cMessageNameAssignment_1_1_2; }
		
		//Identifier
		public RuleCall getMessageNameIdentifierParserRuleCall_1_1_2_0() { return cMessageNameIdentifierParserRuleCall_1_1_2_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_1_3() { return cLeftParenthesisKeyword_1_1_3; }
		
		//(arguments+=OclMessageArg (',' arguments+=OclMessageArg)*)?
		public Group getGroup_1_1_4() { return cGroup_1_1_4; }
		
		//arguments+=OclMessageArg
		public Assignment getArgumentsAssignment_1_1_4_0() { return cArgumentsAssignment_1_1_4_0; }
		
		//OclMessageArg
		public RuleCall getArgumentsOclMessageArgParserRuleCall_1_1_4_0_0() { return cArgumentsOclMessageArgParserRuleCall_1_1_4_0_0; }
		
		//(',' arguments+=OclMessageArg)*
		public Group getGroup_1_1_4_1() { return cGroup_1_1_4_1; }
		
		//','
		public Keyword getCommaKeyword_1_1_4_1_0() { return cCommaKeyword_1_1_4_1_0; }
		
		//arguments+=OclMessageArg
		public Assignment getArgumentsAssignment_1_1_4_1_1() { return cArgumentsAssignment_1_1_4_1_1; }
		
		//OclMessageArg
		public RuleCall getArgumentsOclMessageArgParserRuleCall_1_1_4_1_1_0() { return cArgumentsOclMessageArgParserRuleCall_1_1_4_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_1_5() { return cRightParenthesisKeyword_1_1_5; }
	}
	public class OclMessageArgElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.OclMessageArg");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cOclMessageArgAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cQuestionMarkKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Group cGroup_0_2 = (Group)cGroup_0.eContents().get(2);
		private final Keyword cColonKeyword_0_2_0 = (Keyword)cGroup_0_2.eContents().get(0);
		private final Assignment cTypeAssignment_0_2_1 = (Assignment)cGroup_0_2.eContents().get(1);
		private final RuleCall cTypeTypeExpParserRuleCall_0_2_1_0 = (RuleCall)cTypeAssignment_0_2_1.eContents().get(0);
		private final RuleCall cExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//// FIXME @pre
		//OclMessageArg :
		//    ({OclMessageArg}'?' (':' type=TypeExp)?)
		//|    Expression
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//    ({OclMessageArg}'?' (':' type=TypeExp)?)
		//|    Expression
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//({OclMessageArg}'?' (':' type=TypeExp)?)
		public Group getGroup_0() { return cGroup_0; }
		
		//{OclMessageArg}
		public Action getOclMessageArgAction_0_0() { return cOclMessageArgAction_0_0; }
		
		//'?'
		public Keyword getQuestionMarkKeyword_0_1() { return cQuestionMarkKeyword_0_1; }
		
		//(':' type=TypeExp)?
		public Group getGroup_0_2() { return cGroup_0_2; }
		
		//':'
		public Keyword getColonKeyword_0_2_0() { return cColonKeyword_0_2_0; }
		
		//type=TypeExp
		public Assignment getTypeAssignment_0_2_1() { return cTypeAssignment_0_2_1; }
		
		//TypeExp
		public RuleCall getTypeTypeExpParserRuleCall_0_2_1_0() { return cTypeTypeExpParserRuleCall_0_2_1_0; }
		
		//Expression
		public RuleCall getExpressionParserRuleCall_1() { return cExpressionParserRuleCall_1; }
	}
	public class NUMBER_LITERALElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.NUMBER_LITERAL");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_2_0 = (Alternatives)cGroup_2.eContents().get(0);
		private final Keyword cEKeyword_2_0_0 = (Keyword)cAlternatives_2_0.eContents().get(0);
		private final Keyword cEKeyword_2_0_1 = (Keyword)cAlternatives_2_0.eContents().get(1);
		private final Alternatives cAlternatives_2_1 = (Alternatives)cGroup_2.eContents().get(1);
		private final Keyword cPlusSignKeyword_2_1_0 = (Keyword)cAlternatives_2_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_2_1_1 = (Keyword)cAlternatives_2_1.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2_2 = (RuleCall)cGroup_2.eContents().get(2);
		
		//NUMBER_LITERAL:
		//    INT ('.' INT)? (('e'|'E') ('+'|'-')? INT)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//INT ('.' INT)? (('e'|'E') ('+'|'-')? INT)?
		public Group getGroup() { return cGroup; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//('.' INT)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_1() { return cINTTerminalRuleCall_1_1; }
		
		//(('e'|'E') ('+'|'-')? INT)?
		public Group getGroup_2() { return cGroup_2; }
		
		//('e'|'E')
		public Alternatives getAlternatives_2_0() { return cAlternatives_2_0; }
		
		//'e'
		public Keyword getEKeyword_2_0_0() { return cEKeyword_2_0_0; }
		
		//'E'
		public Keyword getEKeyword_2_0_1() { return cEKeyword_2_0_1; }
		
		//('+'|'-')?
		public Alternatives getAlternatives_2_1() { return cAlternatives_2_1; }
		
		//'+'
		public Keyword getPlusSignKeyword_2_1_0() { return cPlusSignKeyword_2_1_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_2_1_1() { return cHyphenMinusKeyword_2_1_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2_2() { return cINTTerminalRuleCall_2_2; }
	}
	public class EssentialOCLRestrictedKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.EssentialOCLRestrictedKeywords");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cEKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cEKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//EssentialOCLRestrictedKeywords:
		//    'e'
		//|    'E'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//    'e'
		//|    'E'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'e'
		public Keyword getEKeyword_0() { return cEKeyword_0; }
		
		//'E'
		public Keyword getEKeyword_1() { return cEKeyword_1; }
	}
	public class RestrictedKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.RestrictedKeywords");
		private final RuleCall cEssentialOCLRestrictedKeywordsParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//RestrictedKeywords:                    // Intended to be overridden
		//    EssentialOCLRestrictedKeywords
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//                // Intended to be overridden
		//EssentialOCLRestrictedKeywords
		public RuleCall getEssentialOCLRestrictedKeywordsParserRuleCall() { return cEssentialOCLRestrictedKeywordsParserRuleCall; }
	}
	public class IdentifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRestrictedKeywordsParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Identifier:
		//    ID
		//|    RestrictedKeywords
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//    ID
		//|    RestrictedKeywords
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//RestrictedKeywords
		public RuleCall getRestrictedKeywordsParserRuleCall_1() { return cRestrictedKeywordsParserRuleCall_1; }
	}
	public class StringLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.StringLiteral");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//StringLiteral:
		//    STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	public class SimpleNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.SimpleName");
		private final RuleCall cIdentifierParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//SimpleName:
		//    Identifier
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Identifier
		public RuleCall getIdentifierParserRuleCall() { return cIdentifierParserRuleCall; }
	}
	public class PrimitiveTypeIdentifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.PrimitiveTypeIdentifier");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cBooleanKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cIntegerKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cRealKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cStringKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cUnlimitedNaturalKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cOclAnyKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		private final Keyword cOclInvalidKeyword_6 = (Keyword)cAlternatives.eContents().get(6);
		private final Keyword cOclVoidKeyword_7 = (Keyword)cAlternatives.eContents().get(7);
		
		//PrimitiveTypeIdentifier:
		//    'Boolean'
		//|    'Integer'
		//|    'Real'
		//|    'String'
		//|    'UnlimitedNatural'
		//|    'OclAny'
		//|    'OclInvalid'
		//|    'OclVoid'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//    'Boolean'
		//|    'Integer'
		//|    'Real'
		//|    'String'
		//|    'UnlimitedNatural'
		//|    'OclAny'
		//|    'OclInvalid'
		//|    'OclVoid'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'Boolean'
		public Keyword getBooleanKeyword_0() { return cBooleanKeyword_0; }
		
		//'Integer'
		public Keyword getIntegerKeyword_1() { return cIntegerKeyword_1; }
		
		//'Real'
		public Keyword getRealKeyword_2() { return cRealKeyword_2; }
		
		//'String'
		public Keyword getStringKeyword_3() { return cStringKeyword_3; }
		
		//'UnlimitedNatural'
		public Keyword getUnlimitedNaturalKeyword_4() { return cUnlimitedNaturalKeyword_4; }
		
		//'OclAny'
		public Keyword getOclAnyKeyword_5() { return cOclAnyKeyword_5; }
		
		//'OclInvalid'
		public Keyword getOclInvalidKeyword_6() { return cOclInvalidKeyword_6; }
		
		//'OclVoid'
		public Keyword getOclVoidKeyword_7() { return cOclVoidKeyword_7; }
	}
	public class PrimitiveTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.PrimitiveType");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNamePrimitiveTypeIdentifierParserRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//PrimitiveType :
		//    name=PrimitiveTypeIdentifier
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=PrimitiveTypeIdentifier
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//PrimitiveTypeIdentifier
		public RuleCall getNamePrimitiveTypeIdentifierParserRuleCall_0() { return cNamePrimitiveTypeIdentifierParserRuleCall_0; }
	}
	public class CollectionTypeIdentifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.CollectionTypeIdentifier");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cSetKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cBagKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cSequenceKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cCollectionKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cOrderedSetKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		
		//CollectionTypeIdentifier:
		//    'Set'
		//|    'Bag'
		//|    'Sequence'
		//|    'Collection'
		//|    'OrderedSet'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//    'Set'
		//|    'Bag'
		//|    'Sequence'
		//|    'Collection'
		//|    'OrderedSet'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'Set'
		public Keyword getSetKeyword_0() { return cSetKeyword_0; }
		
		//'Bag'
		public Keyword getBagKeyword_1() { return cBagKeyword_1; }
		
		//'Sequence'
		public Keyword getSequenceKeyword_2() { return cSequenceKeyword_2; }
		
		//'Collection'
		public Keyword getCollectionKeyword_3() { return cCollectionKeyword_3; }
		
		//'OrderedSet'
		public Keyword getOrderedSetKeyword_4() { return cOrderedSetKeyword_4; }
	}
	public class TypeExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.TypeExp");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPrimitiveTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNameExpParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cCollectionTypeParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cTupleTypeParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//TypeExp:
		//    PrimitiveType
		//|    NameExp
		//|    CollectionType
		//|    TupleType
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//    PrimitiveType
		//|    NameExp
		//|    CollectionType
		//|    TupleType
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//PrimitiveType
		public RuleCall getPrimitiveTypeParserRuleCall_0() { return cPrimitiveTypeParserRuleCall_0; }
		
		//NameExp
		public RuleCall getNameExpParserRuleCall_1() { return cNameExpParserRuleCall_1; }
		
		//CollectionType
		public RuleCall getCollectionTypeParserRuleCall_2() { return cCollectionTypeParserRuleCall_2; }
		
		//TupleType
		public RuleCall getTupleTypeParserRuleCall_3() { return cTupleTypeParserRuleCall_3; }
	}
	public class CollectionTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.CollectionType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeIdentifierAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeIdentifierCollectionTypeIdentifierParserRuleCall_0_0 = (RuleCall)cTypeIdentifierAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cTypeAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cTypeTypeExpParserRuleCall_1_1_0 = (RuleCall)cTypeAssignment_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		//CollectionType:
		//    typeIdentifier=CollectionTypeIdentifier ('(' type=TypeExp ')')?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//typeIdentifier=CollectionTypeIdentifier ('(' type=TypeExp ')')?
		public Group getGroup() { return cGroup; }
		
		//typeIdentifier=CollectionTypeIdentifier
		public Assignment getTypeIdentifierAssignment_0() { return cTypeIdentifierAssignment_0; }
		
		//CollectionTypeIdentifier
		public RuleCall getTypeIdentifierCollectionTypeIdentifierParserRuleCall_0_0() { return cTypeIdentifierCollectionTypeIdentifierParserRuleCall_0_0; }
		
		//('(' type=TypeExp ')')?
		public Group getGroup_1() { return cGroup_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }
		
		//type=TypeExp
		public Assignment getTypeAssignment_1_1() { return cTypeAssignment_1_1; }
		
		//TypeExp
		public RuleCall getTypeTypeExpParserRuleCall_1_1_0() { return cTypeTypeExpParserRuleCall_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_2() { return cRightParenthesisKeyword_1_2; }
	}
	public class TupleTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.TupleType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNameTupleKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cPartAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cPartTuplePartParserRuleCall_2_0_0 = (RuleCall)cPartAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cPartAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cPartTuplePartParserRuleCall_2_1_1_0 = (RuleCall)cPartAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//TupleType:
		//    name='Tuple' '(' (part+=tuplePart (',' part+=tuplePart)*)? ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name='Tuple' '(' (part+=tuplePart (',' part+=tuplePart)*)? ')'
		public Group getGroup() { return cGroup; }
		
		//name='Tuple'
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//'Tuple'
		public Keyword getNameTupleKeyword_0_0() { return cNameTupleKeyword_0_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//(part+=tuplePart (',' part+=tuplePart)*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//part+=tuplePart
		public Assignment getPartAssignment_2_0() { return cPartAssignment_2_0; }
		
		//tuplePart
		public RuleCall getPartTuplePartParserRuleCall_2_0_0() { return cPartTuplePartParserRuleCall_2_0_0; }
		
		//(',' part+=tuplePart)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//','
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//part+=tuplePart
		public Assignment getPartAssignment_2_1_1() { return cPartAssignment_2_1_1; }
		
		//tuplePart
		public RuleCall getPartTuplePartParserRuleCall_2_1_1_0() { return cPartTuplePartParserRuleCall_2_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class TuplePartElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.tuplePart");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIdentifierParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeTypeExpParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		
		//tuplePart:
		//    name=Identifier ':' type=TypeExp
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=Identifier ':' type=TypeExp
		public Group getGroup() { return cGroup; }
		
		//name=Identifier
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//Identifier
		public RuleCall getNameIdentifierParserRuleCall_0_0() { return cNameIdentifierParserRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//type=TypeExp
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//TypeExp
		public RuleCall getTypeTypeExpParserRuleCall_2_0() { return cTypeTypeExpParserRuleCall_2_0; }
	}
	public class CollectionLiteralExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.CollectionLiteralExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cCollectionTypeParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cCollectionLiteralExpTypeAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Assignment cCollectionLiteralPartsAssignment_1_2_0 = (Assignment)cGroup_1_2.eContents().get(0);
		private final RuleCall cCollectionLiteralPartsCollectionLiteralPartParserRuleCall_1_2_0_0 = (RuleCall)cCollectionLiteralPartsAssignment_1_2_0.eContents().get(0);
		private final Group cGroup_1_2_1 = (Group)cGroup_1_2.eContents().get(1);
		private final Keyword cCommaKeyword_1_2_1_0 = (Keyword)cGroup_1_2_1.eContents().get(0);
		private final Assignment cCollectionLiteralPartsAssignment_1_2_1_1 = (Assignment)cGroup_1_2_1.eContents().get(1);
		private final RuleCall cCollectionLiteralPartsCollectionLiteralPartParserRuleCall_1_2_1_1_0 = (RuleCall)cCollectionLiteralPartsAssignment_1_2_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		
		//CollectionLiteralExp :
		//    CollectionType
		//    ({CollectionLiteralExp.type=current} '{' (collectionLiteralParts+=CollectionLiteralPart
		//     (',' collectionLiteralParts+=CollectionLiteralPart)*)?
		//     '}')?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//CollectionType
		//({CollectionLiteralExp.type=current} '{' (collectionLiteralParts+=CollectionLiteralPart
		// (',' collectionLiteralParts+=CollectionLiteralPart)*)?
		// '}')?
		public Group getGroup() { return cGroup; }
		
		//CollectionType
		public RuleCall getCollectionTypeParserRuleCall_0() { return cCollectionTypeParserRuleCall_0; }
		
		//({CollectionLiteralExp.type=current} '{' (collectionLiteralParts+=CollectionLiteralPart
		// (',' collectionLiteralParts+=CollectionLiteralPart)*)?
		// '}')?
		public Group getGroup_1() { return cGroup_1; }
		
		//{CollectionLiteralExp.type=current}
		public Action getCollectionLiteralExpTypeAction_1_0() { return cCollectionLiteralExpTypeAction_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1_1() { return cLeftCurlyBracketKeyword_1_1; }
		
		//(collectionLiteralParts+=CollectionLiteralPart
		//    (',' collectionLiteralParts+=CollectionLiteralPart)*)?
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//collectionLiteralParts+=CollectionLiteralPart
		public Assignment getCollectionLiteralPartsAssignment_1_2_0() { return cCollectionLiteralPartsAssignment_1_2_0; }
		
		//CollectionLiteralPart
		public RuleCall getCollectionLiteralPartsCollectionLiteralPartParserRuleCall_1_2_0_0() { return cCollectionLiteralPartsCollectionLiteralPartParserRuleCall_1_2_0_0; }
		
		//(',' collectionLiteralParts+=CollectionLiteralPart)*
		public Group getGroup_1_2_1() { return cGroup_1_2_1; }
		
		//','
		public Keyword getCommaKeyword_1_2_1_0() { return cCommaKeyword_1_2_1_0; }
		
		//collectionLiteralParts+=CollectionLiteralPart
		public Assignment getCollectionLiteralPartsAssignment_1_2_1_1() { return cCollectionLiteralPartsAssignment_1_2_1_1; }
		
		//CollectionLiteralPart
		public RuleCall getCollectionLiteralPartsCollectionLiteralPartParserRuleCall_1_2_1_1_0() { return cCollectionLiteralPartsCollectionLiteralPartParserRuleCall_1_2_1_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_1_3() { return cRightCurlyBracketKeyword_1_3; }
	}
	public class CollectionLiteralPartElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.CollectionLiteralPart");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cExpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cExpressionExpressionParserRuleCall_0_0 = (RuleCall)cExpressionAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cLastExpressionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cLastExpressionExpressionParserRuleCall_1_1_0 = (RuleCall)cLastExpressionAssignment_1_1.eContents().get(0);
		
		//CollectionLiteralPart:
		//    expression=Expression ('..' lastExpression=Expression)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//expression=Expression ('..' lastExpression=Expression)?
		public Group getGroup() { return cGroup; }
		
		//expression=Expression
		public Assignment getExpressionAssignment_0() { return cExpressionAssignment_0; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_0_0() { return cExpressionExpressionParserRuleCall_0_0; }
		
		//('..' lastExpression=Expression)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'..'
		public Keyword getFullStopFullStopKeyword_1_0() { return cFullStopFullStopKeyword_1_0; }
		
		//lastExpression=Expression
		public Assignment getLastExpressionAssignment_1_1() { return cLastExpressionAssignment_1_1; }
		
		//Expression
		public RuleCall getLastExpressionExpressionParserRuleCall_1_1_0() { return cLastExpressionExpressionParserRuleCall_1_1_0; }
	}
	public class PrimitiveLiteralExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.PrimitiveLiteralExp");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNumberLiteralExpParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cStringLiteralExpParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cBooleanLiteralExpParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cInvalidLiteralExpParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cNullLiteralExpParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//PrimitiveLiteralExp:
		//    NumberLiteralExp
		//|    StringLiteralExp
		//|    BooleanLiteralExp
		//|    InvalidLiteralExp
		//|    NullLiteralExp
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//    NumberLiteralExp
		//|    StringLiteralExp
		//|    BooleanLiteralExp
		//|    InvalidLiteralExp
		//|    NullLiteralExp
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//NumberLiteralExp
		public RuleCall getNumberLiteralExpParserRuleCall_0() { return cNumberLiteralExpParserRuleCall_0; }
		
		//StringLiteralExp
		public RuleCall getStringLiteralExpParserRuleCall_1() { return cStringLiteralExpParserRuleCall_1; }
		
		//BooleanLiteralExp
		public RuleCall getBooleanLiteralExpParserRuleCall_2() { return cBooleanLiteralExpParserRuleCall_2; }
		
		//InvalidLiteralExp
		public RuleCall getInvalidLiteralExpParserRuleCall_3() { return cInvalidLiteralExpParserRuleCall_3; }
		
		//NullLiteralExp
		public RuleCall getNullLiteralExpParserRuleCall_4() { return cNullLiteralExpParserRuleCall_4; }
	}
	public class TupleLiteralExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.TupleLiteralExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTupleLiteralExpAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTupleKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cPartAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cPartTupleLiteralPartParserRuleCall_2_1_0 = (RuleCall)cPartAssignment_2_1.eContents().get(0);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cPartAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cPartTupleLiteralPartParserRuleCall_2_2_1_0 = (RuleCall)cPartAssignment_2_2_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		
		//TupleLiteralExp:
		//    {TupleLiteralExp} 'Tuple' ('{' part+=TupleLiteralPart (',' part+=TupleLiteralPart)* '}')?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{TupleLiteralExp} 'Tuple' ('{' part+=TupleLiteralPart (',' part+=TupleLiteralPart)* '}')?
		public Group getGroup() { return cGroup; }
		
		//{TupleLiteralExp}
		public Action getTupleLiteralExpAction_0() { return cTupleLiteralExpAction_0; }
		
		//'Tuple'
		public Keyword getTupleKeyword_1() { return cTupleKeyword_1; }
		
		//('{' part+=TupleLiteralPart (',' part+=TupleLiteralPart)* '}')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2_0() { return cLeftCurlyBracketKeyword_2_0; }
		
		//part+=TupleLiteralPart
		public Assignment getPartAssignment_2_1() { return cPartAssignment_2_1; }
		
		//TupleLiteralPart
		public RuleCall getPartTupleLiteralPartParserRuleCall_2_1_0() { return cPartTupleLiteralPartParserRuleCall_2_1_0; }
		
		//(',' part+=TupleLiteralPart)*
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//','
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }
		
		//part+=TupleLiteralPart
		public Assignment getPartAssignment_2_2_1() { return cPartAssignment_2_2_1; }
		
		//TupleLiteralPart
		public RuleCall getPartTupleLiteralPartParserRuleCall_2_2_1_0() { return cPartTupleLiteralPartParserRuleCall_2_2_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2_3() { return cRightCurlyBracketKeyword_2_3; }
	}
	public class TupleLiteralPartElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.TupleLiteralPart");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIdentifierParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cTypeAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cTypeTypeExpParserRuleCall_1_1_0 = (RuleCall)cTypeAssignment_1_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cInitExpressionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cInitExpressionExpressionParserRuleCall_3_0 = (RuleCall)cInitExpressionAssignment_3.eContents().get(0);
		
		//TupleLiteralPart :
		//    name=Identifier (':' type=TypeExp)? '=' initExpression=Expression
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=Identifier (':' type=TypeExp)? '=' initExpression=Expression
		public Group getGroup() { return cGroup; }
		
		//name=Identifier
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//Identifier
		public RuleCall getNameIdentifierParserRuleCall_0_0() { return cNameIdentifierParserRuleCall_0_0; }
		
		//(':' type=TypeExp)?
		public Group getGroup_1() { return cGroup_1; }
		
		//':'
		public Keyword getColonKeyword_1_0() { return cColonKeyword_1_0; }
		
		//type=TypeExp
		public Assignment getTypeAssignment_1_1() { return cTypeAssignment_1_1; }
		
		//TypeExp
		public RuleCall getTypeTypeExpParserRuleCall_1_1_0() { return cTypeTypeExpParserRuleCall_1_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//initExpression=Expression
		public Assignment getInitExpressionAssignment_3() { return cInitExpressionAssignment_3; }
		
		//Expression
		public RuleCall getInitExpressionExpressionParserRuleCall_3_0() { return cInitExpressionExpressionParserRuleCall_3_0; }
	}
	public class NumberLiteralExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.NumberLiteralExp");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameNUMBER_LITERALParserRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//NumberLiteralExp:
		//    name=NUMBER_LITERAL
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=NUMBER_LITERAL
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//NUMBER_LITERAL
		public RuleCall getNameNUMBER_LITERALParserRuleCall_0() { return cNameNUMBER_LITERALParserRuleCall_0; }
	}
	public class StringLiteralExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.StringLiteralExp");
		private final Assignment cValuesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValuesStringLiteralParserRuleCall_0 = (RuleCall)cValuesAssignment.eContents().get(0);
		
		//StringLiteralExp:
		//    values+=StringLiteral+
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//values+=StringLiteral+
		public Assignment getValuesAssignment() { return cValuesAssignment; }
		
		//StringLiteral
		public RuleCall getValuesStringLiteralParserRuleCall_0() { return cValuesStringLiteralParserRuleCall_0; }
	}
	public class BooleanLiteralExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.BooleanLiteralExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBooleanLiteralExpAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cIsTrueAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final Keyword cIsTrueTrueKeyword_1_0_0 = (Keyword)cIsTrueAssignment_1_0.eContents().get(0);
		private final Keyword cFalseKeyword_1_1 = (Keyword)cAlternatives_1.eContents().get(1);
		
		//BooleanLiteralExp:
		//    {BooleanLiteralExp}
		//        (isTrue?='true'
		//    |    'false');
		@Override public ParserRule getRule() { return rule; }
		
		//{BooleanLiteralExp}
		//    (isTrue?='true'
		//|    'false')
		public Group getGroup() { return cGroup; }
		
		//{BooleanLiteralExp}
		public Action getBooleanLiteralExpAction_0() { return cBooleanLiteralExpAction_0; }
		
		//    (isTrue?='true'
		//|    'false')
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//isTrue?='true'
		public Assignment getIsTrueAssignment_1_0() { return cIsTrueAssignment_1_0; }
		
		//'true'
		public Keyword getIsTrueTrueKeyword_1_0_0() { return cIsTrueTrueKeyword_1_0_0; }
		
		//'false'
		public Keyword getFalseKeyword_1_1() { return cFalseKeyword_1_1; }
	}
	public class InvalidLiteralExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.InvalidLiteralExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cInvalidLiteralExpAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cInvalidKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//InvalidLiteralExp:
		//    {InvalidLiteralExp} 'invalid'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{InvalidLiteralExp} 'invalid'
		public Group getGroup() { return cGroup; }
		
		//{InvalidLiteralExp}
		public Action getInvalidLiteralExpAction_0() { return cInvalidLiteralExpAction_0; }
		
		//'invalid'
		public Keyword getInvalidKeyword_1() { return cInvalidKeyword_1; }
	}
	public class NullLiteralExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.NullLiteralExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNullLiteralExpAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cNullKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//NullLiteralExp:
		//    {NullLiteralExp} 'null'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{NullLiteralExp} 'null'
		public Group getGroup() { return cGroup; }
		
		//{NullLiteralExp}
		public Action getNullLiteralExpAction_0() { return cNullLiteralExpAction_0; }
		
		//'null'
		public Keyword getNullKeyword_1() { return cNullKeyword_1; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Expression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cImpliesParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLetExpParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Expression:
		//    implies
		//|    LetExp
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//    implies
		//|    LetExp
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//implies
		public RuleCall getImpliesParserRuleCall_0() { return cImpliesParserRuleCall_0; }
		
		//LetExp
		public RuleCall getLetExpParserRuleCall_1() { return cLetExpParserRuleCall_1; }
	}
	public class ImpliesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.implies");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cXorParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cInfixExpSourceAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Keyword cOpImpliesKeyword_1_1_0 = (Keyword)cOpAssignment_1_1.eContents().get(0);
		private final Assignment cArgumentAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final Alternatives cArgumentAlternatives_1_2_0 = (Alternatives)cArgumentAssignment_1_2.eContents().get(0);
		private final RuleCall cArgumentXorParserRuleCall_1_2_0_0 = (RuleCall)cArgumentAlternatives_1_2_0.eContents().get(0);
		private final RuleCall cArgumentLetExpParserRuleCall_1_2_0_1 = (RuleCall)cArgumentAlternatives_1_2_0.eContents().get(1);
		
		//implies returns Expression:
		//    xor
		//    ({InfixExp.source=current} op='implies' argument=(xor|LetExp))*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//xor
		//({InfixExp.source=current} op='implies' argument=(xor|LetExp))*
		public Group getGroup() { return cGroup; }
		
		//xor
		public RuleCall getXorParserRuleCall_0() { return cXorParserRuleCall_0; }
		
		//({InfixExp.source=current} op='implies' argument=(xor|LetExp))*
		public Group getGroup_1() { return cGroup_1; }
		
		//{InfixExp.source=current}
		public Action getInfixExpSourceAction_1_0() { return cInfixExpSourceAction_1_0; }
		
		//op='implies'
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//'implies'
		public Keyword getOpImpliesKeyword_1_1_0() { return cOpImpliesKeyword_1_1_0; }
		
		//argument=(xor|LetExp)
		public Assignment getArgumentAssignment_1_2() { return cArgumentAssignment_1_2; }
		
		//(xor|LetExp)
		public Alternatives getArgumentAlternatives_1_2_0() { return cArgumentAlternatives_1_2_0; }
		
		//xor
		public RuleCall getArgumentXorParserRuleCall_1_2_0_0() { return cArgumentXorParserRuleCall_1_2_0_0; }
		
		//LetExp
		public RuleCall getArgumentLetExpParserRuleCall_1_2_0_1() { return cArgumentLetExpParserRuleCall_1_2_0_1; }
	}
	public class XorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.xor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cOrParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cInfixExpSourceAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Keyword cOpXorKeyword_1_1_0 = (Keyword)cOpAssignment_1_1.eContents().get(0);
		private final Assignment cArgumentAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final Alternatives cArgumentAlternatives_1_2_0 = (Alternatives)cArgumentAssignment_1_2.eContents().get(0);
		private final RuleCall cArgumentOrParserRuleCall_1_2_0_0 = (RuleCall)cArgumentAlternatives_1_2_0.eContents().get(0);
		private final RuleCall cArgumentLetExpParserRuleCall_1_2_0_1 = (RuleCall)cArgumentAlternatives_1_2_0.eContents().get(1);
		
		//xor returns Expression:
		//    or
		//    ({InfixExp.source=current} op='xor' argument=(or|LetExp))*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//or
		//({InfixExp.source=current} op='xor' argument=(or|LetExp))*
		public Group getGroup() { return cGroup; }
		
		//or
		public RuleCall getOrParserRuleCall_0() { return cOrParserRuleCall_0; }
		
		//({InfixExp.source=current} op='xor' argument=(or|LetExp))*
		public Group getGroup_1() { return cGroup_1; }
		
		//{InfixExp.source=current}
		public Action getInfixExpSourceAction_1_0() { return cInfixExpSourceAction_1_0; }
		
		//op='xor'
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//'xor'
		public Keyword getOpXorKeyword_1_1_0() { return cOpXorKeyword_1_1_0; }
		
		//argument=(or|LetExp)
		public Assignment getArgumentAssignment_1_2() { return cArgumentAssignment_1_2; }
		
		//(or|LetExp)
		public Alternatives getArgumentAlternatives_1_2_0() { return cArgumentAlternatives_1_2_0; }
		
		//or
		public RuleCall getArgumentOrParserRuleCall_1_2_0_0() { return cArgumentOrParserRuleCall_1_2_0_0; }
		
		//LetExp
		public RuleCall getArgumentLetExpParserRuleCall_1_2_0_1() { return cArgumentLetExpParserRuleCall_1_2_0_1; }
	}
	public class OrElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.or");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAndParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cInfixExpSourceAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Keyword cOpOrKeyword_1_1_0 = (Keyword)cOpAssignment_1_1.eContents().get(0);
		private final Assignment cArgumentAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final Alternatives cArgumentAlternatives_1_2_0 = (Alternatives)cArgumentAssignment_1_2.eContents().get(0);
		private final RuleCall cArgumentAndParserRuleCall_1_2_0_0 = (RuleCall)cArgumentAlternatives_1_2_0.eContents().get(0);
		private final RuleCall cArgumentLetExpParserRuleCall_1_2_0_1 = (RuleCall)cArgumentAlternatives_1_2_0.eContents().get(1);
		
		//or returns Expression:
		//    and
		//    ({InfixExp.source=current} op='or' argument=(and|LetExp))*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//and
		//({InfixExp.source=current} op='or' argument=(and|LetExp))*
		public Group getGroup() { return cGroup; }
		
		//and
		public RuleCall getAndParserRuleCall_0() { return cAndParserRuleCall_0; }
		
		//({InfixExp.source=current} op='or' argument=(and|LetExp))*
		public Group getGroup_1() { return cGroup_1; }
		
		//{InfixExp.source=current}
		public Action getInfixExpSourceAction_1_0() { return cInfixExpSourceAction_1_0; }
		
		//op='or'
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//'or'
		public Keyword getOpOrKeyword_1_1_0() { return cOpOrKeyword_1_1_0; }
		
		//argument=(and|LetExp)
		public Assignment getArgumentAssignment_1_2() { return cArgumentAssignment_1_2; }
		
		//(and|LetExp)
		public Alternatives getArgumentAlternatives_1_2_0() { return cArgumentAlternatives_1_2_0; }
		
		//and
		public RuleCall getArgumentAndParserRuleCall_1_2_0_0() { return cArgumentAndParserRuleCall_1_2_0_0; }
		
		//LetExp
		public RuleCall getArgumentLetExpParserRuleCall_1_2_0_1() { return cArgumentLetExpParserRuleCall_1_2_0_1; }
	}
	public class AndElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.and");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cEqualityParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cInfixExpSourceAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Keyword cOpAndKeyword_1_1_0 = (Keyword)cOpAssignment_1_1.eContents().get(0);
		private final Assignment cArgumentAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final Alternatives cArgumentAlternatives_1_2_0 = (Alternatives)cArgumentAssignment_1_2.eContents().get(0);
		private final RuleCall cArgumentEqualityParserRuleCall_1_2_0_0 = (RuleCall)cArgumentAlternatives_1_2_0.eContents().get(0);
		private final RuleCall cArgumentLetExpParserRuleCall_1_2_0_1 = (RuleCall)cArgumentAlternatives_1_2_0.eContents().get(1);
		
		//and returns Expression:
		//    equality
		//    ({InfixExp.source=current} op='and' argument=(equality|LetExp))*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//equality
		//({InfixExp.source=current} op='and' argument=(equality|LetExp))*
		public Group getGroup() { return cGroup; }
		
		//equality
		public RuleCall getEqualityParserRuleCall_0() { return cEqualityParserRuleCall_0; }
		
		//({InfixExp.source=current} op='and' argument=(equality|LetExp))*
		public Group getGroup_1() { return cGroup_1; }
		
		//{InfixExp.source=current}
		public Action getInfixExpSourceAction_1_0() { return cInfixExpSourceAction_1_0; }
		
		//op='and'
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//'and'
		public Keyword getOpAndKeyword_1_1_0() { return cOpAndKeyword_1_1_0; }
		
		//argument=(equality|LetExp)
		public Assignment getArgumentAssignment_1_2() { return cArgumentAssignment_1_2; }
		
		//(equality|LetExp)
		public Alternatives getArgumentAlternatives_1_2_0() { return cArgumentAlternatives_1_2_0; }
		
		//equality
		public RuleCall getArgumentEqualityParserRuleCall_1_2_0_0() { return cArgumentEqualityParserRuleCall_1_2_0_0; }
		
		//LetExp
		public RuleCall getArgumentLetExpParserRuleCall_1_2_0_1() { return cArgumentLetExpParserRuleCall_1_2_0_1; }
	}
	public class EqualityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.equality");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cRelationalParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cInfixExpSourceAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cOpAlternatives_1_1_0 = (Alternatives)cOpAssignment_1_1.eContents().get(0);
		private final Keyword cOpEqualsSignKeyword_1_1_0_0 = (Keyword)cOpAlternatives_1_1_0.eContents().get(0);
		private final Keyword cOpLessThanSignGreaterThanSignKeyword_1_1_0_1 = (Keyword)cOpAlternatives_1_1_0.eContents().get(1);
		private final Assignment cArgumentAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final Alternatives cArgumentAlternatives_1_2_0 = (Alternatives)cArgumentAssignment_1_2.eContents().get(0);
		private final RuleCall cArgumentRelationalParserRuleCall_1_2_0_0 = (RuleCall)cArgumentAlternatives_1_2_0.eContents().get(0);
		private final RuleCall cArgumentLetExpParserRuleCall_1_2_0_1 = (RuleCall)cArgumentAlternatives_1_2_0.eContents().get(1);
		
		//equality returns Expression:
		//    relational
		//    ({InfixExp.source=current} op=('='|'<>') argument=(relational|LetExp))*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//relational
		//({InfixExp.source=current} op=('='|'<>') argument=(relational|LetExp))*
		public Group getGroup() { return cGroup; }
		
		//relational
		public RuleCall getRelationalParserRuleCall_0() { return cRelationalParserRuleCall_0; }
		
		//({InfixExp.source=current} op=('='|'<>') argument=(relational|LetExp))*
		public Group getGroup_1() { return cGroup_1; }
		
		//{InfixExp.source=current}
		public Action getInfixExpSourceAction_1_0() { return cInfixExpSourceAction_1_0; }
		
		//op=('='|'<>')
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//('='|'<>')
		public Alternatives getOpAlternatives_1_1_0() { return cOpAlternatives_1_1_0; }
		
		//'='
		public Keyword getOpEqualsSignKeyword_1_1_0_0() { return cOpEqualsSignKeyword_1_1_0_0; }
		
		//'<>'
		public Keyword getOpLessThanSignGreaterThanSignKeyword_1_1_0_1() { return cOpLessThanSignGreaterThanSignKeyword_1_1_0_1; }
		
		//argument=(relational|LetExp)
		public Assignment getArgumentAssignment_1_2() { return cArgumentAssignment_1_2; }
		
		//(relational|LetExp)
		public Alternatives getArgumentAlternatives_1_2_0() { return cArgumentAlternatives_1_2_0; }
		
		//relational
		public RuleCall getArgumentRelationalParserRuleCall_1_2_0_0() { return cArgumentRelationalParserRuleCall_1_2_0_0; }
		
		//LetExp
		public RuleCall getArgumentLetExpParserRuleCall_1_2_0_1() { return cArgumentLetExpParserRuleCall_1_2_0_1; }
	}
	public class RelationalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.relational");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAdditiveParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cInfixExpSourceAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cOpAlternatives_1_1_0 = (Alternatives)cOpAssignment_1_1.eContents().get(0);
		private final Keyword cOpGreaterThanSignKeyword_1_1_0_0 = (Keyword)cOpAlternatives_1_1_0.eContents().get(0);
		private final Keyword cOpLessThanSignKeyword_1_1_0_1 = (Keyword)cOpAlternatives_1_1_0.eContents().get(1);
		private final Keyword cOpGreaterThanSignEqualsSignKeyword_1_1_0_2 = (Keyword)cOpAlternatives_1_1_0.eContents().get(2);
		private final Keyword cOpLessThanSignEqualsSignKeyword_1_1_0_3 = (Keyword)cOpAlternatives_1_1_0.eContents().get(3);
		private final Assignment cArgumentAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final Alternatives cArgumentAlternatives_1_2_0 = (Alternatives)cArgumentAssignment_1_2.eContents().get(0);
		private final RuleCall cArgumentAdditiveParserRuleCall_1_2_0_0 = (RuleCall)cArgumentAlternatives_1_2_0.eContents().get(0);
		private final RuleCall cArgumentLetExpParserRuleCall_1_2_0_1 = (RuleCall)cArgumentAlternatives_1_2_0.eContents().get(1);
		
		//relational returns Expression:
		//    additive
		//    ({InfixExp.source=current} op=('>'|'<'|'>='|'<=') argument=(additive|LetExp))*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//additive
		//({InfixExp.source=current} op=('>'|'<'|'>='|'<=') argument=(additive|LetExp))*
		public Group getGroup() { return cGroup; }
		
		//additive
		public RuleCall getAdditiveParserRuleCall_0() { return cAdditiveParserRuleCall_0; }
		
		//({InfixExp.source=current} op=('>'|'<'|'>='|'<=') argument=(additive|LetExp))*
		public Group getGroup_1() { return cGroup_1; }
		
		//{InfixExp.source=current}
		public Action getInfixExpSourceAction_1_0() { return cInfixExpSourceAction_1_0; }
		
		//op=('>'|'<'|'>='|'<=')
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//('>'|'<'|'>='|'<=')
		public Alternatives getOpAlternatives_1_1_0() { return cOpAlternatives_1_1_0; }
		
		//'>'
		public Keyword getOpGreaterThanSignKeyword_1_1_0_0() { return cOpGreaterThanSignKeyword_1_1_0_0; }
		
		//'<'
		public Keyword getOpLessThanSignKeyword_1_1_0_1() { return cOpLessThanSignKeyword_1_1_0_1; }
		
		//'>='
		public Keyword getOpGreaterThanSignEqualsSignKeyword_1_1_0_2() { return cOpGreaterThanSignEqualsSignKeyword_1_1_0_2; }
		
		//'<='
		public Keyword getOpLessThanSignEqualsSignKeyword_1_1_0_3() { return cOpLessThanSignEqualsSignKeyword_1_1_0_3; }
		
		//argument=(additive|LetExp)
		public Assignment getArgumentAssignment_1_2() { return cArgumentAssignment_1_2; }
		
		//(additive|LetExp)
		public Alternatives getArgumentAlternatives_1_2_0() { return cArgumentAlternatives_1_2_0; }
		
		//additive
		public RuleCall getArgumentAdditiveParserRuleCall_1_2_0_0() { return cArgumentAdditiveParserRuleCall_1_2_0_0; }
		
		//LetExp
		public RuleCall getArgumentLetExpParserRuleCall_1_2_0_1() { return cArgumentLetExpParserRuleCall_1_2_0_1; }
	}
	public class AdditiveElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.additive");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMultiplicativeParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cInfixExpSourceAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cOpAlternatives_1_1_0 = (Alternatives)cOpAssignment_1_1.eContents().get(0);
		private final Keyword cOpPlusSignKeyword_1_1_0_0 = (Keyword)cOpAlternatives_1_1_0.eContents().get(0);
		private final Keyword cOpHyphenMinusKeyword_1_1_0_1 = (Keyword)cOpAlternatives_1_1_0.eContents().get(1);
		private final Assignment cArgumentAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final Alternatives cArgumentAlternatives_1_2_0 = (Alternatives)cArgumentAssignment_1_2.eContents().get(0);
		private final RuleCall cArgumentMultiplicativeParserRuleCall_1_2_0_0 = (RuleCall)cArgumentAlternatives_1_2_0.eContents().get(0);
		private final RuleCall cArgumentLetExpParserRuleCall_1_2_0_1 = (RuleCall)cArgumentAlternatives_1_2_0.eContents().get(1);
		
		//additive returns Expression:
		//    multiplicative
		//    ({InfixExp.source=current} op=('+'|'-') argument=(multiplicative|LetExp))*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//multiplicative
		//({InfixExp.source=current} op=('+'|'-') argument=(multiplicative|LetExp))*
		public Group getGroup() { return cGroup; }
		
		//multiplicative
		public RuleCall getMultiplicativeParserRuleCall_0() { return cMultiplicativeParserRuleCall_0; }
		
		//({InfixExp.source=current} op=('+'|'-') argument=(multiplicative|LetExp))*
		public Group getGroup_1() { return cGroup_1; }
		
		//{InfixExp.source=current}
		public Action getInfixExpSourceAction_1_0() { return cInfixExpSourceAction_1_0; }
		
		//op=('+'|'-')
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//('+'|'-')
		public Alternatives getOpAlternatives_1_1_0() { return cOpAlternatives_1_1_0; }
		
		//'+'
		public Keyword getOpPlusSignKeyword_1_1_0_0() { return cOpPlusSignKeyword_1_1_0_0; }
		
		//'-'
		public Keyword getOpHyphenMinusKeyword_1_1_0_1() { return cOpHyphenMinusKeyword_1_1_0_1; }
		
		//argument=(multiplicative|LetExp)
		public Assignment getArgumentAssignment_1_2() { return cArgumentAssignment_1_2; }
		
		//(multiplicative|LetExp)
		public Alternatives getArgumentAlternatives_1_2_0() { return cArgumentAlternatives_1_2_0; }
		
		//multiplicative
		public RuleCall getArgumentMultiplicativeParserRuleCall_1_2_0_0() { return cArgumentMultiplicativeParserRuleCall_1_2_0_0; }
		
		//LetExp
		public RuleCall getArgumentLetExpParserRuleCall_1_2_0_1() { return cArgumentLetExpParserRuleCall_1_2_0_1; }
	}
	public class MultiplicativeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.multiplicative");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cUnaryParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cInfixExpSourceAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cOpAlternatives_1_1_0 = (Alternatives)cOpAssignment_1_1.eContents().get(0);
		private final Keyword cOpAsteriskKeyword_1_1_0_0 = (Keyword)cOpAlternatives_1_1_0.eContents().get(0);
		private final Keyword cOpSolidusKeyword_1_1_0_1 = (Keyword)cOpAlternatives_1_1_0.eContents().get(1);
		private final Assignment cArgumentAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final Alternatives cArgumentAlternatives_1_2_0 = (Alternatives)cArgumentAssignment_1_2.eContents().get(0);
		private final RuleCall cArgumentUnaryParserRuleCall_1_2_0_0 = (RuleCall)cArgumentAlternatives_1_2_0.eContents().get(0);
		private final RuleCall cArgumentLetExpParserRuleCall_1_2_0_1 = (RuleCall)cArgumentAlternatives_1_2_0.eContents().get(1);
		
		//multiplicative returns Expression:
		//    unary
		//    ({InfixExp.source=current} op=('*'|'/') argument=(unary|LetExp))*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//unary
		//({InfixExp.source=current} op=('*'|'/') argument=(unary|LetExp))*
		public Group getGroup() { return cGroup; }
		
		//unary
		public RuleCall getUnaryParserRuleCall_0() { return cUnaryParserRuleCall_0; }
		
		//({InfixExp.source=current} op=('*'|'/') argument=(unary|LetExp))*
		public Group getGroup_1() { return cGroup_1; }
		
		//{InfixExp.source=current}
		public Action getInfixExpSourceAction_1_0() { return cInfixExpSourceAction_1_0; }
		
		//op=('*'|'/')
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//('*'|'/')
		public Alternatives getOpAlternatives_1_1_0() { return cOpAlternatives_1_1_0; }
		
		//'*'
		public Keyword getOpAsteriskKeyword_1_1_0_0() { return cOpAsteriskKeyword_1_1_0_0; }
		
		//'/'
		public Keyword getOpSolidusKeyword_1_1_0_1() { return cOpSolidusKeyword_1_1_0_1; }
		
		//argument=(unary|LetExp)
		public Assignment getArgumentAssignment_1_2() { return cArgumentAssignment_1_2; }
		
		//(unary|LetExp)
		public Alternatives getArgumentAlternatives_1_2_0() { return cArgumentAlternatives_1_2_0; }
		
		//unary
		public RuleCall getArgumentUnaryParserRuleCall_1_2_0_0() { return cArgumentUnaryParserRuleCall_1_2_0_0; }
		
		//LetExp
		public RuleCall getArgumentLetExpParserRuleCall_1_2_0_1() { return cArgumentLetExpParserRuleCall_1_2_0_1; }
	}
	public class UnaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.unary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNavigationExpParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cPrefixExpAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cOpAlternatives_1_1_0 = (Alternatives)cOpAssignment_1_1.eContents().get(0);
		private final Keyword cOpHyphenMinusKeyword_1_1_0_0 = (Keyword)cOpAlternatives_1_1_0.eContents().get(0);
		private final Keyword cOpNotKeyword_1_1_0_1 = (Keyword)cOpAlternatives_1_1_0.eContents().get(1);
		private final Assignment cSourceAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cSourceUnaryParserRuleCall_1_2_0 = (RuleCall)cSourceAssignment_1_2.eContents().get(0);
		
		//unary returns Expression:
		//    NavigationExp
		//|    ({PrefixExp} op=('-'|'not') source=unary)
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//    NavigationExp
		//|    ({PrefixExp} op=('-'|'not') source=unary)
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//NavigationExp
		public RuleCall getNavigationExpParserRuleCall_0() { return cNavigationExpParserRuleCall_0; }
		
		//({PrefixExp} op=('-'|'not') source=unary)
		public Group getGroup_1() { return cGroup_1; }
		
		//{PrefixExp}
		public Action getPrefixExpAction_1_0() { return cPrefixExpAction_1_0; }
		
		//op=('-'|'not')
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//('-'|'not')
		public Alternatives getOpAlternatives_1_1_0() { return cOpAlternatives_1_1_0; }
		
		//'-'
		public Keyword getOpHyphenMinusKeyword_1_1_0_0() { return cOpHyphenMinusKeyword_1_1_0_0; }
		
		//'not'
		public Keyword getOpNotKeyword_1_1_0_1() { return cOpNotKeyword_1_1_0_1; }
		
		//source=unary
		public Assignment getSourceAssignment_1_2() { return cSourceAssignment_1_2; }
		
		//unary
		public RuleCall getSourceUnaryParserRuleCall_1_2_0() { return cSourceUnaryParserRuleCall_1_2_0; }
	}
	public class SubNavigationExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.SubNavigationExp");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cRoundBracketExpParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSquareBracketExpParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSelfExpParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cPrimitiveLiteralExpParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cTupleLiteralExpParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cCollectionLiteralExpParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cPreExpParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cTypeExpParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cIfExpParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final Group cGroup_9 = (Group)cAlternatives.eContents().get(9);
		private final Keyword cLeftParenthesisKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Action cNestedExpAction_9_1 = (Action)cGroup_9.eContents().get(1);
		private final Assignment cSourceAssignment_9_2 = (Assignment)cGroup_9.eContents().get(2);
		private final RuleCall cSourceExpressionParserRuleCall_9_2_0 = (RuleCall)cSourceAssignment_9_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_9_3 = (Keyword)cGroup_9.eContents().get(3);
		
		//SubNavigationExp returns Expression:
		//    RoundBracketExp
		//|    SquareBracketExp
		//|    SelfExp
		//|    PrimitiveLiteralExp
		//|    TupleLiteralExp
		//|    CollectionLiteralExp
		//|    PreExp
		//|    TypeExp
		//|    IfExp
		//|    '('{NestedExp} source=Expression ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//    RoundBracketExp
		//|    SquareBracketExp
		//|    SelfExp
		//|    PrimitiveLiteralExp
		//|    TupleLiteralExp
		//|    CollectionLiteralExp
		//|    PreExp
		//|    TypeExp
		//|    IfExp
		//|    '('{NestedExp} source=Expression ')'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//RoundBracketExp
		public RuleCall getRoundBracketExpParserRuleCall_0() { return cRoundBracketExpParserRuleCall_0; }
		
		//SquareBracketExp
		public RuleCall getSquareBracketExpParserRuleCall_1() { return cSquareBracketExpParserRuleCall_1; }
		
		//SelfExp
		public RuleCall getSelfExpParserRuleCall_2() { return cSelfExpParserRuleCall_2; }
		
		//PrimitiveLiteralExp
		public RuleCall getPrimitiveLiteralExpParserRuleCall_3() { return cPrimitiveLiteralExpParserRuleCall_3; }
		
		//TupleLiteralExp
		public RuleCall getTupleLiteralExpParserRuleCall_4() { return cTupleLiteralExpParserRuleCall_4; }
		
		//CollectionLiteralExp
		public RuleCall getCollectionLiteralExpParserRuleCall_5() { return cCollectionLiteralExpParserRuleCall_5; }
		
		//PreExp
		public RuleCall getPreExpParserRuleCall_6() { return cPreExpParserRuleCall_6; }
		
		//TypeExp
		public RuleCall getTypeExpParserRuleCall_7() { return cTypeExpParserRuleCall_7; }
		
		//IfExp
		public RuleCall getIfExpParserRuleCall_8() { return cIfExpParserRuleCall_8; }
		
		//'('{NestedExp} source=Expression ')'
		public Group getGroup_9() { return cGroup_9; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_9_0() { return cLeftParenthesisKeyword_9_0; }
		
		//{NestedExp}
		public Action getNestedExpAction_9_1() { return cNestedExpAction_9_1; }
		
		//source=Expression
		public Assignment getSourceAssignment_9_2() { return cSourceAssignment_9_2; }
		
		//Expression
		public RuleCall getSourceExpressionParserRuleCall_9_2_0() { return cSourceExpressionParserRuleCall_9_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_9_3() { return cRightParenthesisKeyword_9_3; }
	}
	public class SubNavigatingExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.SubNavigatingExp");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cRoundBracketExpParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSquareBracketExpParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cPreExpParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cNameExpParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//SubNavigatingExp returns Expression:
		//    RoundBracketExp
		//|    SquareBracketExp
		//|    PreExp
		//|    NameExp
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//    RoundBracketExp
		//|    SquareBracketExp
		//|    PreExp
		//|    NameExp
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//RoundBracketExp
		public RuleCall getRoundBracketExpParserRuleCall_0() { return cRoundBracketExpParserRuleCall_0; }
		
		//SquareBracketExp
		public RuleCall getSquareBracketExpParserRuleCall_1() { return cSquareBracketExpParserRuleCall_1; }
		
		//PreExp
		public RuleCall getPreExpParserRuleCall_2() { return cPreExpParserRuleCall_2; }
		
		//NameExp
		public RuleCall getNameExpParserRuleCall_3() { return cNameExpParserRuleCall_3; }
	}
	public class IteratorVariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.iteratorVariable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIdentifierParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cTypeAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cTypeTypeExpParserRuleCall_1_1_0 = (RuleCall)cTypeAssignment_1_1.eContents().get(0);
		
		//iteratorVariable :
		//    name=Identifier (':' type=TypeExp)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=Identifier (':' type=TypeExp)?
		public Group getGroup() { return cGroup; }
		
		//name=Identifier
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//Identifier
		public RuleCall getNameIdentifierParserRuleCall_0_0() { return cNameIdentifierParserRuleCall_0_0; }
		
		//(':' type=TypeExp)?
		public Group getGroup_1() { return cGroup_1; }
		
		//':'
		public Keyword getColonKeyword_1_0() { return cColonKeyword_1_0; }
		
		//type=TypeExp
		public Assignment getTypeAssignment_1_1() { return cTypeAssignment_1_1; }
		
		//TypeExp
		public RuleCall getTypeTypeExpParserRuleCall_1_1_0() { return cTypeTypeExpParserRuleCall_1_1_0; }
	}
	public class IteratorAccumulatorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.iteratorAccumulator");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIdentifierParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeTypeExpParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		private final Keyword cEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cInitExpressionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cInitExpressionExpressionParserRuleCall_4_0 = (RuleCall)cInitExpressionAssignment_4.eContents().get(0);
		
		//iteratorAccumulator :
		//    name=Identifier ':' type=TypeExp '=' initExpression=Expression
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=Identifier ':' type=TypeExp '=' initExpression=Expression
		public Group getGroup() { return cGroup; }
		
		//name=Identifier
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//Identifier
		public RuleCall getNameIdentifierParserRuleCall_0_0() { return cNameIdentifierParserRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//type=TypeExp
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//TypeExp
		public RuleCall getTypeTypeExpParserRuleCall_2_0() { return cTypeTypeExpParserRuleCall_2_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_3() { return cEqualsSignKeyword_3; }
		
		//initExpression=Expression
		public Assignment getInitExpressionAssignment_4() { return cInitExpressionAssignment_4; }
		
		//Expression
		public RuleCall getInitExpressionExpressionParserRuleCall_4_0() { return cInitExpressionExpressionParserRuleCall_4_0; }
	}
	public class RoundBracketExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.RoundBracketExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameNameExpParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommercialAtKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cPreAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Keyword cPrePreKeyword_1_1_0 = (Keyword)cPreAssignment_1_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cVariable1Assignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cVariable1IteratorVariableParserRuleCall_3_0_0 = (RuleCall)cVariable1Assignment_3_0.eContents().get(0);
		private final Alternatives cAlternatives_3_1 = (Alternatives)cGroup_3.eContents().get(1);
		private final Group cGroup_3_1_0 = (Group)cAlternatives_3_1.eContents().get(0);
		private final Keyword cCommaKeyword_3_1_0_0 = (Keyword)cGroup_3_1_0.eContents().get(0);
		private final Assignment cVariable2Assignment_3_1_0_1 = (Assignment)cGroup_3_1_0.eContents().get(1);
		private final RuleCall cVariable2IteratorVariableParserRuleCall_3_1_0_1_0 = (RuleCall)cVariable2Assignment_3_1_0_1.eContents().get(0);
		private final Group cGroup_3_1_1 = (Group)cAlternatives_3_1.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_1_1_0 = (Keyword)cGroup_3_1_1.eContents().get(0);
		private final Assignment cVariable2Assignment_3_1_1_1 = (Assignment)cGroup_3_1_1.eContents().get(1);
		private final RuleCall cVariable2IteratorAccumulatorParserRuleCall_3_1_1_1_0 = (RuleCall)cVariable2Assignment_3_1_1_1.eContents().get(0);
		private final Keyword cVerticalLineKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Assignment cArgumentsAssignment_4_0 = (Assignment)cGroup_4.eContents().get(0);
		private final RuleCall cArgumentsExpressionParserRuleCall_4_0_0 = (RuleCall)cArgumentsAssignment_4_0.eContents().get(0);
		private final Group cGroup_4_1 = (Group)cGroup_4.eContents().get(1);
		private final Keyword cCommaKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Assignment cArgumentsAssignment_4_1_1 = (Assignment)cGroup_4_1.eContents().get(1);
		private final RuleCall cArgumentsExpressionParserRuleCall_4_1_1_0 = (RuleCall)cArgumentsAssignment_4_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//RoundBracketExp :
		//    name=NameExp ('@' pre?='pre')? '('
		//        (variable1=iteratorVariable
		//            ((',' variable2=iteratorVariable)
		//            |(';' variable2=iteratorAccumulator))?
		//            '|')?
		//        (arguments+=Expression (',' arguments+=Expression)*)?
		//    ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=NameExp ('@' pre?='pre')? '('
		//    (variable1=iteratorVariable
		//        ((',' variable2=iteratorVariable)
		//        |(';' variable2=iteratorAccumulator))?
		//        '|')?
		//    (arguments+=Expression (',' arguments+=Expression)*)?
		//')'
		public Group getGroup() { return cGroup; }
		
		//name=NameExp
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//NameExp
		public RuleCall getNameNameExpParserRuleCall_0_0() { return cNameNameExpParserRuleCall_0_0; }
		
		//('@' pre?='pre')?
		public Group getGroup_1() { return cGroup_1; }
		
		//'@'
		public Keyword getCommercialAtKeyword_1_0() { return cCommercialAtKeyword_1_0; }
		
		//pre?='pre'
		public Assignment getPreAssignment_1_1() { return cPreAssignment_1_1; }
		
		//'pre'
		public Keyword getPrePreKeyword_1_1_0() { return cPrePreKeyword_1_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//(variable1=iteratorVariable
		//    ((',' variable2=iteratorVariable)
		//    |(';' variable2=iteratorAccumulator))?
		//    '|')?
		public Group getGroup_3() { return cGroup_3; }
		
		//variable1=iteratorVariable
		public Assignment getVariable1Assignment_3_0() { return cVariable1Assignment_3_0; }
		
		//iteratorVariable
		public RuleCall getVariable1IteratorVariableParserRuleCall_3_0_0() { return cVariable1IteratorVariableParserRuleCall_3_0_0; }
		
		//((',' variable2=iteratorVariable)
		//|(';' variable2=iteratorAccumulator))?
		public Alternatives getAlternatives_3_1() { return cAlternatives_3_1; }
		
		//(',' variable2=iteratorVariable)
		public Group getGroup_3_1_0() { return cGroup_3_1_0; }
		
		//','
		public Keyword getCommaKeyword_3_1_0_0() { return cCommaKeyword_3_1_0_0; }
		
		//variable2=iteratorVariable
		public Assignment getVariable2Assignment_3_1_0_1() { return cVariable2Assignment_3_1_0_1; }
		
		//iteratorVariable
		public RuleCall getVariable2IteratorVariableParserRuleCall_3_1_0_1_0() { return cVariable2IteratorVariableParserRuleCall_3_1_0_1_0; }
		
		//(';' variable2=iteratorAccumulator)
		public Group getGroup_3_1_1() { return cGroup_3_1_1; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_1_0() { return cSemicolonKeyword_3_1_1_0; }
		
		//variable2=iteratorAccumulator
		public Assignment getVariable2Assignment_3_1_1_1() { return cVariable2Assignment_3_1_1_1; }
		
		//iteratorAccumulator
		public RuleCall getVariable2IteratorAccumulatorParserRuleCall_3_1_1_1_0() { return cVariable2IteratorAccumulatorParserRuleCall_3_1_1_1_0; }
		
		//'|'
		public Keyword getVerticalLineKeyword_3_2() { return cVerticalLineKeyword_3_2; }
		
		//(arguments+=Expression (',' arguments+=Expression)*)?
		public Group getGroup_4() { return cGroup_4; }
		
		//arguments+=Expression
		public Assignment getArgumentsAssignment_4_0() { return cArgumentsAssignment_4_0; }
		
		//Expression
		public RuleCall getArgumentsExpressionParserRuleCall_4_0_0() { return cArgumentsExpressionParserRuleCall_4_0_0; }
		
		//(',' arguments+=Expression)*
		public Group getGroup_4_1() { return cGroup_4_1; }
		
		//','
		public Keyword getCommaKeyword_4_1_0() { return cCommaKeyword_4_1_0; }
		
		//arguments+=Expression
		public Assignment getArgumentsAssignment_4_1_1() { return cArgumentsAssignment_4_1_1; }
		
		//Expression
		public RuleCall getArgumentsExpressionParserRuleCall_4_1_1_0() { return cArgumentsExpressionParserRuleCall_4_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}
	public class SquareBracketExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.SquareBracketExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameNameExpParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cArgumentsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cArgumentsExpressionParserRuleCall_2_0 = (RuleCall)cArgumentsAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cArgumentsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cArgumentsExpressionParserRuleCall_3_1_0 = (RuleCall)cArgumentsAssignment_3_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommercialAtKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cPreAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final Keyword cPrePreKeyword_5_1_0 = (Keyword)cPreAssignment_5_1.eContents().get(0);
		
		//SquareBracketExp :
		//    name=NameExp '[' arguments+=Expression (',' arguments+=Expression)* ']' ('@' pre?='pre')?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=NameExp '[' arguments+=Expression (',' arguments+=Expression)* ']' ('@' pre?='pre')?
		public Group getGroup() { return cGroup; }
		
		//name=NameExp
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//NameExp
		public RuleCall getNameNameExpParserRuleCall_0_0() { return cNameNameExpParserRuleCall_0_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//arguments+=Expression
		public Assignment getArgumentsAssignment_2() { return cArgumentsAssignment_2; }
		
		//Expression
		public RuleCall getArgumentsExpressionParserRuleCall_2_0() { return cArgumentsExpressionParserRuleCall_2_0; }
		
		//(',' arguments+=Expression)*
		public Group getGroup_3() { return cGroup_3; }
		
		//','
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//arguments+=Expression
		public Assignment getArgumentsAssignment_3_1() { return cArgumentsAssignment_3_1; }
		
		//Expression
		public RuleCall getArgumentsExpressionParserRuleCall_3_1_0() { return cArgumentsExpressionParserRuleCall_3_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_4() { return cRightSquareBracketKeyword_4; }
		
		//('@' pre?='pre')?
		public Group getGroup_5() { return cGroup_5; }
		
		//'@'
		public Keyword getCommercialAtKeyword_5_0() { return cCommercialAtKeyword_5_0; }
		
		//pre?='pre'
		public Assignment getPreAssignment_5_1() { return cPreAssignment_5_1; }
		
		//'pre'
		public Keyword getPrePreKeyword_5_1_0() { return cPrePreKeyword_5_1_0; }
	}
	public class PreExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.PreExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameNameExpParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cCommercialAtKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cPreKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//PreExp :
		//    name=NameExp '@' 'pre'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=NameExp '@' 'pre'
		public Group getGroup() { return cGroup; }
		
		//name=NameExp
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//NameExp
		public RuleCall getNameNameExpParserRuleCall_0_0() { return cNameNameExpParserRuleCall_0_0; }
		
		//'@'
		public Keyword getCommercialAtKeyword_1() { return cCommercialAtKeyword_1; }
		
		//'pre'
		public Keyword getPreKeyword_2() { return cPreKeyword_2; }
	}
	public class SelfExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.SelfExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSelfExpAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSelfKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//SelfExp :
		//    {SelfExp} 'self'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{SelfExp} 'self'
		public Group getGroup() { return cGroup; }
		
		//{SelfExp}
		public Action getSelfExpAction_0() { return cSelfExpAction_0; }
		
		//'self'
		public Keyword getSelfKeyword_1() { return cSelfKeyword_1; }
	}
	public class NameExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.NameExp");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPathNameExpParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSimpleNameExpParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//NameExp :
		//    PathNameExp | SimpleNameExp
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//PathNameExp | SimpleNameExp
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//PathNameExp
		public RuleCall getPathNameExpParserRuleCall_0() { return cPathNameExpParserRuleCall_0; }
		
		//SimpleNameExp
		public RuleCall getSimpleNameExpParserRuleCall_1() { return cSimpleNameExpParserRuleCall_1; }
	}
	public class PathNameExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.PathNameExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNamespaceAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNamespaceIdentifierParserRuleCall_0_0 = (RuleCall)cNamespaceAssignment_0.eContents().get(0);
		private final Keyword cColonColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cElementAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cElementNameExpParserRuleCall_2_0 = (RuleCall)cElementAssignment_2.eContents().get(0);
		
		//PathNameExp :
		//    namespace=Identifier '::' element=NameExp
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//namespace=Identifier '::' element=NameExp
		public Group getGroup() { return cGroup; }
		
		//namespace=Identifier
		public Assignment getNamespaceAssignment_0() { return cNamespaceAssignment_0; }
		
		//Identifier
		public RuleCall getNamespaceIdentifierParserRuleCall_0_0() { return cNamespaceIdentifierParserRuleCall_0_0; }
		
		//'::'
		public Keyword getColonColonKeyword_1() { return cColonColonKeyword_1; }
		
		//element=NameExp
		public Assignment getElementAssignment_2() { return cElementAssignment_2; }
		
		//NameExp
		public RuleCall getElementNameExpParserRuleCall_2_0() { return cElementNameExpParserRuleCall_2_0; }
	}
	public class SimpleNameExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.SimpleNameExp");
		private final Assignment cElementAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementIdentifierParserRuleCall_0 = (RuleCall)cElementAssignment.eContents().get(0);
		
		//SimpleNameExp :
		//    element=Identifier
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//element=Identifier
		public Assignment getElementAssignment() { return cElementAssignment; }
		
		//Identifier
		public RuleCall getElementIdentifierParserRuleCall_0() { return cElementIdentifierParserRuleCall_0; }
	}
	public class IfExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.IfExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIfKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cConditionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConditionExpressionParserRuleCall_1_0 = (RuleCall)cConditionAssignment_1.eContents().get(0);
		private final Keyword cThenKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cThenExpressionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cThenExpressionExpressionParserRuleCall_3_0 = (RuleCall)cThenExpressionAssignment_3.eContents().get(0);
		private final Keyword cElseKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cElseExpressionAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cElseExpressionExpressionParserRuleCall_5_0 = (RuleCall)cElseExpressionAssignment_5.eContents().get(0);
		private final Keyword cEndifKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//IfExp:
		//    'if' condition=Expression
		//    'then' thenExpression=Expression
		//    'else' elseExpression=Expression
		//    'endif'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'if' condition=Expression
		//'then' thenExpression=Expression
		//'else' elseExpression=Expression
		//'endif'
		public Group getGroup() { return cGroup; }
		
		//'if'
		public Keyword getIfKeyword_0() { return cIfKeyword_0; }
		
		//condition=Expression
		public Assignment getConditionAssignment_1() { return cConditionAssignment_1; }
		
		//Expression
		public RuleCall getConditionExpressionParserRuleCall_1_0() { return cConditionExpressionParserRuleCall_1_0; }
		
		//'then'
		public Keyword getThenKeyword_2() { return cThenKeyword_2; }
		
		//thenExpression=Expression
		public Assignment getThenExpressionAssignment_3() { return cThenExpressionAssignment_3; }
		
		//Expression
		public RuleCall getThenExpressionExpressionParserRuleCall_3_0() { return cThenExpressionExpressionParserRuleCall_3_0; }
		
		//'else'
		public Keyword getElseKeyword_4() { return cElseKeyword_4; }
		
		//elseExpression=Expression
		public Assignment getElseExpressionAssignment_5() { return cElseExpressionAssignment_5; }
		
		//Expression
		public RuleCall getElseExpressionExpressionParserRuleCall_5_0() { return cElseExpressionExpressionParserRuleCall_5_0; }
		
		//'endif'
		public Keyword getEndifKeyword_6() { return cEndifKeyword_6; }
	}
	public class LetExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.LetExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVariableAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVariableLetVariableParserRuleCall_1_0 = (RuleCall)cVariableAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cVariableAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cVariableLetVariableParserRuleCall_2_1_0 = (RuleCall)cVariableAssignment_2_1.eContents().get(0);
		private final Keyword cInKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cInAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cInExpressionParserRuleCall_4_0 = (RuleCall)cInAssignment_4.eContents().get(0);
		
		//LetExp:
		//    'let'
		//    variable+=LetVariable (',' variable+=LetVariable)*
		//    'in' in=Expression
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'let'
		//variable+=LetVariable (',' variable+=LetVariable)*
		//'in' in=Expression
		public Group getGroup() { return cGroup; }
		
		//'let'
		public Keyword getLetKeyword_0() { return cLetKeyword_0; }
		
		//variable+=LetVariable
		public Assignment getVariableAssignment_1() { return cVariableAssignment_1; }
		
		//LetVariable
		public RuleCall getVariableLetVariableParserRuleCall_1_0() { return cVariableLetVariableParserRuleCall_1_0; }
		
		//(',' variable+=LetVariable)*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//variable+=LetVariable
		public Assignment getVariableAssignment_2_1() { return cVariableAssignment_2_1; }
		
		//LetVariable
		public RuleCall getVariableLetVariableParserRuleCall_2_1_0() { return cVariableLetVariableParserRuleCall_2_1_0; }
		
		//'in'
		public Keyword getInKeyword_3() { return cInKeyword_3; }
		
		//in=Expression
		public Assignment getInAssignment_4() { return cInAssignment_4; }
		
		//Expression
		public RuleCall getInExpressionParserRuleCall_4_0() { return cInExpressionParserRuleCall_4_0; }
	}
	public class LetVariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.LetVariable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIdentifierParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeTypeExpParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		private final Keyword cEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cInitExpressionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cInitExpressionExpressionParserRuleCall_4_0 = (RuleCall)cInitExpressionAssignment_4.eContents().get(0);
		
		//LetVariable:
		//    name=Identifier ':' type=TypeExp '=' initExpression=Expression
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=Identifier ':' type=TypeExp '=' initExpression=Expression
		public Group getGroup() { return cGroup; }
		
		//name=Identifier
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//Identifier
		public RuleCall getNameIdentifierParserRuleCall_0_0() { return cNameIdentifierParserRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//type=TypeExp
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//TypeExp
		public RuleCall getTypeTypeExpParserRuleCall_2_0() { return cTypeTypeExpParserRuleCall_2_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_3() { return cEqualsSignKeyword_3; }
		
		//initExpression=Expression
		public Assignment getInitExpressionAssignment_4() { return cInitExpressionAssignment_4; }
		
		//Expression
		public RuleCall getInitExpressionExpressionParserRuleCall_4_0() { return cInitExpressionExpressionParserRuleCall_4_0; }
	}
	
	
	private final DocumentElements pDocument;
	private final BodyElements pBody;
	private final ClassifierContextDeclElements pClassifierContextDecl;
	private final ClassifierRefElements pClassifierRef;
	private final ContextDeclElements pContextDecl;
	private final DefinitionElements pDefinition;
	private final DerElements pDer;
	private final InitElements pInit;
	private final InvariantElements pInvariant;
	private final OperationContextDeclElements pOperationContextDecl;
	private final OperationRefElements pOperationRef;
	private final PackageDeclarationElements pPackageDeclaration;
	private final PackageRefElements pPackageRef;
	private final ParameterElements pParameter;
	private final PostElements pPost;
	private final PreElements pPre;
	private final PropertyContextDeclElements pPropertyContextDecl;
	private final PropertyRefElements pPropertyRef;
	private final QualifiedClassifierRefElements pQualifiedClassifierRef;
	private final QualifiedOperationRefElements pQualifiedOperationRef;
	private final QualifiedPropertyRefElements pQualifiedPropertyRef;
	private final QualifiedPackageRefElements pQualifiedPackageRef;
	private final SimpleClassifierRefElements pSimpleClassifierRef;
	private final SimpleOperationRefElements pSimpleOperationRef;
	private final SimplePackageRefElements pSimplePackageRef;
	private final SimplePropertyRefElements pSimplePropertyRef;
	private final NavigationExpElements pNavigationExp;
	private final NavigatingExpElements pNavigatingExp;
	private final OclMessageArgElements pOclMessageArg;
	private final NUMBER_LITERALElements pNUMBER_LITERAL;
	private final EssentialOCLRestrictedKeywordsElements pEssentialOCLRestrictedKeywords;
	private final RestrictedKeywordsElements pRestrictedKeywords;
	private final IdentifierElements pIdentifier;
	private final StringLiteralElements pStringLiteral;
	private final SimpleNameElements pSimpleName;
	private final PrimitiveTypeIdentifierElements pPrimitiveTypeIdentifier;
	private final PrimitiveTypeElements pPrimitiveType;
	private final CollectionTypeIdentifierElements pCollectionTypeIdentifier;
	private final TypeExpElements pTypeExp;
	private final CollectionTypeElements pCollectionType;
	private final TupleTypeElements pTupleType;
	private final TuplePartElements pTuplePart;
	private final CollectionLiteralExpElements pCollectionLiteralExp;
	private final CollectionLiteralPartElements pCollectionLiteralPart;
	private final PrimitiveLiteralExpElements pPrimitiveLiteralExp;
	private final TupleLiteralExpElements pTupleLiteralExp;
	private final TupleLiteralPartElements pTupleLiteralPart;
	private final NumberLiteralExpElements pNumberLiteralExp;
	private final StringLiteralExpElements pStringLiteralExp;
	private final BooleanLiteralExpElements pBooleanLiteralExp;
	private final InvalidLiteralExpElements pInvalidLiteralExp;
	private final NullLiteralExpElements pNullLiteralExp;
	private final ExpressionElements pExpression;
	private final ImpliesElements pImplies;
	private final XorElements pXor;
	private final OrElements pOr;
	private final AndElements pAnd;
	private final EqualityElements pEquality;
	private final RelationalElements pRelational;
	private final AdditiveElements pAdditive;
	private final MultiplicativeElements pMultiplicative;
	private final UnaryElements pUnary;
	private final SubNavigationExpElements pSubNavigationExp;
	private final SubNavigatingExpElements pSubNavigatingExp;
	private final IteratorVariableElements pIteratorVariable;
	private final IteratorAccumulatorElements pIteratorAccumulator;
	private final RoundBracketExpElements pRoundBracketExp;
	private final SquareBracketExpElements pSquareBracketExp;
	private final PreExpElements pPreExp;
	private final SelfExpElements pSelfExp;
	private final NameExpElements pNameExp;
	private final PathNameExpElements pPathNameExp;
	private final SimpleNameExpElements pSimpleNameExp;
	private final IfExpElements pIfExp;
	private final LetExpElements pLetExp;
	private final LetVariableElements pLetVariable;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public BacktrackingContentAssistTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDocument = new DocumentElements();
		this.pBody = new BodyElements();
		this.pClassifierContextDecl = new ClassifierContextDeclElements();
		this.pClassifierRef = new ClassifierRefElements();
		this.pContextDecl = new ContextDeclElements();
		this.pDefinition = new DefinitionElements();
		this.pDer = new DerElements();
		this.pInit = new InitElements();
		this.pInvariant = new InvariantElements();
		this.pOperationContextDecl = new OperationContextDeclElements();
		this.pOperationRef = new OperationRefElements();
		this.pPackageDeclaration = new PackageDeclarationElements();
		this.pPackageRef = new PackageRefElements();
		this.pParameter = new ParameterElements();
		this.pPost = new PostElements();
		this.pPre = new PreElements();
		this.pPropertyContextDecl = new PropertyContextDeclElements();
		this.pPropertyRef = new PropertyRefElements();
		this.pQualifiedClassifierRef = new QualifiedClassifierRefElements();
		this.pQualifiedOperationRef = new QualifiedOperationRefElements();
		this.pQualifiedPropertyRef = new QualifiedPropertyRefElements();
		this.pQualifiedPackageRef = new QualifiedPackageRefElements();
		this.pSimpleClassifierRef = new SimpleClassifierRefElements();
		this.pSimpleOperationRef = new SimpleOperationRefElements();
		this.pSimplePackageRef = new SimplePackageRefElements();
		this.pSimplePropertyRef = new SimplePropertyRefElements();
		this.pNavigationExp = new NavigationExpElements();
		this.pNavigatingExp = new NavigatingExpElements();
		this.pOclMessageArg = new OclMessageArgElements();
		this.pNUMBER_LITERAL = new NUMBER_LITERALElements();
		this.pEssentialOCLRestrictedKeywords = new EssentialOCLRestrictedKeywordsElements();
		this.pRestrictedKeywords = new RestrictedKeywordsElements();
		this.pIdentifier = new IdentifierElements();
		this.pStringLiteral = new StringLiteralElements();
		this.pSimpleName = new SimpleNameElements();
		this.pPrimitiveTypeIdentifier = new PrimitiveTypeIdentifierElements();
		this.pPrimitiveType = new PrimitiveTypeElements();
		this.pCollectionTypeIdentifier = new CollectionTypeIdentifierElements();
		this.pTypeExp = new TypeExpElements();
		this.pCollectionType = new CollectionTypeElements();
		this.pTupleType = new TupleTypeElements();
		this.pTuplePart = new TuplePartElements();
		this.pCollectionLiteralExp = new CollectionLiteralExpElements();
		this.pCollectionLiteralPart = new CollectionLiteralPartElements();
		this.pPrimitiveLiteralExp = new PrimitiveLiteralExpElements();
		this.pTupleLiteralExp = new TupleLiteralExpElements();
		this.pTupleLiteralPart = new TupleLiteralPartElements();
		this.pNumberLiteralExp = new NumberLiteralExpElements();
		this.pStringLiteralExp = new StringLiteralExpElements();
		this.pBooleanLiteralExp = new BooleanLiteralExpElements();
		this.pInvalidLiteralExp = new InvalidLiteralExpElements();
		this.pNullLiteralExp = new NullLiteralExpElements();
		this.pExpression = new ExpressionElements();
		this.pImplies = new ImpliesElements();
		this.pXor = new XorElements();
		this.pOr = new OrElements();
		this.pAnd = new AndElements();
		this.pEquality = new EqualityElements();
		this.pRelational = new RelationalElements();
		this.pAdditive = new AdditiveElements();
		this.pMultiplicative = new MultiplicativeElements();
		this.pUnary = new UnaryElements();
		this.pSubNavigationExp = new SubNavigationExpElements();
		this.pSubNavigatingExp = new SubNavigatingExpElements();
		this.pIteratorVariable = new IteratorVariableElements();
		this.pIteratorAccumulator = new IteratorAccumulatorElements();
		this.pRoundBracketExp = new RoundBracketExpElements();
		this.pSquareBracketExp = new SquareBracketExpElements();
		this.pPreExp = new PreExpElements();
		this.pSelfExp = new SelfExpElements();
		this.pNameExp = new NameExpElements();
		this.pPathNameExp = new PathNameExpElements();
		this.pSimpleNameExp = new SimpleNameExpElements();
		this.pIfExp = new IfExpElements();
		this.pLetExp = new LetExpElements();
		this.pLetVariable = new LetVariableElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage".equals(grammar.getName())) {
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

	
	//Document :
	//    (packages+=PackageDeclaration | contexts+=ContextDecl)*
	//;
	public DocumentElements getDocumentAccess() {
		return pDocument;
	}
	
	public ParserRule getDocumentRule() {
		return getDocumentAccess().getRule();
	}
	
	//Body:
	//    'body' (constraintName=Identifier)? ':' expression=Expression
	//;
	public BodyElements getBodyAccess() {
		return pBody;
	}
	
	public ParserRule getBodyRule() {
		return getBodyAccess().getRule();
	}
	
	//ClassifierContextDecl:
	//    'context' (selfName=Identifier ':' )? classifier=ClassifierRef
	//        (invariants+=Invariant | definitions+=Definition)*
	//;
	public ClassifierContextDeclElements getClassifierContextDeclAccess() {
		return pClassifierContextDecl;
	}
	
	public ParserRule getClassifierContextDeclRule() {
		return getClassifierContextDeclAccess().getRule();
	}
	
	//ClassifierRef:
	//    QualifiedClassifierRef | SimpleClassifierRef
	//;
	public ClassifierRefElements getClassifierRefAccess() {
		return pClassifierRef;
	}
	
	public ParserRule getClassifierRefRule() {
		return getClassifierRefAccess().getRule();
	}
	
	//ContextDecl:
	//    PropertyContextDecl
	//|    ClassifierContextDecl
	//|    OperationContextDecl
	//;
	public ContextDeclElements getContextDeclAccess() {
		return pContextDecl;
	}
	
	public ParserRule getContextDeclRule() {
		return getContextDeclAccess().getRule();
	}
	
	//Definition:
	//    (static?='static')? 'def' (constraintName=Identifier)? ':' constrainedName=Identifier
	//    ('(' (parameters+=Parameter (',' parameters+=Parameter)*)? ')')?
	//    ':' (type=TypeExp)? '=' expression=Expression
	//;
	public DefinitionElements getDefinitionAccess() {
		return pDefinition;
	}
	
	public ParserRule getDefinitionRule() {
		return getDefinitionAccess().getRule();
	}
	
	//Der:
	//    'derive' ':' expression=Expression
	//;
	public DerElements getDerAccess() {
		return pDer;
	}
	
	public ParserRule getDerRule() {
		return getDerAccess().getRule();
	}
	
	//Init:
	//    'init' ':' expression=Expression
	//;
	public InitElements getInitAccess() {
		return pInit;
	}
	
	public ParserRule getInitRule() {
		return getInitAccess().getRule();
	}
	
	//Invariant:
	//    'inv' (constraintName=Identifier)? ':' expression=Expression
	//;
	public InvariantElements getInvariantAccess() {
		return pInvariant;
	}
	
	public ParserRule getInvariantRule() {
		return getInvariantAccess().getRule();
	}
	
	//OperationContextDecl:
	//    'context' operation=OperationRef '('
	//    (parameters+=Parameter (',' parameters+=Parameter)*)?
	//    ')' ':' (type=TypeExp)?
	//    ((pres+=Pre) | (posts+=Post) | (bodies+=Body))*
	//;
	public OperationContextDeclElements getOperationContextDeclAccess() {
		return pOperationContextDecl;
	}
	
	public ParserRule getOperationContextDeclRule() {
		return getOperationContextDeclAccess().getRule();
	}
	
	//OperationRef:
	//    QualifiedOperationRef | SimpleOperationRef
	//;
	public OperationRefElements getOperationRefAccess() {
		return pOperationRef;
	}
	
	public ParserRule getOperationRefRule() {
		return getOperationRefAccess().getRule();
	}
	
	//PackageDeclaration :
	//    'package' package=PackageRef (contexts+=ContextDecl)* 'endpackage'
	//;
	public PackageDeclarationElements getPackageDeclarationAccess() {
		return pPackageDeclaration;
	}
	
	public ParserRule getPackageDeclarationRule() {
		return getPackageDeclarationAccess().getRule();
	}
	
	//PackageRef:
	//    QualifiedPackageRef | SimplePackageRef
	//;
	public PackageRefElements getPackageRefAccess() {
		return pPackageRef;
	}
	
	public ParserRule getPackageRefRule() {
		return getPackageRefAccess().getRule();
	}
	
	//Parameter:
	//    (name=Identifier ':')? type=TypeExp
	//;
	public ParameterElements getParameterAccess() {
		return pParameter;
	}
	
	public ParserRule getParameterRule() {
		return getParameterAccess().getRule();
	}
	
	//Post:
	//    'post' (constraintName=Identifier)? ':' expression=Expression
	//;
	public PostElements getPostAccess() {
		return pPost;
	}
	
	public ParserRule getPostRule() {
		return getPostAccess().getRule();
	}
	
	//Pre:
	//    'pre' (constraintName=Identifier)? ':' expression=Expression
	//;
	public PreElements getPreAccess() {
		return pPre;
	}
	
	public ParserRule getPreRule() {
		return getPreAccess().getRule();
	}
	
	//PropertyContextDecl:
	//    'context' property=PropertyRef ':' type=TypeExp
	//    ((init=Init (der=Der)?)? | (der=Der (init=Init)?))
	//;
	public PropertyContextDeclElements getPropertyContextDeclAccess() {
		return pPropertyContextDecl;
	}
	
	public ParserRule getPropertyContextDeclRule() {
		return getPropertyContextDeclAccess().getRule();
	}
	
	//PropertyRef:
	//    QualifiedPropertyRef | SimplePropertyRef
	//;
	public PropertyRefElements getPropertyRefAccess() {
		return pPropertyRef;
	}
	
	public ParserRule getPropertyRefRule() {
		return getPropertyRefAccess().getRule();
	}
	
	//QualifiedClassifierRef:
	//    namespace=Identifier
	//    '::' element=ClassifierRef
	//;
	public QualifiedClassifierRefElements getQualifiedClassifierRefAccess() {
		return pQualifiedClassifierRef;
	}
	
	public ParserRule getQualifiedClassifierRefRule() {
		return getQualifiedClassifierRefAccess().getRule();
	}
	
	//QualifiedOperationRef :
	//    namespace=Identifier
	//    '::' element=OperationRef
	//;
	public QualifiedOperationRefElements getQualifiedOperationRefAccess() {
		return pQualifiedOperationRef;
	}
	
	public ParserRule getQualifiedOperationRefRule() {
		return getQualifiedOperationRefAccess().getRule();
	}
	
	//QualifiedPropertyRef :
	//    namespace=Identifier
	//    '::' element=PropertyRef
	//;
	public QualifiedPropertyRefElements getQualifiedPropertyRefAccess() {
		return pQualifiedPropertyRef;
	}
	
	public ParserRule getQualifiedPropertyRefRule() {
		return getQualifiedPropertyRefAccess().getRule();
	}
	
	//QualifiedPackageRef :
	//    namespace=Identifier
	//    '::' element=PackageRef
	//;
	public QualifiedPackageRefElements getQualifiedPackageRefAccess() {
		return pQualifiedPackageRef;
	}
	
	public ParserRule getQualifiedPackageRefRule() {
		return getQualifiedPackageRefAccess().getRule();
	}
	
	//SimpleClassifierRef :
	//    classifier=Identifier
	//;
	public SimpleClassifierRefElements getSimpleClassifierRefAccess() {
		return pSimpleClassifierRef;
	}
	
	public ParserRule getSimpleClassifierRefRule() {
		return getSimpleClassifierRefAccess().getRule();
	}
	
	//SimpleOperationRef :
	//    operation=Identifier
	//;
	public SimpleOperationRefElements getSimpleOperationRefAccess() {
		return pSimpleOperationRef;
	}
	
	public ParserRule getSimpleOperationRefRule() {
		return getSimpleOperationRefAccess().getRule();
	}
	
	//SimplePackageRef :
	//    package=Identifier
	//;
	public SimplePackageRefElements getSimplePackageRefAccess() {
		return pSimplePackageRef;
	}
	
	public ParserRule getSimplePackageRefRule() {
		return getSimplePackageRefAccess().getRule();
	}
	
	//SimplePropertyRef :
	//    feature=Identifier
	//;
	public SimplePropertyRefElements getSimplePropertyRefAccess() {
		return pSimplePropertyRef;
	}
	
	public ParserRule getSimplePropertyRefRule() {
		return getSimplePropertyRefAccess().getRule();
	}
	
	////---------------------------------------------------------------------------------
	////    EssentialOCL overrides
	////---------------------------------------------------------------------------------
	//NavigationExp returns Expression:
	//    SubNavigationExp
	//    (
	//        ({InfixExp.source=current} op=('.'|'->') argument=NavigatingExp)
	//    |    ({OclMessage.source=current} op=('^^'|'^') messageName=Identifier
	//            '(' (arguments+=OclMessageArg (',' arguments+=OclMessageArg)*)? ')')
	//    )?
	//;
	public NavigationExpElements getNavigationExpAccess() {
		return pNavigationExp;
	}
	
	public ParserRule getNavigationExpRule() {
		return getNavigationExpAccess().getRule();
	}
	
	//// Follows ., ->, ^
	//NavigatingExp :
	//    SubNavigatingExp
	//    (
	//        ({InfixExp.source=current} op=('.'|'->') argument=NavigatingExp)
	//    |    ({OclMessage.source=current} op=('^^'|'^') messageName=Identifier
	//            '(' (arguments+=OclMessageArg (',' arguments+=OclMessageArg)*)? ')')
	//    )?
	//;
	public NavigatingExpElements getNavigatingExpAccess() {
		return pNavigatingExp;
	}
	
	public ParserRule getNavigatingExpRule() {
		return getNavigatingExpAccess().getRule();
	}
	
	//// FIXME @pre
	//OclMessageArg :
	//    ({OclMessageArg}'?' (':' type=TypeExp)?)
	//|    Expression
	//;
	public OclMessageArgElements getOclMessageArgAccess() {
		return pOclMessageArg;
	}
	
	public ParserRule getOclMessageArgRule() {
		return getOclMessageArgAccess().getRule();
	}
	
	//NUMBER_LITERAL:
	//    INT ('.' INT)? (('e'|'E') ('+'|'-')? INT)?
	//;
	public NUMBER_LITERALElements getNUMBER_LITERALAccess() {
		return pNUMBER_LITERAL;
	}
	
	public ParserRule getNUMBER_LITERALRule() {
		return getNUMBER_LITERALAccess().getRule();
	}
	
	//EssentialOCLRestrictedKeywords:
	//    'e'
	//|    'E'
	//;
	public EssentialOCLRestrictedKeywordsElements getEssentialOCLRestrictedKeywordsAccess() {
		return pEssentialOCLRestrictedKeywords;
	}
	
	public ParserRule getEssentialOCLRestrictedKeywordsRule() {
		return getEssentialOCLRestrictedKeywordsAccess().getRule();
	}
	
	//RestrictedKeywords:                    // Intended to be overridden
	//    EssentialOCLRestrictedKeywords
	//;
	public RestrictedKeywordsElements getRestrictedKeywordsAccess() {
		return pRestrictedKeywords;
	}
	
	public ParserRule getRestrictedKeywordsRule() {
		return getRestrictedKeywordsAccess().getRule();
	}
	
	//Identifier:
	//    ID
	//|    RestrictedKeywords
	//;
	public IdentifierElements getIdentifierAccess() {
		return pIdentifier;
	}
	
	public ParserRule getIdentifierRule() {
		return getIdentifierAccess().getRule();
	}
	
	//StringLiteral:
	//    STRING
	//;
	public StringLiteralElements getStringLiteralAccess() {
		return pStringLiteral;
	}
	
	public ParserRule getStringLiteralRule() {
		return getStringLiteralAccess().getRule();
	}
	
	//SimpleName:
	//    Identifier
	//;
	public SimpleNameElements getSimpleNameAccess() {
		return pSimpleName;
	}
	
	public ParserRule getSimpleNameRule() {
		return getSimpleNameAccess().getRule();
	}
	
	//PrimitiveTypeIdentifier:
	//    'Boolean'
	//|    'Integer'
	//|    'Real'
	//|    'String'
	//|    'UnlimitedNatural'
	//|    'OclAny'
	//|    'OclInvalid'
	//|    'OclVoid'
	//;
	public PrimitiveTypeIdentifierElements getPrimitiveTypeIdentifierAccess() {
		return pPrimitiveTypeIdentifier;
	}
	
	public ParserRule getPrimitiveTypeIdentifierRule() {
		return getPrimitiveTypeIdentifierAccess().getRule();
	}
	
	//PrimitiveType :
	//    name=PrimitiveTypeIdentifier
	//;
	public PrimitiveTypeElements getPrimitiveTypeAccess() {
		return pPrimitiveType;
	}
	
	public ParserRule getPrimitiveTypeRule() {
		return getPrimitiveTypeAccess().getRule();
	}
	
	//CollectionTypeIdentifier:
	//    'Set'
	//|    'Bag'
	//|    'Sequence'
	//|    'Collection'
	//|    'OrderedSet'
	//;
	public CollectionTypeIdentifierElements getCollectionTypeIdentifierAccess() {
		return pCollectionTypeIdentifier;
	}
	
	public ParserRule getCollectionTypeIdentifierRule() {
		return getCollectionTypeIdentifierAccess().getRule();
	}
	
	//TypeExp:
	//    PrimitiveType
	//|    NameExp
	//|    CollectionType
	//|    TupleType
	//;
	public TypeExpElements getTypeExpAccess() {
		return pTypeExp;
	}
	
	public ParserRule getTypeExpRule() {
		return getTypeExpAccess().getRule();
	}
	
	//CollectionType:
	//    typeIdentifier=CollectionTypeIdentifier ('(' type=TypeExp ')')?
	//;
	public CollectionTypeElements getCollectionTypeAccess() {
		return pCollectionType;
	}
	
	public ParserRule getCollectionTypeRule() {
		return getCollectionTypeAccess().getRule();
	}
	
	//TupleType:
	//    name='Tuple' '(' (part+=tuplePart (',' part+=tuplePart)*)? ')'
	//;
	public TupleTypeElements getTupleTypeAccess() {
		return pTupleType;
	}
	
	public ParserRule getTupleTypeRule() {
		return getTupleTypeAccess().getRule();
	}
	
	//tuplePart:
	//    name=Identifier ':' type=TypeExp
	//;
	public TuplePartElements getTuplePartAccess() {
		return pTuplePart;
	}
	
	public ParserRule getTuplePartRule() {
		return getTuplePartAccess().getRule();
	}
	
	//CollectionLiteralExp :
	//    CollectionType
	//    ({CollectionLiteralExp.type=current} '{' (collectionLiteralParts+=CollectionLiteralPart
	//     (',' collectionLiteralParts+=CollectionLiteralPart)*)?
	//     '}')?
	//;
	public CollectionLiteralExpElements getCollectionLiteralExpAccess() {
		return pCollectionLiteralExp;
	}
	
	public ParserRule getCollectionLiteralExpRule() {
		return getCollectionLiteralExpAccess().getRule();
	}
	
	//CollectionLiteralPart:
	//    expression=Expression ('..' lastExpression=Expression)?
	//;
	public CollectionLiteralPartElements getCollectionLiteralPartAccess() {
		return pCollectionLiteralPart;
	}
	
	public ParserRule getCollectionLiteralPartRule() {
		return getCollectionLiteralPartAccess().getRule();
	}
	
	//PrimitiveLiteralExp:
	//    NumberLiteralExp
	//|    StringLiteralExp
	//|    BooleanLiteralExp
	//|    InvalidLiteralExp
	//|    NullLiteralExp
	//;
	public PrimitiveLiteralExpElements getPrimitiveLiteralExpAccess() {
		return pPrimitiveLiteralExp;
	}
	
	public ParserRule getPrimitiveLiteralExpRule() {
		return getPrimitiveLiteralExpAccess().getRule();
	}
	
	//TupleLiteralExp:
	//    {TupleLiteralExp} 'Tuple' ('{' part+=TupleLiteralPart (',' part+=TupleLiteralPart)* '}')?
	//;
	public TupleLiteralExpElements getTupleLiteralExpAccess() {
		return pTupleLiteralExp;
	}
	
	public ParserRule getTupleLiteralExpRule() {
		return getTupleLiteralExpAccess().getRule();
	}
	
	//TupleLiteralPart :
	//    name=Identifier (':' type=TypeExp)? '=' initExpression=Expression
	//;
	public TupleLiteralPartElements getTupleLiteralPartAccess() {
		return pTupleLiteralPart;
	}
	
	public ParserRule getTupleLiteralPartRule() {
		return getTupleLiteralPartAccess().getRule();
	}
	
	//NumberLiteralExp:
	//    name=NUMBER_LITERAL
	//;
	public NumberLiteralExpElements getNumberLiteralExpAccess() {
		return pNumberLiteralExp;
	}
	
	public ParserRule getNumberLiteralExpRule() {
		return getNumberLiteralExpAccess().getRule();
	}
	
	//StringLiteralExp:
	//    values+=StringLiteral+
	//;
	public StringLiteralExpElements getStringLiteralExpAccess() {
		return pStringLiteralExp;
	}
	
	public ParserRule getStringLiteralExpRule() {
		return getStringLiteralExpAccess().getRule();
	}
	
	//BooleanLiteralExp:
	//    {BooleanLiteralExp}
	//        (isTrue?='true'
	//    |    'false');
	public BooleanLiteralExpElements getBooleanLiteralExpAccess() {
		return pBooleanLiteralExp;
	}
	
	public ParserRule getBooleanLiteralExpRule() {
		return getBooleanLiteralExpAccess().getRule();
	}
	
	//InvalidLiteralExp:
	//    {InvalidLiteralExp} 'invalid'
	//;
	public InvalidLiteralExpElements getInvalidLiteralExpAccess() {
		return pInvalidLiteralExp;
	}
	
	public ParserRule getInvalidLiteralExpRule() {
		return getInvalidLiteralExpAccess().getRule();
	}
	
	//NullLiteralExp:
	//    {NullLiteralExp} 'null'
	//;
	public NullLiteralExpElements getNullLiteralExpAccess() {
		return pNullLiteralExp;
	}
	
	public ParserRule getNullLiteralExpRule() {
		return getNullLiteralExpAccess().getRule();
	}
	
	//Expression:
	//    implies
	//|    LetExp
	//;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//implies returns Expression:
	//    xor
	//    ({InfixExp.source=current} op='implies' argument=(xor|LetExp))*
	//;
	public ImpliesElements getImpliesAccess() {
		return pImplies;
	}
	
	public ParserRule getImpliesRule() {
		return getImpliesAccess().getRule();
	}
	
	//xor returns Expression:
	//    or
	//    ({InfixExp.source=current} op='xor' argument=(or|LetExp))*
	//;
	public XorElements getXorAccess() {
		return pXor;
	}
	
	public ParserRule getXorRule() {
		return getXorAccess().getRule();
	}
	
	//or returns Expression:
	//    and
	//    ({InfixExp.source=current} op='or' argument=(and|LetExp))*
	//;
	public OrElements getOrAccess() {
		return pOr;
	}
	
	public ParserRule getOrRule() {
		return getOrAccess().getRule();
	}
	
	//and returns Expression:
	//    equality
	//    ({InfixExp.source=current} op='and' argument=(equality|LetExp))*
	//;
	public AndElements getAndAccess() {
		return pAnd;
	}
	
	public ParserRule getAndRule() {
		return getAndAccess().getRule();
	}
	
	//equality returns Expression:
	//    relational
	//    ({InfixExp.source=current} op=('='|'<>') argument=(relational|LetExp))*
	//;
	public EqualityElements getEqualityAccess() {
		return pEquality;
	}
	
	public ParserRule getEqualityRule() {
		return getEqualityAccess().getRule();
	}
	
	//relational returns Expression:
	//    additive
	//    ({InfixExp.source=current} op=('>'|'<'|'>='|'<=') argument=(additive|LetExp))*
	//;
	public RelationalElements getRelationalAccess() {
		return pRelational;
	}
	
	public ParserRule getRelationalRule() {
		return getRelationalAccess().getRule();
	}
	
	//additive returns Expression:
	//    multiplicative
	//    ({InfixExp.source=current} op=('+'|'-') argument=(multiplicative|LetExp))*
	//;
	public AdditiveElements getAdditiveAccess() {
		return pAdditive;
	}
	
	public ParserRule getAdditiveRule() {
		return getAdditiveAccess().getRule();
	}
	
	//multiplicative returns Expression:
	//    unary
	//    ({InfixExp.source=current} op=('*'|'/') argument=(unary|LetExp))*
	//;
	public MultiplicativeElements getMultiplicativeAccess() {
		return pMultiplicative;
	}
	
	public ParserRule getMultiplicativeRule() {
		return getMultiplicativeAccess().getRule();
	}
	
	//unary returns Expression:
	//    NavigationExp
	//|    ({PrefixExp} op=('-'|'not') source=unary)
	//;
	public UnaryElements getUnaryAccess() {
		return pUnary;
	}
	
	public ParserRule getUnaryRule() {
		return getUnaryAccess().getRule();
	}
	
	//SubNavigationExp returns Expression:
	//    RoundBracketExp
	//|    SquareBracketExp
	//|    SelfExp
	//|    PrimitiveLiteralExp
	//|    TupleLiteralExp
	//|    CollectionLiteralExp
	//|    PreExp
	//|    TypeExp
	//|    IfExp
	//|    '('{NestedExp} source=Expression ')'
	//;
	public SubNavigationExpElements getSubNavigationExpAccess() {
		return pSubNavigationExp;
	}
	
	public ParserRule getSubNavigationExpRule() {
		return getSubNavigationExpAccess().getRule();
	}
	
	//SubNavigatingExp returns Expression:
	//    RoundBracketExp
	//|    SquareBracketExp
	//|    PreExp
	//|    NameExp
	//;
	public SubNavigatingExpElements getSubNavigatingExpAccess() {
		return pSubNavigatingExp;
	}
	
	public ParserRule getSubNavigatingExpRule() {
		return getSubNavigatingExpAccess().getRule();
	}
	
	//iteratorVariable :
	//    name=Identifier (':' type=TypeExp)?
	//;
	public IteratorVariableElements getIteratorVariableAccess() {
		return pIteratorVariable;
	}
	
	public ParserRule getIteratorVariableRule() {
		return getIteratorVariableAccess().getRule();
	}
	
	//iteratorAccumulator :
	//    name=Identifier ':' type=TypeExp '=' initExpression=Expression
	//;
	public IteratorAccumulatorElements getIteratorAccumulatorAccess() {
		return pIteratorAccumulator;
	}
	
	public ParserRule getIteratorAccumulatorRule() {
		return getIteratorAccumulatorAccess().getRule();
	}
	
	//RoundBracketExp :
	//    name=NameExp ('@' pre?='pre')? '('
	//        (variable1=iteratorVariable
	//            ((',' variable2=iteratorVariable)
	//            |(';' variable2=iteratorAccumulator))?
	//            '|')?
	//        (arguments+=Expression (',' arguments+=Expression)*)?
	//    ')'
	//;
	public RoundBracketExpElements getRoundBracketExpAccess() {
		return pRoundBracketExp;
	}
	
	public ParserRule getRoundBracketExpRule() {
		return getRoundBracketExpAccess().getRule();
	}
	
	//SquareBracketExp :
	//    name=NameExp '[' arguments+=Expression (',' arguments+=Expression)* ']' ('@' pre?='pre')?
	//;
	public SquareBracketExpElements getSquareBracketExpAccess() {
		return pSquareBracketExp;
	}
	
	public ParserRule getSquareBracketExpRule() {
		return getSquareBracketExpAccess().getRule();
	}
	
	//PreExp :
	//    name=NameExp '@' 'pre'
	//;
	public PreExpElements getPreExpAccess() {
		return pPreExp;
	}
	
	public ParserRule getPreExpRule() {
		return getPreExpAccess().getRule();
	}
	
	//SelfExp :
	//    {SelfExp} 'self'
	//;
	public SelfExpElements getSelfExpAccess() {
		return pSelfExp;
	}
	
	public ParserRule getSelfExpRule() {
		return getSelfExpAccess().getRule();
	}
	
	//NameExp :
	//    PathNameExp | SimpleNameExp
	//;
	public NameExpElements getNameExpAccess() {
		return pNameExp;
	}
	
	public ParserRule getNameExpRule() {
		return getNameExpAccess().getRule();
	}
	
	//PathNameExp :
	//    namespace=Identifier '::' element=NameExp
	//;
	public PathNameExpElements getPathNameExpAccess() {
		return pPathNameExp;
	}
	
	public ParserRule getPathNameExpRule() {
		return getPathNameExpAccess().getRule();
	}
	
	//SimpleNameExp :
	//    element=Identifier
	//;
	public SimpleNameExpElements getSimpleNameExpAccess() {
		return pSimpleNameExp;
	}
	
	public ParserRule getSimpleNameExpRule() {
		return getSimpleNameExpAccess().getRule();
	}
	
	//IfExp:
	//    'if' condition=Expression
	//    'then' thenExpression=Expression
	//    'else' elseExpression=Expression
	//    'endif'
	//;
	public IfExpElements getIfExpAccess() {
		return pIfExp;
	}
	
	public ParserRule getIfExpRule() {
		return getIfExpAccess().getRule();
	}
	
	//LetExp:
	//    'let'
	//    variable+=LetVariable (',' variable+=LetVariable)*
	//    'in' in=Expression
	//;
	public LetExpElements getLetExpAccess() {
		return pLetExp;
	}
	
	public ParserRule getLetExpRule() {
		return getLetExpAccess().getRule();
	}
	
	//LetVariable:
	//    name=Identifier ':' type=TypeExp '=' initExpression=Expression
	//;
	public LetVariableElements getLetVariableAccess() {
		return pLetVariable;
	}
	
	public ParserRule getLetVariableRule() {
		return getLetVariableAccess().getRule();
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
