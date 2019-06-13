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
public class CompTest_3005_CompoundTest_A1E982A3D1B28AD0DAC2B23765666437
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompTest_3005_CompoundTest_A1E982A3D1B28AD0DAC2B23765666437(IContainer parent, String name) {
		super(parent, "CompTest_3005", "A1E982A3D1B28AD0DAC2B23765666437");
	}

	public void execute() {

		this.add(new test.Ch_w1_Test_A1E9811AD1920010D249B73331306265(this, "A1E982A4025568B0DAC2B23765666437") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}