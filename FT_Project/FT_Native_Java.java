
import resources.FT_Native_JavaHelper;
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
 * @author swadesh.sagar
 */
public class FT_Native_Java extends FT_Native_JavaHelper
{
	/**
	 * Script Name   : <b>FT_Native_Java</b>
	 * Generated     : <b>May 4, 2020 9:22:57 AM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 17134 ()
	 * 
	 * @since  2020/05/04
	 * @author swadesh.sagar
	 */
	public void testMain(Object[] args) 
	{
		startApp("ClassicsJavaA");
		
		// Frame: ClassicsCD
		tree2().click(atPath("Composers->Haydn->Location(PLUS_MINUS)"));
		tree2().click(atPath("Composers->Haydn->Symphonies Nos. 94 & 98"));
		placeOrder().click();
		
		// Frame: Member Logon
		ok().click();
		
		// Frame: Place an Order
		cancel().click();
		
		// Frame: ClassicsCD
		classicsCD(ANY,MAY_EXIT).close();
	}
}

