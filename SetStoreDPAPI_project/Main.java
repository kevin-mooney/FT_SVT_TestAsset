
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
 * @author jhansi.m
 */
public class Main extends MainHelper
{
	/**
	 * Script Name   : <b>Main</b>
	 * Generated     : <b>Mar 15, 2020 10:40:43 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 15063 ()
	 * 
	 * @since  2020/03/15
	 * @author jhansi.m
	 */
	public void testMain(Object[] args) 
	{
		callScript("Private_script1", DEFAULT_ARGS, DP_ALL);
		
		//callScript("Private_script1", DEFAULT_ARGS, DP_SHARE_CURRENT_RECORD);
		
	}
}

