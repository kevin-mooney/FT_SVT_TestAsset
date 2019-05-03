package package_java;

import org.eclipse.hyades.test.common.event.VerdictEvent;

import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;
import com.ibm.rational.test.lt.execution.moeb.custom.IMobileWebService;

import com.ibm.rational.test.lt.execution.moeb.custom.MobileWebCustomAccessor;

/**
 * @author unknown
 */
public class printlog implements com.ibm.rational.test.lt.kernel.custom.ICustomCode2 {

	/**
	 * Instances of this will be created using the no-arg constructor.
	 */
	public printlog() {
	}

	/**
	 * For javadoc of ICustomCode2 and ITestExecutionServices interfaces, select 'Help Contents' in the
	 * Help menu and select 'Extending Rational Performance Tester functionality' -> 'Extending test execution with custom code'
	 */
	public String exec(ITestExecutionServices tes, String[] args) {
		IMobileWebService mobileWebService = MobileWebCustomAccessor.getMobileWebService();
		
		if(args[0].contains("none")) { //negative VP - pass if the visiblity is "non" - not visible
			tes.getTestLogManager().reportVerificationPoint("CustomVP", VerdictEvent.VERDICT_PASS);
			
			mobileWebService.reportVerdict(tes, "Web CustomVP ", VerdictEvent.VERDICT_PASS);
			
		} else { // Else it is visible, so report VP failure
			tes.getTestLogManager().reportVerificationPoint("CustomVP", VerdictEvent.VERDICT_FAIL);
			
			mobileWebService.reportVerdict(tes, "Web CustomVP ", VerdictEvent.VERDICT_FAIL);
		}
		return null;
	}

}

