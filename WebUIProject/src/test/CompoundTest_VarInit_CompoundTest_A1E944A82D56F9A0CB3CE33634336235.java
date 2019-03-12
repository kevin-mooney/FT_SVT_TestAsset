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
public class CompoundTest_VarInit_CompoundTest_A1E944A82D56F9A0CB3CE33634336235
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_VarInit_CompoundTest_A1E944A82D56F9A0CB3CE33634336235(IContainer parent, String name) {
		super(parent, "CompoundTest_VarInit", "A1E944A82D56F9A0CB3CE33634336235");
	}

	public void execute() {

		this.add(new test.VariableInit_Test_A1E944A79EAF8140CB3CE33634336235(this, "A1E944A833C89A50CB3CE33634336235") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}