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
public class CompNav1_CompoundTest_A1E93E6A7788A490EB42E53034336137
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompNav1_CompoundTest_A1E93E6A7788A490EB42E53034336137(IContainer parent, String name) {
		super(parent, "CompNav1", "A1E93E6A7788A490EB42E53034336137");
	}

	public void execute() {

		this.add(new test.FirstDummyTest_Test_A1E92F58589ECB20EC36E43439636630(this,
				"A1E93E6A8F262CD0EB42E53034336137") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}