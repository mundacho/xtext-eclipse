/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalBug304681TestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
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
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.Bug304681TestLanguageGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private Bug304681TestLanguageGrammarAccess grammarAccess;

    public InternalBug304681TestLanguageParser(TokenStream input, Bug304681TestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected Bug304681TestLanguageGrammarAccess getGrammarAccess() {
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
			otherlv_0='1'
			{
				newLeafNode(otherlv_0, grammarAccess.getModelAccess().getDigitOneKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getDefinitionPackageDefinitionParserRuleCall_0_1_0());
					}
					lv_definition_1_0=rulePackageDefinition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						set(
							$current,
							"definition",
							lv_definition_1_0,
							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug304681TestLanguage.PackageDefinition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_2='2'
			{
				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getDigitTwoKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getDefinitionPackageDefinition2ParserRuleCall_1_1_0());
					}
					lv_definition_3_0=rulePackageDefinition2
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						set(
							$current,
							"definition",
							lv_definition_3_0,
							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug304681TestLanguage.PackageDefinition2");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRulePackageDefinition
entryRulePackageDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPackageDefinitionRule()); }
	iv_rulePackageDefinition=rulePackageDefinition
	{ $current=$iv_rulePackageDefinition.current; }
	EOF;

// Rule PackageDefinition
rulePackageDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getPackageDefinitionAccess().getPackageDefinitionAction_0(),
					$current);
			}
		)
		otherlv_1='package'
		{
			newLeafNode(otherlv_1, grammarAccess.getPackageDefinitionAccess().getPackageKeyword_1());
		}
		(
			(
				lv_namespace_2_0=RULE_ID
				{
					newLeafNode(lv_namespace_2_0, grammarAccess.getPackageDefinitionAccess().getNamespaceIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPackageDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"namespace",
						lv_namespace_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getPackageDefinitionAccess().getSemicolonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getContentsObjectParserRuleCall_4_0());
				}
				lv_contents_4_0=ruleObject
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
					}
					add(
						$current,
						"contents",
						lv_contents_4_0,
						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug304681TestLanguage.Object");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleObject
entryRuleObject returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getObjectAccess().getUnorderedGroup_5()
	);
}:
	{ newCompositeNode(grammarAccess.getObjectRule()); }
	iv_ruleObject=ruleObject
	{ $current=$iv_ruleObject.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule Object
ruleObject returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getObjectAccess().getUnorderedGroup_5()
	);
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_enabled_0_0='enabled'
					{
						newLeafNode(lv_enabled_0_0, grammarAccess.getObjectAccess().getEnabledEnabledKeyword_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getObjectRule());
						}
						setWithLastConsumed($current, "enabled", lv_enabled_0_0 != null, "enabled");
					}
				)
			)
			    |
			(
				(
					lv_abstract_1_0='abstract'
					{
						newLeafNode(lv_abstract_1_0, grammarAccess.getObjectAccess().getAbstractAbstractKeyword_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getObjectRule());
						}
						setWithLastConsumed($current, "abstract", lv_abstract_1_0 != null, "abstract");
					}
				)
			)
		)?
		otherlv_2='object'
		{
			newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getObjectKeyword_1());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObjectRule());
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
				newLeafNode(otherlv_4, grammarAccess.getObjectAccess().getExtendsKeyword_3_0());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getObjectRule());
						}
					}
					otherlv_5=RULE_ID
					{
						newLeafNode(otherlv_5, grammarAccess.getObjectAccess().getParentObjectCrossReference_3_1_0());
					}
				)
			)
		)?
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getObjectAccess().getUnorderedGroup_5());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 0);
					}
								({true}?=>(otherlv_8='shortDescription'
								{
									newLeafNode(otherlv_8, grammarAccess.getObjectAccess().getShortDescriptionKeyword_5_0_0());
								}
								(
									(
										lv_shortDescription_9_0=RULE_STRING
										{
											newLeafNode(lv_shortDescription_9_0, grammarAccess.getObjectAccess().getShortDescriptionSTRINGTerminalRuleCall_5_0_1_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getObjectRule());
											}
											setWithLastConsumed(
												$current,
												"shortDescription",
												lv_shortDescription_9_0,
												"org.eclipse.xtext.common.Terminals.STRING");
										}
									)
								)
								otherlv_10=';'
								{
									newLeafNode(otherlv_10, grammarAccess.getObjectAccess().getSemicolonKeyword_5_0_2());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getObjectAccess().getUnorderedGroup_5());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 1);
					}
								({true}?=>(otherlv_11='longDescription'
								{
									newLeafNode(otherlv_11, grammarAccess.getObjectAccess().getLongDescriptionKeyword_5_1_0());
								}
								(
									(
										lv_longDescription_12_0=RULE_STRING
										{
											newLeafNode(lv_longDescription_12_0, grammarAccess.getObjectAccess().getLongDescriptionSTRINGTerminalRuleCall_5_1_1_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getObjectRule());
											}
											setWithLastConsumed(
												$current,
												"longDescription",
												lv_longDescription_12_0,
												"org.eclipse.xtext.common.Terminals.STRING");
										}
									)
								)
								otherlv_13=';'
								{
									newLeafNode(otherlv_13, grammarAccess.getObjectAccess().getSemicolonKeyword_5_1_2());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getObjectAccess().getUnorderedGroup_5());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 2);
					}
								({true}?=>(otherlv_14='serialUID'
								{
									newLeafNode(otherlv_14, grammarAccess.getObjectAccess().getSerialUIDKeyword_5_2_0());
								}
								(
									(
										lv_serialVersionUID_15_0=RULE_INT
										{
											newLeafNode(lv_serialVersionUID_15_0, grammarAccess.getObjectAccess().getSerialVersionUIDINTTerminalRuleCall_5_2_1_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getObjectRule());
											}
											setWithLastConsumed(
												$current,
												"serialVersionUID",
												lv_serialVersionUID_15_0,
												"org.eclipse.xtext.common.Terminals.INT");
										}
									)
								)
								otherlv_16=';'
								{
									newLeafNode(otherlv_16, grammarAccess.getObjectAccess().getSemicolonKeyword_5_2_2());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getObjectAccess().getUnorderedGroup_5());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 3)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 3);
					}
								({true}?=>((
									(
										lv_cloneable_17_0='cloneable'
										{
											newLeafNode(lv_cloneable_17_0, grammarAccess.getObjectAccess().getCloneableCloneableKeyword_5_3_0_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getObjectRule());
											}
											setWithLastConsumed($current, "cloneable", lv_cloneable_17_0 != null, "cloneable");
										}
									)
								)
								otherlv_18=';'
								{
									newLeafNode(otherlv_18, grammarAccess.getObjectAccess().getSemicolonKeyword_5_3_1());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getObjectAccess().getUnorderedGroup_5());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getObjectAccess().getFeaturesFeatureParserRuleCall_5_4_0());
									}
									lv_features_19_0=ruleFeature
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getObjectRule());
										}
										add(
											$current,
											"features",
											lv_features_19_0,
											"org.eclipse.xtext.ui.tests.editor.contentassist.Bug304681TestLanguage.Feature");
										afterParserOrEnumRuleCall();
									}
								)
								))+
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getObjectAccess().getUnorderedGroup_5());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 5)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 5);
					}
								({true}?=>(otherlv_20='before'
								{
									newLeafNode(otherlv_20, grammarAccess.getObjectAccess().getBeforeKeyword_5_5_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getObjectAccess().getFeaturesFeatureParserRuleCall_5_5_1_0());
										}
										lv_features_21_0=ruleFeature
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getObjectRule());
											}
											add(
												$current,
												"features",
												lv_features_21_0,
												"org.eclipse.xtext.ui.tests.editor.contentassist.Bug304681TestLanguage.Feature");
											afterParserOrEnumRuleCall();
										}
									)
								)*
								otherlv_22='after'
								{
									newLeafNode(otherlv_22, grammarAccess.getObjectAccess().getAfterKeyword_5_5_2());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getObjectAccess().getUnorderedGroup_5());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 6)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 6);
					}
								({true}?=>(otherlv_23='optionalLoop'
								{
									newLeafNode(otherlv_23, grammarAccess.getObjectAccess().getOptionalLoopKeyword_5_6_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getObjectAccess().getFeaturesFeatureParserRuleCall_5_6_1_0());
										}
										lv_features_24_0=ruleFeature
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getObjectRule());
											}
											add(
												$current,
												"features",
												lv_features_24_0,
												"org.eclipse.xtext.ui.tests.editor.contentassist.Bug304681TestLanguage.Feature");
											afterParserOrEnumRuleCall();
										}
									)
								)*
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getObjectAccess().getUnorderedGroup_5());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 7)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 7);
					}
								({true}?=>(otherlv_25='mandatoryLoop'
								{
									newLeafNode(otherlv_25, grammarAccess.getObjectAccess().getMandatoryLoopKeyword_5_7_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getObjectAccess().getFeaturesFeatureParserRuleCall_5_7_1_0());
										}
										lv_features_26_0=ruleFeature
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getObjectRule());
											}
											add(
												$current,
												"features",
												lv_features_26_0,
												"org.eclipse.xtext.ui.tests.editor.contentassist.Bug304681TestLanguage.Feature");
											afterParserOrEnumRuleCall();
										}
									)
								)+
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getObjectAccess().getUnorderedGroup_5());
					}
				)
			)
					)*
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getObjectAccess().getUnorderedGroup_5());
				}
		)
		otherlv_27='}'
		{
			newLeafNode(otherlv_27, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_6());
		}
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	iv_ruleFeature=ruleFeature
	{ $current=$iv_ruleFeature.current; }
	EOF;

