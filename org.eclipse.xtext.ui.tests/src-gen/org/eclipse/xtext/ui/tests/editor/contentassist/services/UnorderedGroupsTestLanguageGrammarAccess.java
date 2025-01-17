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
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class UnorderedGroupsTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.UnorderedGroupsTestLanguage.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cDigitOneKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cFirstAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cFirstSimpleModelParserRuleCall_0_1_0 = (RuleCall)cFirstAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cDigitTwoKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cSecondAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cSecondMandatoryModelParserRuleCall_1_1_0 = (RuleCall)cSecondAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cDigitThreeKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cThrirdAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cThrirdLoopedModelParserRuleCall_2_1_0 = (RuleCall)cThrirdAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Keyword cDigitFourKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cForthAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cForthGroupLoopedModelParserRuleCall_3_1_0 = (RuleCall)cForthAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Keyword cDigitFiveKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cFifthAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cFifthLoopedAlternativeModelParserRuleCall_4_1_0 = (RuleCall)cFifthAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Keyword cBug304681Keyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cModelAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cModelBug304681ModelParserRuleCall_5_1_0 = (RuleCall)cModelAssignment_5_1.eContents().get(0);
		
		//Model :
		//     '1' first=SimpleModel
		//   | '2' second=MandatoryModel
		//   | '3' thrird=LoopedModel
		//   | '4' forth=GroupLoopedModel
		//   | '5' fifth=LoopedAlternativeModel
		//   | 'bug304681' model=Bug304681Model
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//  '1' first=SimpleModel
		//| '2' second=MandatoryModel
		//| '3' thrird=LoopedModel
		//| '4' forth=GroupLoopedModel
		//| '5' fifth=LoopedAlternativeModel
		//| 'bug304681' model=Bug304681Model
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'1' first=SimpleModel
		public Group getGroup_0() { return cGroup_0; }
		
		//'1'
		public Keyword getDigitOneKeyword_0_0() { return cDigitOneKeyword_0_0; }
		
		//first=SimpleModel
		public Assignment getFirstAssignment_0_1() { return cFirstAssignment_0_1; }
		
		//SimpleModel
		public RuleCall getFirstSimpleModelParserRuleCall_0_1_0() { return cFirstSimpleModelParserRuleCall_0_1_0; }
		
		//'2' second=MandatoryModel
		public Group getGroup_1() { return cGroup_1; }
		
		//'2'
		public Keyword getDigitTwoKeyword_1_0() { return cDigitTwoKeyword_1_0; }
		
		//second=MandatoryModel
		public Assignment getSecondAssignment_1_1() { return cSecondAssignment_1_1; }
		
		//MandatoryModel
		public RuleCall getSecondMandatoryModelParserRuleCall_1_1_0() { return cSecondMandatoryModelParserRuleCall_1_1_0; }
		
		//'3' thrird=LoopedModel
		public Group getGroup_2() { return cGroup_2; }
		
		//'3'
		public Keyword getDigitThreeKeyword_2_0() { return cDigitThreeKeyword_2_0; }
		
		//thrird=LoopedModel
		public Assignment getThrirdAssignment_2_1() { return cThrirdAssignment_2_1; }
		
		//LoopedModel
		public RuleCall getThrirdLoopedModelParserRuleCall_2_1_0() { return cThrirdLoopedModelParserRuleCall_2_1_0; }
		
		//'4' forth=GroupLoopedModel
		public Group getGroup_3() { return cGroup_3; }
		
		//'4'
		public Keyword getDigitFourKeyword_3_0() { return cDigitFourKeyword_3_0; }
		
		//forth=GroupLoopedModel
		public Assignment getForthAssignment_3_1() { return cForthAssignment_3_1; }
		
		//GroupLoopedModel
		public RuleCall getForthGroupLoopedModelParserRuleCall_3_1_0() { return cForthGroupLoopedModelParserRuleCall_3_1_0; }
		
		//'5' fifth=LoopedAlternativeModel
		public Group getGroup_4() { return cGroup_4; }
		
		//'5'
		public Keyword getDigitFiveKeyword_4_0() { return cDigitFiveKeyword_4_0; }
		
		//fifth=LoopedAlternativeModel
		public Assignment getFifthAssignment_4_1() { return cFifthAssignment_4_1; }
		
		//LoopedAlternativeModel
		public RuleCall getFifthLoopedAlternativeModelParserRuleCall_4_1_0() { return cFifthLoopedAlternativeModelParserRuleCall_4_1_0; }
		
		//'bug304681' model=Bug304681Model
		public Group getGroup_5() { return cGroup_5; }
		
		//'bug304681'
		public Keyword getBug304681Keyword_5_0() { return cBug304681Keyword_5_0; }
		
		//model=Bug304681Model
		public Assignment getModelAssignment_5_1() { return cModelAssignment_5_1; }
		
		//Bug304681Model
		public RuleCall getModelBug304681ModelParserRuleCall_5_1_0() { return cModelBug304681ModelParserRuleCall_5_1_0; }
	}
	public class SimpleModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.UnorderedGroupsTestLanguage.SimpleModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final UnorderedGroup cUnorderedGroup_0 = (UnorderedGroup)cGroup.eContents().get(0);
		private final Assignment cVisibilityAssignment_0_0 = (Assignment)cUnorderedGroup_0.eContents().get(0);
		private final Alternatives cVisibilityAlternatives_0_0_0 = (Alternatives)cVisibilityAssignment_0_0.eContents().get(0);
		private final Keyword cVisibilityPublicKeyword_0_0_0_0 = (Keyword)cVisibilityAlternatives_0_0_0.eContents().get(0);
		private final Keyword cVisibilityPrivateKeyword_0_0_0_1 = (Keyword)cVisibilityAlternatives_0_0_0.eContents().get(1);
		private final Keyword cVisibilityProtectedKeyword_0_0_0_2 = (Keyword)cVisibilityAlternatives_0_0_0.eContents().get(2);
		private final Assignment cStaticAssignment_0_1 = (Assignment)cUnorderedGroup_0.eContents().get(1);
		private final Keyword cStaticStaticKeyword_0_1_0 = (Keyword)cStaticAssignment_0_1.eContents().get(0);
		private final Assignment cSynchronizedAssignment_0_2 = (Assignment)cUnorderedGroup_0.eContents().get(2);
		private final Keyword cSynchronizedSynchronizedKeyword_0_2_0 = (Keyword)cSynchronizedAssignment_0_2.eContents().get(0);
		private final Alternatives cAlternatives_0_3 = (Alternatives)cUnorderedGroup_0.eContents().get(3);
		private final Assignment cAbstractAssignment_0_3_0 = (Assignment)cAlternatives_0_3.eContents().get(0);
		private final Keyword cAbstractAbstractKeyword_0_3_0_0 = (Keyword)cAbstractAssignment_0_3_0.eContents().get(0);
		private final Assignment cFinalAssignment_0_3_1 = (Assignment)cAlternatives_0_3.eContents().get(1);
		private final Keyword cFinalFinalKeyword_0_3_1_0 = (Keyword)cFinalAssignment_0_3_1.eContents().get(0);
		private final Keyword cClassKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//SimpleModel:
		//    (
		//        visibility=('public'|'private'|'protected')?
		//      & static?='static'?
		//      & synchronized?='synchronized'?
		//      & (abstract?='abstract' | final?='final')?
		//    )
		//    'class' name=ID '{' '}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//(
		//    visibility=('public'|'private'|'protected')?
		//  & static?='static'?
		//  & synchronized?='synchronized'?
		//  & (abstract?='abstract' | final?='final')?
		//)
		//'class' name=ID '{' '}'
		public Group getGroup() { return cGroup; }
		
		//(
		//    visibility=('public'|'private'|'protected')?
		//  & static?='static'?
		//  & synchronized?='synchronized'?
		//  & (abstract?='abstract' | final?='final')?
		//)
		public UnorderedGroup getUnorderedGroup_0() { return cUnorderedGroup_0; }
		
		//visibility=('public'|'private'|'protected')?
		public Assignment getVisibilityAssignment_0_0() { return cVisibilityAssignment_0_0; }
		
		//('public'|'private'|'protected')
		public Alternatives getVisibilityAlternatives_0_0_0() { return cVisibilityAlternatives_0_0_0; }
		
		//'public'
		public Keyword getVisibilityPublicKeyword_0_0_0_0() { return cVisibilityPublicKeyword_0_0_0_0; }
		
		//'private'
		public Keyword getVisibilityPrivateKeyword_0_0_0_1() { return cVisibilityPrivateKeyword_0_0_0_1; }
		
		//'protected'
		public Keyword getVisibilityProtectedKeyword_0_0_0_2() { return cVisibilityProtectedKeyword_0_0_0_2; }
		
		//static?='static'?
		public Assignment getStaticAssignment_0_1() { return cStaticAssignment_0_1; }
		
		//'static'
		public Keyword getStaticStaticKeyword_0_1_0() { return cStaticStaticKeyword_0_1_0; }
		
		//synchronized?='synchronized'?
		public Assignment getSynchronizedAssignment_0_2() { return cSynchronizedAssignment_0_2; }
		
		//'synchronized'
		public Keyword getSynchronizedSynchronizedKeyword_0_2_0() { return cSynchronizedSynchronizedKeyword_0_2_0; }
		
		//(abstract?='abstract' | final?='final')?
		public Alternatives getAlternatives_0_3() { return cAlternatives_0_3; }
		
		//abstract?='abstract'
		public Assignment getAbstractAssignment_0_3_0() { return cAbstractAssignment_0_3_0; }
		
		//'abstract'
		public Keyword getAbstractAbstractKeyword_0_3_0_0() { return cAbstractAbstractKeyword_0_3_0_0; }
		
		//final?='final'
		public Assignment getFinalAssignment_0_3_1() { return cFinalAssignment_0_3_1; }
		
		//'final'
		public Keyword getFinalFinalKeyword_0_3_1_0() { return cFinalFinalKeyword_0_3_1_0; }
		
		//'class'
		public Keyword getClassKeyword_1() { return cClassKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class MandatoryModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.UnorderedGroupsTestLanguage.MandatoryModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final UnorderedGroup cUnorderedGroup_0 = (UnorderedGroup)cGroup.eContents().get(0);
		private final Assignment cVisibilityAssignment_0_0 = (Assignment)cUnorderedGroup_0.eContents().get(0);
		private final Alternatives cVisibilityAlternatives_0_0_0 = (Alternatives)cVisibilityAssignment_0_0.eContents().get(0);
		private final Keyword cVisibilityPublicKeyword_0_0_0_0 = (Keyword)cVisibilityAlternatives_0_0_0.eContents().get(0);
		private final Keyword cVisibilityPrivateKeyword_0_0_0_1 = (Keyword)cVisibilityAlternatives_0_0_0.eContents().get(1);
		private final Keyword cVisibilityProtectedKeyword_0_0_0_2 = (Keyword)cVisibilityAlternatives_0_0_0.eContents().get(2);
		private final Assignment cStaticAssignment_0_1 = (Assignment)cUnorderedGroup_0.eContents().get(1);
		private final Keyword cStaticStaticKeyword_0_1_0 = (Keyword)cStaticAssignment_0_1.eContents().get(0);
		private final Assignment cSynchronizedAssignment_0_2 = (Assignment)cUnorderedGroup_0.eContents().get(2);
		private final Keyword cSynchronizedSynchronizedKeyword_0_2_0 = (Keyword)cSynchronizedAssignment_0_2.eContents().get(0);
		private final Alternatives cAlternatives_0_3 = (Alternatives)cUnorderedGroup_0.eContents().get(3);
		private final Assignment cAbstractAssignment_0_3_0 = (Assignment)cAlternatives_0_3.eContents().get(0);
		private final Keyword cAbstractAbstractKeyword_0_3_0_0 = (Keyword)cAbstractAssignment_0_3_0.eContents().get(0);
		private final Assignment cFinalAssignment_0_3_1 = (Assignment)cAlternatives_0_3.eContents().get(1);
		private final Keyword cFinalFinalKeyword_0_3_1_0 = (Keyword)cFinalAssignment_0_3_1.eContents().get(0);
		private final Keyword cClassKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//MandatoryModel:
		//    (
		//        visibility=('public'|'private'|'protected')
		//      & static?='static'
		//      & synchronized?='synchronized'
		//      & (abstract?='abstract' | final?='final')?
		//    )
		//    'class' name=ID '{' '}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//(
		//    visibility=('public'|'private'|'protected')
		//  & static?='static'
		//  & synchronized?='synchronized'
		//  & (abstract?='abstract' | final?='final')?
		//)
		//'class' name=ID '{' '}'
		public Group getGroup() { return cGroup; }
		
		//(
		//    visibility=('public'|'private'|'protected')
		//  & static?='static'
		//  & synchronized?='synchronized'
		//  & (abstract?='abstract' | final?='final')?
		//)
		public UnorderedGroup getUnorderedGroup_0() { return cUnorderedGroup_0; }
		
		//visibility=('public'|'private'|'protected')
		public Assignment getVisibilityAssignment_0_0() { return cVisibilityAssignment_0_0; }
		
		//('public'|'private'|'protected')
		public Alternatives getVisibilityAlternatives_0_0_0() { return cVisibilityAlternatives_0_0_0; }
		
		//'public'
		public Keyword getVisibilityPublicKeyword_0_0_0_0() { return cVisibilityPublicKeyword_0_0_0_0; }
		
		//'private'
		public Keyword getVisibilityPrivateKeyword_0_0_0_1() { return cVisibilityPrivateKeyword_0_0_0_1; }
		
		//'protected'
		public Keyword getVisibilityProtectedKeyword_0_0_0_2() { return cVisibilityProtectedKeyword_0_0_0_2; }
		
		//static?='static'
		public Assignment getStaticAssignment_0_1() { return cStaticAssignment_0_1; }
		
		//'static'
		public Keyword getStaticStaticKeyword_0_1_0() { return cStaticStaticKeyword_0_1_0; }
		
		//synchronized?='synchronized'
		public Assignment getSynchronizedAssignment_0_2() { return cSynchronizedAssignment_0_2; }
		
		//'synchronized'
		public Keyword getSynchronizedSynchronizedKeyword_0_2_0() { return cSynchronizedSynchronizedKeyword_0_2_0; }
		
		//(abstract?='abstract' | final?='final')?
		public Alternatives getAlternatives_0_3() { return cAlternatives_0_3; }
		
		//abstract?='abstract'
		public Assignment getAbstractAssignment_0_3_0() { return cAbstractAssignment_0_3_0; }
		
		//'abstract'
		public Keyword getAbstractAbstractKeyword_0_3_0_0() { return cAbstractAbstractKeyword_0_3_0_0; }
		
		//final?='final'
		public Assignment getFinalAssignment_0_3_1() { return cFinalAssignment_0_3_1; }
		
		//'final'
		public Keyword getFinalFinalKeyword_0_3_1_0() { return cFinalFinalKeyword_0_3_1_0; }
		
		//'class'
		public Keyword getClassKeyword_1() { return cClassKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class LoopedModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.UnorderedGroupsTestLanguage.LoopedModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final UnorderedGroup cUnorderedGroup_0 = (UnorderedGroup)cGroup.eContents().get(0);
		private final Assignment cVisibilityAssignment_0_0 = (Assignment)cUnorderedGroup_0.eContents().get(0);
		private final Alternatives cVisibilityAlternatives_0_0_0 = (Alternatives)cVisibilityAssignment_0_0.eContents().get(0);
		private final Keyword cVisibilityPublicKeyword_0_0_0_0 = (Keyword)cVisibilityAlternatives_0_0_0.eContents().get(0);
		private final Keyword cVisibilityPrivateKeyword_0_0_0_1 = (Keyword)cVisibilityAlternatives_0_0_0.eContents().get(1);
		private final Keyword cVisibilityProtectedKeyword_0_0_0_2 = (Keyword)cVisibilityAlternatives_0_0_0.eContents().get(2);
		private final Assignment cStaticAssignment_0_1 = (Assignment)cUnorderedGroup_0.eContents().get(1);
		private final Keyword cStaticStaticKeyword_0_1_0 = (Keyword)cStaticAssignment_0_1.eContents().get(0);
		private final Assignment cSynchronizedAssignment_0_2 = (Assignment)cUnorderedGroup_0.eContents().get(2);
		private final Keyword cSynchronizedSynchronizedKeyword_0_2_0 = (Keyword)cSynchronizedAssignment_0_2.eContents().get(0);
		private final Alternatives cAlternatives_0_3 = (Alternatives)cUnorderedGroup_0.eContents().get(3);
		private final Assignment cAbstractAssignment_0_3_0 = (Assignment)cAlternatives_0_3.eContents().get(0);
		private final Keyword cAbstractAbstractKeyword_0_3_0_0 = (Keyword)cAbstractAssignment_0_3_0.eContents().get(0);
		private final Assignment cFinalAssignment_0_3_1 = (Assignment)cAlternatives_0_3.eContents().get(1);
		private final Keyword cFinalFinalKeyword_0_3_1_0 = (Keyword)cFinalAssignment_0_3_1.eContents().get(0);
		private final Keyword cClassKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//LoopedModel:
		//    (
		//        visibility+=('public'|'private'|'protected')*
		//      & static+='static'*
		//      & synchronized+='synchronized'*
		//      & (abstract+='abstract' | final+='final')*
		//    )
		//    'class' name=ID '{' '}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//(
		//    visibility+=('public'|'private'|'protected')*
		//  & static+='static'*
		//  & synchronized+='synchronized'*
		//  & (abstract+='abstract' | final+='final')*
		//)
		//'class' name=ID '{' '}'
		public Group getGroup() { return cGroup; }
		
		//(
		//    visibility+=('public'|'private'|'protected')*
		//  & static+='static'*
		//  & synchronized+='synchronized'*
		//  & (abstract+='abstract' | final+='final')*
		//)
		public UnorderedGroup getUnorderedGroup_0() { return cUnorderedGroup_0; }
		
		//visibility+=('public'|'private'|'protected')*
		public Assignment getVisibilityAssignment_0_0() { return cVisibilityAssignment_0_0; }
		
		//('public'|'private'|'protected')
		public Alternatives getVisibilityAlternatives_0_0_0() { return cVisibilityAlternatives_0_0_0; }
		
		//'public'
		public Keyword getVisibilityPublicKeyword_0_0_0_0() { return cVisibilityPublicKeyword_0_0_0_0; }
		
		//'private'
		public Keyword getVisibilityPrivateKeyword_0_0_0_1() { return cVisibilityPrivateKeyword_0_0_0_1; }
		
		//'protected'
		public Keyword getVisibilityProtectedKeyword_0_0_0_2() { return cVisibilityProtectedKeyword_0_0_0_2; }
		
		//static+='static'*
		public Assignment getStaticAssignment_0_1() { return cStaticAssignment_0_1; }
		
		//'static'
		public Keyword getStaticStaticKeyword_0_1_0() { return cStaticStaticKeyword_0_1_0; }
		
		//synchronized+='synchronized'*
		public Assignment getSynchronizedAssignment_0_2() { return cSynchronizedAssignment_0_2; }
		
		//'synchronized'
		public Keyword getSynchronizedSynchronizedKeyword_0_2_0() { return cSynchronizedSynchronizedKeyword_0_2_0; }
		
		//(abstract+='abstract' | final+='final')*
		public Alternatives getAlternatives_0_3() { return cAlternatives_0_3; }
		
		//abstract+='abstract'
		public Assignment getAbstractAssignment_0_3_0() { return cAbstractAssignment_0_3_0; }
		
		//'abstract'
		public Keyword getAbstractAbstractKeyword_0_3_0_0() { return cAbstractAbstractKeyword_0_3_0_0; }
		
		//final+='final'
		public Assignment getFinalAssignment_0_3_1() { return cFinalAssignment_0_3_1; }
		
		//'final'
		public Keyword getFinalFinalKeyword_0_3_1_0() { return cFinalFinalKeyword_0_3_1_0; }
		
		//'class'
		public Keyword getClassKeyword_1() { return cClassKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class GroupLoopedModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.UnorderedGroupsTestLanguage.GroupLoopedModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final UnorderedGroup cUnorderedGroup_0 = (UnorderedGroup)cGroup.eContents().get(0);
		private final Assignment cVisibilityAssignment_0_0 = (Assignment)cUnorderedGroup_0.eContents().get(0);
		private final Alternatives cVisibilityAlternatives_0_0_0 = (Alternatives)cVisibilityAssignment_0_0.eContents().get(0);
		private final Keyword cVisibilityPublicKeyword_0_0_0_0 = (Keyword)cVisibilityAlternatives_0_0_0.eContents().get(0);
		private final Keyword cVisibilityPrivateKeyword_0_0_0_1 = (Keyword)cVisibilityAlternatives_0_0_0.eContents().get(1);
		private final Keyword cVisibilityProtectedKeyword_0_0_0_2 = (Keyword)cVisibilityAlternatives_0_0_0.eContents().get(2);
		private final Assignment cStaticAssignment_0_1 = (Assignment)cUnorderedGroup_0.eContents().get(1);
		private final Keyword cStaticStaticKeyword_0_1_0 = (Keyword)cStaticAssignment_0_1.eContents().get(0);
		private final Assignment cSynchronizedAssignment_0_2 = (Assignment)cUnorderedGroup_0.eContents().get(2);
		private final Keyword cSynchronizedSynchronizedKeyword_0_2_0 = (Keyword)cSynchronizedAssignment_0_2.eContents().get(0);
		private final Alternatives cAlternatives_0_3 = (Alternatives)cUnorderedGroup_0.eContents().get(3);
		private final Assignment cAbstractAssignment_0_3_0 = (Assignment)cAlternatives_0_3.eContents().get(0);
		private final Keyword cAbstractAbstractKeyword_0_3_0_0 = (Keyword)cAbstractAssignment_0_3_0.eContents().get(0);
		private final Assignment cFinalAssignment_0_3_1 = (Assignment)cAlternatives_0_3.eContents().get(1);
		private final Keyword cFinalFinalKeyword_0_3_1_0 = (Keyword)cFinalAssignment_0_3_1.eContents().get(0);
		private final Keyword cClassKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GroupLoopedModel:
		//    (
		//        visibility+=('public'|'private'|'protected')
		//      & static+='static'
		//      & synchronized+='synchronized'
		//      & (abstract+='abstract' | final+='final')
		//    )*
		//    'class' name=ID '{' '}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//(
		//    visibility+=('public'|'private'|'protected')
		//  & static+='static'
		//  & synchronized+='synchronized'
		//  & (abstract+='abstract' | final+='final')
		//)*
		//'class' name=ID '{' '}'
		public Group getGroup() { return cGroup; }
		
		//(
		//    visibility+=('public'|'private'|'protected')
		//  & static+='static'
		//  & synchronized+='synchronized'
		//  & (abstract+='abstract' | final+='final')
		//)*
		public UnorderedGroup getUnorderedGroup_0() { return cUnorderedGroup_0; }
		
		//visibility+=('public'|'private'|'protected')
		public Assignment getVisibilityAssignment_0_0() { return cVisibilityAssignment_0_0; }
		
		//('public'|'private'|'protected')
		public Alternatives getVisibilityAlternatives_0_0_0() { return cVisibilityAlternatives_0_0_0; }
		
		//'public'
		public Keyword getVisibilityPublicKeyword_0_0_0_0() { return cVisibilityPublicKeyword_0_0_0_0; }
		
		//'private'
		public Keyword getVisibilityPrivateKeyword_0_0_0_1() { return cVisibilityPrivateKeyword_0_0_0_1; }
		
		//'protected'
		public Keyword getVisibilityProtectedKeyword_0_0_0_2() { return cVisibilityProtectedKeyword_0_0_0_2; }
		
		//static+='static'
		public Assignment getStaticAssignment_0_1() { return cStaticAssignment_0_1; }
		
		//'static'
		public Keyword getStaticStaticKeyword_0_1_0() { return cStaticStaticKeyword_0_1_0; }
		
		//synchronized+='synchronized'
		public Assignment getSynchronizedAssignment_0_2() { return cSynchronizedAssignment_0_2; }
		
		//'synchronized'
		public Keyword getSynchronizedSynchronizedKeyword_0_2_0() { return cSynchronizedSynchronizedKeyword_0_2_0; }
		
		//(abstract+='abstract' | final+='final')
		public Alternatives getAlternatives_0_3() { return cAlternatives_0_3; }
		
		//abstract+='abstract'
		public Assignment getAbstractAssignment_0_3_0() { return cAbstractAssignment_0_3_0; }
		
		//'abstract'
		public Keyword getAbstractAbstractKeyword_0_3_0_0() { return cAbstractAbstractKeyword_0_3_0_0; }
		
		//final+='final'
		public Assignment getFinalAssignment_0_3_1() { return cFinalAssignment_0_3_1; }
		
		//'final'
		public Keyword getFinalFinalKeyword_0_3_1_0() { return cFinalFinalKeyword_0_3_1_0; }
		
		//'class'
		public Keyword getClassKeyword_1() { return cClassKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class LoopedAlternativeModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.UnorderedGroupsTestLanguage.LoopedAlternativeModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Assignment cVisibilityAssignment_0_0 = (Assignment)cAlternatives_0.eContents().get(0);
		private final Alternatives cVisibilityAlternatives_0_0_0 = (Alternatives)cVisibilityAssignment_0_0.eContents().get(0);
		private final Keyword cVisibilityPublicKeyword_0_0_0_0 = (Keyword)cVisibilityAlternatives_0_0_0.eContents().get(0);
		private final Keyword cVisibilityPrivateKeyword_0_0_0_1 = (Keyword)cVisibilityAlternatives_0_0_0.eContents().get(1);
		private final Keyword cVisibilityProtectedKeyword_0_0_0_2 = (Keyword)cVisibilityAlternatives_0_0_0.eContents().get(2);
		private final Assignment cStaticAssignment_0_1 = (Assignment)cAlternatives_0.eContents().get(1);
		private final Keyword cStaticStaticKeyword_0_1_0 = (Keyword)cStaticAssignment_0_1.eContents().get(0);
		private final Assignment cSynchronizedAssignment_0_2 = (Assignment)cAlternatives_0.eContents().get(2);
		private final Keyword cSynchronizedSynchronizedKeyword_0_2_0 = (Keyword)cSynchronizedAssignment_0_2.eContents().get(0);
		private final Alternatives cAlternatives_0_3 = (Alternatives)cAlternatives_0.eContents().get(3);
		private final Assignment cAbstractAssignment_0_3_0 = (Assignment)cAlternatives_0_3.eContents().get(0);
		private final Keyword cAbstractAbstractKeyword_0_3_0_0 = (Keyword)cAbstractAssignment_0_3_0.eContents().get(0);
		private final Assignment cFinalAssignment_0_3_1 = (Assignment)cAlternatives_0_3.eContents().get(1);
		private final Keyword cFinalFinalKeyword_0_3_1_0 = (Keyword)cFinalAssignment_0_3_1.eContents().get(0);
		private final Group cGroup_0_4 = (Group)cAlternatives_0.eContents().get(4);
		private final Keyword cBeforeKeyword_0_4_0 = (Keyword)cGroup_0_4.eContents().get(0);
		private final Keyword cAfterKeyword_0_4_1 = (Keyword)cGroup_0_4.eContents().get(1);
		private final Keyword cClassKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//LoopedAlternativeModel:
		//    (
		//        visibility+=('public'|'private'|'protected')
		//      | static+='static'
		//      | synchronized+='synchronized'
		//      | (abstract+='abstract' | final+='final')
		//      | ('before' 'after'*)
		//    )*
		//    'class' name=ID '{' '}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//(
		//    visibility+=('public'|'private'|'protected')
		//  | static+='static'
		//  | synchronized+='synchronized'
		//  | (abstract+='abstract' | final+='final')
		//  | ('before' 'after'*)
		//)*
		//'class' name=ID '{' '}'
		public Group getGroup() { return cGroup; }
		
		//(
		//    visibility+=('public'|'private'|'protected')
		//  | static+='static'
		//  | synchronized+='synchronized'
		//  | (abstract+='abstract' | final+='final')
		//  | ('before' 'after'*)
		//)*
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//visibility+=('public'|'private'|'protected')
		public Assignment getVisibilityAssignment_0_0() { return cVisibilityAssignment_0_0; }
		
		//('public'|'private'|'protected')
		public Alternatives getVisibilityAlternatives_0_0_0() { return cVisibilityAlternatives_0_0_0; }
		
		//'public'
		public Keyword getVisibilityPublicKeyword_0_0_0_0() { return cVisibilityPublicKeyword_0_0_0_0; }
		
		//'private'
		public Keyword getVisibilityPrivateKeyword_0_0_0_1() { return cVisibilityPrivateKeyword_0_0_0_1; }
		
		//'protected'
		public Keyword getVisibilityProtectedKeyword_0_0_0_2() { return cVisibilityProtectedKeyword_0_0_0_2; }
		
		//static+='static'
		public Assignment getStaticAssignment_0_1() { return cStaticAssignment_0_1; }
		
		//'static'
		public Keyword getStaticStaticKeyword_0_1_0() { return cStaticStaticKeyword_0_1_0; }
		
		//synchronized+='synchronized'
		public Assignment getSynchronizedAssignment_0_2() { return cSynchronizedAssignment_0_2; }
		
		//'synchronized'
		public Keyword getSynchronizedSynchronizedKeyword_0_2_0() { return cSynchronizedSynchronizedKeyword_0_2_0; }
		
		//(abstract+='abstract' | final+='final')
		public Alternatives getAlternatives_0_3() { return cAlternatives_0_3; }
		
		//abstract+='abstract'
		public Assignment getAbstractAssignment_0_3_0() { return cAbstractAssignment_0_3_0; }
		
		//'abstract'
		public Keyword getAbstractAbstractKeyword_0_3_0_0() { return cAbstractAbstractKeyword_0_3_0_0; }
		
		//final+='final'
		public Assignment getFinalAssignment_0_3_1() { return cFinalAssignment_0_3_1; }
		
		//'final'
		public Keyword getFinalFinalKeyword_0_3_1_0() { return cFinalFinalKeyword_0_3_1_0; }
		
		//('before' 'after'*)
		public Group getGroup_0_4() { return cGroup_0_4; }
		
		//'before'
		public Keyword getBeforeKeyword_0_4_0() { return cBeforeKeyword_0_4_0; }
		
		//'after'*
		public Keyword getAfterKeyword_0_4_1() { return cAfterKeyword_0_4_1; }
		
		//'class'
		public Keyword getClassKeyword_1() { return cClassKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class Bug304681ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.UnorderedGroupsTestLanguage.Bug304681Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBug304681ModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final UnorderedGroup cUnorderedGroup_2 = (UnorderedGroup)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cUnorderedGroup_2.eContents().get(0);
		private final Keyword cShortKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Assignment cShortDescriptionAssignment_2_0_1 = (Assignment)cGroup_2_0.eContents().get(1);
		private final RuleCall cShortDescriptionSTRINGTerminalRuleCall_2_0_1_0 = (RuleCall)cShortDescriptionAssignment_2_0_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_0_2 = (Keyword)cGroup_2_0.eContents().get(2);
		private final Group cGroup_2_1 = (Group)cUnorderedGroup_2.eContents().get(1);
		private final Keyword cLongKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cLongDescriptionAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cLongDescriptionSTRINGTerminalRuleCall_2_1_1_0 = (RuleCall)cLongDescriptionAssignment_2_1_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_1_2 = (Keyword)cGroup_2_1.eContents().get(2);
		private final Group cGroup_2_2 = (Group)cUnorderedGroup_2.eContents().get(2);
		private final Keyword cUidKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cUidAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cUidSTRINGTerminalRuleCall_2_2_1_0 = (RuleCall)cUidAssignment_2_2_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_2_2 = (Keyword)cGroup_2_2.eContents().get(2);
		private final Group cGroup_2_3 = (Group)cUnorderedGroup_2.eContents().get(3);
		private final Assignment cFlagAssignment_2_3_0 = (Assignment)cGroup_2_3.eContents().get(0);
		private final Keyword cFlagFlagKeyword_2_3_0_0 = (Keyword)cFlagAssignment_2_3_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_3_1 = (Keyword)cGroup_2_3.eContents().get(1);
		private final Assignment cFeaturesAssignment_2_4 = (Assignment)cUnorderedGroup_2.eContents().get(4);
		private final RuleCall cFeaturesBug304681FeatureParserRuleCall_2_4_0 = (RuleCall)cFeaturesAssignment_2_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Bug304681Model: {Bug304681Model}
		//    "{" (
		//        ("short" shortDescription=STRING ";")? &
		//         ("long"  longDescription=STRING ";")? &
		//         ("uid" uid=STRING ";")? &
		//         (flag?="flag" ";")? &
		//         features+=Bug304681Feature*
		//     ) "}";
		@Override public ParserRule getRule() { return rule; }
		
		//{Bug304681Model}
		//   "{" (
		//       ("short" shortDescription=STRING ";")? &
		//        ("long"  longDescription=STRING ";")? &
		//        ("uid" uid=STRING ";")? &
		//        (flag?="flag" ";")? &
		//        features+=Bug304681Feature*
		//    ) "}"
		public Group getGroup() { return cGroup; }
		
		//{Bug304681Model}
		public Action getBug304681ModelAction_0() { return cBug304681ModelAction_0; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//(
		//       ("short" shortDescription=STRING ";")? &
		//        ("long"  longDescription=STRING ";")? &
		//        ("uid" uid=STRING ";")? &
		//        (flag?="flag" ";")? &
		//        features+=Bug304681Feature*
		//    )
		public UnorderedGroup getUnorderedGroup_2() { return cUnorderedGroup_2; }
		
		//("short" shortDescription=STRING ";")?
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//"short"
		public Keyword getShortKeyword_2_0_0() { return cShortKeyword_2_0_0; }
		
		//shortDescription=STRING
		public Assignment getShortDescriptionAssignment_2_0_1() { return cShortDescriptionAssignment_2_0_1; }
		
		//STRING
		public RuleCall getShortDescriptionSTRINGTerminalRuleCall_2_0_1_0() { return cShortDescriptionSTRINGTerminalRuleCall_2_0_1_0; }
		
		//";"
		public Keyword getSemicolonKeyword_2_0_2() { return cSemicolonKeyword_2_0_2; }
		
		//("long"  longDescription=STRING ";")?
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//"long"
		public Keyword getLongKeyword_2_1_0() { return cLongKeyword_2_1_0; }
		
		//longDescription=STRING
		public Assignment getLongDescriptionAssignment_2_1_1() { return cLongDescriptionAssignment_2_1_1; }
		
		//STRING
		public RuleCall getLongDescriptionSTRINGTerminalRuleCall_2_1_1_0() { return cLongDescriptionSTRINGTerminalRuleCall_2_1_1_0; }
		
		//";"
		public Keyword getSemicolonKeyword_2_1_2() { return cSemicolonKeyword_2_1_2; }
		
		//("uid" uid=STRING ";")?
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//"uid"
		public Keyword getUidKeyword_2_2_0() { return cUidKeyword_2_2_0; }
		
		//uid=STRING
		public Assignment getUidAssignment_2_2_1() { return cUidAssignment_2_2_1; }
		
		//STRING
		public RuleCall getUidSTRINGTerminalRuleCall_2_2_1_0() { return cUidSTRINGTerminalRuleCall_2_2_1_0; }
		
		//";"
		public Keyword getSemicolonKeyword_2_2_2() { return cSemicolonKeyword_2_2_2; }
		
		//(flag?="flag" ";")?
		public Group getGroup_2_3() { return cGroup_2_3; }
		
		//flag?="flag"
		public Assignment getFlagAssignment_2_3_0() { return cFlagAssignment_2_3_0; }
		
		//"flag"
		public Keyword getFlagFlagKeyword_2_3_0_0() { return cFlagFlagKeyword_2_3_0_0; }
		
		//";"
		public Keyword getSemicolonKeyword_2_3_1() { return cSemicolonKeyword_2_3_1; }
		
		//features+=Bug304681Feature*
		public Assignment getFeaturesAssignment_2_4() { return cFeaturesAssignment_2_4; }
		
		//Bug304681Feature
		public RuleCall getFeaturesBug304681FeatureParserRuleCall_2_4_0() { return cFeaturesBug304681FeatureParserRuleCall_2_4_0; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class Bug304681FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.UnorderedGroupsTestLanguage.Bug304681Feature");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBug304681AttributeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cBug304681ReferenceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Bug304681Feature:
		//  Bug304681Attribute | Bug304681Reference;
		@Override public ParserRule getRule() { return rule; }
		
		//Bug304681Attribute | Bug304681Reference
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Bug304681Attribute
		public RuleCall getBug304681AttributeParserRuleCall_0() { return cBug304681AttributeParserRuleCall_0; }
		
		//Bug304681Reference
		public RuleCall getBug304681ReferenceParserRuleCall_1() { return cBug304681ReferenceParserRuleCall_1; }
	}
	public class Bug304681AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.UnorderedGroupsTestLanguage.Bug304681Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAttrKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Bug304681Attribute:
		//  'attr' name=ID ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'attr' name=ID ';'
		public Group getGroup() { return cGroup; }
		
		//'attr'
		public Keyword getAttrKeyword_0() { return cAttrKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class Bug304681ReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.editor.contentassist.UnorderedGroupsTestLanguage.Bug304681Reference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Bug304681Reference:
		//  'ref' name=ID ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'ref' name=ID ';'
		public Group getGroup() { return cGroup; }
		
		//'ref'
		public Keyword getRefKeyword_0() { return cRefKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	
	
	private final ModelElements pModel;
	private final SimpleModelElements pSimpleModel;
	private final MandatoryModelElements pMandatoryModel;
	private final LoopedModelElements pLoopedModel;
	private final GroupLoopedModelElements pGroupLoopedModel;
	private final LoopedAlternativeModelElements pLoopedAlternativeModel;
	private final Bug304681ModelElements pBug304681Model;
	private final Bug304681FeatureElements pBug304681Feature;
	private final Bug304681AttributeElements pBug304681Attribute;
	private final Bug304681ReferenceElements pBug304681Reference;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public UnorderedGroupsTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pSimpleModel = new SimpleModelElements();
		this.pMandatoryModel = new MandatoryModelElements();
		this.pLoopedModel = new LoopedModelElements();
		this.pGroupLoopedModel = new GroupLoopedModelElements();
		this.pLoopedAlternativeModel = new LoopedAlternativeModelElements();
		this.pBug304681Model = new Bug304681ModelElements();
		this.pBug304681Feature = new Bug304681FeatureElements();
		this.pBug304681Attribute = new Bug304681AttributeElements();
		this.pBug304681Reference = new Bug304681ReferenceElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.ui.tests.editor.contentassist.UnorderedGroupsTestLanguage".equals(grammar.getName())) {
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
	//     '1' first=SimpleModel
	//   | '2' second=MandatoryModel
	//   | '3' thrird=LoopedModel
	//   | '4' forth=GroupLoopedModel
	//   | '5' fifth=LoopedAlternativeModel
	//   | 'bug304681' model=Bug304681Model
	//;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//SimpleModel:
	//    (
	//        visibility=('public'|'private'|'protected')?
	//      & static?='static'?
	//      & synchronized?='synchronized'?
	//      & (abstract?='abstract' | final?='final')?
	//    )
	//    'class' name=ID '{' '}'
	//;
	public SimpleModelElements getSimpleModelAccess() {
		return pSimpleModel;
	}
	
	public ParserRule getSimpleModelRule() {
		return getSimpleModelAccess().getRule();
	}
	
	//MandatoryModel:
	//    (
	//        visibility=('public'|'private'|'protected')
	//      & static?='static'
	//      & synchronized?='synchronized'
	//      & (abstract?='abstract' | final?='final')?
	//    )
	//    'class' name=ID '{' '}'
	//;
	public MandatoryModelElements getMandatoryModelAccess() {
		return pMandatoryModel;
	}
	
	public ParserRule getMandatoryModelRule() {
		return getMandatoryModelAccess().getRule();
	}
	
	//LoopedModel:
	//    (
	//        visibility+=('public'|'private'|'protected')*
	//      & static+='static'*
	//      & synchronized+='synchronized'*
	//      & (abstract+='abstract' | final+='final')*
	//    )
	//    'class' name=ID '{' '}'
	//;
	public LoopedModelElements getLoopedModelAccess() {
		return pLoopedModel;
	}
	
	public ParserRule getLoopedModelRule() {
		return getLoopedModelAccess().getRule();
	}
	
	//GroupLoopedModel:
	//    (
	//        visibility+=('public'|'private'|'protected')
	//      & static+='static'
	//      & synchronized+='synchronized'
	//      & (abstract+='abstract' | final+='final')
	//    )*
	//    'class' name=ID '{' '}'
	//;
	public GroupLoopedModelElements getGroupLoopedModelAccess() {
		return pGroupLoopedModel;
	}
	
	public ParserRule getGroupLoopedModelRule() {
		return getGroupLoopedModelAccess().getRule();
	}
	
	//LoopedAlternativeModel:
	//    (
	//        visibility+=('public'|'private'|'protected')
	//      | static+='static'
	//      | synchronized+='synchronized'
	//      | (abstract+='abstract' | final+='final')
	//      | ('before' 'after'*)
	//    )*
	//    'class' name=ID '{' '}'
	//;
	public LoopedAlternativeModelElements getLoopedAlternativeModelAccess() {
		return pLoopedAlternativeModel;
	}
	
	public ParserRule getLoopedAlternativeModelRule() {
		return getLoopedAlternativeModelAccess().getRule();
	}
	
	//Bug304681Model: {Bug304681Model}
	//    "{" (
	//        ("short" shortDescription=STRING ";")? &
	//         ("long"  longDescription=STRING ";")? &
	//         ("uid" uid=STRING ";")? &
	//         (flag?="flag" ";")? &
	//         features+=Bug304681Feature*
	//     ) "}";
	public Bug304681ModelElements getBug304681ModelAccess() {
		return pBug304681Model;
	}
	
	public ParserRule getBug304681ModelRule() {
		return getBug304681ModelAccess().getRule();
	}
	
	//Bug304681Feature:
	//  Bug304681Attribute | Bug304681Reference;
	public Bug304681FeatureElements getBug304681FeatureAccess() {
		return pBug304681Feature;
	}
	
	public ParserRule getBug304681FeatureRule() {
		return getBug304681FeatureAccess().getRule();
	}
	
	//Bug304681Attribute:
	//  'attr' name=ID ';';
	public Bug304681AttributeElements getBug304681AttributeAccess() {
		return pBug304681Attribute;
	}
	
	public ParserRule getBug304681AttributeRule() {
		return getBug304681AttributeAccess().getRule();
	}
	
	//Bug304681Reference:
	//  'ref' name=ID ';';
	public Bug304681ReferenceElements getBug304681ReferenceAccess() {
		return pBug304681Reference;
	}
	
	public ParserRule getBug304681ReferenceRule() {
		return getBug304681ReferenceAccess().getRule();
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
