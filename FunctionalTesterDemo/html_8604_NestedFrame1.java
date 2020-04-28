
import resources.html_8604_NestedFrame1Helper;
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
public class html_8604_NestedFrame1 extends html_8604_NestedFrame1Helper
{
	/**
	 * Script Name   : <b>NestedFrame</b>
	 * Generated     : <b>04-Feb-2019 5:16:49 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.3  Build 9600 ()
	 * 
	 * @since  2019/02/04
	 * @author JaspreetSinghC
	 */
	public void testMain(Object[] args) 
	{
		startApp("http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/start.htm");
		
		// Frame: Java Console
		//close().click();
		
		// HTML Browser
		// Document: Regression Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/start.htm
		document_regressionTestPage().performTest(RegressionTestPage_RegressionTestPageVP());
		link_modifiedTryitDefect40117().performTest(ModifiedTryitDefect40117_textVP());
		link_nestedFramesSample1Defect().performTest(NestedFramesSample1Defect45282_textVP());
		link_nestedFramesSample2Defect().performTest(NestedFramesSample2Defect45282_textVP());
		link_modifiedTryitDefect40117().click();
		// Document: HTML TryIt: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/40117_modified_tryit/HTMLTryit.htm
		// Document: Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/40117_modified_tryit/welcome.htm
		image_titleGif5000Bytes().performTest(titleGif5000Bytes_titleGif5000BytesVP());
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/40117_modified_tryit/topframe.htm
		document_httpCivcez229NonprodH().performTest(httpCivcez229NonprodHclpnpComA_httpCivcez229NonprodHclpnpComAVP());
		// Document: Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/40117_modified_tryit/welcome.htm
		image_titleGif5000Bytes().performTest(titleGif5000Bytes_titleGif5000Bytes_2VP());
		image_welcomeGif4000Bytes().performTest(welcomeGif4000Bytes_welcomeGif4000BytesVP());
		document_homePage().performTest(HomePage_HomePageVP());
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/40117_modified_tryit/topframe.htm
		image_btn1().click();
		image_btn2().click();
		// Document: Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/40117_modified_tryit/frame2.htm
		table_htmlTable_0().performTest(HtmlTable_0_visiblegridVP());
		document_homePage2().performTest(HomePage_HomePage_2VP());
		text_t1().click(atPoint(70,18));
		browser_htmlBrowser(document_htmlTryIt(),DEFAULT_FLAGS).inputKeys("5 yr{TAB}");
		browser_htmlBrowser(document_htmlTryIt(),DEFAULT_FLAGS).inputKeys("{Num1}{Num0}{Num0}{Num0}{Num0}{TAB}");
		browser_htmlBrowser(document_htmlTryIt(),DEFAULT_FLAGS).inputKeys("{Num1}{Num1}{TAB}");
		link_link1().click();
		link_change().click();
		text_t1().click(atPoint(27,12));
		document_homePage2().performTest(HomePage_HomePage_3VP());
		link_link1().performTest(link1_textVP());
		link_change().performTest(change_textVP());
		text_t1().click(atPoint(51,13));
		browser_htmlBrowser(document_htmlTryIt(),DEFAULT_FLAGS).inputKeys("{BKSP}{BKSP}{BKSP}");
		link_link1().click();
		table_htmlTable_0().performTest(HtmlTable_0_contentswithchildrenVP());
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/40117_modified_tryit/topframe.htm
		image_btn3().click();
		// Document: Widgets: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/40117_modified_tryit/frame4.htm
		form_form1().performTest(form1_textVP());
		document_widgets().performTest(Widgets_WidgetsVP());
		text_t1_2().click(atPoint(41,16));
		browser_htmlBrowser(document_htmlTryIt(),DEFAULT_FLAGS).inputKeys("Testing single line text Area. 123 Done.{TAB}");
		browser_htmlBrowser(document_htmlTryIt(),DEFAULT_FLAGS).inputKeys("Now testing scrolling{ENTER}");
		browser_htmlBrowser(document_htmlTryIt(),DEFAULT_FLAGS).inputKeys("text{ENTER}");
		browser_htmlBrowser(document_htmlTryIt(),DEFAULT_FLAGS).inputKeys("area{ENTER}");
		browser_htmlBrowser(document_htmlTryIt(),DEFAULT_FLAGS).inputKeys("567 done.{ENTER}");
		browser_htmlBrowser(document_htmlTryIt(),DEFAULT_FLAGS).inputKeys("....{ENTER}");
		browser_htmlBrowser(document_htmlTryIt(),DEFAULT_FLAGS).inputKeys("${%}{^}{^}");
		checkBox_c1on().click();
		checkBox_c3on().click();
		radioButton_r1V2().click();
		browser_htmlBrowser(document_htmlTryIt(),DEFAULT_FLAGS).inputKeys("{TAB}");
		browser_htmlBrowser(document_htmlTryIt(),DEFAULT_FLAGS).inputChars("item 4");
		// ignoring the dropdown click, manually add statement for selecting item, use click(atText"item name")
		document_widgets().performTest(Widgets_Widgets_2VP());
		text_s1().performTest(S1_textVP());
		text_t1_2().performTest(T1_textVP());
		button_submit().click();
		document_widgets().performTest(Widgets_Widgets_3VP());
		document_widgets().click(atPoint(1014,383));
		document_widgets().click(atPoint(1217,112));
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/40117_modified_tryit/topframe.htm
		image_btn4().click();
		// Document: Image Map Link: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/40117_modified_tryit/frame3.htm
		image_colorLinks().performTest(ColorLinks_ColorLinksVP());
		image_textImageLink().performTest(TextImageLink_TextImageLinkVP());
		image_slidepic().performTest(slidepic_slidepicVP());
		link__ImageTextLink().performTest(_ImageTextLink_textVP());
		link__SlideShow().performTest(_SlideShow_textVP());
		image_colorLinks().click(atPoint(56,39));
		// Document: Blue One: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/40117_modified_tryit/red1.htm
		link_back().performTest(Back_textVP());
		link_back().click();
		// Document: Image Map Link: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/40117_modified_tryit/frame3.htm
		link__ImageTextLink().click();
		// Document: Blue One: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/40117_modified_tryit/Circles.htm
		link_back2().performTest(Back_text_2VP());
		image_circles().click();
		link_back2().click();
			
		// HTML Browser
		// Document: HTML TryIt: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/40117_modified_tryit/HTMLTryit.htm
		// Document: Image Map Link: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/40117_modified_tryit/frame3.htm
		link__SlideShow().click();
		// Document: 404 Not Found: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/40117_modified_tryit/SlBlue2.htm
		document__404NotFound().performTest(_404NotFound__404NotFoundVP());
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/40117_modified_tryit/topframe.htm
		image_btn4().click();
		link_slpBug().performTest(SLPBug_textVP());
		link_slpBug().click();
		document_httpCivcez229NonprodH().performTest(httpCivcez229NonprodHclpnpComA_httpCivcez229NonprodHclpnpComA_2VP());
		// Document: HTML TryIt: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/40117_modified_tryit/frame5.htm
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/40117_modified_tryit/topframe2.htm
		document_httpCivcez229NonprodH2().performTest(httpCivcez229NonprodHclpnpComA_httpCivcez229NonprodHclpnpComA_3VP());
		// Document: Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/40117_modified_tryit/welcome.htm
		document_homePage3().performTest(HomePage_HomePage_4VP());
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/40117_modified_tryit/topframe.htm
		link_slpBug().click();
		// HTML Browser
		browser_htmlBrowser(document_htmlTryIt(),DEFAULT_FLAGS).close();
		
		// 
		html_htmlDialog(ANY,MAY_EXIT).click(atPoint(163,117));
				
		
		
	}
}

