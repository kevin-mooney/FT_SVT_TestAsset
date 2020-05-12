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
public class CompoundTest_A1EA94422F534480DE59B93432333664
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_A1EA94422F534480DE59B93432333664(IContainer parent, String name) {
		super(parent, "Comp2_FT+WebUI_1205", "A1EA94422F534480DE59B93432333664");
	}

	public void execute() {

		this.add(RftTestInvocation_1(this));
		this.add(new test.Ch1_Test_A1EA93A2AA28D850DE59B93432333664(this, "A1EA9442B65AD560DE59B93432333664") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Ch2_new_Test_A1EA93A464D39950DE59B93432333664(this, "A1EA9444D5A46830DE59B93432333664") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

	private com.ibm.rational.test.rtw.rft.codegen.lib.RtwRftScriptExecutor RftTestInvocation_1(IContainer parent) {
		com.ibm.rational.test.rtw.rft.codegen.lib.RtwRftScriptExecutor rtwRftExec = new com.ibm.rational.test.rtw.rft.codegen.lib.RtwRftScriptExecutor(
				this, "FT_HTML");
		rtwRftExec.setProjectPath("FT_Traditional");
		rtwRftExec.setExecutionArgs("");
		return rtwRftExec;
	}

}