// Rule Feature
ruleFeature returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0());
		}
		this_Attribute_0=ruleAttribute
		{
			$current = $this_Attribute_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getFeatureAccess().getReferenceParserRuleCall_1());
		}
		this_Reference_1=ruleReference
		{
			$current = $this_Reference_1.current;
			afterParserOrEnumRuleCall();
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
		otherlv_0='Attribute'
		{
			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
		}
		(
			(
				lv_type_1_0=RULE_ID
				{
					newLeafNode(lv_type_1_0, grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"type",
						lv_type_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
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
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleReference
entryRuleReference returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1()
	);
}:
	{ newCompositeNode(grammarAccess.getReferenceRule()); }
	iv_ruleReference=ruleReference
	{ $current=$iv_ruleReference.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule Reference
ruleReference returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1()
	);
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Reference'
		{
			newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getReferenceKeyword_0());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReferenceRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getTypeObjectCrossReference_1_0());
				}
			)
		)
		(
			(
				lv_many_2_0='*'
				{
					newLeafNode(lv_many_2_0, grammarAccess.getReferenceAccess().getManyAsteriskKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReferenceRule());
					}
					setWithLastConsumed($current, "many", lv_many_2_0 != null, "*");
				}
			)
		)?
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReferenceRule());
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
			(
				otherlv_4='{'
				{
					newLeafNode(otherlv_4, grammarAccess.getReferenceAccess().getLeftCurlyBracketKeyword_4_0_0());
				}
				(
					(
						{ 
						  getUnorderedGroupHelper().enter(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1());
						}
						(
							(
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1(), 0)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1(), 0);
							}
										({true}?=>(otherlv_6='shortDescription'
										{
											newLeafNode(otherlv_6, grammarAccess.getReferenceAccess().getShortDescriptionKeyword_4_0_1_0_0());
										}
										(
											(
												lv_shortDescription_7_0=RULE_STRING
												{
													newLeafNode(lv_shortDescription_7_0, grammarAccess.getReferenceAccess().getShortDescriptionSTRINGTerminalRuleCall_4_0_1_0_1_0());
												}
												{
													if ($current==null) {
														$current = createModelElement(grammarAccess.getReferenceRule());
													}
													setWithLastConsumed(
														$current,
														"shortDescription",
														lv_shortDescription_7_0,
														"org.eclipse.xtext.common.Terminals.STRING");
												}
											)
										)
										otherlv_8=';'
										{
											newLeafNode(otherlv_8, grammarAccess.getReferenceAccess().getSemicolonKeyword_4_0_1_0_2());
										}
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1(), 1)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1(), 1);
							}
										({true}?=>(otherlv_9='longDescription'
										{
											newLeafNode(otherlv_9, grammarAccess.getReferenceAccess().getLongDescriptionKeyword_4_0_1_1_0());
										}
										(
											(
												lv_longDescription_10_0=RULE_STRING
												{
													newLeafNode(lv_longDescription_10_0, grammarAccess.getReferenceAccess().getLongDescriptionSTRINGTerminalRuleCall_4_0_1_1_1_0());
												}
												{
													if ($current==null) {
														$current = createModelElement(grammarAccess.getReferenceRule());
													}
													setWithLastConsumed(
														$current,
														"longDescription",
														lv_longDescription_10_0,
														"org.eclipse.xtext.common.Terminals.STRING");
												}
											)
										)
										otherlv_11=';'
										{
											newLeafNode(otherlv_11, grammarAccess.getReferenceAccess().getSemicolonKeyword_4_0_1_1_2());
										}
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1());
							}
						)
					)
							)*
						)
					)
						{ 
						  getUnorderedGroupHelper().leave(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1());
						}
				)
				otherlv_12='}'
				{
					newLeafNode(otherlv_12, grammarAccess.getReferenceAccess().getRightCurlyBracketKeyword_4_0_2());
				}
			)
			    |
			otherlv_13=';'
			{
				newLeafNode(otherlv_13, grammarAccess.getReferenceAccess().getSemicolonKeyword_4_1());
			}
		)
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRulePackageDefinition2
entryRulePackageDefinition2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPackageDefinition2Rule()); }
	iv_rulePackageDefinition2=rulePackageDefinition2
	{ $current=$iv_rulePackageDefinition2.current; }
	EOF;

