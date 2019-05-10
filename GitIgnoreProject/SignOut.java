
import resources.SignOutHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.sys.graphical.Highlighter;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;

import java.awt.Rectangle;

import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author Jhansi.m
 */
public class SignOut extends SignOutHelper
{
	/**
	 * Script Name   : <b>SignOut</b>
	 * Generated     : <b>12-Jul-2018 10:25:05 AM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 15063 ()
	 * 
	 * @since  2018/07/12
	 * @author Jhansi.m
	 */
	public void testMain(Object[] args) 
	{
		
		// HTML Browser
		// Document: #1 Site for Booking Flights, Hotels, Packages, Trains & Local activities.: https://www.cleartrip.com/
//		link_wilswilson004GmailCom().click();
//		link_global_signout().performTest(global_signout_textVP());
//		link_global_signout().click();
		
		TestObject[] userAccount =html_userAccountNav().find(atDescendant(".id", "userAccountLink"));
		getScreen().click(((GuiTestObject)userAccount[0]).getScreenPoint());
//		
//		
//		TestObject[] SignOut =html_home().find(atDescendant(".id", "global_signout"));
//		System.out.println(SignOut.length);

		TestObject[] SignOut =html_userAccountMenu().find(atDescendant(".id", "global_signout"));
		sleep(5);
		for (TestObject to : SignOut)
		{
			
			getScreen().click(((GuiTestObject)to).getScreenPoint());
		
		}
	sleep(5);
	}	

}


