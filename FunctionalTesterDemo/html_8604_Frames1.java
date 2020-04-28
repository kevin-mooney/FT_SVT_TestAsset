
import resources.html_8604_Frames1Helper;
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
public class html_8604_Frames1 extends html_8604_Frames1Helper
{
	/**
	 * Script Name   : <b>FF_sampleApp</b>
	 * Generated     : <b>30-Jan-2019 12:03:26 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.3  Build 9600 ()
	 * 
	 * @since  2019/01/30
	 * @author JaspreetSinghC
	 */
	public void testMain(Object[] args) 
	{
		startApp("http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html");
		
		// Frame: Java Console
		close().click();
		
		// HTML Browser
		// Document: Frame Example Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html
		// Document: Frame example #1 Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/frame1.htm
		document_frameExample1Page().performTest(FrameExample1Page_FrameExample1PageVP());
		link_htmlFormElementSamplePage().performTest(HTMLFormElementSamplePage_textVP());
		link_htmlFormElementSamplePage().performTest(HTMLFormElementSamplePage_standardVP());
		// Document: Frame example #2 Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/frame2.htm
		document_frameExample2Page().performTest(FrameExample2Page_FrameExample2PageVP());
		// Document: Frame example #3 Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/frame3.htm
		document_frameExample3Page().performTest(FrameExample3Page_FrameExample3PageVP());
		// Document: Frame example #4 Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/frame4.htm
		document_frameExample4Page().performTest(FrameExample4Page_FrameExample4PageVP());
		form__WhatPCTypeDoYouOwn386Pen().performTest(_WhatPCTypeDoYouOwn386Pentium9_textVP());
		link_ntbSite().performTest(NTBSite_textVP());
		link_htmlFormElementSamplePage2().performTest(HTMLFormElementSamplePageTable_standardVP());
		// Document: Frame example #5 Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/frame5.htm
		document_frameExample5Page().performTest(FrameExample5Page_FrameExample5PageVP());
		// Document: Frame example #6 Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/frame6.htm
		document_frameExample6Page().performTest(FrameExample6Page_FrameExample6PageVP());
		link_dilbertSite().performTest(DilbertSite_textVP());
		link_dilbertSite().performTest(DilbertSite_standardVP());
		
		//Frame1 - Click on the link script
				
		// HTML Browser
		// Document: Frame Example Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html
		// Document: Frame example #1 Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/frame1.htm
		link_htmlFormElementSamplePage().click();
		
		// 
		//pluginEmbeddedFrame().performTest(_standardVP());
		
		// HTML Browser
		// Document: Frame Example Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html
		// Document: Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/index.htm
		text__1linebox().performTest(_1linebox_textVP());
		document_homePage().performTest(HomePage_HomePageVP());
		text__1linebox().click(atPoint(13,20));
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputChars("Aaasdfgh");
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputKeys("{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}");
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputKeys("{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}Testing one-line text box of mediu");
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputKeys("m lenght{BKSP}th{BKSP}{BKSP}{BKSP}th. TEST{BKSP}{BKSP}XT COMPLET");
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputChars("E.");
		text__1linebox().performTest(_1linebox_text_2VP());
		text__1linebox().click(atPoint(145,11));
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputChars(".");
		text_scrollbox().performTest(Scrollbox_textVP());
		text_scrollbox().click(atPoint(123,16));
		text_scrollbox().hover(atPoint(123,15));
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputKeys("Testing the Scrolling textTe{BKSP}{BKSP} box. Typing mulitple li");
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputChars("nes to test the same.");
		text_scrollbox().performTest(Scrollbox_text_2VP());
		checkBox_checkboxON().performTest(CheckboxON_stateVP());
		radioButton_sexM().performTest(SexM_stateVP());
		radioButton_sexF().performTest(SexF_stateVP());
		checkBox_checkboxON().click();
		radioButton_sexM().click();
		checkBox_checkboxON().performTest(CheckboxON_state_2VP());
		radioButton_sexM().performTest(SexM_state_2VP());
		radioButton_sexF().performTest(SexF_state_2VP());
		button_submit().performTest(Submit_textVP());
		button_actionsubmit().performTest(actionsubmit_standardVP());
		button_actionsubmit2().performTest(actionsubmit_textVP());
		button_actionsubmit2().performTest(actionsubmit_standard_2VP());
		button_actionsubmit3().performTest(actionsubmit_standard_3VP());
		button_reset().performTest(Reset_textVP());
		button_submit().click();
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/Formpost.asp?1linebox=Testing+one-line+text+box+of+medium+length.+TEXT+COMPLETE.&Scrollbox=Testing+the+Scrolling+text+box.+Typing+mulitple+lines+to+test+the+same.&Checkbox=ON&Sex=M&Submit=Submit&Investment=Under+%2425%2C000
		document_httpCivcez229NonprodH().performTest(httpCivcez229NonprodHclpnpComA_httpCivcez229NonprodHclpnpComAVP());
		document_httpCivcez229NonprodH().click(atPoint(505,567));
		document_httpCivcez229NonprodH().click(atPoint(505,567));
		document_httpCivcez229NonprodH().drag(atPoint(491,569), 
                                        atPoint(1022,599));
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).click(atPoint(70,58));
		// Document: Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/index.htm
		button_actionsubmit().click();
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/Formpost.asp?1linebox=Testing+one-line+text+box+of+medium+length.+TEXT+COMPLETE.&Scrollbox=Testing+the+Scrolling+text+box.+Typing+mulitple+lines+to+test+the+same.&Checkbox=ON&Sex=M&Submit=Submit&Investment=Under+%2425%2C000
		document_httpCivcez229NonprodH().performTest(httpCivcez229NonprodHclpnpComA_httpCivcez229NonprodHclpnpComA_3VP());
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).click(atPoint(73,62));
		pageTab_frameExamplePage().click();
		// Document: Frame Example Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html
		// Document: Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/index.htm
		button_actionsubmit4().click();
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/Formpost.asp?1linebox=Testing+one-line+text+box+of+medium+length.+TEXT+COMPLETE.&Scrollbox=Testing+the+Scrolling+text+box.+Typing+mulitple+lines+to+test+the+same.&Checkbox=ON&Sex=M&Submit=Submit&Investment=Under+%2425%2C000
		document_httpCivcez229NonprodH().performTest(httpCivcez229NonprodHclpnpComA_httpCivcez229NonprodHclpnpComA_4VP());
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).click(atPoint(73,62));
		
		
		
		// HTML Browser
		// Document: Frame Example Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html
		// Document: Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/index.htm
		button_reset().performTest(Reset_text_2VP());
		button_reset().click();
		button_reset().performTest(Reset_standardVP());
		list_investment().performTest(Investment_listVP());
		list_investment().click();
		// ignoring the dropdown click, manually add statement for selecting item, use click(atText"item name")
		list_investment2().performTest(Investment2_listVP());
		list_investment2().performTest(Investment2_standardVP());
		list_investment2().click(atText("Under $25,000"));
		list_investment2().click(atText("Under $25,000"));
		list_investment2().performTest(Investment2_selectedVP());
		list_investment2().click(atText("$25,001 to $50,000"));
		list_investment2().click(CTRL_LEFT, atText("$50,001 and higher"));
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputKeys("^{LeftCtrl}");
		list_investment2().performTest(Investment2_selected_2VP());
		list_investment3().performTest(Investment3_listVP());
		list_investment3().performTest(Investment3_standardVP());
		list_investment3().click(atText("Under $25,000"));
		list_investment3().performTest(Investment3_selectedVP());
		list_investment3().click(CTRL_LEFT, atText("$50,001 and higher"));
		list_investment3().performTest(Investment3_selected_2VP());
		button_button().performTest(Button_textVP());
		button_button().performTest(Button_standardVP());
		button_button().click();
		document_homePage().click(atPoint(850,503));
		button_bridge1Jpg49392Bytes().performTest(Bridge1Jpg49392Bytes_Bridge1Jpg49392BytesVP());
		button_bridge1Jpg49392Bytes().performTest(Bridge1Jpg49392Bytes_standardVP());
		button_bridge1Jpg49392Bytes().click();
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/Formpost.asp?1linebox=Testing+one-line+text+box+of+medium+length.+TEXT+COMPLETE.&Scrollbox=Testing+the+Scrolling+text+box.+Typing+mulitple+lines+to+test+the+same.&Checkbox=ON&Sex=M&Submit=Submit&Investment=Under+%2425%2C000
		document_httpCivcez229NonprodH().performTest(httpCivcez229NonprodHclpnpComA_httpCivcez229NonprodHclpnpComA_5VP());
		document_httpCivcez229NonprodH().drag(atPoint(31,570), 
                                        atPoint(834,563));
		//document_httpCivcez229NonprodH().performTest(httpCivcez229NonprodHclpnpComA_httpCivcez229NonprodHclpnpComA_6VP());
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).click(atPoint(69,62));
		// Document: Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/index.htm
		form_htmlFormTagFile().performTest(HTMLFormTagFile_textVP());
		text_the_name().performTest(the_name_textVP());
		text_fav_file().performTest(fav_file_textVP());
		text_the_name().click(atPoint(39,9));
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputChars("Hindustan Singh");
		text_fav_file().click(atPoint(40,14));
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputChars("HIndustan Singh favorite's");
		text_the_name().performTest(the_name_text_2VP());
		text_fav_file().performTest(fav_file_text_2VP());
		text_fav_file().click(atPoint(145,9));
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputChars(" file");
		text_fav_file().performTest(fav_file_text_3VP());
		button_submit2().performTest(Submit_text_2VP());
		button_submit2().click();
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/Formpost.asp?1linebox=Testing+one-line+text+box+of+medium+length.+TEXT+COMPLETE.&Scrollbox=Testing+the+Scrolling+text+box.+Typing+mulitple+lines+to+test+the+same.&Checkbox=ON&Sex=M&Submit=Submit&Investment=Under+%2425%2C000
		document_httpCivcez229NonprodH().performTest(httpCivcez229NonprodHclpnpComA_httpCivcez229NonprodHclpnpComA_7VP());
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).click(atPoint(69,62));
		//pageTab_frameExamplePage().click();
		// Document: Frame Example Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html
		// Document: Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/index.htm
		
				
		//Close App
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).close();
		
		
		
	}
}

