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
public class CompoundTest_A1E94ADE7B809410EC1AE36337323162
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_A1E94ADE7B809410EC1AE36337323162(IContainer parent, String name) {
		super(parent, "WebUI+FT comp test march 2003", "A1E94ADE7B809410EC1AE36337323162");
	}

	public void execute() {

		this.add(new test.Jquery1_Test_A1E94A377BF15120F672B06130326631(this, "A1E94ADE84600070EC1AE36337323162") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(RftTestInvocation_1(this));
		super.execute();
	}

	private com.ibm.rational.test.rtw.rft.codegen.lib.RtwRftScriptExecutor RftTestInvocation_1(IContainer parent) {
		com.ibm.rational.test.rtw.rft.codegen.lib.RtwRftScriptExecutor rtwRftExec = new com.ibm.rational.test.rtw.rft.codegen.lib.RtwRftScriptExecutor(
				this, "Script1");
		rtwRftExec.setProjectPath("FT_Browser");
		rtwRftExec.setExecutionArgs("");
		return rtwRftExec;
	}

}