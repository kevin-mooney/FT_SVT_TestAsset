
import resources.FTAriesOpenPageHelper;
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
public class FTAriesOpenPage extends FTAriesOpenPageHelper
{
	/**
	 * Script Name   : <b>FTAriesOpenPage</b>
	 * Generated     : <b>May 8, 2020 1:49:02 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 17763 ()
	 * 
	 * @since  2020/05/08
	 * @author vatsalas
	 */
	public void testMain(Object[] args) 
	{
		startApp("http://civcez229.nonprod.hclpnp.com/aries-web/index.html");
		
		// HTML Browser
		// Document: Aries-web Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/index.html
		table_htmlTable_0().click(atCell(atRow(atIndex(0)), 
                                   atColumn(atIndex(1))));
		// Document: Aries-web Sample Sites Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/SampleSites.html
		link_testQEComponentOwners().click();
		// Document: Vision Office Products Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/index.htm
		document_visionOfficeProductsH().nClick(
                                        6, LEFT, atPoint(215,301));
		// Document: Contest page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/contest.htm
		document_contestPage().nClick(6, LEFT, atPoint(970,52));
		document_contestPage().click(atPoint(1081,54));
		
	}
}

