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
public class WebUI_Simple_DS_Script_CompoundTest_A1E96D68CBDB3D00C374B26364316464
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public WebUI_Simple_DS_Script_CompoundTest_A1E96D68CBDB3D00C374B26364316464(IContainer parent, String name) {
		super(parent, "WebUI_Simple_DS_Script", "A1E96D68CBDB3D00C374B26364316464");
	}

	public void execute() {

		this.add(new test.Google_Test_A1E95F5FBA0A9BA0F68AB13161646436(this, "A1E96D68E6F84F10C374B26364316464") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}