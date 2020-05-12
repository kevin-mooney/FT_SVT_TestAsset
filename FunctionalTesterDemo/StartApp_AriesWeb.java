
import resources.StartApp_AriesWebHelper;
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
public class StartApp_AriesWeb extends StartApp_AriesWebHelper
{
	/**
	 * Script Name   : <b>StartApp</b>
	 * Generated     : <b>May 12, 2020 7:07:31 AM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 17763 ()
	 * 
	 * @since  2020/05/12
	 * @author vatsalas
	 */
	public void testMain(Object[] args) 
	{
		// TODO Insert code here
		
		startBrowser("Firefox", "http://civcez229.nonprod.hclpnp.com/aries-web/index.html");
		callScript("FTAriesNavigate");
		callScript("CompleteForm");
		callScript("ButtonsInForm");


	}
}

