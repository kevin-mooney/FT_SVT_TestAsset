
import resources.html_8604_Frames4Helper;
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
public class html_8604_Frames4 extends html_8604_Frames4Helper
{
	/**
	 * Script Name   : <b>Frames003</b>
	 * Generated     : <b>04-Feb-2019 11:57:29 AM</b>
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
		// Document: Frame example #4 Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/frame4.htm
		checkBox_pC386().performTest(PC386_stateVP());
		checkBox_pcPentium90().performTest(PCPentium90_stateVP());
		checkBox_pcPentiumII200().performTest(PCPentiumII200_stateVP());
		checkBox_pC386().click();
		checkBox_pcPentiumII200().click();
		checkBox_pC386().performTest(PC386_state_2VP());
		checkBox_pcPentiumII200().performTest(PCPentiumII200_state_2VP());
		link_ntbSite().click();
		// Document: Site is currently undergoing maintenance: https://www.ntb.com/
		frame_htmlIFRAME().performTest(HtmlIFRAME_textVP());
		browser_htmlBrowser(document_siteIsCurrentlyUnderg(),DEFAULT_FLAGS).click(atPoint(62,53));
		// Document: Frame Example Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html
		// Document: Frame example #4 Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/frame4.htm
		link_htmlFormElementSamplePage2().click();
		// Document: Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/withintablex1.htm
		text__1linebox().performTest(_1linebox_textVP());
		text_scrollbox().performTest(Scrollbox_textVP());
		checkBox_checkboxON().performTest(CheckboxON_stateVP());
		radioButton_sexM().performTest(SexM_stateVP());
		radioButton_sexF().performTest(SexF_stateVP());
		button_submit().performTest(Submit_textVP());
		button_actionsubmit().performTest(actionsubmit_textVP());
		button_actionsubmit().performTest(actionsubmit_standardVP());
		button_actionsubmit2().performTest(actionsubmit_standard_2VP());
		button_actionsubmit3().performTest(actionsubmit_standard_3VP());
		button_actionsubmit4().performTest(actionsubmit_standard_4VP());
		button_reset().performTest(Reset_textVP());
		text__1linebox().click(atPoint(117,15));
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputChars("Testing one line text ");
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputKeys("by entering chars 12345&*{(}{)} in it.");
		text_scrollbox().click(atPoint(118,21));
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputKeys("Test{ENTER}");
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputKeys("Multi line{ENTER}");
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputKeys("1234{ENTER}");
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputKeys("enter chars{ENTER}");
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputKeys("by placing special{ENTER}");
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputKeys("chars{ENTER}");
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputKeys("!@#${ENTER}");
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputChars("098");
		checkBox_checkboxON().click();
		radioButton_sexM().click();
		text__1linebox().performTest(_1linebox_text_2VP());
		text_scrollbox().performTest(Scrollbox_text_2VP());
		checkBox_checkboxON().performTest(CheckboxON_state_2VP());
		radioButton_sexM().performTest(SexM_state_2VP());
		radioButton_sexF().performTest(SexF_state_2VP());
		document_homePage().drag(atPoint(849,704), atPoint(824,843));
		list_investment().performTest(Investment_listVP());
		list_investment2().performTest(Investment2_listVP());
		list_investment3().performTest(Investment3_listVP());
		button_button().performTest(Button_textVP());
		button_bridge1Jpg49392Bytes().performTest(Bridge1Jpg49392Bytes_textVP());
		button_bridge1Jpg49392Bytes().performTest(Bridge1Jpg49392Bytes_Bridge1Jpg49392BytesVP());
		form_htmlFormTagFile().performTest(HTMLFormTagFile_textVP());
		text_the_name().performTest(the_name_textVP());
		html_fav_file().performTest(fav_file_standardVP());
		button_submit2().performTest(Submit_text_2VP());
		list_investment().click();
		// ignoring the dropdown click, manually add statement for selecting item, use click(atText"item name")
		list_investment2().click(atText("$25,001 to $50,000"));
		list_investment2().click(CTRL_LEFT, atText("Under $25,000"));
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputKeys("^{LeftCtrl}");
		list_investment3().click(atText("$25,001 to $50,000"));
		list_investment3().click(atText("$50,001 and higher"));
		list_investment3().click(CTRL_LEFT, atText("$25,001 to $50,000"));
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputKeys("^{LeftCtrl}");
		list_investment().performTest(Investment_selectedVP());
		list_investment2().performTest(Investment2_selectedVP());
		list_investment3().performTest(Investment3_selectedVP());
		text_the_name().click(atPoint(44,9));
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).inputChars("Charles Carmichael Walker");
		text_the_name().performTest(the_name_text_2VP());
				
		/* Failure	
		html_fav_file().click(atPoint(42,6));
		html_fav_file().click(atPoint(32,11));
		html_fav_fileTestTxt().performTest(fav_fileTestTxt_textVP());
		*/
		button_submit2().click();
		
		
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/Formpost.asp?the_name=Charles+Carmichael+Walker&fav_file=Test.txt&submit_button=Submit
		document_httpCivcez229NonprodH().performTest(httpCivcez229NonprodHclpnpComA_httpCivcez229NonprodHclpnpComAVP());
		
