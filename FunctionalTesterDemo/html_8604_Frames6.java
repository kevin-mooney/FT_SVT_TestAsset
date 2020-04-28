
import resources.html_8604_Frames6Helper;
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
public class html_8604_Frames6 extends html_8604_Frames6Helper
{
	/**
	 * Script Name   : <b>Frames006</b>
	 * Generated     : <b>04-Feb-2019 1:33:20 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.3  Build 9600 ()
	 * 
	 * @since  2019/02/04
	 * @author JaspreetSinghC
	 */
	public void testMain(Object[] args) 
	{
		startApp("http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html");
		
		// Frame: Java Console
		close().click();
		
		// HTML Browser
		// Document: Frame Example Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/index.html
		// Document: Frame example #6 Page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/frametest/frame6.htm
		/* During Playback: issues below - script not run - tried couple of times, does not click on below link- exec blocked
		 * 
		 */
				
		link_dilbertSite().click();
		
		image_andrewsMcMeelSyndication().performTest(AndrewsMcMeelSyndicationLogo_standardVP());
		image_andrewsMcMeelSyndication().performTest(AndrewsMcMeelSyndicationLogo_AndrewsMcMeelSyndicationLogoVP());
		link_clientLogin().performTest(ClientLogin_textVP());
		link_international().performTest(International_textVP());
		link_nea().performTest(NEA_textVP());
		html_contentWrapper().performTest(contentWrapper_textVP());
		
		document_andrewsMcMeelSyndicat6().drag(
                                        atPoint(399,377), 
                                        atPoint(124,351));
		
		text_searchfor().performTest(searchfor_textVP());
		button_searchsubmit().performTest(Searchsubmit_textVP());
		link_creativeSolutions().performTest(CreativeSolutions_textVP());
		link_about().performTest(About_textVP());
		html_sidebar().performTest(sidebar_textVP());
		html_contentHeader().performTest(contentHeader_textVP());
		image_dilbertSample().performTest(DilbertSample_DilbertSampleVP());
		image_dilbertSample().performTest(DilbertSample_DilbertSample_2VP());
		html_footer().performTest(footer_textVP());
		link_comics().click();
		// Document: Andrews McMeel Syndication - Home: http://syndication.andrewsmcmeel.com/comics
		link_clientLogin2().click();
		// Document: Andrews McMeel Syndication - Home: http://syndication.andrewsmcmeel.com/login
		html_content().performTest(content_textVP());
		browser_htmlBrowser(document_andrewsMcMeelSyndicat(),DEFAULT_FLAGS).click(atPoint(73,60));
		// Document: Andrews McMeel Syndication - Home: http://syndication.andrewsmcmeel.com/comics
		html_majorOverviewHeader().performTest(majorOverviewHeader_textVP());
		document_andrewsMcMeelSyndicat2().drag(
                                        atPoint(235,373), 
                                        atPoint(502,356));
		link_help().click();
		// Document: Andrews McMeel Syndication - Home: http://syndication.andrewsmcmeel.com/help
		html_majorOverviewHeader2().performTest(majorOverviewHeader_text_2VP());
		link_about2().performTest(About_text_2VP());
		link_help2().performTest(Help_textVP());
		link_about3().click();
		// Document: Andrews McMeel Syndication - Home: http://syndication.andrewsmcmeel.com/about
		html_majorOverviewHeader3().performTest(majorOverviewHeader_text_3VP());
		link_creativeSolutions2().click();
		// Document: Andrews McMeel Syndication - Home: http://syndication.andrewsmcmeel.com/solutions
		html_majorOverviewHeader4().performTest(majorOverviewHeader_text_4VP());
		document_andrewsMcMeelSyndicat3().drag(
                                        atPoint(172,383), 
                                        atPoint(457,363));
		html_majorOverviewHeader4().performTest(majorOverviewHeader_majorOverviewHeaderVP());
		browser_htmlBrowser(document_andrewsMcMeelSyndicat3(),DEFAULT_FLAGS).click(atPoint(1927,802));
		image_andrewsMcMeelSyndication2().performTest(AndrewsMcMeelSyndicationPrintS_AndrewsMcMeelSyndicationPrintSVP());
		image_andrewsMcMeelSyndication3().performTest(AndrewsMcMeelSyndicationOnline_AndrewsMcMeelSyndicationOnlineVP());
		browser_htmlBrowser(document_andrewsMcMeelSyndicat3(),DEFAULT_FLAGS).click(atPoint(1927,798));
		link_findOutMoreAboutourPrintS().performTest(FindOutMoreAboutourPrintSoluti_textVP());
		document_andrewsMcMeelSyndicat3().drag(
                                        atPoint(273,373), 
                                        atPoint(483,361));
		link_findOutMoreAboutourMobile().performTest(FindOutMoreAboutourMobileSolut_textVP());
		link_findOutMoreAboutourMobile().click();
		// Document: Andrews McMeel Syndication - Home: http://syndication.andrewsmcmeel.com/solutions/mobile
		html_content2().performTest(content_text_2VP());
		link_cookieChoiceDismiss2().click();
		image_andrewsMcMeelSyndication4().performTest(AndrewsMcMeelSyndicationLogo_AndrewsMcMeelSyndicationLogo_2VP());
		image_andrewsMcMeelSyndication5().performTest(AndrewsMcMeelSyndicationLogo_AndrewsMcMeelSyndicationLogo_3VP());
		text_searchfor2().click(atPoint(107,14));
		browser_htmlBrowser(document_andrewsMcMeelSyndicat4(),DEFAULT_FLAGS).inputChars("comics");
		button_searchsubmit2().click();
		// Document: Andrews McMeel Syndication - Home: http://syndication.andrewsmcmeel.com/comics/stonesoup_espanol
		html_contentHeader2().performTest(contentHeader_text_2VP());
		image_lasHermanasStoneSample().performTest(LasHermanasStoneSample_LasHermanasStoneSampleVP());
		link_subscribeToTheNewsFeed().performTest(SubscribeToTheNewsFeed_textVP());
		browser_htmlBrowser(document_andrewsMcMeelSyndicat5(),DEFAULT_FLAGS).close();
	}
}

