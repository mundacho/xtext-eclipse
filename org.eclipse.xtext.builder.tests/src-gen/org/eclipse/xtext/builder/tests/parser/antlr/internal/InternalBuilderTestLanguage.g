/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalBuilderTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.builder.tests.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.builder.tests.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.builder.tests.services.BuilderTestLanguageGrammarAccess;

}

@parser::members {

 	private BuilderTestLanguageGrammarAccess grammarAccess;

    public InternalBuilderTestLanguageParser(TokenStream input, BuilderTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "NamedElement";
   	}

   	@Override
   	protected BuilderTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleNamedElement
entryRuleNamedElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNamedElementRule()); }
	iv_ruleNamedElement=ruleNamedElement
	{ $current=$iv_ruleNamedElement.current; }
	EOF;

// Rule NamedElement
ruleNamedElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getNamedElementAccess().getNamespaceParserRuleCall_0());
		}
		this_Namespace_0=ruleNamespace
		{
			$current = $this_Namespace_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNamedElementAccess().getElementParserRuleCall_1());
		}
		this_Element_1=ruleElement
		{
			$current = $this_Element_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleNamespace
entryRuleNamespace returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNamespaceRule()); }
	iv_ruleNamespace=ruleNamespace
	{ $current=$iv_ruleNamespace.current; }
	EOF;

// Rule Namespace
ruleNamespace returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='namespace'
		{
			newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNamespaceAccess().getNameQualifiedNameParserRuleCall_1_0());
				}
				lv_name_1_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNamespaceRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.builder.tests.BuilderTestLanguage.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_3_0());
				}
				lv_imports_3_0=ruleImport
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNamespaceRule());
					}
					add(
						$current,
						"imports",
						lv_imports_3_0,
						"org.eclipse.xtext.builder.tests.BuilderTestLanguage.Import");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getNamespaceAccess().getElementsNamedElementParserRuleCall_4_0());
				}
				lv_elements_4_0=ruleNamedElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNamespaceRule());
					}
					add(
						$current,
						"elements",
						lv_elements_4_0,
						"org.eclipse.xtext.builder.tests.BuilderTestLanguage.NamedElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	iv_ruleImport=ruleImport
	{ $current=$iv_ruleImport.current; }
	EOF;

// Rule Import
ruleImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0());
				}
				lv_importedNamespace_1_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImportRule());
					}
					set(
						$current,
						"importedNamespace",
						lv_importedNamespace_1_0,
						"org.eclipse.xtext.builder.tests.BuilderTestLanguage.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleElement
entryRuleElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementRule()); }
	iv_ruleElement=ruleElement
	{ $current=$iv_ruleElement.current; }
	EOF;

// Rule Element
ruleElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='object'
		{
			newLeafNode(otherlv_0, grammarAccess.getElementAccess().getObjectKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getElementRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='references'
			{
				newLeafNode(otherlv_2, grammarAccess.getElementAccess().getReferencesKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getElementRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getElementAccess().getReferencesElementCrossReference_2_1_0());
					}
					ruleQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_4='otherRefs'
			{
				newLeafNode(otherlv_4, grammarAccess.getElementAccess().getOtherRefsKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getElementRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getElementAccess().getOtherRefsElementCrossReference_3_1_0());
					}
					ruleQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getElementAccess().getCommaKeyword_3_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getElementRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getElementAccess().getOtherRefsElementCrossReference_3_2_1_0());
						}
						ruleQualifiedName
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
