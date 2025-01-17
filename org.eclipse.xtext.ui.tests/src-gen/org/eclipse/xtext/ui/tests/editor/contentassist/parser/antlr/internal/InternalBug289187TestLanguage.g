/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalBug289187TestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.ui.tests.editor.contentassist.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.ui.tests.editor.contentassist.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.Bug289187TestLanguageGrammarAccess;

}

@parser::members {

 	private Bug289187TestLanguageGrammarAccess grammarAccess;

    public InternalBug289187TestLanguageParser(TokenStream input, Bug289187TestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected Bug289187TestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getClassesClassParserRuleCall_0());
			}
			lv_classes_0_0=ruleClass
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"classes",
					lv_classes_0_0,
					"org.eclipse.xtext.ui.tests.editor.contentassist.Bug289187TestLanguage.Class");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleClass
entryRuleClass returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassRule()); }
	iv_ruleClass=ruleClass
	{ $current=$iv_ruleClass.current; }
	EOF;

// Rule Class
ruleClass returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_abstract_0_0='abstract'
				{
					newLeafNode(lv_abstract_0_0, grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClassRule());
					}
					setWithLastConsumed($current, "abstract", lv_abstract_0_0 != null, "abstract");
				}
			)
		)?
		(
			(
				lv_transient_1_0='transient'
				{
					newLeafNode(lv_transient_1_0, grammarAccess.getClassAccess().getTransientTransientKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClassRule());
					}
					setWithLastConsumed($current, "transient", lv_transient_1_0 != null, "transient");
				}
			)
		)?
		otherlv_2='class'
		{
			newLeafNode(otherlv_2, grammarAccess.getClassAccess().getClassKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClassRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_4='extends'
			{
				newLeafNode(otherlv_4, grammarAccess.getClassAccess().getExtendsKeyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getClassRule());
						}
					}
					otherlv_5=RULE_ID
					{
						newLeafNode(otherlv_5, grammarAccess.getClassAccess().getSuperClassClassCrossReference_4_1_0());
					}
				)
			)
		)?
		(
			otherlv_6='implements'
			{
				newLeafNode(otherlv_6, grammarAccess.getClassAccess().getImplementsKeyword_5_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getClassRule());
						}
					}
					otherlv_7=RULE_ID
					{
						newLeafNode(otherlv_7, grammarAccess.getClassAccess().getImplementedInterfacesClassCrossReference_5_1_0());
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getClassAccess().getCommaKeyword_5_2_0());
				}
				otherlv_9='implements'
				{
					newLeafNode(otherlv_9, grammarAccess.getClassAccess().getImplementsKeyword_5_2_1());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getClassRule());
							}
						}
						otherlv_10=RULE_ID
						{
							newLeafNode(otherlv_10, grammarAccess.getClassAccess().getImplementedInterfacesClassCrossReference_5_2_2_0());
						}
					)
				)
			)*
		)?
		otherlv_11='{'
		{
			newLeafNode(otherlv_11, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			otherlv_12='classNumber'
			{
				newLeafNode(otherlv_12, grammarAccess.getClassAccess().getClassNumberKeyword_7_0());
			}
			otherlv_13='='
			{
				newLeafNode(otherlv_13, grammarAccess.getClassAccess().getEqualsSignKeyword_7_1());
			}
			(
				(
					lv_classNumber_14_0=RULE_INT
					{
						newLeafNode(lv_classNumber_14_0, grammarAccess.getClassAccess().getClassNumberINTTerminalRuleCall_7_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getClassRule());
						}
						setWithLastConsumed(
							$current,
							"classNumber",
							lv_classNumber_14_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)?
		(
			otherlv_15='quid'
			{
				newLeafNode(otherlv_15, grammarAccess.getClassAccess().getQuidKeyword_8_0());
			}
			otherlv_16='='
			{
				newLeafNode(otherlv_16, grammarAccess.getClassAccess().getEqualsSignKeyword_8_1());
			}
			(
				(
					lv_quid_17_0=RULE_INT
					{
						newLeafNode(lv_quid_17_0, grammarAccess.getClassAccess().getQuidINTTerminalRuleCall_8_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getClassRule());
						}
						setWithLastConsumed(
							$current,
							"quid",
							lv_quid_17_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)?
		(
			otherlv_18='documentation'
			{
				newLeafNode(otherlv_18, grammarAccess.getClassAccess().getDocumentationKeyword_9_0());
			}
			otherlv_19='='
			{
				newLeafNode(otherlv_19, grammarAccess.getClassAccess().getEqualsSignKeyword_9_1());
			}
			(
				(
					lv_documentation_20_0=RULE_STRING
					{
						newLeafNode(lv_documentation_20_0, grammarAccess.getClassAccess().getDocumentationSTRINGTerminalRuleCall_9_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getClassRule());
						}
						setWithLastConsumed(
							$current,
							"documentation",
							lv_documentation_20_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_10_0());
				}
				lv_attributes_21_0=ruleAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassRule());
					}
					add(
						$current,
						"attributes",
						lv_attributes_21_0,
						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug289187TestLanguage.Attribute");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getClassAccess().getOperationsOperationParserRuleCall_11_0());
				}
				lv_operations_22_0=ruleOperation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassRule());
					}
					add(
						$current,
						"operations",
						lv_operations_22_0,
						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug289187TestLanguage.Operation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_23='}'
		{
			newLeafNode(otherlv_23, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_12());
		}
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_0_0());
				}
				lv_visibility_0_0=ruleVisibility
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"visibility",
						lv_visibility_0_0,
						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug289187TestLanguage.Visibility");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_1='attribute'
		{
			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttributeKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleOperation
entryRuleOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOperationRule()); }
	iv_ruleOperation=ruleOperation
	{ $current=$iv_ruleOperation.current; }
	EOF;

// Rule Operation
ruleOperation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getOperationAccess().getVisibilityVisibilityEnumRuleCall_0_0());
				}
				lv_visibility_0_0=ruleVisibility
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOperationRule());
					}
					set(
						$current,
						"visibility",
						lv_visibility_0_0,
						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug289187TestLanguage.Visibility");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_1='operation'
		{
			newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getOperationKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOperationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Rule Visibility
ruleVisibility returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='PRIVATE'
			{
				$current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='PROTECTED'
			{
				$current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='PACKAGE_PRIVATE'
			{
				$current = grammarAccess.getVisibilityAccess().getPACKAGE_PRIVATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPACKAGE_PRIVATEEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='PUBLIC'
			{
				$current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_3());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
