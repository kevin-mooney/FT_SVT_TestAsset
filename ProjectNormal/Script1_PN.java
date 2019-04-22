
import resources.Script1_PNHelper;
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
public class Script1_PN extends Script1_PNHelper
{
	/**
	 * Script Name   : <b>Script1_PN</b>
	 * Generated     : <b>Apr 22, 2019 5:14:59 PM</b>
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
		placeOrder().click();
		
		// Frame: Member Logon
		ok().click();
		
		// Frame: Place an Order
		cancel().click();
		
		// Frame: ClassicsCD
		classicsCD(ANY,MAY_EXIT).close();
	}
}

