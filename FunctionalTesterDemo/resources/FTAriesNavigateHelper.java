// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources;

import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.vp.IFtVerificationPoint;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Script Name   : <b>FTAriesNavigate</b><br>
 * Generated     : <b>2020/05/08 2:07:14 PM</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 10 amd64 10.0 <br>
 * 
 * @since  May 08, 2020
 * @author Tester
 */
public abstract class FTAriesNavigateHelper extends RationalTestScript
{
	/**
	 * htmlBrowser: with default state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : Chrome
	 * 		.processName : chrome.exe
	 */
	protected BrowserTestObject browser_htmlBrowser() 
	{
		return new BrowserTestObject(
                        getMappedTestObject("browser_htmlBrowser"));
	}
	/**
	 * htmlBrowser: with specific test context and state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : Chrome
	 * 		.processName : chrome.exe
	 */
	protected BrowserTestObject browser_htmlBrowser(TestObject anchor, long flags) 
	{
		return new BrowserTestObject(
                        getMappedTestObject("browser_htmlBrowser"), anchor, flags);
	}
	
	/**
	 * ContestPage: with default state.
	 *		.class : Html.HtmlDocument
	 * 		.title : Contest page
	 * 		.url : http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/conte ...
	 */
	protected DocumentTestObject document_contestPage() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_contestPage"));
	}
	/**
	 * ContestPage: with specific test context and state.
	 *		.class : Html.HtmlDocument
	 * 		.title : Contest page
	 * 		.url : http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/conte ...
	 */
	protected DocumentTestObject document_contestPage(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_contestPage"), anchor, flags);
	}
	
	/**
	 * ClickHereToWinAFREEComputerChair: with default state.
	 *		.text : Click here to win a FREE computer chair!
	 * 		.id : 
	 * 		.href : http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/conte ...
	 * 		.class : Html.A
	 * 		.title : 
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_clickHereToWinAFREEComput() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_clickHereToWinAFREEComput"));
	}
	/**
	 * ClickHereToWinAFREEComputerChair: with specific test context and state.
	 *		.text : Click here to win a FREE computer chair!
	 * 		.id : 
	 * 		.href : http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/conte ...
	 * 		.class : Html.A
	 * 		.title : 
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_clickHereToWinAFREEComput(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_clickHereToWinAFREEComput"), anchor, flags);
	}
	
	/**
	 * SampleHTMLSites: with default state.
	 *		.text : Sample HTML Sites
	 * 		.id : 
	 * 		.href : http://civcez229.nonprod.hclpnp.com/aries-web/SampleSites.html
	 * 		.class : Html.A
	 * 		.title : 
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_sampleHTMLSites() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_sampleHTMLSites"));
	}
	/**
	 * SampleHTMLSites: with specific test context and state.
	 *		.text : Sample HTML Sites
	 * 		.id : 
	 * 		.href : http://civcez229.nonprod.hclpnp.com/aries-web/SampleSites.html
	 * 		.class : Html.A
	 * 		.title : 
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_sampleHTMLSites(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_sampleHTMLSites"), anchor, flags);
	}
	
	/**
	 * VisionOfficeProductsSite: with default state.
	 *		.text : Vision Office Products site
	 * 		.id : 
	 * 		.href : http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/index ...
	 * 		.class : Html.A
	 * 		.title : 
	 * 		.name : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject link_visionOfficeProductsSite() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_visionOfficeProductsSite"));
	}
	/**
	 * VisionOfficeProductsSite: with specific test context and state.
	 *		.text : Vision Office Products site
	 * 		.id : 
	 * 		.href : http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/index ...
	 * 		.class : Html.A
	 * 		.title : 
	 * 		.name : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject link_visionOfficeProductsSite(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_visionOfficeProductsSite"), anchor, flags);
	}
	
	

	protected FTAriesNavigateHelper()
	{
		setScriptName("FTAriesNavigate");
	}
	
}

