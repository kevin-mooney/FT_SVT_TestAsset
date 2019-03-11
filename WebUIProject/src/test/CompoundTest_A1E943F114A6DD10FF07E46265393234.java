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
public class CompoundTest_A1E943F114A6DD10FF07E46265393234
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_A1E943F114A6DD10FF07E46265393234(IContainer parent, String name) {
		super(parent, "DS-CompoundTest", "A1E943F114A6DD10FF07E46265393234");
	}

	public void execute() {

		this.add(new test.Cleartrip_Test_A1E943EC3FFE8B20F7BAB43534643730(this, "A1E943FA63FC87D0CB3CE33634336235") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}