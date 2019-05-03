package package_java;

import com.ibm.rational.test.lt.core.execution.VerdictEventTester;
import com.ibm.rational.test.lt.execution.moeb.custom.IMobileWebService;
import com.ibm.rational.test.lt.execution.moeb.custom.MobileWebCustomAccessor;
import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;

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
		
		
			tes.getTestLogManager().reportVerificationPoint("CustomVP", VerdictEventTester.VERDICT_PASS_BIT);
			
			mobileWebService.reportVerdict(tes, "Web CustomVP ", VerdictEventTester.VERDICT_PASS_BIT);
			
		
			tes.getTestLogManager().reportVerificationPoint("CustomVP", VerdictEventTester.VERDICT_FAIL_BIT);
			
			mobileWebService.reportVerdict(tes, "Web CustomVP ", VerdictEventTester.VERDICT_FAIL_BIT);
		
		return null;
	}

}
