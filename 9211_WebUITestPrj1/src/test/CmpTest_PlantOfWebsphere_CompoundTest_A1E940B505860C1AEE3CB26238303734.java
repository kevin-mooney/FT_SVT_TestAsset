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
public class CmpTest_PlantOfWebsphere_CompoundTest_A1E940B505860C1AEE3CB26238303734
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CmpTest_PlantOfWebsphere_CompoundTest_A1E940B505860C1AEE3CB26238303734(IContainer parent, String name) {
		super(parent, "CmpTest_PlantOfWebsphere", "A1E940B505860C1AEE3CB26238303734");
	}

	public void execute() {

		this.add(new test.PlantsByWebSphere_VarIntFile_Test_A1E940B59F36D67FEE3CB26238303734(this,
				"A1E942D59CE37390E718E63737666633") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}