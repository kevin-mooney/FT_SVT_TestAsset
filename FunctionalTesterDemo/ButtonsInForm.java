
import resources.ButtonsInFormHelper;
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
 * @author vatsalas
 */
public class ButtonsInForm extends ButtonsInFormHelper
{
	/**
	 * Script Name   : <b>ButtonsInForm</b>
	 * Generated     : <b>May 12, 2020 7:25:21 AM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 17763 ()
	 * 
	 * @since  2020/05/12
	 * @author vatsalas
	 */
	public void testMain(Object[] args) 
	{
		// TODO Insert code here
		
		// HTML Browser
		// Document: Contest page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/contest.htm
		button_reset().click();
		
		callScript("CompleteForm");

		button_yesIWantToRegisterToWin().click();
		
		//browser_htmlBrowser(document_contestPage(),DEFAULT_FLAGS).close();
		
	}
}

