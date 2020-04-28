
import resources.html_8604_Frames5Helper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author JaspreetSinghC
 */
public class html_8604_Frames5 extends html_8604_Frames5Helper
{
	/**
	 * Script Name   : <b>Frames005</b>
	 * Generated     : <b>04-Feb-2019 12:50:18 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.3  Build 9600 ()
	 * 
	 * @since  2019/02/04
	 * @author JaspreetSinghC
	 */
	public void testMain(Object[] args) 
	{
		startApp("http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html");
		
		// Frame: Java Console
		close().click();
		
		// HTML Browser
		// Document: Frame Example Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html
		// Document: Frame example #5 Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/frame5.htm
		link_linkTestPage().click();
		// Document: Link Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/index.htm
		link_nametest().performTest(nametest_textVP());
		link__99().performTest(_99__99VP());
		link_thisIsTheTitleText().performTest(ThisIsTheTitleText_textVP());
		link_textTaggedAsLinkTest().performTest(TextTaggedAsLinkTest_textVP());
		link_longLinkTestTHisIsTheLong().performTest(LongLinkTestTHisIsTheLongLinkT_textVP());
		link_longLinkTestTHisIsTheLong2().performTest(LongLinkTestTHisIsTheLongLinkT_text_2VP());
		link_nametest().click();
		// Document: Name Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/name.htm
		document_nameTestPage().performTest(NameTestPage_NameTestPageVP());
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).click(atPoint(65,58));
		// Document: Frame Example Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html
		// Document: Link Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/index.htm
		link__99().click();
		// Document: ID Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/id.htm
		document_idTestPage().performTest(IDTestPage_IDTestPageVP());
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).click(atPoint(65,58));
		// Document: Frame Example Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html
		// Document: Link Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/index.htm
		link__LinkTestForHTMLExtension().click();
		// Document: ALT Text Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/alt.htm
		document_altTextTestPage().performTest(ALTTextTestPage_ALTTextTestPageVP());
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).click(atPoint(65,58));
		// Document: Link Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/index.htm
		link__LinkTestForHTMLExtension2().click();
		// Document: No ALT Text Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/noalt.htm
		document_noALTTextTestPage().performTest(NoALTTextTestPage_NoALTTextTestPageVP());
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).click(atPoint(65,59));
		// Document: Link Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/index.htm
		link_nametest2().click();
		// Document: Name & ID Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/nameid.htm
		document_nameIDTestPage().performTest(NameIDTestPage_NameIDTestPageVP());
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).click(atPoint(65,58));
		// Document: Frame Example Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html
		// Document: Link Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/index.htm
		link_nametest3().click();
		// Document: Name, ID and Alt text Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/nameidalt.htm
		document_nameIDAndAltTextTestP().performTest(NameIDAndAltTextTestPage_NameIDAndAltTextTestPageVP());
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).click(atPoint(67,58));
		// Document: Link Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/index.htm
		link_thisIsTheTitleText().click();
		// Document: Title Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/title.htm
		document_titleTestPage().performTest(TitleTestPage_TitleTestPageVP());
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).click(atPoint(65,58));
		// Document: Frame Example Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html
		// Document: Link Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/index.htm
		link_textTaggedAsLinkTest().click();
		// Document: Link Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/link.htm
		document_linkTestPage().performTest(LinkTestPage_LinkTestPageVP());
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).click(atPoint(68,57));
		// Document: Link Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/index.htm
		link_longLinkTestTHisIsTheLong().click();
		// Document: Long Link Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/longlink.htm
		document_longLinkTestPage().performTest(LongLinkTestPage_LongLinkTestPageVP());
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).click(atPoint(66,58));
		// Document: Link Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/index.htm
		link_longLinkTestTHisIsTheLong2().click();
		// Document: The OTHER Long Link Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/longlink2.htm
		document_theOTHERLongLinkTestP().performTest(TheOTHERLongLinkTestPage_TheOTHERLongLinkTestPageVP());
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).click(atPoint(62,57));
		// Document: Link Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/index.htm
		document_linkTestPage2().drag(atPoint(1373,661), atPoint(1365,762));
		document_linkTestPage2().performTest(LinkTestPage_LinkTestPage_2VP());
		image_offer().performTest(offer_offerVP());
		link__WhatSMyCarWorth().performTest(_WhatSMyCarWorth_textVP());
		table_htmlTable_0().performTest(HtmlTable_0_gridVP());
		image_offer2().performTest(offer_offer_2VP());
		link_whatSMyCarWorthIsItWorthS().performTest(WhatSMyCarWorthIsItWorthSellin_textVP());
		
		/* Failures below - could not fix
		
		link__WhatSMyCarWorth().click();
		// Document: HREF, IMG Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/hrefimg.htm
		document_hrefimgTestPage().performTest(HREFIMGTestPage_HREFIMGTestPageVP());
		button_backButton(browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS),DEFAULT_FLAGS).click();
		// Document: Frame Example Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html
		// Document: Link Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/index.htm
		link_whatSMyCarWorthIsItWorthS().click();
		// Document: HREF, IMG Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/hrefimg.htm
		document_hrefimgTestPage().performTest(HREFIMGTestPage_HREFIMGTestPage_2VP());
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).click(atPoint(67,57));
		// Document: Link Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/index.htm
		link_whatSMyCarWorthIsItWorthS().click();
		// Document: HREF, IMG Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/hrefimg.htm
		document_hrefimgTestPage().performTest(HREFIMGTestPage_HREFIMGTestPage_3VP());
		
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).click(atPoint(65,60));
		*/
		
		
		// Document: Link Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/link_tests/index.htm
		document_linkTestPage2().drag(atPoint(1373,730), atPoint(1364,824));
		image_regionalGardeningMap().performTest(regionalGardeningMap_regionalGardeningMapVP());
		image_areYouHungryIAm().performTest(AreYouHungryIAm_AreYouHungryIAmVP());
		table_htmlTable_1().performTest(HtmlTable_1_gridVP());
		document_linkTestPage2().drag(atPoint(1371,830), atPoint(1373,869));
		image_hamburger().performTest(hamburger_hamburgerVP());
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).close();
	}
}

