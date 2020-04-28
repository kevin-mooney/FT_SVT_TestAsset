
import resources.html_8604_NestedFrame2Helper;
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
 * @author JaspreetSinghC
 */
public class html_8604_NestedFrame2 extends html_8604_NestedFrame2Helper
{
	/**
	 * Script Name   : <b>NestedFrame002</b>
	 * Generated     : <b>04-Feb-2019 5:51:27 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.3  Build 9600 ()
	 * 
	 * @since  2019/02/04
	 * @author JaspreetSinghC
	 */
	public void testMain(Object[] args) 
	{
		startApp("http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/start.htm");
		
		// Frame: Java Console
		//close().click();
				
		// HTML Browser
		// Document: Regression Test Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/start.htm
		link_nestedFramesSample1Defect().click();
		// Document: framset niveau 1: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/45282-NestedFrames/Sample1/index.html
		// Document: header: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/45282-NestedFrames/Sample1/header.html
		document_header().performTest(header_headerVP());
		// Document: framset niveau 2: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/45282-NestedFrames/Sample1/framset2.html
		// Document: Left: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/45282-NestedFrames/Sample1/left.html
		document_left().performTest(Left_LeftVP());
		// Document: Right: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/45282-NestedFrames/Sample1/center.html
		document_right().performTest(Right_RightVP());
		// Document: Right: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/45282-NestedFrames/Sample1/right.html
		document_right2().performTest(Right_Right_2VP());
		// Document: header: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/45282-NestedFrames/Sample1/header.html
		document_header().drag(atPoint(1913,24), atPoint(1910,65));
		document_header().drag(atPoint(1912,56), atPoint(1911,28));
		// Document: framset niveau 2: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/45282-NestedFrames/Sample1/framset2.html
		// Document: Right: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/45282-NestedFrames/Sample1/center.html
		image_default1().performTest(default1_default1VP());
		image_default9().performTest(default9_default9VP());
		text_name1().click(atPoint(17,8));
		browser_htmlBrowser(document_framsetNiveau1(),DEFAULT_FLAGS).inputKeys("Sarah Walker{TAB}");
		browser_htmlBrowser(document_framsetNiveau1(),DEFAULT_FLAGS).inputKeys("charles carmichael{TAB}");
		browser_htmlBrowser(document_framsetNiveau1(),DEFAULT_FLAGS).inputKeys("morgan grimes{TAB}");
		browser_htmlBrowser(document_framsetNiveau1(),DEFAULT_FLAGS).inputKeys("john casey{TAB}");
		browser_htmlBrowser(document_framsetNiveau1(),DEFAULT_FLAGS).inputKeys("testing HCL{TAB}");
		browser_htmlBrowser(document_framsetNiveau1(),DEFAULT_FLAGS).inputKeys("IBM test{TAB}");
		browser_htmlBrowser(document_framsetNiveau1(),DEFAULT_FLAGS).inputKeys("john snow{TAB}");
		browser_htmlBrowser(document_framsetNiveau1(),DEFAULT_FLAGS).inputKeys("DIANE LOCKHART{TAB}");
		browser_htmlBrowser(document_framsetNiveau1(),DEFAULT_FLAGS).inputChars("JAMES spader");
		table_htmlTable_0().performTest(HtmlTable_0_gridVP());
		table_htmlTable_0().performTest(HtmlTable_0_contentswithchildrenVP());
		browser_htmlBrowser(document_framsetNiveau1(),DEFAULT_FLAGS).close();
		
	}
}

