
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
	 * Generated     : <b>Apr 22, 2019 3:01:30 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 17134 ()
	 * 
	 * @since  2019/04/22
	 * @author jhansi.m
	 */
	public void testMain(Object[] args) 
	{
		startApp("ClassicsJavaA");
		
		// Frame: ClassicsCD
		// TabbedPage
		schubert4_14Jpg().performTest(Schubert4_14Jpg_icontextVP());
		placeOrder().performTest(PlaceOrder_standardVP());
		tree2().click(atPath("Composers->Schubert->Location(PLUS_MINUS)"));
		tree2().click(atPath("Composers->Schubert->String Quartets Nos. 4 & 14"));
		placeOrder().click();
		
		// Frame: Member Logon
		memberLogon().performTest(MemberLogon_standardVP());
		ok().click();
		
		// Frame: Place an Order
		cardNumberIncludeTheSpaces().click(atPoint(104,7));
		placeAnOrder().inputKeys(dpString("CARD NUM"));
		expirationDate().click(atPoint(21,10));
		placeAnOrder().inputKeys(dpString("EXP DATE"));
		placeOrder2().click();
		
		// 
		message().performTest(Message_standardVP());
		ok2().drag();
		
		// Frame: ClassicsCD
		classicsCD(ANY,MAY_EXIT).close();
	}
}

