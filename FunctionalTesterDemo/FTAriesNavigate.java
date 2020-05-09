
import resources.FTAriesNavigateHelper;
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
public class FTAriesNavigate extends FTAriesNavigateHelper
{
	/**
	 * Script Name   : <b>FTAriesNavigate</b>
	 * Generated     : <b>May 8, 2020 2:06:17 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 17763 ()
	 * 
	 * @since  2020/05/08
	 * @author vatsalas
	 */
	public void testMain(Object[] args) 
	
	
	{
		//startApp("http://civcez229.nonprod.hclpnp.com/aries-web/index.html");
		startBrowser("Firefox", "http://civcez229.nonprod.hclpnp.com/aries-web/index.html");
		// HTML Browser
		// Document: Aries-web Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/index.html
		link_sampleHTMLSites().click();
		// Document: Aries-web Sample Sites Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/SampleSites.html
		link_visionOfficeProductsSite().click();
		// Document: Vision Office Products Home Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/index.htm
		link_clickHereToWinAFREEComput().click();
		
		
	
	}
}

