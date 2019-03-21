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
public class Compound_Http_WebUI_Tests_CompoundTest_A1E94BC6990AF230E05EB63637383761
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public Compound_Http_WebUI_Tests_CompoundTest_A1E94BC6990AF230E05EB63637383761(IContainer parent, String name) {
		super(parent, "Compound_Http_WebUI_Tests", "A1E94BC6990AF230E05EB63637383761");
	}

	public void execute() {

		IContainer testMethod_1 = (IContainer) loadTest(this, "Perf_Project_95",
				"test.HTTPTest_Test_A1E94BC7D96A53B0E05EB63637383761", "A1E94BC8F74A39D0F718E23066653366");
		testMethod_1.setRtbEnabled(false);
		this.add(testMethod_1);

		this.add(new test.SearchTest1_Test_A1E943E98691BDD0F7BAB43534643730(this, "A1E94BC6B491E9A0E05EB63637383761") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}