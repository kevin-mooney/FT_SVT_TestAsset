
import resources.Script1Helper;
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
public class Script1 extends Script1Helper
{
	/**
	 * Script Name   : <b>Script1</b>
	 * Generated     : <b>Mar 20, 2019 12:38:46 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 17134 ()
	 * 
	 * @since  2019/03/20
	 * @author jhansi.m
	 */
	public void testMain(Object[] args) 
	{
		
		startBrowser("mozilla firefox", "https://www.google.com");
		// HTML Browser
		// Document: Google: https://www.google.com/
		text_search().click(atPoint(303,26));
		browser_htmlBrowser(document_google(),DEFAULT_FLAGS).inputKeys("testing{ENTER}");
		// Document: testing - Google Search: https://www.google.com/search?source=hp&ei=EOeRXIa7L_XVz7sPjJSC4AQ&q=testing&btnK=Google+Search&oq=testing&gs_l=psy-ab.3..0l9j0i131.8120.9253..9584...0.0..0.71.483.7......0....1..gws-wiz.....0.WCs2ygDJQrk
		document_testingGoogleSearch().click(atXpath("//div[@id='rso']/div/div/div/div/div/div/a/h3"));
		// To get the complete hierarchy, use the Insert Test Object option
		// Document: Software testing - Wikipedia: https://en.wikipedia.org/wiki/Software_testing
		document_softwareTestingWikipe().click(atXpath("//li[@id='n-mainpage-description']/a"));
		// To get the complete hierarchy, use the Insert Test Object option
	}
}

