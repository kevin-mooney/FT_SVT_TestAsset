
import resources.Native_HTML_FF1Helper;
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
 * @author jhansi.m
 */
public class Native_HTML_FF1 extends Native_HTML_FF1Helper
{
	/**
	 * Script Name   : <b>Native_HTML_FF1</b>
	 * Generated     : <b>May 29, 2020 1:46:30 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 15063 ()
	 * 
	 * @since  2020/05/29
	 * @author jhansi.m
	 */
	public void testMain(Object[] args) 
	{
		startBrowser("mozilla firefox","https://www.ibm.com/in-en");
		sleep(8);
		
		browser_htmlBrowser(document_ibmIndia(),DEFAULT_FLAGS).maximize();
		
		// HTML Browser
		// Document: IBM - India: https://www.ibm.com/in-en
		link_ibm().click();
		link_mhitemMms1().performTest(mhitemMms1_textVP());
		link_mhitemMms2().performTest(mhitemMms2_textVP());
		link_mhitemMms4().performTest( mhitemMms4_textVP() );
		link_mhitemMms4().click();
		// Document: IBM Support - India: https://www.ibm.com/support/in/en/?lnk=msu_inen
		html_ibmLeadspaceBody().performTest(ibmLeadspaceBody_textVP());
		text_q().setText(dpString("Search"));
		text_q().click();
		browser_htmlBrowser(document_ibmSupportIndia(),DEFAULT_FLAGS).inputKeys("{ENTER}");
		// Document: IBM Search: https://www.ibm.com/search?lang=en&cc=in&q=test1
		sleep(5);
//		link_htmlA().click();
//	
//		// Document: IBM - India: https://www.ibm.com/in-en
//		link_mhitemMms0().performTest(mhitemMms0_textVP());
//		browser_htmlBrowser(document_ibmIndia(),DEFAULT_FLAGS).close();
		
		// HTML Browser
		// Document: IBM - India: https://www.ibm.com/in-en

		browser_htmlBrowser(document_ibmSearch(),DEFAULT_FLAGS).close();
		
		
	}
}

