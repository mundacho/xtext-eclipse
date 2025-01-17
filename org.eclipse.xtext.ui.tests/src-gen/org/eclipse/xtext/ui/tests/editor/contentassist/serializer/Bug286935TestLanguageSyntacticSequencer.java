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
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.Bug286935TestLanguageGrammarAccess;

@SuppressWarnings("all")
public class Bug286935TestLanguageSyntacticSequencer extends AbstractSyntacticSequencer {

	protected Bug286935TestLanguageGrammarAccess grammarAccess;
	protected AbstractElementAlias match_State_StateKeyword_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (Bug286935TestLanguageGrammarAccess) access;
		match_State_StateKeyword_2_q = new TokenAlias(false, true, grammarAccess.getStateAccess().getStateKeyword_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_State_StateKeyword_2_q.equals(syntax))
				emit_State_StateKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'state'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 *     (rule start) (ambiguity) label=STRING
	 *     (rule start) (ambiguity) stateName=ID
	 *     isFinal?='final' (ambiguity) (rule end)
	 *     isFinal?='final' (ambiguity) label=STRING
	 *     isFinal?='final' (ambiguity) stateName=ID
	 *     isInitial?='init' (ambiguity) (rule end)
	 *     isInitial?='init' (ambiguity) label=STRING
	 *     isInitial?='init' (ambiguity) stateName=ID
	 *     stateKind=StateType (ambiguity) (rule end)
	 *     stateKind=StateType (ambiguity) label=STRING
	 *     stateKind=StateType (ambiguity) stateName=ID
	 
	 * </pre>
	 */
	protected void emit_State_StateKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
