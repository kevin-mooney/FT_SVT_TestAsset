/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import java.util.HashMap;

@SuppressWarnings("all")
public class TestAndroid_CompoundTest_A1E951401A346930CEA1B13934363337
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public TestAndroid_CompoundTest_A1E951401A346930CEA1B13934363337(IContainer parent, String name) {
		super(parent, "testAndroid", "A1E951401A346930CEA1B13934363337");
	}

	public void execute() {

		this.add(SeleniumTest_1(this));
		super.execute();
	}

	private com.ibm.rational.test.rtw.se.codegen.lib.SeleniumScriptExecutor SeleniumTest_1(IContainer parent) {
		com.ibm.rational.test.rtw.se.codegen.lib.SeleniumScriptExecutor selExec = new com.ibm.rational.test.rtw.se.codegen.lib.SeleniumScriptExecutor(
				this, "PerfectoAndroidTest");
		selExec.setProjectPath("PerfectoMobile");
		selExec.setSourcePath("com.hcl.perfecto.test.PerfectoAndroidTest");
		selExec.setIsJunit(true);
		selExec.setExecutionArgs("");
		return selExec;
	}

}