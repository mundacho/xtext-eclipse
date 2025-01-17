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
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.Bug303200TestLanguageGrammarAccess;

@SuppressWarnings("all")
public class Bug303200TestLanguageSyntacticSequencer extends AbstractSyntacticSequencer {

	protected Bug303200TestLanguageGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Attribute_LTTerminalRuleCall_1_2_a;
	protected AbstractElementAlias match_Attribute_LTTerminalRuleCall_1_4_a;
	protected AbstractElementAlias match_Block_LTTerminalRuleCall_2_0_a;
	protected AbstractElementAlias match_Block_LTTerminalRuleCall_3_a;
	protected AbstractElementAlias match_FunctionDefinition_LTTerminalRuleCall_2_a;
	protected AbstractElementAlias match_FunctionDefinition_LTTerminalRuleCall_4_a;
	protected AbstractElementAlias match_FunctionDefinition_LTTerminalRuleCall_6_a;
	protected AbstractElementAlias match_ListExpression_LTTerminalRuleCall_1_0_a;
	protected AbstractElementAlias match_ListExpression_LTTerminalRuleCall_1_2_a;
	protected AbstractElementAlias match_Parameters_LTTerminalRuleCall_2_a;
	protected AbstractElementAlias match_Parameters_LTTerminalRuleCall_3_1_a;
	protected AbstractElementAlias match_Parameters_LTTerminalRuleCall_3_2_1_a;
	protected AbstractElementAlias match_Parameters_LTTerminalRuleCall_3_2_3_a;
	protected AbstractElementAlias match_PostfixExpression_LTTerminalRuleCall_1_0_1_a;
	protected AbstractElementAlias match_PostfixExpression_LTTerminalRuleCall_1_1_1_a;
	protected AbstractElementAlias match_PostfixExpression_LTTerminalRuleCall_1_1_3_a;
	protected AbstractElementAlias match_PostfixExpression_LTTerminalRuleCall_1_1_4_1_a;
	protected AbstractElementAlias match_PrimaryExpression_LTTerminalRuleCall_1_2_a;
	protected AbstractElementAlias match_PrimaryExpression_LTTerminalRuleCall_1_4_a;
	protected AbstractElementAlias match_Program_LTTerminalRuleCall_1_0_a;
	protected AbstractElementAlias match_Program_LTTerminalRuleCall_2_a;
	protected AbstractElementAlias match_PropertyOperator_LTTerminalRuleCall_0_1_a;
	protected AbstractElementAlias match_PropertyOperator_LTTerminalRuleCall_1_1_a;
	protected AbstractElementAlias match_PropertyOperator_LTTerminalRuleCall_1_3_a;
	protected AbstractElementAlias match_Statement_LTTerminalRuleCall_1_2_1_or_SemicolonKeyword_1_2_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (Bug303200TestLanguageGrammarAccess) access;
		match_Attribute_LTTerminalRuleCall_1_2_a = new TokenAlias(true, true, grammarAccess.getAttributeAccess().getLTTerminalRuleCall_1_2());
		match_Attribute_LTTerminalRuleCall_1_4_a = new TokenAlias(true, true, grammarAccess.getAttributeAccess().getLTTerminalRuleCall_1_4());
		match_Block_LTTerminalRuleCall_2_0_a = new TokenAlias(true, true, grammarAccess.getBlockAccess().getLTTerminalRuleCall_2_0());
		match_Block_LTTerminalRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getBlockAccess().getLTTerminalRuleCall_3());
		match_FunctionDefinition_LTTerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getFunctionDefinitionAccess().getLTTerminalRuleCall_2());
		match_FunctionDefinition_LTTerminalRuleCall_4_a = new TokenAlias(true, true, grammarAccess.getFunctionDefinitionAccess().getLTTerminalRuleCall_4());
		match_FunctionDefinition_LTTerminalRuleCall_6_a = new TokenAlias(true, true, grammarAccess.getFunctionDefinitionAccess().getLTTerminalRuleCall_6());
		match_ListExpression_LTTerminalRuleCall_1_0_a = new TokenAlias(true, true, grammarAccess.getListExpressionAccess().getLTTerminalRuleCall_1_0());
		match_ListExpression_LTTerminalRuleCall_1_2_a = new TokenAlias(true, true, grammarAccess.getListExpressionAccess().getLTTerminalRuleCall_1_2());
		match_Parameters_LTTerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getParametersAccess().getLTTerminalRuleCall_2());
		match_Parameters_LTTerminalRuleCall_3_1_a = new TokenAlias(true, true, grammarAccess.getParametersAccess().getLTTerminalRuleCall_3_1());
		match_Parameters_LTTerminalRuleCall_3_2_1_a = new TokenAlias(true, true, grammarAccess.getParametersAccess().getLTTerminalRuleCall_3_2_1());
		match_Parameters_LTTerminalRuleCall_3_2_3_a = new TokenAlias(true, true, grammarAccess.getParametersAccess().getLTTerminalRuleCall_3_2_3());
		match_PostfixExpression_LTTerminalRuleCall_1_0_1_a = new TokenAlias(true, true, grammarAccess.getPostfixExpressionAccess().getLTTerminalRuleCall_1_0_1());
		match_PostfixExpression_LTTerminalRuleCall_1_1_1_a = new TokenAlias(true, true, grammarAccess.getPostfixExpressionAccess().getLTTerminalRuleCall_1_1_1());
		match_PostfixExpression_LTTerminalRuleCall_1_1_3_a = new TokenAlias(true, true, grammarAccess.getPostfixExpressionAccess().getLTTerminalRuleCall_1_1_3());
		match_PostfixExpression_LTTerminalRuleCall_1_1_4_1_a = new TokenAlias(true, true, grammarAccess.getPostfixExpressionAccess().getLTTerminalRuleCall_1_1_4_1());
		match_PrimaryExpression_LTTerminalRuleCall_1_2_a = new TokenAlias(true, true, grammarAccess.getPrimaryExpressionAccess().getLTTerminalRuleCall_1_2());
		match_PrimaryExpression_LTTerminalRuleCall_1_4_a = new TokenAlias(true, true, grammarAccess.getPrimaryExpressionAccess().getLTTerminalRuleCall_1_4());
		match_Program_LTTerminalRuleCall_1_0_a = new TokenAlias(true, true, grammarAccess.getProgramAccess().getLTTerminalRuleCall_1_0());
		match_Program_LTTerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getProgramAccess().getLTTerminalRuleCall_2());
		match_PropertyOperator_LTTerminalRuleCall_0_1_a = new TokenAlias(true, true, grammarAccess.getPropertyOperatorAccess().getLTTerminalRuleCall_0_1());
		match_PropertyOperator_LTTerminalRuleCall_1_1_a = new TokenAlias(true, true, grammarAccess.getPropertyOperatorAccess().getLTTerminalRuleCall_1_1());
		match_PropertyOperator_LTTerminalRuleCall_1_3_a = new TokenAlias(true, true, grammarAccess.getPropertyOperatorAccess().getLTTerminalRuleCall_1_3());
		match_Statement_LTTerminalRuleCall_1_2_1_or_SemicolonKeyword_1_2_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getStatementAccess().getLTTerminalRuleCall_1_2_1()), new TokenAlias(false, false, grammarAccess.getStatementAccess().getSemicolonKeyword_1_2_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getLTRule())
			return getLTToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal LT: '\r'|'\n';
	 */
	protected String getLTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\r";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Attribute_LTTerminalRuleCall_1_2_a.equals(syntax))
				emit_Attribute_LTTerminalRuleCall_1_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Attribute_LTTerminalRuleCall_1_4_a.equals(syntax))
				emit_Attribute_LTTerminalRuleCall_1_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Block_LTTerminalRuleCall_2_0_a.equals(syntax))
				emit_Block_LTTerminalRuleCall_2_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Block_LTTerminalRuleCall_3_a.equals(syntax))
				emit_Block_LTTerminalRuleCall_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_FunctionDefinition_LTTerminalRuleCall_2_a.equals(syntax))
				emit_FunctionDefinition_LTTerminalRuleCall_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_FunctionDefinition_LTTerminalRuleCall_4_a.equals(syntax))
				emit_FunctionDefinition_LTTerminalRuleCall_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_FunctionDefinition_LTTerminalRuleCall_6_a.equals(syntax))
				emit_FunctionDefinition_LTTerminalRuleCall_6_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ListExpression_LTTerminalRuleCall_1_0_a.equals(syntax))
				emit_ListExpression_LTTerminalRuleCall_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ListExpression_LTTerminalRuleCall_1_2_a.equals(syntax))
				emit_ListExpression_LTTerminalRuleCall_1_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Parameters_LTTerminalRuleCall_2_a.equals(syntax))
				emit_Parameters_LTTerminalRuleCall_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Parameters_LTTerminalRuleCall_3_1_a.equals(syntax))
				emit_Parameters_LTTerminalRuleCall_3_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Parameters_LTTerminalRuleCall_3_2_1_a.equals(syntax))
				emit_Parameters_LTTerminalRuleCall_3_2_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Parameters_LTTerminalRuleCall_3_2_3_a.equals(syntax))
				emit_Parameters_LTTerminalRuleCall_3_2_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PostfixExpression_LTTerminalRuleCall_1_0_1_a.equals(syntax))
				emit_PostfixExpression_LTTerminalRuleCall_1_0_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PostfixExpression_LTTerminalRuleCall_1_1_1_a.equals(syntax))
				emit_PostfixExpression_LTTerminalRuleCall_1_1_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PostfixExpression_LTTerminalRuleCall_1_1_3_a.equals(syntax))
				emit_PostfixExpression_LTTerminalRuleCall_1_1_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PostfixExpression_LTTerminalRuleCall_1_1_4_1_a.equals(syntax))
				emit_PostfixExpression_LTTerminalRuleCall_1_1_4_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryExpression_LTTerminalRuleCall_1_2_a.equals(syntax))
				emit_PrimaryExpression_LTTerminalRuleCall_1_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryExpression_LTTerminalRuleCall_1_4_a.equals(syntax))
				emit_PrimaryExpression_LTTerminalRuleCall_1_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Program_LTTerminalRuleCall_1_0_a.equals(syntax))
				emit_Program_LTTerminalRuleCall_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Program_LTTerminalRuleCall_2_a.equals(syntax))
				emit_Program_LTTerminalRuleCall_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PropertyOperator_LTTerminalRuleCall_0_1_a.equals(syntax))
				emit_PropertyOperator_LTTerminalRuleCall_0_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PropertyOperator_LTTerminalRuleCall_1_1_a.equals(syntax))
				emit_PropertyOperator_LTTerminalRuleCall_1_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PropertyOperator_LTTerminalRuleCall_1_3_a.equals(syntax))
				emit_PropertyOperator_LTTerminalRuleCall_1_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Statement_LTTerminalRuleCall_1_2_1_or_SemicolonKeyword_1_2_0.equals(syntax))
				emit_Statement_LTTerminalRuleCall_1_2_1_or_SemicolonKeyword_1_2_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     LT*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '[' (ambiguity) expression=PostfixExpression
	 
	 * </pre>
	 */
	protected void emit_Attribute_LTTerminalRuleCall_1_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     LT*
	 *
	 * This ambiguous syntax occurs at:
	 *     expression=PostfixExpression (ambiguity) ']' (rule end)
	 
	 * </pre>
	 */
	protected void emit_Attribute_LTTerminalRuleCall_1_4_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     LT*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '{' (ambiguity) directives+=Statement
	 *     directives+=Statement (ambiguity) directives+=Statement
	 
	 * </pre>
	 */
	protected void emit_Block_LTTerminalRuleCall_2_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     LT*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '{' (ambiguity) '}' (rule start)
	 *     directives+=Statement (ambiguity) '}' (rule end)
	 
	 * </pre>
	 */
	protected void emit_Block_LTTerminalRuleCall_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     LT*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'function' (ambiguity) name=ID
	 *     attributes+=Attribute 'function' (ambiguity) name=ID
	 
	 * </pre>
	 */
	protected void emit_FunctionDefinition_LTTerminalRuleCall_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     LT*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) params=Parameters
	 
	 * </pre>
	 */
	protected void emit_FunctionDefinition_LTTerminalRuleCall_4_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     LT*
	 *
	 * This ambiguous syntax occurs at:
	 *     params=Parameters (ambiguity) body=Block
	 
	 * </pre>
	 */
	protected void emit_FunctionDefinition_LTTerminalRuleCall_6_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     LT*
	 *
	 * This ambiguous syntax occurs at:
	 *     expressions+=PostfixExpression (ambiguity) ',' LT* expressions+=PostfixExpression
	 
	 * </pre>
	 */
	protected void emit_ListExpression_LTTerminalRuleCall_1_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     LT*
	 *
	 * This ambiguous syntax occurs at:
	 *     expressions+=PostfixExpression LT* ',' (ambiguity) expressions+=PostfixExpression
	 
	 * </pre>
	 */
	protected void emit_ListExpression_LTTerminalRuleCall_1_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     LT*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '(' (ambiguity) ')' (rule start)
	 *     (rule start) '(' (ambiguity) params+=ID
	 
	 * </pre>
	 */
	protected void emit_Parameters_LTTerminalRuleCall_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     LT*
	 *
	 * This ambiguous syntax occurs at:
	 *     params+=ID (ambiguity) ')' (rule end)
	 *     params+=ID (ambiguity) ',' LT* params+=ID
	 
	 * </pre>
	 */
	protected void emit_Parameters_LTTerminalRuleCall_3_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     LT*
	 *
	 * This ambiguous syntax occurs at:
	 *     params+=ID LT* ',' (ambiguity) params+=ID
	 
	 * </pre>
	 */
	protected void emit_Parameters_LTTerminalRuleCall_3_2_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     LT*
	 *
	 * This ambiguous syntax occurs at:
	 *     params+=ID (ambiguity) ')' (rule end)
	 *     params+=ID (ambiguity) ',' LT* params+=ID
	 
	 * </pre>
	 */
	protected void emit_Parameters_LTTerminalRuleCall_3_2_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     LT*
	 *
	 * This ambiguous syntax occurs at:
	 *     {PostfixExpression.expression=} (ambiguity) property=PropertyOperator
	 
	 * </pre>
	 */
	protected void emit_PostfixExpression_LTTerminalRuleCall_1_0_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     LT*
	 *
	 * This ambiguous syntax occurs at:
	 *     {Invocation.expression=} (ambiguity) '(' LT* ')' (rule end)
	 *     {Invocation.expression=} (ambiguity) '(' LT* arguments=ListExpression
	 
	 * </pre>
	 */
	protected void emit_PostfixExpression_LTTerminalRuleCall_1_1_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     LT*
	 *
	 * This ambiguous syntax occurs at:
	 *     {Invocation.expression=} LT* '(' (ambiguity) ')' (rule end)
	 *     {Invocation.expression=} LT* '(' (ambiguity) arguments=ListExpression
	 
	 * </pre>
	 */
	protected void emit_PostfixExpression_LTTerminalRuleCall_1_1_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     LT*
	 *
	 * This ambiguous syntax occurs at:
	 *     arguments=ListExpression (ambiguity) ')' (rule end)
	 
	 * </pre>
	 */
	protected void emit_PostfixExpression_LTTerminalRuleCall_1_1_4_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     LT*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'function' (ambiguity) params=Parameters
	 
	 * </pre>
	 */
	protected void emit_PrimaryExpression_LTTerminalRuleCall_1_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     LT*
	 *
	 * This ambiguous syntax occurs at:
	 *     params=Parameters (ambiguity) body=Block
	 
	 * </pre>
	 */
	protected void emit_PrimaryExpression_LTTerminalRuleCall_1_4_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     LT*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) directives+=ProgramDirective
	 *     directives+=ProgramDirective (ambiguity) directives+=ProgramDirective
	 
	 * </pre>
	 */
	protected void emit_Program_LTTerminalRuleCall_1_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     LT*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 *     directives+=ProgramDirective (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Program_LTTerminalRuleCall_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     LT*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '.' (ambiguity) name=ID
	 
	 * </pre>
	 */
	protected void emit_PropertyOperator_LTTerminalRuleCall_0_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     LT*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '[' (ambiguity) expressions=ListExpression
	 
	 * </pre>
	 */
	protected void emit_PropertyOperator_LTTerminalRuleCall_1_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     LT*
	 *
	 * This ambiguous syntax occurs at:
	 *     expressions=ListExpression (ambiguity) ']' (rule end)
	 
	 * </pre>
	 */
	protected void emit_PropertyOperator_LTTerminalRuleCall_1_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ';' | LT
	 *
	 * This ambiguous syntax occurs at:
	 *     expression=PostfixExpression (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Statement_LTTerminalRuleCall_1_2_1_or_SemicolonKeyword_1_2_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
