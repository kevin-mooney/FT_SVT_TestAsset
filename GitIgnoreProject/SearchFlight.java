
import resources.SearchFlightHelper;
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
 * @author Jhansi.m
 */
public class SearchFlight extends SearchFlightHelper
{
	/**
	 * Script Name   : <b>SearchFlight</b>
	 * Generated     : <b>11-Jul-2018 3:03:49 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 15063 ()
	 * 
	 * @since  2018/07/11
	 * @author Jhansi.m
	 */
	public void testMain(Object[] args) 
	{
		//startBrowser("chrome", "https://www.cleartrip.com/");
		// HTML Browser
		// Document: #1 Site for Booking Flights, Hotels, Packages, Trains & Local activities.: https://www.cleartrip.com/
		sleep(5);
		text_anyWorldwideCityOrAirport().click();
		//link_clear().click();
		text_anyWorldwideCityOrAirport().click(atPoint(159,19));
		browser_htmlBrowser(document__1SiteForBookingFligh(),DEFAULT_FLAGS).inputChars(dpString("From"));
		//browser_htmlBrowser(document__1SiteForBookingFligh(),DEFAULT_FLAGS).inputChars("delhi");
		link_uiId10().click();
	
		
		//link_clear2().click();		
		//link_uiId22().hover();
		browser_htmlBrowser(document__1SiteForBookingFligh(),DEFAULT_FLAGS).inputChars(dpString("To"));
		link_uiId22().click();
		text_departDate().setText("Fri, 31 Aug, 2018");
		//link__31().click();
		link_moreSearchOptions().click();
		list_class().click();
		// ignoring the dropdown click, manually add statement for selecting item, use click(atText"item name")
		button_searchFlightssubmit().click();
		button_bookSubmit().click();
		// HTML Browser
		
		
		
		
		
		
		
		// Document: Cleartrip | Book your flight securely in simple steps: https://www.cleartrip.com/flights/itinerary/687664c2bc-0168-40e5-bc70-b13d899a95dc/review
		//label__YesIAcceptTheTermsAndCo().performTest( _YesIAcceptTheTermsAndConditio_textVP() );
		if(!document_cleartripBookYourFlig2().getProperty(".url").toString().contains("review"))
		{
			sleep(10);
		}
		//checkBox_insuranceConfirmon2().performTest( insuranceConfirmon_stateVP() );
		checkBox_insuranceConfirmon().performTest( insuranceConfirmon_stateVP() );
		checkBox_insuranceConfirmon().click();
		sleep(5);
		button_continueBookingbutton().click();
		sleep(2);
		
		
		// HTML Browser
		// Document: Cleartrip | Book your flight securely in simple steps: https://www.cleartrip.com/flights/itinerary/682e8db282-23cb-43f2-a929-bf67a2c02e4a/traveller
		list_adult1STitle2().click();
		list_adult1STitle2().click(atText("Mr"));
		
		
//		list_adult1STitle().click();
		
		// ignoring the dropdown click, manually add statement for selecting item, use click(atText"item name")
		text_adult1SFirstName().click(atPoint(26,19));
		browser_htmlBrowser(document_cleartripBookYourFlig(),DEFAULT_FLAGS).inputChars("Rahul");
		text_adult1SLastName().click(atPoint(53,10));
		browser_htmlBrowser(document_cleartripBookYourFlig(),DEFAULT_FLAGS).inputChars("RRrr");
		button_continuebutton().click();
		//System.out.println(text_creditCardNumberDisp().isShowing());
		//System.out.println(text_creditCardNumberDisp().ensureObjectIsVisible());

		
		if(!document_cleartripBookYourFlig2().getProperty(".url").toString().contains("pay")){
			sleep(5);
		}
//		System.out.println(text_creditCardNumberDisp().isShowing());
//		System.out.println(text_creditCardNumberDisp().ensureObjectIsVisible());
		// Document: Cleartrip | Book your flight securely in simple steps: https://www.cleartrip.com/flights/itinerary/687664c2bc-0168-40e5-bc70-b13d899a95dc/pay
		//html_ccTitle().waitForExistence();
		html_ccTitle2().performTest( ccTitle_textVP() );
		// Document: Cleartrip | Book your flight securely in simple steps: https://www.cleartrip.com/flights/itinerary/687664c2bc-0168-40e5-bc70-b13d899a95dc/review
		image_cleartripIndiaSFavourite().click();
	}
}

