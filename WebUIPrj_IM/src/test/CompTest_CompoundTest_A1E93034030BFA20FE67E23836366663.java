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
public class CompTest_CompoundTest_A1E93034030BFA20FE67E23836366663
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompTest_CompoundTest_A1E93034030BFA20FE67E23836366663(IContainer parent, String name) {
		super(parent, "CompTest", "A1E93034030BFA20FE67E23836366663");
	}

	public void execute() {

		this.add(new test.Test1_Test_A1E930332F64A0A0FE67E23836366663(this, "A1E93034070D8530FE67E23836366663") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}