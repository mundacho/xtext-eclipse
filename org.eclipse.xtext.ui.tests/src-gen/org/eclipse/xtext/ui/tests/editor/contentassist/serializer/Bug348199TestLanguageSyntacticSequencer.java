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
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.Bug348199TestLanguageGrammarAccess;

@SuppressWarnings("all")
public class Bug348199TestLanguageSyntacticSequencer extends AbstractSyntacticSequencer {

	protected Bug348199TestLanguageGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_0_2_0_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_0_3_0_0_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_0_3_0_3_0_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_0_3_1_0_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_0_3_1_3_0_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_0_4_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_1_2_0_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_1_3_0_0_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_1_3_0_3_0_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_1_3_1_0_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_1_3_1_3_0_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_1_4_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_2_2_0_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_2_3_0_0_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_2_3_0_3_0_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_2_3_1_0_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_2_3_1_3_0_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_2_4_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_3_2_0_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_3_3_0_0_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_3_3_0_3_0_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_3_3_1_0_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_3_3_1_3_0_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_3_4_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_4_2_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_4_3_1_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_4_4_0_2_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_4_4_0_3_1_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_4_4_1_2_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_4_4_1_3_1_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_5_2_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_5_3_1_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_5_4_0_2_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_5_4_0_3_1_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_5_4_1_2_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_5_4_1_3_1_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_6_2_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_6_3_1_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_6_4_0_2_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_6_4_0_3_1_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_6_4_1_2_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_6_4_1_3_1_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_7_2_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_7_3_1_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_7_4_0_2_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_7_4_0_3_1_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_7_4_1_2_p;
	protected AbstractElementAlias match_Timeperiod_NLTerminalRuleCall_3_7_4_1_3_1_p;
	protected AbstractElementAlias match_Timeperiod___DigitEightKeyword_3_7_0_LeftCurlyBracketKeyword_3_7_1_NLTerminalRuleCall_3_7_2_p_RightCurlyBracketKeyword_3_7_5___or___DigitFiveKeyword_3_4_0_LeftCurlyBracketKeyword_3_4_1_NLTerminalRuleCall_3_4_2_p_RightCurlyBracketKeyword_3_4_5___or___DigitFourKeyword_3_3_0_LeftCurlyBracketKeyword_3_3_1_NLTerminalRuleCall_3_3_4_p_RightCurlyBracketKeyword_3_3_5___or___DigitOneKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_NLTerminalRuleCall_3_0_4_p_RightCurlyBracketKeyword_3_0_5___or___DigitSixKeyword_3_5_0_LeftCurlyBracketKeyword_3_5_1_NLTerminalRuleCall_3_5_2_p_RightCurlyBracketKeyword_3_5_5___or___DigitTwoKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_NLTerminalRuleCall_3_1_4_p_RightCurlyBracketKeyword_3_1_5__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (Bug348199TestLanguageGrammarAccess) access;
		match_Timeperiod_NLTerminalRuleCall_3_0_2_0_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_2_0());
		match_Timeperiod_NLTerminalRuleCall_3_0_3_0_0_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_3_0_0());
		match_Timeperiod_NLTerminalRuleCall_3_0_3_0_3_0_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_3_0_3_0());
		match_Timeperiod_NLTerminalRuleCall_3_0_3_1_0_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_3_1_0());
		match_Timeperiod_NLTerminalRuleCall_3_0_3_1_3_0_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_3_1_3_0());
		match_Timeperiod_NLTerminalRuleCall_3_0_4_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_4());
		match_Timeperiod_NLTerminalRuleCall_3_1_2_0_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_2_0());
		match_Timeperiod_NLTerminalRuleCall_3_1_3_0_0_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_3_0_0());
		match_Timeperiod_NLTerminalRuleCall_3_1_3_0_3_0_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_3_0_3_0());
		match_Timeperiod_NLTerminalRuleCall_3_1_3_1_0_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_3_1_0());
		match_Timeperiod_NLTerminalRuleCall_3_1_3_1_3_0_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_3_1_3_0());
		match_Timeperiod_NLTerminalRuleCall_3_1_4_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_4());
		match_Timeperiod_NLTerminalRuleCall_3_2_2_0_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_2_0());
		match_Timeperiod_NLTerminalRuleCall_3_2_3_0_0_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_3_0_0());
		match_Timeperiod_NLTerminalRuleCall_3_2_3_0_3_0_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_3_0_3_0());
		match_Timeperiod_NLTerminalRuleCall_3_2_3_1_0_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_3_1_0());
		match_Timeperiod_NLTerminalRuleCall_3_2_3_1_3_0_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_3_1_3_0());
		match_Timeperiod_NLTerminalRuleCall_3_2_4_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_4());
		match_Timeperiod_NLTerminalRuleCall_3_3_2_0_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_2_0());
		match_Timeperiod_NLTerminalRuleCall_3_3_3_0_0_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_3_0_0());
		match_Timeperiod_NLTerminalRuleCall_3_3_3_0_3_0_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_3_0_3_0());
		match_Timeperiod_NLTerminalRuleCall_3_3_3_1_0_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_3_1_0());
		match_Timeperiod_NLTerminalRuleCall_3_3_3_1_3_0_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_3_1_3_0());
		match_Timeperiod_NLTerminalRuleCall_3_3_4_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_4());
		match_Timeperiod_NLTerminalRuleCall_3_4_2_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_2());
		match_Timeperiod_NLTerminalRuleCall_3_4_3_1_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_3_1());
		match_Timeperiod_NLTerminalRuleCall_3_4_4_0_2_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_4_0_2());
		match_Timeperiod_NLTerminalRuleCall_3_4_4_0_3_1_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_4_0_3_1());
		match_Timeperiod_NLTerminalRuleCall_3_4_4_1_2_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_4_1_2());
		match_Timeperiod_NLTerminalRuleCall_3_4_4_1_3_1_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_4_1_3_1());
		match_Timeperiod_NLTerminalRuleCall_3_5_2_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_2());
		match_Timeperiod_NLTerminalRuleCall_3_5_3_1_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_3_1());
		match_Timeperiod_NLTerminalRuleCall_3_5_4_0_2_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_4_0_2());
		match_Timeperiod_NLTerminalRuleCall_3_5_4_0_3_1_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_4_0_3_1());
		match_Timeperiod_NLTerminalRuleCall_3_5_4_1_2_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_4_1_2());
		match_Timeperiod_NLTerminalRuleCall_3_5_4_1_3_1_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_4_1_3_1());
		match_Timeperiod_NLTerminalRuleCall_3_6_2_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_2());
		match_Timeperiod_NLTerminalRuleCall_3_6_3_1_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_3_1());
		match_Timeperiod_NLTerminalRuleCall_3_6_4_0_2_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_4_0_2());
		match_Timeperiod_NLTerminalRuleCall_3_6_4_0_3_1_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_4_0_3_1());
		match_Timeperiod_NLTerminalRuleCall_3_6_4_1_2_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_4_1_2());
		match_Timeperiod_NLTerminalRuleCall_3_6_4_1_3_1_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_4_1_3_1());
		match_Timeperiod_NLTerminalRuleCall_3_7_2_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_2());
		match_Timeperiod_NLTerminalRuleCall_3_7_3_1_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_3_1());
		match_Timeperiod_NLTerminalRuleCall_3_7_4_0_2_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_4_0_2());
		match_Timeperiod_NLTerminalRuleCall_3_7_4_0_3_1_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_4_0_3_1());
		match_Timeperiod_NLTerminalRuleCall_3_7_4_1_2_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_4_1_2());
		match_Timeperiod_NLTerminalRuleCall_3_7_4_1_3_1_p = new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_4_1_3_1());
		match_Timeperiod___DigitEightKeyword_3_7_0_LeftCurlyBracketKeyword_3_7_1_NLTerminalRuleCall_3_7_2_p_RightCurlyBracketKeyword_3_7_5___or___DigitFiveKeyword_3_4_0_LeftCurlyBracketKeyword_3_4_1_NLTerminalRuleCall_3_4_2_p_RightCurlyBracketKeyword_3_4_5___or___DigitFourKeyword_3_3_0_LeftCurlyBracketKeyword_3_3_1_NLTerminalRuleCall_3_3_4_p_RightCurlyBracketKeyword_3_3_5___or___DigitOneKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_NLTerminalRuleCall_3_0_4_p_RightCurlyBracketKeyword_3_0_5___or___DigitSixKeyword_3_5_0_LeftCurlyBracketKeyword_3_5_1_NLTerminalRuleCall_3_5_2_p_RightCurlyBracketKeyword_3_5_5___or___DigitTwoKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_NLTerminalRuleCall_3_1_4_p_RightCurlyBracketKeyword_3_1_5__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTimeperiodAccess().getDigitEightKeyword_3_7_0()), new TokenAlias(false, false, grammarAccess.getTimeperiodAccess().getLeftCurlyBracketKeyword_3_7_1()), new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_2()), new TokenAlias(false, false, grammarAccess.getTimeperiodAccess().getRightCurlyBracketKeyword_3_7_5())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTimeperiodAccess().getDigitFiveKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getTimeperiodAccess().getLeftCurlyBracketKeyword_3_4_1()), new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_2()), new TokenAlias(false, false, grammarAccess.getTimeperiodAccess().getRightCurlyBracketKeyword_3_4_5())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTimeperiodAccess().getDigitFourKeyword_3_3_0()), new TokenAlias(false, false, grammarAccess.getTimeperiodAccess().getLeftCurlyBracketKeyword_3_3_1()), new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_4()), new TokenAlias(false, false, grammarAccess.getTimeperiodAccess().getRightCurlyBracketKeyword_3_3_5())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTimeperiodAccess().getDigitOneKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getTimeperiodAccess().getLeftCurlyBracketKeyword_3_0_1()), new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_4()), new TokenAlias(false, false, grammarAccess.getTimeperiodAccess().getRightCurlyBracketKeyword_3_0_5())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTimeperiodAccess().getDigitSixKeyword_3_5_0()), new TokenAlias(false, false, grammarAccess.getTimeperiodAccess().getLeftCurlyBracketKeyword_3_5_1()), new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_2()), new TokenAlias(false, false, grammarAccess.getTimeperiodAccess().getRightCurlyBracketKeyword_3_5_5())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTimeperiodAccess().getDigitTwoKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getTimeperiodAccess().getLeftCurlyBracketKeyword_3_1_1()), new TokenAlias(true, false, grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_4()), new TokenAlias(false, false, grammarAccess.getTimeperiodAccess().getRightCurlyBracketKeyword_3_1_5())));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getNLRule())
			return getNLToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal NL:
	 * 	'\r'? '\n' 
	 * ;
	 */
	protected String getNLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\n";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Timeperiod_NLTerminalRuleCall_3_0_2_0_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_0_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_0_3_0_0_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_0_3_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_0_3_0_3_0_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_0_3_0_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_0_3_1_0_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_0_3_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_0_3_1_3_0_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_0_3_1_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_0_4_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_0_4_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_1_2_0_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_1_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_1_3_0_0_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_1_3_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_1_3_0_3_0_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_1_3_0_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_1_3_1_0_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_1_3_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_1_3_1_3_0_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_1_3_1_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_1_4_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_1_4_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_2_2_0_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_2_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_2_3_0_0_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_2_3_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_2_3_0_3_0_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_2_3_0_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_2_3_1_0_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_2_3_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_2_3_1_3_0_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_2_3_1_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_2_4_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_2_4_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_3_2_0_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_3_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_3_3_0_0_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_3_3_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_3_3_0_3_0_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_3_3_0_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_3_3_1_0_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_3_3_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_3_3_1_3_0_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_3_3_1_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_3_4_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_3_4_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_4_2_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_4_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_4_3_1_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_4_3_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_4_4_0_2_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_4_4_0_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_4_4_0_3_1_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_4_4_0_3_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_4_4_1_2_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_4_4_1_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_4_4_1_3_1_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_4_4_1_3_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_5_2_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_5_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_5_3_1_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_5_3_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_5_4_0_2_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_5_4_0_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_5_4_0_3_1_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_5_4_0_3_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_5_4_1_2_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_5_4_1_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_5_4_1_3_1_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_5_4_1_3_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_6_2_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_6_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_6_3_1_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_6_3_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_6_4_0_2_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_6_4_0_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_6_4_0_3_1_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_6_4_0_3_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_6_4_1_2_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_6_4_1_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_6_4_1_3_1_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_6_4_1_3_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_7_2_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_7_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_7_3_1_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_7_3_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_7_4_0_2_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_7_4_0_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_7_4_0_3_1_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_7_4_0_3_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_7_4_1_2_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_7_4_1_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod_NLTerminalRuleCall_3_7_4_1_3_1_p.equals(syntax))
				emit_Timeperiod_NLTerminalRuleCall_3_7_4_1_3_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timeperiod___DigitEightKeyword_3_7_0_LeftCurlyBracketKeyword_3_7_1_NLTerminalRuleCall_3_7_2_p_RightCurlyBracketKeyword_3_7_5___or___DigitFiveKeyword_3_4_0_LeftCurlyBracketKeyword_3_4_1_NLTerminalRuleCall_3_4_2_p_RightCurlyBracketKeyword_3_4_5___or___DigitFourKeyword_3_3_0_LeftCurlyBracketKeyword_3_3_1_NLTerminalRuleCall_3_3_4_p_RightCurlyBracketKeyword_3_3_5___or___DigitOneKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_NLTerminalRuleCall_3_0_4_p_RightCurlyBracketKeyword_3_0_5___or___DigitSixKeyword_3_5_0_LeftCurlyBracketKeyword_3_5_1_NLTerminalRuleCall_3_5_2_p_RightCurlyBracketKeyword_3_5_5___or___DigitTwoKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_NLTerminalRuleCall_3_1_4_p_RightCurlyBracketKeyword_3_1_5__.equals(syntax))
				emit_Timeperiod___DigitEightKeyword_3_7_0_LeftCurlyBracketKeyword_3_7_1_NLTerminalRuleCall_3_7_2_p_RightCurlyBracketKeyword_3_7_5___or___DigitFiveKeyword_3_4_0_LeftCurlyBracketKeyword_3_4_1_NLTerminalRuleCall_3_4_2_p_RightCurlyBracketKeyword_3_4_5___or___DigitFourKeyword_3_3_0_LeftCurlyBracketKeyword_3_3_1_NLTerminalRuleCall_3_3_4_p_RightCurlyBracketKeyword_3_3_5___or___DigitOneKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_NLTerminalRuleCall_3_0_4_p_RightCurlyBracketKeyword_3_0_5___or___DigitSixKeyword_3_5_0_LeftCurlyBracketKeyword_3_5_1_NLTerminalRuleCall_3_5_2_p_RightCurlyBracketKeyword_3_5_5___or___DigitTwoKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_NLTerminalRuleCall_3_1_4_p_RightCurlyBracketKeyword_3_1_5__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'define' 'timeperiod' '1' '{' (ambiguity) time+=TimeDef1
	 *     time+=TimeDef1 (ambiguity) time+=TimeDef1
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_0_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'define' 'timeperiod' '1' '{' (ambiguity) 'timeperiod_name' name+=ID
	 *     alias+=ID (ambiguity) 'timeperiod_name' name+=ID
	 *     name+=ID (ambiguity) 'timeperiod_name' name+=ID
	 *     time+=TimeDef1 (ambiguity) 'timeperiod_name' name+=ID
	 *     time+=TimeDef2 (ambiguity) 'timeperiod_name' name+=ID
	 *     time+=TimeDef3 (ambiguity) 'timeperiod_name' name+=ID
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_0_3_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     name+=ID (ambiguity) time+=TimeDef2
	 *     time+=TimeDef2 (ambiguity) time+=TimeDef2
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_0_3_0_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'define' 'timeperiod' '1' '{' (ambiguity) 'otherelement' alias+=ID
	 *     alias+=ID (ambiguity) 'otherelement' alias+=ID
	 *     name+=ID (ambiguity) 'otherelement' alias+=ID
	 *     time+=TimeDef1 (ambiguity) 'otherelement' alias+=ID
	 *     time+=TimeDef2 (ambiguity) 'otherelement' alias+=ID
	 *     time+=TimeDef3 (ambiguity) 'otherelement' alias+=ID
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_0_3_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     alias+=ID (ambiguity) time+=TimeDef3
	 *     time+=TimeDef3 (ambiguity) time+=TimeDef3
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_0_3_1_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     alias+=ID (ambiguity) '}' (rule end)
	 *     name+=ID (ambiguity) '}' (rule end)
	 *     time+=TimeDef1 (ambiguity) '}' (rule end)
	 *     time+=TimeDef2 (ambiguity) '}' (rule end)
	 *     time+=TimeDef3 (ambiguity) '}' (rule end)
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_0_4_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'define' 'timeperiod' '2' '{' (ambiguity) time+=TimeDef1
	 *     time+=TimeDef1 (ambiguity) time+=TimeDef1
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_1_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'define' 'timeperiod' '2' '{' (ambiguity) 'timeperiod_name' name+=ID
	 *     time+=TimeDef1 (ambiguity) 'timeperiod_name' name+=ID
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_1_3_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     name+=ID (ambiguity) time+=TimeDef2
	 *     time+=TimeDef2 (ambiguity) time+=TimeDef2
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_1_3_0_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'define' 'timeperiod' '2' '{' (ambiguity) 'otherelement' alias+=ID
	 *     time+=TimeDef1 (ambiguity) 'otherelement' alias+=ID
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_1_3_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     alias+=ID (ambiguity) time+=TimeDef3
	 *     time+=TimeDef3 (ambiguity) time+=TimeDef3
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_1_3_1_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     alias+=ID (ambiguity) '}' (rule end)
	 *     name+=ID (ambiguity) '}' (rule end)
	 *     time+=TimeDef1 (ambiguity) '}' (rule end)
	 *     time+=TimeDef2 (ambiguity) '}' (rule end)
	 *     time+=TimeDef3 (ambiguity) '}' (rule end)
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_1_4_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'define' 'timeperiod' '3' '{' (ambiguity) time+=TimeDef1
	 *     time+=TimeDef1 (ambiguity) time+=TimeDef1
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_2_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'define' 'timeperiod' '3' '{' (ambiguity) 'timeperiod_name' name+=ID
	 *     alias+=ID (ambiguity) 'timeperiod_name' name+=ID
	 *     name+=ID (ambiguity) 'timeperiod_name' name+=ID
	 *     time+=TimeDef1 (ambiguity) 'timeperiod_name' name+=ID
	 *     time+=TimeDef2 (ambiguity) 'timeperiod_name' name+=ID
	 *     time+=TimeDef3 (ambiguity) 'timeperiod_name' name+=ID
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_2_3_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     name+=ID (ambiguity) time+=TimeDef2
	 *     time+=TimeDef2 (ambiguity) time+=TimeDef2
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_2_3_0_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'define' 'timeperiod' '3' '{' (ambiguity) 'otherelement' alias+=ID
	 *     alias+=ID (ambiguity) 'otherelement' alias+=ID
	 *     name+=ID (ambiguity) 'otherelement' alias+=ID
	 *     time+=TimeDef1 (ambiguity) 'otherelement' alias+=ID
	 *     time+=TimeDef2 (ambiguity) 'otherelement' alias+=ID
	 *     time+=TimeDef3 (ambiguity) 'otherelement' alias+=ID
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_2_3_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     alias+=ID (ambiguity) time+=TimeDef3
	 *     time+=TimeDef3 (ambiguity) time+=TimeDef3
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_2_3_1_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     alias+=ID (ambiguity) '}' (rule end)
	 *     name+=ID (ambiguity) '}' (rule end)
	 *     time+=TimeDef2 (ambiguity) '}' (rule end)
	 *     time+=TimeDef3 (ambiguity) '}' (rule end)
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_2_4_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'define' 'timeperiod' '4' '{' (ambiguity) time+=TimeDef1
	 *     time+=TimeDef1 (ambiguity) time+=TimeDef1
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_3_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'define' 'timeperiod' '4' '{' (ambiguity) 'timeperiod_name' name+=ID
	 *     alias+=ID (ambiguity) 'timeperiod_name' name+=ID
	 *     name+=ID (ambiguity) 'timeperiod_name' name+=ID
	 *     time+=TimeDef1 (ambiguity) 'timeperiod_name' name+=ID
	 *     time+=TimeDef2 (ambiguity) 'timeperiod_name' name+=ID
	 *     time+=TimeDef3 (ambiguity) 'timeperiod_name' name+=ID
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_3_3_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     name+=ID (ambiguity) time+=TimeDef2
	 *     time+=TimeDef2 (ambiguity) time+=TimeDef2
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_3_3_0_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'define' 'timeperiod' '4' '{' (ambiguity) 'otherelement' alias+=ID
	 *     alias+=ID (ambiguity) 'otherelement' alias+=ID
	 *     name+=ID (ambiguity) 'otherelement' alias+=ID
	 *     time+=TimeDef1 (ambiguity) 'otherelement' alias+=ID
	 *     time+=TimeDef2 (ambiguity) 'otherelement' alias+=ID
	 *     time+=TimeDef3 (ambiguity) 'otherelement' alias+=ID
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_3_3_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     alias+=ID (ambiguity) time+=TimeDef3
	 *     time+=TimeDef3 (ambiguity) time+=TimeDef3
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_3_3_1_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     alias+=ID (ambiguity) '}' (rule end)
	 *     name+=ID (ambiguity) '}' (rule end)
	 *     time+=TimeDef1 (ambiguity) '}' (rule end)
	 *     time+=TimeDef2 (ambiguity) '}' (rule end)
	 *     time+=TimeDef3 (ambiguity) '}' (rule end)
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_3_4_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'define' 'timeperiod' '5' '{' (ambiguity) 'otherelement' alias+=ID
	 *     (rule start) 'define' 'timeperiod' '5' '{' (ambiguity) 'timeperiod_name' name+=ID
	 *     (rule start) 'define' 'timeperiod' '5' '{' (ambiguity) time+=TimeDef1
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_4_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     time+=TimeDef1 (ambiguity) 'otherelement' alias+=ID
	 *     time+=TimeDef1 (ambiguity) 'timeperiod_name' name+=ID
	 *     time+=TimeDef1 (ambiguity) '}' (rule end)
	 *     time+=TimeDef1 (ambiguity) time+=TimeDef1
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_4_3_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     name+=ID (ambiguity) 'otherelement' alias+=ID
	 *     name+=ID (ambiguity) 'timeperiod_name' name+=ID
	 *     name+=ID (ambiguity) '}' (rule end)
	 *     name+=ID (ambiguity) time+=TimeDef2
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_4_4_0_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     time+=TimeDef2 (ambiguity) 'otherelement' alias+=ID
	 *     time+=TimeDef2 (ambiguity) 'timeperiod_name' name+=ID
	 *     time+=TimeDef2 (ambiguity) '}' (rule end)
	 *     time+=TimeDef2 (ambiguity) time+=TimeDef2
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_4_4_0_3_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     alias+=ID (ambiguity) 'otherelement' alias+=ID
	 *     alias+=ID (ambiguity) 'timeperiod_name' name+=ID
	 *     alias+=ID (ambiguity) '}' (rule end)
	 *     alias+=ID (ambiguity) time+=TimeDef3
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_4_4_1_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     time+=TimeDef3 (ambiguity) 'otherelement' alias+=ID
	 *     time+=TimeDef3 (ambiguity) 'timeperiod_name' name+=ID
	 *     time+=TimeDef3 (ambiguity) '}' (rule end)
	 *     time+=TimeDef3 (ambiguity) time+=TimeDef3
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_4_4_1_3_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'define' 'timeperiod' '6' '{' (ambiguity) 'otherelement' alias+=ID
	 *     (rule start) 'define' 'timeperiod' '6' '{' (ambiguity) 'timeperiod_name' name+=ID
	 *     (rule start) 'define' 'timeperiod' '6' '{' (ambiguity) time+=TimeDef1
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_5_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     time+=TimeDef1 (ambiguity) 'otherelement' alias+=ID
	 *     time+=TimeDef1 (ambiguity) 'timeperiod_name' name+=ID
	 *     time+=TimeDef1 (ambiguity) '}' (rule end)
	 *     time+=TimeDef1 (ambiguity) time+=TimeDef1
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_5_3_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     name+=ID (ambiguity) '}' (rule end)
	 *     name+=ID (ambiguity) time+=TimeDef2
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_5_4_0_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     time+=TimeDef2 (ambiguity) '}' (rule end)
	 *     time+=TimeDef2 (ambiguity) time+=TimeDef2
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_5_4_0_3_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     alias+=ID (ambiguity) '}' (rule end)
	 *     alias+=ID (ambiguity) time+=TimeDef3
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_5_4_1_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     time+=TimeDef3 (ambiguity) '}' (rule end)
	 *     time+=TimeDef3 (ambiguity) time+=TimeDef3
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_5_4_1_3_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'define' 'timeperiod' '7' '{' (ambiguity) 'otherelement' alias+=ID
	 *     (rule start) 'define' 'timeperiod' '7' '{' (ambiguity) 'timeperiod_name' name+=ID
	 *     (rule start) 'define' 'timeperiod' '7' '{' (ambiguity) time+=TimeDef1
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_6_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     time+=TimeDef1 (ambiguity) 'otherelement' alias+=ID
	 *     time+=TimeDef1 (ambiguity) 'timeperiod_name' name+=ID
	 *     time+=TimeDef1 (ambiguity) time+=TimeDef1
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_6_3_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     name+=ID (ambiguity) 'otherelement' alias+=ID
	 *     name+=ID (ambiguity) 'timeperiod_name' name+=ID
	 *     name+=ID (ambiguity) '}' (rule end)
	 *     name+=ID (ambiguity) time+=TimeDef2
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_6_4_0_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     time+=TimeDef2 (ambiguity) 'otherelement' alias+=ID
	 *     time+=TimeDef2 (ambiguity) 'timeperiod_name' name+=ID
	 *     time+=TimeDef2 (ambiguity) '}' (rule end)
	 *     time+=TimeDef2 (ambiguity) time+=TimeDef2
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_6_4_0_3_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     alias+=ID (ambiguity) 'otherelement' alias+=ID
	 *     alias+=ID (ambiguity) 'timeperiod_name' name+=ID
	 *     alias+=ID (ambiguity) '}' (rule end)
	 *     alias+=ID (ambiguity) time+=TimeDef3
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_6_4_1_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     time+=TimeDef3 (ambiguity) 'otherelement' alias+=ID
	 *     time+=TimeDef3 (ambiguity) 'timeperiod_name' name+=ID
	 *     time+=TimeDef3 (ambiguity) '}' (rule end)
	 *     time+=TimeDef3 (ambiguity) time+=TimeDef3
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_6_4_1_3_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'define' 'timeperiod' '8' '{' (ambiguity) 'otherelement' alias+=ID
	 *     (rule start) 'define' 'timeperiod' '8' '{' (ambiguity) 'timeperiod_name' name+=ID
	 *     (rule start) 'define' 'timeperiod' '8' '{' (ambiguity) time+=TimeDef1
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_7_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     time+=TimeDef1 (ambiguity) 'otherelement' alias+=ID
	 *     time+=TimeDef1 (ambiguity) 'timeperiod_name' name+=ID
	 *     time+=TimeDef1 (ambiguity) '}' (rule end)
	 *     time+=TimeDef1 (ambiguity) time+=TimeDef1
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_7_3_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     name+=ID (ambiguity) 'otherelement' alias+=ID
	 *     name+=ID (ambiguity) 'timeperiod_name' name+=ID
	 *     name+=ID (ambiguity) '}' (rule end)
	 *     name+=ID (ambiguity) time+=TimeDef2
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_7_4_0_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     time+=TimeDef2 (ambiguity) 'otherelement' alias+=ID
	 *     time+=TimeDef2 (ambiguity) 'timeperiod_name' name+=ID
	 *     time+=TimeDef2 (ambiguity) '}' (rule end)
	 *     time+=TimeDef2 (ambiguity) time+=TimeDef2
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_7_4_0_3_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     alias+=ID (ambiguity) 'otherelement' alias+=ID
	 *     alias+=ID (ambiguity) 'timeperiod_name' name+=ID
	 *     alias+=ID (ambiguity) '}' (rule end)
	 *     alias+=ID (ambiguity) time+=TimeDef3
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_7_4_1_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     time+=TimeDef3 (ambiguity) 'otherelement' alias+=ID
	 *     time+=TimeDef3 (ambiguity) 'timeperiod_name' name+=ID
	 *     time+=TimeDef3 (ambiguity) '}' (rule end)
	 *     time+=TimeDef3 (ambiguity) time+=TimeDef3
	 
	 * </pre>
	 */
	protected void emit_Timeperiod_NLTerminalRuleCall_3_7_4_1_3_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (
	  *         ('1' '{' NL+ '}') | 
	  *         ('2' '{' NL+ '}') | 
	  *         ('4' '{' NL+ '}') | 
	  *         ('5' '{' NL+ '}') | 
	  *         ('6' '{' NL+ '}') | 
	  *         ('8' '{' NL+ '}')
	  *     )
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'define' 'timeperiod' (ambiguity) (rule start)
	 
	 * </pre>
	 */
	protected void emit_Timeperiod___DigitEightKeyword_3_7_0_LeftCurlyBracketKeyword_3_7_1_NLTerminalRuleCall_3_7_2_p_RightCurlyBracketKeyword_3_7_5___or___DigitFiveKeyword_3_4_0_LeftCurlyBracketKeyword_3_4_1_NLTerminalRuleCall_3_4_2_p_RightCurlyBracketKeyword_3_4_5___or___DigitFourKeyword_3_3_0_LeftCurlyBracketKeyword_3_3_1_NLTerminalRuleCall_3_3_4_p_RightCurlyBracketKeyword_3_3_5___or___DigitOneKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1_NLTerminalRuleCall_3_0_4_p_RightCurlyBracketKeyword_3_0_5___or___DigitSixKeyword_3_5_0_LeftCurlyBracketKeyword_3_5_1_NLTerminalRuleCall_3_5_2_p_RightCurlyBracketKeyword_3_5_5___or___DigitTwoKeyword_3_1_0_LeftCurlyBracketKeyword_3_1_1_NLTerminalRuleCall_3_1_4_p_RightCurlyBracketKeyword_3_1_5__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
