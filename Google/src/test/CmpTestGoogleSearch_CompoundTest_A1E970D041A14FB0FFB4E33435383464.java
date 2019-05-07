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
public class CmpTestGoogleSearch_CompoundTest_A1E970D041A14FB0FFB4E33435383464
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CmpTestGoogleSearch_CompoundTest_A1E970D041A14FB0FFB4E33435383464(IContainer parent, String name) {
		super(parent, "CmpTestGoogleSearch", "A1E970D041A14FB0FFB4E33435383464");
	}

	public void execute() {

		this.add(
				new test.GoogleSearch1_Test_A1E970CFAB8F7EC0FFB4E33435383464(this, "A1E970D047565720FFB4E33435383464") {
					public void execute() {
						this.setRtbEnabled(false);
						super.execute();
					}
				});

		super.execute();
	}

}