// Rule PackageDefinition2
rulePackageDefinition2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getPackageDefinition2Access().getPackageDefinitionAction_0(),
					$current);
			}
		)
		otherlv_1='package'
		{
			newLeafNode(otherlv_1, grammarAccess.getPackageDefinition2Access().getPackageKeyword_1());
		}
		(
			(
				lv_namespace_2_0=RULE_ID
				{
					newLeafNode(lv_namespace_2_0, grammarAccess.getPackageDefinition2Access().getNamespaceIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPackageDefinition2Rule());
					}
					setWithLastConsumed(
						$current,
						"namespace",
						lv_namespace_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getPackageDefinition2Access().getSemicolonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPackageDefinition2Access().getContentsObject2ParserRuleCall_4_0());
				}
				lv_contents_4_0=ruleObject2
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPackageDefinition2Rule());
					}
					add(
						$current,
						"contents",
						lv_contents_4_0,
						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug304681TestLanguage.Object2");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleObject2
entryRuleObject2 returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getObject2Access().getUnorderedGroup_5()
	);
}:
	{ newCompositeNode(grammarAccess.getObject2Rule()); }
	iv_ruleObject2=ruleObject2
	{ $current=$iv_ruleObject2.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule Object2
ruleObject2 returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getObject2Access().getUnorderedGroup_5()
	);
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_enabled_0_0='enabled'
					{
						newLeafNode(lv_enabled_0_0, grammarAccess.getObject2Access().getEnabledEnabledKeyword_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getObject2Rule());
						}
						setWithLastConsumed($current, "enabled", lv_enabled_0_0 != null, "enabled");
					}
				)
			)
			    |
			(
				(
					lv_abstract_1_0='abstract'
					{
						newLeafNode(lv_abstract_1_0, grammarAccess.getObject2Access().getAbstractAbstractKeyword_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getObject2Rule());
						}
						setWithLastConsumed($current, "abstract", lv_abstract_1_0 != null, "abstract");
					}
				)
			)
		)?
		otherlv_2='object'
		{
			newLeafNode(otherlv_2, grammarAccess.getObject2Access().getObjectKeyword_1());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getObject2Access().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObject2Rule());
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
				newLeafNode(otherlv_4, grammarAccess.getObject2Access().getExtendsKeyword_3_0());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getObject2Rule());
						}
					}
					otherlv_5=RULE_ID
					{
						newLeafNode(otherlv_5, grammarAccess.getObject2Access().getParentObjectCrossReference_3_1_0());
					}
				)
			)
		)?
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getObject2Access().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getObject2Access().getUnorderedGroup_5());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getObject2Access().getUnorderedGroup_5(), 0);
					}
								({true}?=>(otherlv_8='shortDescription'
								{
									newLeafNode(otherlv_8, grammarAccess.getObject2Access().getShortDescriptionKeyword_5_0_0());
								}
								(
									(
										lv_shortDescription_9_0=RULE_STRING
										{
											newLeafNode(lv_shortDescription_9_0, grammarAccess.getObject2Access().getShortDescriptionSTRINGTerminalRuleCall_5_0_1_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getObject2Rule());
											}
											setWithLastConsumed(
												$current,
												"shortDescription",
												lv_shortDescription_9_0,
												"org.eclipse.xtext.common.Terminals.STRING");
										}
									)
								)
								otherlv_10=';'
								{
									newLeafNode(otherlv_10, grammarAccess.getObject2Access().getSemicolonKeyword_5_0_2());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getObject2Access().getUnorderedGroup_5());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getObject2Access().getUnorderedGroup_5(), 1);
					}
								({true}?=>(otherlv_11='longDescription'
								{
									newLeafNode(otherlv_11, grammarAccess.getObject2Access().getLongDescriptionKeyword_5_1_0());
								}
								(
									(
										lv_longDescription_12_0=RULE_STRING
										{
											newLeafNode(lv_longDescription_12_0, grammarAccess.getObject2Access().getLongDescriptionSTRINGTerminalRuleCall_5_1_1_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getObject2Rule());
											}
											setWithLastConsumed(
												$current,
												"longDescription",
												lv_longDescription_12_0,
												"org.eclipse.xtext.common.Terminals.STRING");
										}
									)
								)
								otherlv_13=';'
								{
									newLeafNode(otherlv_13, grammarAccess.getObject2Access().getSemicolonKeyword_5_1_2());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getObject2Access().getUnorderedGroup_5());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getObject2Access().getUnorderedGroup_5(), 2);
					}
								({true}?=>(otherlv_14='serialUID'
								{
									newLeafNode(otherlv_14, grammarAccess.getObject2Access().getSerialUIDKeyword_5_2_0());
								}
								(
									(
										lv_serialVersionUID_15_0=RULE_INT
										{
											newLeafNode(lv_serialVersionUID_15_0, grammarAccess.getObject2Access().getSerialVersionUIDINTTerminalRuleCall_5_2_1_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getObject2Rule());
											}
											setWithLastConsumed(
												$current,
												"serialVersionUID",
												lv_serialVersionUID_15_0,
												"org.eclipse.xtext.common.Terminals.INT");
										}
									)
								)
								otherlv_16=';'
								{
									newLeafNode(otherlv_16, grammarAccess.getObject2Access().getSemicolonKeyword_5_2_2());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getObject2Access().getUnorderedGroup_5());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 3)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getObject2Access().getUnorderedGroup_5(), 3);
					}
								({true}?=>((
									(
										lv_cloneable_17_0='cloneable'
										{
											newLeafNode(lv_cloneable_17_0, grammarAccess.getObject2Access().getCloneableCloneableKeyword_5_3_0_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getObject2Rule());
											}
											setWithLastConsumed($current, "cloneable", lv_cloneable_17_0 != null, "cloneable");
										}
									)
								)
								otherlv_18=';'
								{
									newLeafNode(otherlv_18, grammarAccess.getObject2Access().getSemicolonKeyword_5_3_1());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getObject2Access().getUnorderedGroup_5());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 4)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getObject2Access().getUnorderedGroup_5(), 4);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getObject2Access().getFeaturesFeature2ParserRuleCall_5_4_0());
									}
									lv_features_19_0=ruleFeature2
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getObject2Rule());
										}
										add(
											$current,
											"features",
											lv_features_19_0,
											"org.eclipse.xtext.ui.tests.editor.contentassist.Bug304681TestLanguage.Feature2");
										afterParserOrEnumRuleCall();
									}
								)
								))+
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getObject2Access().getUnorderedGroup_5());
					}
				)
			)
					)*
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getObject2Access().getUnorderedGroup_5());
				}
		)
		otherlv_20='}'
		{
			newLeafNode(otherlv_20, grammarAccess.getObject2Access().getRightCurlyBracketKeyword_6());
		}
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRuleFeature2
entryRuleFeature2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeature2Rule()); }
	iv_ruleFeature2=ruleFeature2
	{ $current=$iv_ruleFeature2.current; }
	EOF;

