
import resources.html_8604_Frames2Helper;
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
public class html_8604_Frames2 extends html_8604_Frames2Helper
{
	/**
	 * Script Name   : <b>Frames002</b>
	 * Generated     : <b>01-Feb-2019 5:04:28 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.3  Build 9600 ()
	 * 
	 * @since  2019/02/01
	 * @author JaspreetSinghC
	 */
	public void testMain(Object[] args) 
	{
		startApp("http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html");
		
		// Frame: Java Console
		close().click();
		
		
		//Frame2 - Click on the link script
		
		// HTML Browser
		// Document: Frame Example Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html
		// Document: Frame example #2 Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/frame2.htm
		link_htmlFormElementSamplePage().click();
		
		// 
		//pluginEmbeddedFrame().performTest(_standardVP());
		
		// HTML Browser
		// Document: Frame Example Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html
		// Document: Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/index.htm
		text__1linebox().performTest(_1linebox_textVP());
		text__1linebox().click(atPoint(91,7));
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputChars("Entering 1 line text for testing.");
		text__1linebox().performTest(_1linebox_text_2VP());
		text_scrollbox().performTest(Scrollbox_textVP());
		text_scrollbox().click(atPoint(88,11));
		text_scrollbox().click(SHIFT_LEFT, atPoint(88,11));
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputChars("E");
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputChars("ntering multi line comments to ensure it is tested clearly and n");
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputKeys("o issues are found.{ENTER}");
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputKeys("123{ENTER}");
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputKeys("dfgh{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}");
		text_scrollbox().performTest(Scrollbox_text_2VP());
		checkBox_checkboxON().performTest(CheckboxON_stateVP());
		checkBox_checkboxON().performTest(CheckboxON_standardVP());
		checkBox_checkboxON().click();
		checkBox_checkboxON().click();
		checkBox_checkboxON().click();
		checkBox_checkboxON().performTest(CheckboxON_state_2VP());
		radioButton_sexM().performTest(SexM_stateVP());
		radioButton_sexF().performTest(SexF_stateVP());
		form_htmlFormSampler().performTest(HTMLFormSampler_standardVP());
		button_submit().performTest(Submit_textVP());
		button_submit().click();
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/Formpost.asp?1linebox=Entering+1+line+text+for+testing.&Scrollbox=Entering+multi+line+comments+to+ensure+it+is+tested+clearly+and+no+issues+are+found.%0D%0A&Checkbox=ON&Sex=F&Submit=Submit&Investment=Under+%2425%2C000
		document_httpCivcez229NonprodH().performTest(httpCivcez229NonprodHclpnpComA_httpCivcez229NonprodHclpnpComAVP());
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).click(atPoint(67,59));
		// Document: Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/index.htm
		button_actionsubmit().performTest(actionsubmit_textVP());
		button_actionsubmit2().performTest(actionsubmit_text_2VP());
		button_actionsubmit3().performTest(actionsubmit_standardVP());
		button_actionsubmit4().performTest(actionsubmit_standard_2VP());
		button_reset().performTest(Reset_textVP());
		button_actionsubmit().click();
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).click(atPoint(67,59));
		// Document: Frame Example Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html
		// Document: Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/index.htm
		button_reset().click();
		text__1linebox().performTest(_1linebox_text_3VP());
		text_scrollbox().performTest(Scrollbox_text_3VP());
		checkBox_checkboxON().performTest(CheckboxON_state_3VP());
		list_investment().performTest(Investment_listVP());
		list_investment().click();
		// ignoring the dropdown click, manually add statement for selecting item, use click(atText"item name")
		list_investment().performTest(Investment_selectedVP());
		list_investment2().performTest(Investment2_listVP());
		list_investment2().performTest(Investment2_selectedVP());
		list_investment2().click(atText("$25,001 to $50,000"));
		list_investment2().click(atText("$50,001 and higher"));
		list_investment2().click(CTRL_LEFT, atText("$25,001 to $50,000"));
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputKeys("^{LeftCtrl}");
		list_investment2().click(CTRL_LEFT, atText("Under $25,000"));
		list_investment2().performTest(Investment2_list_2VP());
		list_investment2().performTest(Investment2_selected_2VP());
		list_investment3().performTest(Investment3_listVP());
		list_investment3().performTest(Investment3_selectedVP());
		list_investment3().click(atText("Under $25,000"));
		list_investment3().click(CTRL_LEFT, atText("$25,001 to $50,000"));
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputKeys("^{LeftCtrl}");
		list_investment3().performTest(Investment3_selected_2VP());
		button_button().performTest(Button_textVP());
		
		
		// HTML Browser
		// Document: Frame Example Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html
		// Document: Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/index.htm
		button_button().click();
		
		
		// HTML Browser
		// Document: Frame Example Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html
		// Document: Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/index.htm
		document_homePage().drag(atPoint(1373,280), atPoint(1377,555));
		
		
		//document_homePage().click(atPoint(1372,516));
		
		
		//button_bridge1Jpg49392Bytes().performTest(Bridge1Jpg49392Bytes_textVP());
		button_bridge1Jpg49392Bytes().performTest(Bridge1Jpg49392Bytes_Bridge1Jpg49392BytesVP());
		button_bridge1Jpg49392Bytes().performTest(Bridge1Jpg49392Bytes_standardVP());
		form_htmlFormTagFile().performTest(HTMLFormTagFile_textVP());
		text_the_name().performTest(the_name_textVP());
		text_fav_file().performTest(fav_file_textVP());
		form_htmlFormTagFile().performTest(HTMLFormTagFile_standardVP());
		text_the_name().click(atPoint(116,4));
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputChars("Sarah Walker");
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputKeys(" Mcmahon{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}ic{BKSP}chellenge");
		text_fav_file().click(atPoint(116,16));
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputChars("CIA Confidential Part 456 from 2");
		text_fav_file().click(atPoint(117,14));
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputKeys("{BKSP}");
		text_fav_file().click(atPoint(117,5));
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputChars("o");
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputKeys("{ExtDelete}r");
		text_the_name().performTest(the_name_text_2VP());
		text_fav_file().performTest(fav_file_text_2VP());
		button_submit2().performTest(Submit_text_2VP());
		button_submit2().click();
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).click(atPoint(67,59));
		form_htmlFormSampler().performTest(HTMLFormSampler_textVP());
		browser_htmlBrowser(document_frameExamplePage(),MAY_EXIT).click(atPoint(223,24));
			
		
	}
}

