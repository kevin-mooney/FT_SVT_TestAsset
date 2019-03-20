package CommonUtilities;

import com.rational.test.ft.RationalTestException;
import com.rational.test.ft.object.interfaces.GuiTestObject;
import com.rational.test.ft.object.interfaces.TestObject;
import com.rational.test.ft.script.ITestObjectMethodState;
import com.rational.test.ft.script.RationalTestScript;
import com.rational.test.ft.sys.graphical.Highlighter;

/**
 * Description   : Super class for script helper
 * 
 * @author Tester
 * @since  January 27, 2017
 */
public abstract class HelperSuper_GenericFunctions extends RationalTestScript
{
	/**
	 * Following method can be used to highlight a programmatically during script execution.
	 * As it is implemented in the Helper Superclass, all the scripts that have specified this class as their HelperSuperClass get the functionality.
	 */
	protected void hilightControl(TestObject testObject)
	{
		if(!(testObject instanceof GuiTestObject)){
			throw new RationalTestException("Can't  highlight a NON-UI object");
		}
		GuiTestObject gui = (GuiTestObject)testObject;
		
		Highlighter hilighter = Highlighter.create(gui.getScreenRectangle());
		hilighter.show();    // Highlight the around the control.
		sleep(0.5);           // pause to make the highlighter show for 0.5 seconds.
		hilighter.hide();    // hide it to give a blink effect.
		sleep(0.5);           // pause for another 0.5 seconds.
		hilighter.destroy(); //destroy the Highlighter object.
	}
	
	@Override
	public void onObjectNotFound(ITestObjectMethodState testObjectMethodState) {
		logError("The tool could not find the object it was looking for. Ensure the Java that is being used by the application  is enabled.");
	}
}
