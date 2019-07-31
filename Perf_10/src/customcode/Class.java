package customcode;

import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;

/**
 * @author unknown
 */
public class Class implements com.ibm.rational.test.lt.kernel.custom.ICustomCode2 {

	/**
	 * Instances of this will be created using the no-arg constructor.
	 */
	public Class() {
	}

	/**
	 * For javadoc of ICustomCode2 and ITestExecutionServices interfaces, select 'Help Contents' in the
	 * Help menu and select 'Extending Rational Performance Tester functionality' -> 'Extending test execution with custom code'
	 */
	public String exec(ITestExecutionServices tes, String[] args) {
		tes.getTestLogManager().reportMessage(args[0]);
		tes.getTestLogManager().reportMessage(args[1]);
		String count;
		
		count = args[0]+args[1];
		tes.getTestLogManager().reportMessage(count);
		int add= Integer.parseInt(args[0])+Integer.parseInt(args[1]);
		String s= Integer.toString(add);
		tes.getTestLogManager().reportMessage(s);
		return null;
	}

}
