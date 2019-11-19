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
public class CompoundTest_A1E938D6EF6792D0EC4AB63632346638
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTestInSchedule {

	public CompoundTest_A1E938D6EF6792D0EC4AB63632346638(IContainer parent, String invocationId) {
		super(parent, "cmptest-7", invocationId, "A1E938D6EF6792D0EC4AB63632346638");
	}

	public void execute() {

		this.add(new test.Test_A1E938D3B5E8D260F90CB73137383237(this, "A1E938D4342939D0F90CB73137383237") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}