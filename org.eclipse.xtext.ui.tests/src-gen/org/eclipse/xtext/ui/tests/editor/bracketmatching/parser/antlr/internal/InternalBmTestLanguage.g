/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalBmTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.ui.tests.editor.bracketmatching.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.ui.tests.editor.bracketmatching.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.ui.tests.editor.bracketmatching.services.BmTestLanguageGrammarAccess;

}

@parser::members {

 	private BmTestLanguageGrammarAccess grammarAccess;

    public InternalBmTestLanguageParser(TokenStream input, BmTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "File";
   	}

   	@Override
   	protected BmTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleFile
entryRuleFile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFileRule()); }
	iv_ruleFile=ruleFile
	{ $current=$iv_ruleFile.current; }
	EOF;

// Rule File
ruleFile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getFileAccess().getExpressionExpressionParserRuleCall_0());
			}
			lv_expression_0_0=ruleExpression
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getFileRule());
				}
				add(
					$current,
					"expression",
					lv_expression_0_0,
					"org.eclipse.xtext.ui.tests.editor.bracketmatching.BmTestLanguage.Expression");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getSExpressionParserRuleCall_0());
		}
		this_SExpression_0=ruleSExpression
		{
			$current = $this_SExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getAtomParserRuleCall_1());
		}
		this_Atom_1=ruleAtom
		{
			$current = $this_Atom_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			otherlv_2='['
			{
				newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_2_0());
			}
			{
				newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_2_1());
			}
			this_Expression_3=ruleExpression
			{
				$current = $this_Expression_3.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_4=']'
			{
				newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_2_2());
			}
		)
	)
;

// Entry rule entryRuleSExpression
entryRuleSExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSExpressionRule()); }
	iv_ruleSExpression=ruleSExpression
	{ $current=$iv_ruleSExpression.current; }
	EOF;

// Rule SExpression
ruleSExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSExpressionAccess().getSExpressionAction_0(),
					$current);
			}
		)
		(
			(
				otherlv_1='('
				{
					newLeafNode(otherlv_1, grammarAccess.getSExpressionAccess().getLeftParenthesisKeyword_1_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSExpressionAccess().getElementExpressionParserRuleCall_1_0_1_0());
						}
						lv_element_2_0=ruleExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSExpressionRule());
							}
							add(
								$current,
								"element",
								lv_element_2_0,
								"org.eclipse.xtext.ui.tests.editor.bracketmatching.BmTestLanguage.Expression");
							afterParserOrEnumRuleCall();
						}
					)
				)*
				otherlv_3=')'
				{
					newLeafNode(otherlv_3, grammarAccess.getSExpressionAccess().getRightParenthesisKeyword_1_0_2());
				}
			)
			    |
			(
				otherlv_4='begin'
				{
					newLeafNode(otherlv_4, grammarAccess.getSExpressionAccess().getBeginKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSExpressionAccess().getElementExpressionParserRuleCall_1_1_1_0());
						}
						lv_element_5_0=ruleExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSExpressionRule());
							}
							add(
								$current,
								"element",
								lv_element_5_0,
								"org.eclipse.xtext.ui.tests.editor.bracketmatching.BmTestLanguage.Expression");
							afterParserOrEnumRuleCall();
						}
					)
				)*
				otherlv_6='end'
				{
					newLeafNode(otherlv_6, grammarAccess.getSExpressionAccess().getEndKeyword_1_1_2());
				}
			)
		)
	)
;

// Entry rule entryRuleAtom
entryRuleAtom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtomRule()); }
	iv_ruleAtom=ruleAtom
	{ $current=$iv_ruleAtom.current; }
	EOF;

// Rule Atom
ruleAtom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getAtomAccess().getValueVALUEParserRuleCall_0());
			}
			lv_value_0_0=ruleVALUE
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getAtomRule());
				}
				set(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.ui.tests.editor.bracketmatching.BmTestLanguage.VALUE");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleVALUE
entryRuleVALUE returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVALUERule()); }
	iv_ruleVALUE=ruleVALUE
	{ $current=$iv_ruleVALUE.current.getText(); }
	EOF;

// Rule VALUE
ruleVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getVALUEAccess().getIDTerminalRuleCall_0());
		}
		    |
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getVALUEAccess().getINTTerminalRuleCall_1());
		}
		    |
		this_STRING_2=RULE_STRING
		{
			$current.merge(this_STRING_2);
		}
		{
			newLeafNode(this_STRING_2, grammarAccess.getVALUEAccess().getSTRINGTerminalRuleCall_2());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
