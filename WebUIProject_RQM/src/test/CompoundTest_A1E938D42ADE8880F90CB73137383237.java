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
public class CompoundTest_A1E938D42ADE8880F90CB73137383237
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_A1E938D42ADE8880F90CB73137383237(IContainer parent, String name) {
		super(parent, "cmptest-1", "A1E938D42ADE8880F90CB73137383237");
	}

	public void execute() {

		this.add(new test.Test_A1E938D3B5E8D260F90CB73137383237(this, "A1EA101A5B87C500C1E0B53937613333") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}