// Rule Feature2
ruleFeature2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getFeature2Access().getAttribute2ParserRuleCall_0());
		}
		this_Attribute2_0=ruleAttribute2
		{
			$current = $this_Attribute2_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getFeature2Access().getReference2ParserRuleCall_1());
		}
		this_Reference2_1=ruleReference2
		{
			$current = $this_Reference2_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAttribute2
entryRuleAttribute2 returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1()
	);
}:
	{ newCompositeNode(grammarAccess.getAttribute2Rule()); }
	iv_ruleAttribute2=ruleAttribute2
	{ $current=$iv_ruleAttribute2.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule Attribute2
ruleAttribute2 returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1()
	);
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Attribute'
		{
			newLeafNode(otherlv_0, grammarAccess.getAttribute2Access().getAttributeKeyword_0());
		}
		(
			(
				lv_type_1_0=RULE_ID
				{
					newLeafNode(lv_type_1_0, grammarAccess.getAttribute2Access().getTypeIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttribute2Rule());
					}
					setWithLastConsumed(
						$current,
						"type",
						lv_type_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getAttribute2Access().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttribute2Rule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				otherlv_3='{'
				{
					newLeafNode(otherlv_3, grammarAccess.getAttribute2Access().getLeftCurlyBracketKeyword_3_0_0());
				}
				(
					(
						{ 
						  getUnorderedGroupHelper().enter(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1());
						}
						(
							(
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 0)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 0);
							}
										({true}?=>(otherlv_5='shortDescription'
										{
											newLeafNode(otherlv_5, grammarAccess.getAttribute2Access().getShortDescriptionKeyword_3_0_1_0_0());
										}
										(
											(
												lv_shortDescription_6_0=RULE_STRING
												{
													newLeafNode(lv_shortDescription_6_0, grammarAccess.getAttribute2Access().getShortDescriptionSTRINGTerminalRuleCall_3_0_1_0_1_0());
												}
												{
													if ($current==null) {
														$current = createModelElement(grammarAccess.getAttribute2Rule());
													}
													setWithLastConsumed(
														$current,
														"shortDescription",
														lv_shortDescription_6_0,
														"org.eclipse.xtext.common.Terminals.STRING");
												}
											)
										)
										otherlv_7=';'
										{
											newLeafNode(otherlv_7, grammarAccess.getAttribute2Access().getSemicolonKeyword_3_0_1_0_2());
										}
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 1)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 1);
							}
										({true}?=>(otherlv_8='longDescription'
										{
											newLeafNode(otherlv_8, grammarAccess.getAttribute2Access().getLongDescriptionKeyword_3_0_1_1_0());
										}
										(
											(
												lv_longDescription_9_0=RULE_STRING
												{
													newLeafNode(lv_longDescription_9_0, grammarAccess.getAttribute2Access().getLongDescriptionSTRINGTerminalRuleCall_3_0_1_1_1_0());
												}
												{
													if ($current==null) {
														$current = createModelElement(grammarAccess.getAttribute2Rule());
													}
													setWithLastConsumed(
														$current,
														"longDescription",
														lv_longDescription_9_0,
														"org.eclipse.xtext.common.Terminals.STRING");
												}
											)
										)
										otherlv_10=';'
										{
											newLeafNode(otherlv_10, grammarAccess.getAttribute2Access().getSemicolonKeyword_3_0_1_1_2());
										}
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 2)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 2);
							}
										({true}?=>((
											{
												newCompositeNode(grammarAccess.getAttribute2Access().getConstraintDefinitionsConstraintDefinitionParserRuleCall_3_0_1_2_0());
											}
											lv_constraintDefinitions_11_0=ruleConstraintDefinition
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getAttribute2Rule());
												}
												add(
													$current,
													"constraintDefinitions",
													lv_constraintDefinitions_11_0,
													"org.eclipse.xtext.ui.tests.editor.contentassist.Bug304681TestLanguage.ConstraintDefinition");
												afterParserOrEnumRuleCall();
											}
										)
										))+
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 3)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 3);
							}
										({true}?=>((
											(
												lv_required_12_0='required'
												{
													newLeafNode(lv_required_12_0, grammarAccess.getAttribute2Access().getRequiredRequiredKeyword_3_0_1_3_0_0());
												}
												{
													if ($current==null) {
														$current = createModelElement(grammarAccess.getAttribute2Rule());
													}
													setWithLastConsumed($current, "required", lv_required_12_0 != null, "required");
												}
											)
										)
										otherlv_13=';'
										{
											newLeafNode(otherlv_13, grammarAccess.getAttribute2Access().getSemicolonKeyword_3_0_1_3_1());
										}
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 4)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 4);
							}
										({true}?=>((
											(
												lv_technical_14_0='technical'
												{
													newLeafNode(lv_technical_14_0, grammarAccess.getAttribute2Access().getTechnicalTechnicalKeyword_3_0_1_4_0_0());
												}
												{
													if ($current==null) {
														$current = createModelElement(grammarAccess.getAttribute2Rule());
													}
													setWithLastConsumed($current, "technical", lv_technical_14_0 != null, "technical");
												}
											)
										)
										otherlv_15=';'
										{
											newLeafNode(otherlv_15, grammarAccess.getAttribute2Access().getSemicolonKeyword_3_0_1_4_1());
										}
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1());
							}
						)
					)
							)*
						)
					)
						{ 
						  getUnorderedGroupHelper().leave(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1());
						}
				)
				otherlv_16='}'
				{
					newLeafNode(otherlv_16, grammarAccess.getAttribute2Access().getRightCurlyBracketKeyword_3_0_2());
				}
			)
			    |
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getAttribute2Access().getSemicolonKeyword_3_1());
			}
		)
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRuleReference2
entryRuleReference2 returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getReference2Access().getUnorderedGroup_4_0_1()
	);
}:
	{ newCompositeNode(grammarAccess.getReference2Rule()); }
	iv_ruleReference2=ruleReference2
	{ $current=$iv_ruleReference2.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule Reference2
ruleReference2 returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getReference2Access().getUnorderedGroup_4_0_1()
	);
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Reference'
		{
			newLeafNode(otherlv_0, grammarAccess.getReference2Access().getReferenceKeyword_0());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReference2Rule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getReference2Access().getTypeObjectCrossReference_1_0());
				}
			)
		)
		(
			(
				lv_many_2_0='*'
				{
					newLeafNode(lv_many_2_0, grammarAccess.getReference2Access().getManyAsteriskKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReference2Rule());
					}
					setWithLastConsumed($current, "many", lv_many_2_0 != null, "*");
				}
			)
		)?
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getReference2Access().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReference2Rule());
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
			(
				otherlv_4='{'
				{
					newLeafNode(otherlv_4, grammarAccess.getReference2Access().getLeftCurlyBracketKeyword_4_0_0());
				}
				(
					(
						{ 
						  getUnorderedGroupHelper().enter(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1());
						}
						(
							(
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1(), 0)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1(), 0);
							}
										({true}?=>(otherlv_6='shortDescription'
										{
											newLeafNode(otherlv_6, grammarAccess.getReference2Access().getShortDescriptionKeyword_4_0_1_0_0());
										}
										(
											(
												lv_shortDescription_7_0=RULE_STRING
												{
													newLeafNode(lv_shortDescription_7_0, grammarAccess.getReference2Access().getShortDescriptionSTRINGTerminalRuleCall_4_0_1_0_1_0());
												}
												{
													if ($current==null) {
														$current = createModelElement(grammarAccess.getReference2Rule());
													}
													setWithLastConsumed(
														$current,
														"shortDescription",
														lv_shortDescription_7_0,
														"org.eclipse.xtext.common.Terminals.STRING");
												}
											)
										)
										otherlv_8=';'
										{
											newLeafNode(otherlv_8, grammarAccess.getReference2Access().getSemicolonKeyword_4_0_1_0_2());
										}
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1(), 1)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1(), 1);
							}
										({true}?=>(otherlv_9='longDescription'
										{
											newLeafNode(otherlv_9, grammarAccess.getReference2Access().getLongDescriptionKeyword_4_0_1_1_0());
										}
										(
											(
												lv_longDescription_10_0=RULE_STRING
												{
													newLeafNode(lv_longDescription_10_0, grammarAccess.getReference2Access().getLongDescriptionSTRINGTerminalRuleCall_4_0_1_1_1_0());
												}
												{
													if ($current==null) {
														$current = createModelElement(grammarAccess.getReference2Rule());
													}
													setWithLastConsumed(
														$current,
														"longDescription",
														lv_longDescription_10_0,
														"org.eclipse.xtext.common.Terminals.STRING");
												}
											)
										)
										otherlv_11=';'
										{
											newLeafNode(otherlv_11, grammarAccess.getReference2Access().getSemicolonKeyword_4_0_1_1_2());
										}
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1());
							}
						)
					)
							)*
						)
					)
						{ 
						  getUnorderedGroupHelper().leave(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1());
						}
				)
				otherlv_12='}'
				{
					newLeafNode(otherlv_12, grammarAccess.getReference2Access().getRightCurlyBracketKeyword_4_0_2());
				}
			)
			    |
			otherlv_13=';'
			{
				newLeafNode(otherlv_13, grammarAccess.getReference2Access().getSemicolonKeyword_4_1());
			}
		)
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRuleConstraintDefinition
entryRuleConstraintDefinition returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3()
	);
}:
	{ newCompositeNode(grammarAccess.getConstraintDefinitionRule()); }
	iv_ruleConstraintDefinition=ruleConstraintDefinition
	{ $current=$iv_ruleConstraintDefinition.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule ConstraintDefinition
ruleConstraintDefinition returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3()
	);
}
@after {
	leaveRule();
}:
	(
		otherlv_0='constraint'
		{
			newLeafNode(otherlv_0, grammarAccess.getConstraintDefinitionAccess().getConstraintKeyword_0());
		}
		(
			(
				lv_type_1_0=RULE_ID
				{
					newLeafNode(lv_type_1_0, grammarAccess.getConstraintDefinitionAccess().getTypeIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConstraintDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"type",
						lv_type_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getConstraintDefinitionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='parameters'
								{
									newLeafNode(otherlv_4, grammarAccess.getConstraintDefinitionAccess().getParametersKeyword_3_0_0());
								}
								(
									(
										lv_parameters_5_0=RULE_STRING
										{
											newLeafNode(lv_parameters_5_0, grammarAccess.getConstraintDefinitionAccess().getParametersSTRINGTerminalRuleCall_3_0_1_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getConstraintDefinitionRule());
											}
											addWithLastConsumed(
												$current,
												"parameters",
												lv_parameters_5_0,
												"org.eclipse.xtext.common.Terminals.STRING");
										}
									)
								)*
								otherlv_6=';'
								{
									newLeafNode(otherlv_6, grammarAccess.getConstraintDefinitionAccess().getSemicolonKeyword_3_0_2());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_7='message'
								{
									newLeafNode(otherlv_7, grammarAccess.getConstraintDefinitionAccess().getMessageKeyword_3_1_0());
								}
								(
									(
										lv_message_8_0=RULE_STRING
										{
											newLeafNode(lv_message_8_0, grammarAccess.getConstraintDefinitionAccess().getMessageSTRINGTerminalRuleCall_3_1_1_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getConstraintDefinitionRule());
											}
											setWithLastConsumed(
												$current,
												"message",
												lv_message_8_0,
												"org.eclipse.xtext.common.Terminals.STRING");
										}
									)
								)
								otherlv_9=';'
								{
									newLeafNode(otherlv_9, grammarAccess.getConstraintDefinitionAccess().getSemicolonKeyword_3_1_2());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3());
				}
		)
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getConstraintDefinitionAccess().getRightCurlyBracketKeyword_4());
		}
	)
;
finally {
	myUnorderedGroupState.restore();
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
