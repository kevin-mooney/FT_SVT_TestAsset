
import resources.html_8604_NestedFrame3Helper;
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
public class html_8604_NestedFrame3 extends html_8604_NestedFrame3Helper
{
	/**
	 * Script Name   : <b>NestedFrame003</b>
	 * Generated     : <b>04-Feb-2019 5:51:39 PM</b>
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
		link_nestedFramesSample2Defect().click();
		// Document: Outer Frame: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/45282-NestedFrames/Sample2/TestFrames/frameset1.htm
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/45282-NestedFrames/Sample2/TestFrames/frame1.htm
		document_httpCivcez229NonprodH().performTest(httpCivcez229NonprodHclpnpComA_httpCivcez229NonprodHclpnpComAVP());
		// Document: Frameset 2: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/45282-NestedFrames/Sample2/TestFrames/frameset2.htm
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/45282-NestedFrames/Sample2/TestFrames/left.htm
		document_httpCivcez229NonprodH2().performTest(httpCivcez229NonprodHclpnpComA_httpCivcez229NonprodHclpnpComA_2VP());
		// Document: Frameset 2: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/45282-NestedFrames/Sample2/TestFrames/framesetlevel2.htm
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/45282-NestedFrames/Sample2/TestFrames/frame3.htm
		document_httpCivcez229NonprodH3().performTest(httpCivcez229NonprodHclpnpComA_httpCivcez229NonprodHclpnpComA_3VP());
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/45282-NestedFrames/Sample2/TestFrames/frame4.htm
		document_httpCivcez229NonprodH4().performTest(httpCivcez229NonprodHclpnpComA_httpCivcez229NonprodHclpnpComA_4VP());
		
		/* Playback failing from here
		 * 
		 */
		
		text_text1().click(atPoint(92,8));
		browser_htmlBrowser(document_outerFrame(),DEFAULT_FLAGS).inputChars("testing by typing into frame 1 textbox. DONE.");
		
		
		// Document: Frameset 2: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/45282-NestedFrames/Sample2/TestFrames/frameset2.htm
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/45282-NestedFrames/Sample2/TestFrames/left.htm
		text_text1_2().click(atPoint(73,8));
		browser_htmlBrowser(document_outerFrame(),DEFAULT_FLAGS).inputKeys("{CAPSLOCK}TESTING INNER LEFT FRAME TEXTBOX");
		// Document: Frameset 2: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/45282-NestedFrames/Sample2/TestFrames/framesetlevel2.htm
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/45282-NestedFrames/Sample2/TestFrames/frame3.htm
		text_text1_3().click(atPoint(16,4));
		browser_htmlBrowser(document_outerFrame(),DEFAULT_FLAGS).inputKeys("{CAPSLOCK}testING INNER inner frame TEXTbox {%}{^}$123");
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/45282-NestedFrames/Sample2/TestFrames/frame4.htm
		text_text1_4().click(atPoint(125,9));
		browser_htmlBrowser(document_outerFrame(),DEFAULT_FLAGS).inputKeys(" 123${%}{^}");
		text_text1_4().click(atPoint(6,11));
		text_text1_4().click(atPoint(6,11));
		text_text1_4().click(SHIFT_LEFT, atPoint(6,11));
		browser_htmlBrowser(document_outerFrame(),DEFAULT_FLAGS).inputChars("T");
		text_text1_4().click(atPoint(6,11));
		browser_htmlBrowser(document_outerFrame(),DEFAULT_FLAGS).inputChars("e");
		text_text1_4().click(atPoint(6,11));
		browser_htmlBrowser(document_outerFrame(),DEFAULT_FLAGS).inputChars("s");
		browser_htmlBrowser(document_outerFrame(),DEFAULT_FLAGS).inputKeys("t m{ExtRight}{ExtRight} {BKSP}{ExtLeft} {ExtHome}Te");
		text_text1_4().performTest(text1_textVP());
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/45282-NestedFrames/Sample2/TestFrames/frame3.htm
		text_text1_3().performTest(text1_text_2VP());
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/45282-NestedFrames/Sample2/TestFrames/left.htm
		text_text1_2().performTest(text1_text_3VP());
		// Document: http://civcez229.nonprod.hclpnp.com/aries-web/samples/nestedframes/45282-NestedFrames/Sample2/TestFrames/frame1.htm
		text_text1().performTest(text1_text_4VP());
		browser_htmlBrowser(document_outerFrame(),DEFAULT_FLAGS).close();
		
	}
}

