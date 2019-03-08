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
public class CompoundTest_A1E9418F76E10D20E3F2E53064333630
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_A1E9418F76E10D20E3F2E53064333630(IContainer parent, String name) {
		super(parent, "WebUI+RPT", "A1E9418F76E10D20E3F2E53064333630");
	}

	public void execute() {

		this.add(new test.ChromeWiki_Test_A1E93F3A5F86BEB0E874B13063393834(this, "A1E9418F7D1D1EE0E3F2E53064333630") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		IContainer testMethod_1 = (IContainer) loadTest(this, "Repoproject95",
				"test.Httptest1_Test_A1E93AA982C28160E222E66163616239", "A1E9418F86739000E3F2E53064333630");
		testMethod_1.setRtbEnabled(false);
		this.add(testMethod_1);

		super.execute();
	}

}