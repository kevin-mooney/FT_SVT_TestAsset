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
public class CompoundTest_WebUI_Performance_CompoundTest_A1E94BA5A025A720D876B96632663263
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_WebUI_Performance_CompoundTest_A1E94BA5A025A720D876B96632663263(IContainer parent,
			String name) {
		super(parent, "CompoundTest_WebUI_Performance", "A1E94BA5A025A720D876B96632663263");
	}

	public void execute() {

		this.add(new test.SearchTest1_Test_A1E943E98691BDD0F7BAB43534643730(this, "A1E94BA5AE2BE4B0D876B96632663263") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		IContainer testMethod_1 = (IContainer) loadTest(this, "New_Perf_project",
				"test.Perf_Test_Test_A1E94BA68E0D6E50D876B96632663263", "A1E94BA97C3A69F0E05EB63637383761");
		testMethod_1.setRtbEnabled(false);
		this.add(testMethod_1);

		super.execute();
	}

}