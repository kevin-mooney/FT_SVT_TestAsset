
import resources.Private_script1Helper;
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
public class Private_script1 extends Private_script1Helper
{
	/**
	 * Script Name   : <b>Private_script1</b>
	 * Generated     : <b>Mar 15, 2020 4:03:30 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 15063 ()
	 * 
	 * @since  2020/03/15
	 * @author jhansi.m
	 */
	public void testMain(Object[] args) 
	{
		startApp("ClassicsJavaA");
		
		logInfo("Current:" + getDataSetManager().getDataSetRow().getEntireRow());
		
		// Frame: ClassicsCD
		tree2().drag(atPoint(7,29), atPoint(7,28));
		tree2().click(atPath("Composers->Schubert->String Quartets Nos. 4 & 14"));
		placeOrder().click();
		// Data Driven Code inserted on Mar 15, 2020
		
		// Frame: Member Logon
		ok().click();
		// Data Driven Code inserted on Mar 15, 2020
		
		setDatapool("NeWCoulmn", "NewValue");
		
		logInfo(dpString("NewColumn"));
		
		storeDatapool();
		 
		setDatapool("CardNumberIncludeTheSpaces", "00000");
		//setDatapool("ExpirationDate", "00/00");
	
		// Frame: Place an Order
		cardNumberIncludeTheSpaces().setText(dpString("CardNumberIncludeTheSpaces"));
		expirationDate().setText(dpString("ExpirationDate"));
		placeOrder2().click();
		ok2().click();
		
		setDatapool("NeWCoulmn", "ChangeValue");
		
		logInfo(dpString("NewColumn"));
		
		storeDatapool();
				
		classicsCD(ANY,MAY_EXIT).close();
	}
}

