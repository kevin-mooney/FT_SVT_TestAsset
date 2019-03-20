
import resources.ClassicsJava_FindBasedScriptHelper;
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

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author Tester
 */
public class ClassicsJava_FindBasedScript extends ClassicsJava_FindBasedScriptHelper
{
	/**
	 * Script Name   : <b>ClassicsJava_FindBasedScript</b>
	 * Generated     : <b>03-Mar-2017 4:36:00 PM</b>
	 * Description   : Functional Test Script.
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2017/03/03
	 * @author Tester
	 * Note- This script does not use the object map. It uses the find API to find the controls and then uses other APIs
	 * to perform actions.
	 */
	public void testMain(Object[] args) 
	{
		logInfo("Starting execution of script " + getScriptName());
		startApp("ClassicsJavaA");
		
		/**
		 * find() API is used to find the controls using the given set of properties.
		 * Following call to find  specifies that  it is looking for controls at the  Child level which has .class property as "ClassicsJava".
		 * find() API returns  an array of objects of type TestObject.
		 */
		TestObject[] classicsJava = find( atChild(".class", "ClassicsJava") );
		int counter = 10;
		while(classicsJava.length == 0)
		{
			sleep(1);
			if(--counter == 0)
			{
				logInfo("Timed out while trying to find ClassicsJava");
				break;
			}
			classicsJava = find( atChild(".class", "ClassicsJava") );
		}
		
		if(classicsJava.length == 0) {
			logError("ClassicsJava applicatio not found. Stopping Execution");
			return;
		}
		
		logInfo("ClassicsJava Found: " + classicsJava.length, ((GuiTestObject)classicsJava[0]).getScreenSnapshot());
		
		hilightControl(classicsJava[0]);
		/**
		 * find() API can also anchored to other TestObject.
		 * Which means that the search will start from the given TestObject.
		 * atDecendant() specifies that the search is expanded to the all the levels of hierarchy.
		 */
		TestObject[] treeControls = classicsJava[0].find(atDescendant(".class","javax.swing.JTree"));
		
		if(treeControls.length == 0)
		{
			logError("Could not find the  JTree");
			return;
		}
		logInfo("treeControls Found: "+ treeControls);
		
		/**
		 *  To perform Actions, the returned object can be cast to GuiTestObject that supports actions like  click()
		 */
		((GuiSubitemTestObject)treeControls[0]).click(atPath("Composers->Schubert->Die schone Mullerin, Op. 25"));
		
		
		/**
		 * Multiple properties can be supplied to the find() API
		 */
		TestObject[] buttons = classicsJava[0].find(atDescendant(".class","javax.swing.JButton","name","placeOrderButton2"));
		hilightControl(buttons[0]);
		((GuiTestObject)buttons[0]).click();
		
		//Clean up once done with the objects, using the unregister() API.
		unregister(classicsJava);
		unregister(treeControls);
		unregister(buttons);
		
		boolean found = false;
		TestObject[] memberFrames = null;
		while( !found)
		{
			int count = 0;
			memberFrames = find(atChild(".class","javax.swing.JFrame",".captionText","Member Logon"));
			if(memberFrames.length == 0)
			{
				sleep(1);
				if(++count > 10)
				{
					logError("Member Logon Frame not found!");
					return;
				}
				
			}
			else
				found = true;
		}	
		
		TestObject radioCandidates[] = memberFrames[0].find(atDescendant(".class","javax.swing.JRadioButton","name","radioButtonA"));
		
		/**
		 * To select a radio button , cast the TestObject to  ToggleGUITestObject and call  select() method.
		 */
		((ToggleGUITestObject)radioCandidates[0]).select();
		hilightControl(radioCandidates[0]);
		
		TestObject[] radioCandidates2 = memberFrames[0].find(atDescendant(".class","javax.swing.JRadioButton","name","radioButtonB"));
		
		/**
		 * getProperty() can be used to retrieve a property from a TestObject.
		 */
		logInfo("New Customer- Status: "+ radioCandidates[0].getProperty("Selected"));
		logInfo("Existing Customer- Status: "+ radioCandidates2[0].getProperty("Selected"));
		
		
		 radioCandidates = memberFrames[0].find(atDescendant(".class","javax.swing.JRadioButton","name","radioButtonB"));
		 
		((ToggleGUITestObject)radioCandidates[0]).select();
		hilightControl(radioCandidates2[0]);
		logInfo("Existing Customer- Status: "+ radioCandidates[0].getProperty("Selected"));
		
		
		/**
		 * Find the JComboBox with name nameCombo
		 */
		TestObject[] combos  = memberFrames[0].find(atChild(".class","javax.swing.JComboBox","name","nameCombo"));
		((TextSelectGuiSubitemTestObject)combos[0]).select("Jack Thompson");
		
		logInfo("Selected Element: "+((TextSelectGuiSubitemTestObject)combos[0]).getSelectedText());
		
		TestObject[] passwords = memberFrames[0].find(atChild(".class","javax.swing.JPasswordField","name",".passText2"));
		((TextGuiSubitemTestObject)passwords[0]).setText("Verify Data");
		
		
		TestObject[] cancelButtons = memberFrames[0].find(atChild(".class","javax.swing.JButton","name","cancel-orderlogon"));
		if( cancelButtons.length == 0 )
		{
			logInfo("Cancel Button not found in Member Logon Frame");
			return;
		}
		
		((GuiTestObject)cancelButtons[0]).click();
		unregister(cancelButtons);
		
		TestObject[] classics = find(atChild(".class","ClassicsJava"));
		TestObject[] menuBars = classics[0].find(atChild(".class","javax.swing.JMenuBar","name","jmb"));
		((GuiSubitemTestObject)menuBars[0]).click(atPath("Order->View Existing Order Status..."));
		
		unregister(classics);
		unregister(menuBars);
		sleep(2);
		
		/**
		 * Find the Frame with caption text  "View Order Status"
		 */
		TestObject[] viewOrders = find(atChild(".class","javax.swing.JFrame",".captionText","View Order Status"));
		if(viewOrders.length == 0)
		{
			logError("View Order Status window not found ", getRootTestObject().getScreenSnapshot());
			return;
			
		}
		
		TestObject[] okButtons=viewOrders[0].find(atDescendant(".class","javax.swing.JButton","name","ok-statuslogon2"));
		((GuiTestObject)okButtons[0]).click();
		unregister(viewOrders);
		
		classics = find(atChild(".class","ClassicsJava"));
		logInfo("Finished Script , Closing Application",((GuiTestObject) classics[0]).getScreenSnapshot());
		
		/**
		 * Cast a top level window to  TopLevelTestObject  and on that we can call close() method.
		 */
		((TopLevelTestObject)classics[0]).close();		
		
	}
}