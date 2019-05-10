
import resources.MainHelper;
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
 * @author Jhansi.m
 */
public class Main extends MainHelper
{
	/**
	 * Script Name   : <b>Main</b>
	 * Generated     : <b>12-Jul-2018 10:18:37 AM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 15063 ()
	 * 
	 * @since  2018/07/12
	 * @author Jhansi.m
	 */
	public void testMain(Object[] args) 
	{
		// TODO Insert code here
		startBrowser("chrome", "https://www.cleartrip.com/");
		sleep(3);	
		//callScript("SignIn_Chrome");
		
		callScript("SignInToClearTrip");
		callScript("SearchFlight", DEFAULT_ARGS, DP_ALL);
		callScript("SignOut");
		
		
	}
}

