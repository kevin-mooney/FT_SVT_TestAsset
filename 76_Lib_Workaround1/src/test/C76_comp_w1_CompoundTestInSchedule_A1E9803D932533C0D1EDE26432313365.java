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
public class C76_comp_w1_CompoundTestInSchedule_A1E9803D932533C0D1EDE26432313365
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTestInSchedule {

	public C76_comp_w1_CompoundTestInSchedule_A1E9803D932533C0D1EDE26432313365(IContainer parent, String invocationId) {
		super(parent, "76_comp_w1", invocationId, "A1E9803D932533C0D1EDE26432313365");
	}

	public void execute() {

		this.add(
				new test.C76_Chrome_w1_Test_A1E9803D87394AB0D1EDE26432313365(this, "A1E9803D976E0100D1EDE26432313365") {
					public void execute() {
						this.setRtbEnabled(false);
						super.execute();
					}
				});

		super.execute();
	}

}