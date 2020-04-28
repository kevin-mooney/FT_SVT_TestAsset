
import resources.html_8604_NestedFramesHelper;
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
public class html_8604_NestedFrames extends html_8604_NestedFramesHelper
{
	/**
	 * Script Name   : <b>NestedFrames</b>
	 * Generated     : <b>04-Feb-2019 2:51:22 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.3  Build 9600 ()
	 * 
	 * @since  2019/02/04
	 * @author JaspreetSinghC
	 */
	public void testMain(Object[] args) 
	{
		startApp("http://civcez229.nonprod.hclpnp.com/aries-web/iframe/Aries-webContestPageNestedIframe.html");
		
		// Frame: Java Console
		//close().click();
		
		// HTML Browser
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/iframe/Aries-webContestPageNestedIframe.html
		form__IHaveABikeIHaveACar().performTest(_IHaveABikeIHaveACar_textVP());
		form_input1().performTest(input1_textVP());
		checkBox_vehicleBike1().performTest(vehicleBike1_stateVP());
		checkBox_vehicleCar1().performTest(vehicleCar1_stateVP());
		text_username().performTest(username_textVP());
		button_submit().performTest(Submit_textVP());
		// Document: Aries-web contest page - Iframe: http://civcez229.nonprod.hclpnp.com/aries-web/iframe/aries-webContestPageiframe.html
		document_ariesWebContestPageIf().performTest(AriesWebContestPageIframe_AriesWebContestPageIframeVP());
		// Document: Contest page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/contest.htm
		document_contestPage().performTest(ContestPage_ContestPageVP());
		text_name().performTest(Name_textVP());
		text_address().performTest(address_textVP());
		text_city().performTest(City_textVP());
		text_email().performTest(email_textVP());
		list_position().performTest(position_listVP());
		list_salary().performTest(salary_listVP());
		table_htmlTable_0().performTest(HtmlTable_0_gridVP());
		table_htmlTable_0().performTest(HtmlTable_0_contentswithchildrenVP());
		table_htmlTable_0().performTest(HtmlTable_0_textVP());
		radioButton_buyeryes().performTest(buyeryes_stateVP());
		radioButton_buyerno().performTest(buyerno_stateVP());
		text_buyerDescription().performTest(buyerDescription_textVP());
		button_yesIWantToRegisterToWin().performTest(YesIWantToRegisterToWinTheComp_textVP());
		button_reset().performTest(Reset_textVP());
		document_contestPage().drag(atPoint(613,396), atPoint(613,538));
		document_ariesWebContestPageIf().drag(atPoint(1715,401), 
                                        atPoint(1721,498));
		text_htmlINPUTText().performTest(HtmlINPUTText_textVP());
		// Document: Contest page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/contest.htm
		//document_contestPage().click(atPoint(611,199));
		document_contestPage().drag(atPoint(613,358), atPoint(610,207));
		button_reset().click();
		button_yesIWantToRegisterToWin().click();
		document_ariesWebContestPageIf().performTest(AriesWebContestPageIframe_AriesWebContestPageIframe_2VP());
		document_ariesWebContestPageIf().click(atPoint(1168,397));
		document_ariesWebContestPageIf().drag(atPoint(1715,321), 
                                        atPoint(1714,250));
		checkBox_vehicleBike1().click();
		checkBox_vehicleCar1().click();
		text_username().click(atPoint(43,13));
		browser_htmlBrowser(document_httpCivcez229NonprodH(),DEFAULT_FLAGS).inputChars("Testonehcl");
		// Document: Aries-web contest page - Iframe: http://civcez229.nonprod.hclpnp.com/aries-web/iframe/aries-webContestPageiframe.html
		// Document: Contest page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/contest.htm
		text_name().click(atPoint(77,19));
		text_name().click(atPoint(49,15));
		text_name().click(atPoint(49,15));
		text_name().click(atPoint(49,15));
		text_name().click(atPoint(49,15));
		text_name().dragToScreenPoint(atPoint(68,17), table_htmlTable_0().getScreenPoint(atCell(
                                        atRow(atIndex(1)), 
                                        atColumn(atIndex(0)))));
		browser_htmlBrowser(document_httpCivcez229NonprodH(),DEFAULT_FLAGS).inputKeys("TestY{BKSP}User1");
		text_name().click(atPoint(11,16));
		browser_htmlBrowser(document_httpCivcez229NonprodH(),DEFAULT_FLAGS).inputChars("RFT ");
		browser_htmlBrowser().inputKeys("{TAB}");
		
		// HTML Browser
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/iframe/Aries-webContestPageNestedIframe.html
		// Document: Aries-web contest page - Iframe: http://civcez229.nonprod.hclpnp.com/aries-web/iframe/aries-webContestPageiframe.html
		// Document: Contest page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/contest.htm
		browser_htmlBrowser(document_httpCivcez229NonprodH(),DEFAULT_FLAGS).inputKeys("{Num2}{Num1}{Num5}{Num0} e lake cook rd");
		browser_htmlBrowser().inputKeys("{TAB}");
		browser_htmlBrowser(document_httpCivcez229NonprodH(),DEFAULT_FLAGS).inputChars("buffalo grove");
		browser_htmlBrowser().inputKeys("{TAB}");
		browser_htmlBrowser(document_httpCivcez229NonprodH(),DEFAULT_FLAGS).inputChars("illinois");
		browser_htmlBrowser().inputKeys("{TAB}");	
		browser_htmlBrowser(document_httpCivcez229NonprodH(),DEFAULT_FLAGS).inputKeys("{Num6}{Num0}{Num0}{Num8}{Num9}");
		browser_htmlBrowser().inputKeys("{TAB}");
		browser_htmlBrowser(document_httpCivcez229NonprodH(),DEFAULT_FLAGS).inputChars("rfttestuser1@hcltest.com");
		browser_htmlBrowser().inputKeys("{TAB}");
		browser_htmlBrowser().inputKeys("pp{TAB}");
		browser_htmlBrowser().inputChars("$7");
		text_buyerDescription().click(atPoint(191,35));
		browser_htmlBrowser(document_httpCivcez229NonprodH(),DEFAULT_FLAGS).inputKeys("Hardware, infra{ENTER}");
		browser_htmlBrowser(document_httpCivcez229NonprodH(),DEFAULT_FLAGS).inputKeys("software{ENTER}");
		browser_htmlBrowser(document_httpCivcez229NonprodH(),DEFAULT_FLAGS).inputKeys("lof{BKSP}gistics{ENTER}");
		browser_htmlBrowser(document_httpCivcez229NonprodH(),DEFAULT_FLAGS).inputChars("and more..");
		checkBox_vehicleBike1().performTest(vehicleBike1_state_2VP());
		checkBox_vehicleCar1().performTest(vehicleCar1_state_2VP());
		text_username().performTest(username_text_2VP());
		// Document: Aries-web contest page - Iframe: http://civcez229.nonprod.hclpnp.com/aries-web/iframe/aries-webContestPageiframe.html
		// Document: Contest page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/contest.htm
		table_htmlTable_0().performTest(HtmlTable_0_contentswithchildren_2VP());
		list_position().performTest(position_selectedVP());
		list_salary().performTest(salary_selectedVP());
		text_buyerDescription().performTest(buyerDescription_text_2VP());
		button_submit().click();
		// Document: 404 Not Found: http://civcez229.nonprod.hclpnp.com/aries-web/iframe/html_form_action.asp?username=Testonehcl
		document__404NotFound().performTest(_404NotFound__404NotFoundVP());
		browser_htmlBrowser(document__404NotFound(),DEFAULT_FLAGS).click(atPoint(65,57));
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/iframe/Aries-webContestPageNestedIframe.html
		// Document: Aries-web contest page - Iframe: http://civcez229.nonprod.hclpnp.com/aries-web/iframe/aries-webContestPageiframe.html
		// Document: Contest page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/contest.htm
		button_yesIWantToRegisterToWin().click();
		document_ariesWebContestPageIf().performTest(AriesWebContestPageIframe_AriesWebContestPageIframe_3VP());
		document_ariesWebContestPageIf().click(atPoint(1130,378));
		// Document: Contest page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/contest.htm
		text_name().click(atPoint(122,19));
		browser_htmlBrowser(document_httpCivcez229NonprodH(),DEFAULT_FLAGS).inputKeys("{BKSP}A");
		text_name().performTest(Name_text_2VP());
		button_yesIWantToRegisterToWin().click();
		document_httpCivcez229NonprodH().performTest(httpCivcez229NonprodHclpnpComA_httpCivcez229NonprodHclpnpComAVP());
		browser_htmlBrowser(document_httpCivcez229NonprodH(),DEFAULT_FLAGS).click(atPoint(63,58));
		// Document: Aries-web contest page - Iframe: http://civcez229.nonprod.hclpnp.com/aries-web/iframe/aries-webContestPageiframe.html
		document_ariesWebContestPageIf().drag(atPoint(1710,459), 
                                        atPoint(1716,541));
		text_htmlINPUTText().click(atPoint(28,12));
		browser_htmlBrowser(document_httpCivcez229NonprodH(),DEFAULT_FLAGS).inputKeys("Test {BKSP}ing r{BKSP}RFT TestUserA details");
		text_htmlINPUTText().performTest(TestingRFTTestUserADetails_textVP());
		// Document: Contest page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/contest.htm
		button_reset().click();
		//document_httpCivcez229NonprodH().performTest(httpCivcez229NonprodHclpnpComA_httpCivcez229NonprodHclpnpComA_2VP());
		// Document: Aries-web contest page - Iframe: http://civcez229.nonprod.hclpnp.com/aries-web/iframe/aries-webContestPageiframe.html
		// Document: Contest page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/contest.htm
		table_htmlTable_0().performTest(HtmlTable_0_contentswithchildren_3VP());
		browser_htmlBrowser(document_httpCivcez229NonprodH(),DEFAULT_FLAGS).close();
		
		
	}
}

