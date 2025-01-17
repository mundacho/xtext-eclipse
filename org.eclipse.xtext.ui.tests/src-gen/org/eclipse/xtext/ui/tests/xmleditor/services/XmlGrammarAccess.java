/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.ui.tests.xmleditor.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class XmlGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class XmlDocumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.xmleditor.Xml.XmlDocument");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cXmlDocumentAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cContentsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cContentsContentParserRuleCall_1_0 = (RuleCall)cContentsAssignment_1.eContents().get(0);
		
		///*
		// * This grammar definition is based on the following tutorial:
		// * https://theantlrguy.atlassian.net/wiki/spaces/ANTLR3/pages/2687107/Parsing+XML
		// */
		//XmlDocument:
		//{XmlDocument}
		//    contents += Content*;
		@Override public ParserRule getRule() { return rule; }
		
		//{XmlDocument}
		//    contents += Content*
		public Group getGroup() { return cGroup; }
		
		//{XmlDocument}
		public Action getXmlDocumentAction_0() { return cXmlDocumentAction_0; }
		
		//contents += Content*
		public Assignment getContentsAssignment_1() { return cContentsAssignment_1; }
		
		//Content
		public RuleCall getContentsContentParserRuleCall_1_0() { return cContentsContentParserRuleCall_1_0; }
	}
	public class ContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.xmleditor.Xml.Content");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cTagAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cTagTagParserRuleCall_0_0 = (RuleCall)cTagAssignment_0.eContents().get(0);
		private final Assignment cTextAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cTextPCDATATerminalRuleCall_1_0 = (RuleCall)cTextAssignment_1.eContents().get(0);
		
		//Content:
		//    tag=Tag | text=PCDATA
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//tag=Tag | text=PCDATA
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//tag=Tag
		public Assignment getTagAssignment_0() { return cTagAssignment_0; }
		
		//Tag
		public RuleCall getTagTagParserRuleCall_0_0() { return cTagTagParserRuleCall_0_0; }
		
		//text=PCDATA
		public Assignment getTextAssignment_1() { return cTextAssignment_1; }
		
		//PCDATA
		public RuleCall getTextPCDATATerminalRuleCall_1_0() { return cTextPCDATATerminalRuleCall_1_0; }
	}
	public class TagElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.xmleditor.Xml.Tag");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTAG_START_OPENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cAttributesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAttributesAttributeParserRuleCall_2_0 = (RuleCall)cAttributesAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final RuleCall cTAG_EMPTY_CLOSETerminalRuleCall_3_0 = (RuleCall)cAlternatives_3.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cAlternatives_3.eContents().get(1);
		private final RuleCall cTAG_CLOSETerminalRuleCall_3_1_0 = (RuleCall)cGroup_3_1.eContents().get(0);
		private final Assignment cContentsAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cContentsContentParserRuleCall_3_1_1_0 = (RuleCall)cContentsAssignment_3_1_1.eContents().get(0);
		private final RuleCall cTAG_END_OPENTerminalRuleCall_3_1_2 = (RuleCall)cGroup_3_1.eContents().get(2);
		private final Assignment cCloseNameAssignment_3_1_3 = (Assignment)cGroup_3_1.eContents().get(3);
		private final RuleCall cCloseNameIDTerminalRuleCall_3_1_3_0 = (RuleCall)cCloseNameAssignment_3_1_3.eContents().get(0);
		private final RuleCall cTAG_CLOSETerminalRuleCall_3_1_4 = (RuleCall)cGroup_3_1.eContents().get(4);
		
		//Tag hidden(WS):
		//    TAG_START_OPEN name=ID attributes+=Attribute*
		//    (
		//        TAG_EMPTY_CLOSE |
		//        TAG_CLOSE contents+=Content* TAG_END_OPEN closeName=ID TAG_CLOSE
		//    )
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//TAG_START_OPEN name=ID attributes+=Attribute*
		//(
		//    TAG_EMPTY_CLOSE |
		//    TAG_CLOSE contents+=Content* TAG_END_OPEN closeName=ID TAG_CLOSE
		//)
		public Group getGroup() { return cGroup; }
		
		//TAG_START_OPEN
		public RuleCall getTAG_START_OPENTerminalRuleCall_0() { return cTAG_START_OPENTerminalRuleCall_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//attributes+=Attribute*
		public Assignment getAttributesAssignment_2() { return cAttributesAssignment_2; }
		
		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_2_0() { return cAttributesAttributeParserRuleCall_2_0; }
		
		//(
		//    TAG_EMPTY_CLOSE |
		//    TAG_CLOSE contents+=Content* TAG_END_OPEN closeName=ID TAG_CLOSE
		//)
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//TAG_EMPTY_CLOSE
		public RuleCall getTAG_EMPTY_CLOSETerminalRuleCall_3_0() { return cTAG_EMPTY_CLOSETerminalRuleCall_3_0; }
		
		//TAG_CLOSE contents+=Content* TAG_END_OPEN closeName=ID TAG_CLOSE
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//TAG_CLOSE
		public RuleCall getTAG_CLOSETerminalRuleCall_3_1_0() { return cTAG_CLOSETerminalRuleCall_3_1_0; }
		
		//contents+=Content*
		public Assignment getContentsAssignment_3_1_1() { return cContentsAssignment_3_1_1; }
		
		//Content
		public RuleCall getContentsContentParserRuleCall_3_1_1_0() { return cContentsContentParserRuleCall_3_1_1_0; }
		
		//TAG_END_OPEN
		public RuleCall getTAG_END_OPENTerminalRuleCall_3_1_2() { return cTAG_END_OPENTerminalRuleCall_3_1_2; }
		
		//closeName=ID
		public Assignment getCloseNameAssignment_3_1_3() { return cCloseNameAssignment_3_1_3; }
		
		//ID
		public RuleCall getCloseNameIDTerminalRuleCall_3_1_3_0() { return cCloseNameIDTerminalRuleCall_3_1_3_0; }
		
		//TAG_CLOSE
		public RuleCall getTAG_CLOSETerminalRuleCall_3_1_4() { return cTAG_CLOSETerminalRuleCall_3_1_4; }
	}
	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.xmleditor.Xml.Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final RuleCall cATTR_EQTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//Attribute: name=ID ATTR_EQ value=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ATTR_EQ value=STRING
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//ATTR_EQ
		public RuleCall getATTR_EQTerminalRuleCall_1() { return cATTR_EQTerminalRuleCall_1; }
		
		//value=STRING
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_0() { return cValueSTRINGTerminalRuleCall_2_0; }
	}
	
	
	private final XmlDocumentElements pXmlDocument;
	private final ContentElements pContent;
	private final TagElements pTag;
	private final AttributeElements pAttribute;
	private final TerminalRule tTAG_START_OPEN;
	private final TerminalRule tTAG_END_OPEN;
	private final TerminalRule tTAG_CLOSE;
	private final TerminalRule tTAG_EMPTY_CLOSE;
	private final TerminalRule tATTR_EQ;
	private final TerminalRule tID;
	private final TerminalRule tSTRING;
	private final TerminalRule tWS;
	private final TerminalRule tPCDATA;
	
	private final Grammar grammar;

	@Inject
	public XmlGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pXmlDocument = new XmlDocumentElements();
		this.pContent = new ContentElements();
		this.pTag = new TagElements();
		this.pAttribute = new AttributeElements();
		this.tTAG_START_OPEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.xmleditor.Xml.TAG_START_OPEN");
		this.tTAG_END_OPEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.xmleditor.Xml.TAG_END_OPEN");
		this.tTAG_CLOSE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.xmleditor.Xml.TAG_CLOSE");
		this.tTAG_EMPTY_CLOSE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.xmleditor.Xml.TAG_EMPTY_CLOSE");
		this.tATTR_EQ = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.xmleditor.Xml.ATTR_EQ");
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.xmleditor.Xml.ID");
		this.tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.xmleditor.Xml.STRING");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.xmleditor.Xml.WS");
		this.tPCDATA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ui.tests.xmleditor.Xml.PCDATA");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.ui.tests.xmleditor.Xml".equals(grammar.getName())) {
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
	

	
	///*
	// * This grammar definition is based on the following tutorial:
	// * https://theantlrguy.atlassian.net/wiki/spaces/ANTLR3/pages/2687107/Parsing+XML
	// */
	//XmlDocument:
	//{XmlDocument}
	//    contents += Content*;
	public XmlDocumentElements getXmlDocumentAccess() {
		return pXmlDocument;
	}
	
	public ParserRule getXmlDocumentRule() {
		return getXmlDocumentAccess().getRule();
	}
	
	//Content:
	//    tag=Tag | text=PCDATA
	//;
	public ContentElements getContentAccess() {
		return pContent;
	}
	
	public ParserRule getContentRule() {
		return getContentAccess().getRule();
	}
	
	//Tag hidden(WS):
	//    TAG_START_OPEN name=ID attributes+=Attribute*
	//    (
	//        TAG_EMPTY_CLOSE |
	//        TAG_CLOSE contents+=Content* TAG_END_OPEN closeName=ID TAG_CLOSE
	//    )
	//;
	public TagElements getTagAccess() {
		return pTag;
	}
	
	public ParserRule getTagRule() {
		return getTagAccess().getRule();
	}
	
	//Attribute: name=ID ATTR_EQ value=STRING;
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}
	
	//terminal TAG_START_OPEN : '<' ;
	public TerminalRule getTAG_START_OPENRule() {
		return tTAG_START_OPEN;
	}
	
	//terminal TAG_END_OPEN: '</';
	public TerminalRule getTAG_END_OPENRule() {
		return tTAG_END_OPEN;
	}
	
	//terminal TAG_CLOSE : '>' ;
	public TerminalRule getTAG_CLOSERule() {
		return tTAG_CLOSE;
	}
	
	//terminal TAG_EMPTY_CLOSE: '/>';
	public TerminalRule getTAG_EMPTY_CLOSERule() {
		return tTAG_EMPTY_CLOSE;
	}
	
	//terminal ATTR_EQ: '=';
	public TerminalRule getATTR_EQRule() {
		return tATTR_EQ;
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return tID;
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return tSTRING;
	}
	
	//terminal WS: (' '|'\r'|'\t'|'\u000C'|'\n')+;
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//terminal PCDATA : (!'<')+ ;
	public TerminalRule getPCDATARule() {
		return tPCDATA;
	}
}
