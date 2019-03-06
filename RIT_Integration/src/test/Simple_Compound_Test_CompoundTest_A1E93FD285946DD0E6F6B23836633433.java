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
public class Simple_Compound_Test_CompoundTest_A1E93FD285946DD0E6F6B23836633433
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public Simple_Compound_Test_CompoundTest_A1E93FD285946DD0E6F6B23836633433(IContainer parent, String name) {
		super(parent, "Simple_Compound_Test", "A1E93FD285946DD0E6F6B23836633433");
	}

	public void execute() {

		this.add(new test.Google_without_DP_Test_A1E93FD216D28C10E6F6B23836633433(this,
				"A1E93FD292E87260E6F6B23836633433") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}