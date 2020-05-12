
import resources.CompleteFormHelper;
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
public class CompleteForm extends CompleteFormHelper
{
	/**
	 * Script Name   : <b>CompleteForm</b>
	 * Generated     : <b>May 11, 2020 2:34:01 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 17763 ()
	 * 
	 * @since  2020/05/11
	 * @author vatsalas
	 */
	public void testMain(Object[] args) 
	{
		// TODO Insert code here
		
		
		// HTML Browser
		// Document: Contest page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/contest.htm
	//	table_htmlTable_0().performTest(HtmlTable_0_standardVP());
		text_name().setText("Vatsala");
		text_address().setText("");
		//text_city().setText();
		text_email().setText("vatsalaswamy.s@hcl.com");
		text_state().setText("Karnata");
		text_zip().setText("577201");
		
		
		
		
	}
}

