
import resources.html_8604_iFrameHelper;
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
public class html_8604_iFrame extends html_8604_iFrameHelper
{
	/**
	 * Script Name   : <b>iFrame</b>
	 * Generated     : <b>04-Feb-2019 4:38:23 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.3  Build 9600 ()
	 * 
	 * @since  2019/02/04
	 * @author JaspreetSinghC
	 */
	public void testMain(Object[] args) 
	{
		startApp("http://civcez229.nonprod.hclpnp.com/aries-web/iframe/aries-webContestPageiframe.html");
		
		// Frame: Java Console
		//close().click();
				
		// HTML Browser
		// Document: Aries-web contest page - Iframe: http://civcez229.nonprod.hclpnp.com/aries-web/iframe/aries-webContestPageiframe.html
		document_ariesWebContestPageIf().performTest(AriesWebContestPageIframe_AriesWebContestPageIframeVP());
		// Document: Contest page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/contest.htm
		document_contestPage().performTest(ContestPage_ContestPageVP());
		text_htmlINPUTText().performTest(HtmlINPUTText_textVP());
		// Document: Contest page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/contest.htm
		table_htmlTable_0().performTest(HtmlTable_0_contentswithchildrenVP());
		button_yesIWantToRegisterToWin().performTest(YesIWantToRegisterToWinTheComp_textVP());
		button_reset().performTest(Reset_textVP());
		text_name().dragToScreenPoint(atPoint(68,9), table_htmlTable_0().getScreenPoint(atPoint(0,41)));
		browser_htmlBrowser(document_ariesWebContestPageIf(),DEFAULT_FLAGS).inputKeys("RFT TestUserB{TAB}");
		browser_htmlBrowser(document_ariesWebContestPageIf(),DEFAULT_FLAGS).inputKeys("{Num2}{Num1}{Num5}{Num2} e lake cook rd{TAB}");
		browser_htmlBrowser(document_ariesWebContestPageIf(),DEFAULT_FLAGS).inputKeys("buffalo grove{TAB}");
		browser_htmlBrowser(document_ariesWebContestPageIf(),DEFAULT_FLAGS).inputKeys("Illinois{TAB}");
		browser_htmlBrowser(document_ariesWebContestPageIf(),DEFAULT_FLAGS).inputKeys("{Num6}{Num0}{Num0}{Num8}{Num9}{TAB}");
		browser_htmlBrowser(document_ariesWebContestPageIf(),DEFAULT_FLAGS).inputKeys("rfttestuserb@ibmtestr.com{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}.com{TAB}");
		browser_htmlBrowser(document_ariesWebContestPageIf(),DEFAULT_FLAGS).inputKeys("s{TAB}");
		browser_htmlBrowser(document_ariesWebContestPageIf(),DEFAULT_FLAGS).inputKeys("$5{TAB}");
		text_buyerDescription().click(atPoint(66,38));
		browser_htmlBrowser(document_ariesWebContestPageIf(),DEFAULT_FLAGS).inputKeys("test{ENTER}");
		browser_htmlBrowser(document_ariesWebContestPageIf(),DEFAULT_FLAGS).inputKeys("logistice{BKSP}s{ENTER}");
		browser_htmlBrowser(document_ariesWebContestPageIf(),DEFAULT_FLAGS).inputKeys("d{BKSP}software{ENTER}");
		browser_htmlBrowser(document_ariesWebContestPageIf(),DEFAULT_FLAGS).inputKeys("hardware :- mouse, printer, mosue{BKSP}{BKSP}{BKSP}use pad, ");
		browser_htmlBrowser(document_ariesWebContestPageIf(),DEFAULT_FLAGS).inputKeys("{ENTER}");
		browser_htmlBrowser(document_ariesWebContestPageIf(),DEFAULT_FLAGS).inputKeys("headphones and {BKSP},{ENTER}");
		browser_htmlBrowser(document_ariesWebContestPageIf(),DEFAULT_FLAGS).inputChars("etc..");
		table_htmlTable_0().performTest(HtmlTable_0_contentswithchildren_2VP());
		list_position().performTest(position_selectedVP());
		list_salary().performTest(salary_selectedVP());
		text_buyerDescription().performTest(buyerDescription_textVP());
		text_zip().click(atPoint(90,13));
		browser_htmlBrowser(document_ariesWebContestPageIf(),DEFAULT_FLAGS).inputChars(".AA#$");
		text_name().click(atPoint(190,11));
		text_city().click(atPoint(145,14));
		browser_htmlBrowser(document_ariesWebContestPageIf(),DEFAULT_FLAGS).inputKeys(" {Num2}{Num2}{Num6}");
		button_yesIWantToRegisterToWin().click();
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/noresult.htm?VTI-GROUP=0&Name=RFT+TestUserB&address=2152+e+lake+cook+rd&City=buffalo+grove+226&State=Illinois&Zip=60089.AA%23%24&email=rfttestuserb%40ibmtest.com&position=Senior+Management&salary=%2450%2C001+to+%2475%2C000&buyer=yes&buyer+description=test%0D%0Alogistics%0D%0Asoftware%0D%0Ahardware+%3A-+mouse%2C+printer%2C+mouse+pad%2C+%0D%0Aheadphones+and%2C%0D%0Aetc..&submit=Yes%2C+I+want+to+register+to+win+the+computer+chair
		document_httpCivcez229NonprodH().performTest(httpCivcez229NonprodHclpnpComA_httpCivcez229NonprodHclpnpComAVP());
		text_htmlINPUTText().performTest(HtmlINPUTText_text_2VP());
		text_htmlINPUTText().click(atPoint(89,10));
		browser_htmlBrowser(document_ariesWebContestPageIf(),DEFAULT_FLAGS).inputChars("test on landing page of register");
		text_htmlINPUTText().performTest(testOnLandingPageOfRegister_textVP());
		browser_htmlBrowser(document_ariesWebContestPageIf(),DEFAULT_FLAGS).click(atPoint(68,56));
		text_htmlINPUTText().performTest(testOnLandingPageOfRegister_text_2VP());
		button_reset().click();
		table_htmlTable_0().performTest(HtmlTable_0_visiblegridVP());
		table_htmlTable_0().performTest(HtmlTable_0_contentswithchildren_3VP());
		radioButton_buyeryes().performTest(buyeryes_stateVP());
		text_htmlINPUTText().performTest(testOnLandingPageOfRegister_text_3VP());
		
	}
}

