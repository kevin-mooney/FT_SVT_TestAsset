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
public class HttpCompoundTest_CompoundTest_A1E93C1E6A90F100F37EE46634363631
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public HttpCompoundTest_CompoundTest_A1E93C1E6A90F100F37EE46634363631(IContainer parent, String name) {
		super(parent, "httpCompoundTest", "A1E93C1E6A90F100F37EE46634363631");
	}

	public void execute() {

		this.add(new test.HttpTest_Test_A1E93C1CB3952E40F7CDB83339623231(this, "A1E93C2003F5A100F37EE46634363631") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}