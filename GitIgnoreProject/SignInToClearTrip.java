
import resources.SignInToClearTripHelper;
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
public class SignInToClearTrip extends SignInToClearTripHelper
{
	/**
	 * Script Name   : <b>SignInToClearTrip</b>
	 * Generated     : <b>11-Jul-2018 12:25:19 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 15063 ()
	 * 
	 * @since  2018/07/11
	 * @author Jhansi.m
	 */
	public void testMain(Object[] args) 
	{
	
		TestObject[] tos = html_userAccountNav().find(atDescendant(".class", "Html.A", ".id", "userAccountLink"));		
		for (TestObject to : tos)
		{
			//highlight(to);
			getScreen().click(((GuiTestObject)to).getScreenPoint());
			sleep(5);
		}
		
		TestObject[] signin = html_userAccountNav().find(atDescendant(".id", "SignIn"));
		for (TestObject to : signin)
		{
			//highlight(to);
			getScreen().click(((GuiTestObject)to).getScreenPoint());
			sleep(5);
		}

		
		TestObject[] email = html_contentFrame().find(atDescendant(".id", "email"));
		sleep(5);
		for (TestObject to : email)
		{
			//highlight(to);
			//getScreen().click(((GuiTestObject)to).getScreenPoint());
			((TextGuiTestObject)to).setText("wilswilson004@gmail.com");
			sleep(5);
		}
		
		TestObject[] password = html_contentFrame().find(atDescendant(".id", "password"));
		
		for (TestObject to : password)
		{
			//highlight(to);
			getScreen().click(((GuiTestObject)to).getScreenPoint());
			((TextGuiTestObject)to).setText("qwer@123");
			sleep(5);
		}
		
	TestObject[] signInButton = html_contentFrame().find(atDescendant(".id", "signInButton"));
		
		for (TestObject to : signInButton)
		{
			//highlight(to);
			getScreen().click(((GuiTestObject)to).getScreenPoint());
			sleep(5);
		}
		
		TestObject[] userAccount =html_userAccountNav().find(atDescendant(".id", "userAccountLink"));
		getScreen().click(((GuiTestObject)userAccount[0]).getScreenPoint());
		
		
		TestObject[] SignOut =html_userAccountMenu().find(atDescendant(".id", "global_signout"));
		sleep(5);
		((GuiTestObject)SignOut[0]).performTest( global_signout_textVP() );

		
	
	
//	private void highlight(TestObject to) {
//		System.out.println(to.getObjectClassName());
//		System.out.println(to.getProperties());
//		GuiTestObject gto = (GuiTestObject) to;
//		Rectangle rec = gto.getScreenRectangle();
//		System.out.println(rec);
//		System.out.println(gto.getScreenPoint());
//		Highlighter h = Highlighter.create(rec);
//		h.show();
//		sleep(3);
//		h.destroy();
//	}
		

	}
}

