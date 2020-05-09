
import resources.FTAriesWebHelper;
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
 * Description : Functional Test Script
 * 
 * @author vatsalas
 */
public class FTAriesWeb extends FTAriesWebHelper {
	/**
	 * Script Name : <b>FTAriesWeb</b> Generated : <b>Apr 3, 2020 5:15:34 PM</b>
	 * Description : Functional Test Script Original Host : WinNT Version 10.0 Build
	 * 17763 ()
	 * 
	 * @since 2020/04/03
	 * @author vatsalas
	 */
	public void testMain(Object[] args) {
		// TODO Insert code here

		startBrowser("Firefox", "http://civcez229.nonprod.hclpnp.com/aries-web/iframe/aries-webContestPageiframe.html");

	//	browser_htmlBrowser().maximize();

		// sample find to locate a text field

		TestObject[] text = null;
		text = table_htmlTable_0().find(atChild(".class", "Html.INPUT.text", ".name", "Name"));
		if (text.length > 0) {
			((GuiTestObject) text[0]).click();
			((TextGuiTestObject) text[0]).setText(dpString("Name"));
		} else {
			logError("not able to find field to enter name");
		}

		// sample text fields

		// text_name().setText("Name");

		text_address().setText(dpString("address 3"));
		text_city().setText(dpString("City"));
		text_state().setText(dpString("State"));
		text_zip().setText(dpString("Zip"));
		text_email().setText(dpString("email"));

		list_position().select(dpString("position"));
		list_salary().select(dpString("salary"));

		text_buyerDescription().setText(dpString("buyerDescription"));
		
		browser_htmlBrowser().close();
	}
}