		/* Playback issues below - script not run - tried couple of times.
		 * 
		 */
		pageTab_frameExamplePage().click();
		// Document: Frame Example Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/Formpost.asp?the_name=Charles+Carmichael+Walker&fav_file=Test.txt&submit_button=Submit
		document_httpCivcez229NonprodH().click(atPoint(474,650));
		pageTab_frameExamplePage().click();
		
		// Window: firefox.exe: Frame Example Page - Mozilla Firefox
		backpopupMenu().click(atPath("Frame Example Page"));
		
		// HTML Browser
		button_backButton(browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS),DEFAULT_FLAGS).click();
		
		// Window: firefox.exe: Frame Example Page - Mozilla Firefox
		backpopupMenu().click(atPath("Frame Example Page"));
		
		// HTML Browser
		// Document: Frame Example Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html
		// Document: Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/withintablex1.htm
		document_homePage().drag(atPoint(850,850), atPoint(851,957));
		document_homePage().performTest(HomePage_HomePageVP());
		document_homePage().drag(atPoint(851,840), atPoint(847,596));
		button_submit().click();
		pageTab_frameExamplePage().click();
		
		// Window: firefox.exe: Frame Example Page - Mozilla Firefox
		backpopupMenu().click(atPath("Frame Example Page"));
		
		// HTML Browser
		// Document: Frame Example Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html
		// Document: Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/withintablex1.htm
		button_submit().click();
		// Document: 405 Method Not Allowed: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/Formpost.asp
		document__405MethodNotAllowed().performTest(_405MethodNotAllowed__405MethodNotAllowedVP());
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).click(atPoint(69,59));
		
		// Window: firefox.exe: Frame Example Page - Mozilla Firefox
		backpopupMenu().click(atPath("Frame Example Page"));
		
		// HTML Browser
		// Document: Frame Example Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html
		// Document: Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/withintablex1.htm
		button_actionsubmit3().click();
		// Document: 405 Method Not Allowed: http://civcez229.nonprod.hclpnp.com/aries-web/samples/htmlsamplerpag/Formpost.asp
		document__405MethodNotAllowed().performTest(_405MethodNotAllowed__405MethodNotAllowed_2VP());
		pageTab_frameExamplePage().click();
		
		// Window: firefox.exe: Frame Example Page - Mozilla Firefox
		backpopupMenu().click(atPath("Frame Example Page"));
		
		// HTML Browser
		browser_htmlBrowser(document_frameExamplePage(),DEFAULT_FLAGS).close();
		
		
	}
}

