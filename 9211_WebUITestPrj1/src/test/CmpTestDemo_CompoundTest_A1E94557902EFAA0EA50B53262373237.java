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
public class CmpTestDemo_CompoundTest_A1E94557902EFAA0EA50B53262373237
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CmpTestDemo_CompoundTest_A1E94557902EFAA0EA50B53262373237(IContainer parent, String name) {
		super(parent, "cmpTestDemo", "A1E94557902EFAA0EA50B53262373237");
	}

	public void execute() {

		this.add(new test.PlantsByWebSphere_Test_A1E945565ACBCB00EA50B53262373237(this,
				"A1E94557956A6540EA50B53262373237") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}