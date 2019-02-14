package getUIData;

import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;

/**
 * @author unknown
 */
public class GetData implements com.ibm.rational.test.lt.kernel.custom.ICustomCode2 {

	/**
	 * Instances of this will be created using the no-arg constructor.
	 */
	public GetData() {
	}

	/**
	 * For javadoc of ICustomCode2 and ITestExecutionServices interfaces, select 'Help Contents' in the
	 * Help menu and select 'Extending Rational Performance Tester functionality' -> 'Extending test execution with custom code'
	 */
	public String exec(ITestExecutionServices tes, String[] args) {
		
		String OperatingSys= tes.getValue("OS1", tes.STORAGE_LOCAL); 
		
		int index=tes.getLoopControl().getIterationCount();
		tes.setValue("OS[index]", tes.STORAGE_LOCAL, OperatingSys+"  Navanit");
		tes.getTestLogManager().reportMessage(tes.getValue("OS[index]", tes.STORAGE_LOCAL));
		return null;
	}

}
