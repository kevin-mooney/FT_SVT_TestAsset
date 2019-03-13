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
public class Compound_FileInitData_CompoundTest_A1E9455938FFE0D0CB3CE33634336235
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public Compound_FileInitData_CompoundTest_A1E9455938FFE0D0CB3CE33634336235(IContainer parent, String name) {
		super(parent, "Compound_FileInitData", "A1E9455938FFE0D0CB3CE33634336235");
	}

	public void execute() {

		this.add(new test.VarFiledata_Test_A1E94558D48EFD61CB3CE33634336235(this, "A1E9455940CCF2D0CB3CE33634336235") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}