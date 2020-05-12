
import resources.FT_HTML_newHelper;
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
public class FT_HTML_new extends FT_HTML_newHelper
{
	/**
	 * Script Name   : <b>FT_HTML</b>
	 * Generated     : <b>May 12, 2020 2:44:46 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 15063 ()
	 * 
	 * @since  2020/05/12
	 * @author jhansi.m
	 */
	public void testMain(Object[] args) 
	{
		startBrowser("Mozilla Firefox","https://www.google.com");
		
		// HTML Browser
		// Document: Google: https://www.google.com/
		text_search().click(atPoint(108,33));
		browser_htmlBrowser(document_google(),DEFAULT_FLAGS).inputKeys("test{ENTER}");
		browser_htmlBrowser(document_testGoogleSearch(),DEFAULT_FLAGS).close();
	}
}

