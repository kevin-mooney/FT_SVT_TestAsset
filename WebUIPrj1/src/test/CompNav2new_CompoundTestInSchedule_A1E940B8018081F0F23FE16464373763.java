/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.For;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import java.util.HashMap;

@SuppressWarnings("all")
public class CompNav2new_CompoundTestInSchedule_A1E940B8018081F0F23FE16464373763
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTestInSchedule {

	public CompNav2new_CompoundTestInSchedule_A1E940B8018081F0F23FE16464373763(IContainer parent, String invocationId) {
		super(parent, "CompNav2new", invocationId, "A1E940B8018081F0F23FE16464373763");
	}

	public void execute() {

		For loopNm_1 = Loop_1(this);
		this.add(loopNm_1);
		loopNm_1.addVarsToInit(null);

		super.execute();
	}

	private For Loop_1(IContainer parent) {
		For forLoop = new For(parent, "Loop1", "A1E956BE6E630970F2A0B23032376134", 0, 0, 0, 2, 1, true, false, null) {

			public void executeLoop() {

				IContainer testMethod_1 = (IContainer) loadTest(this, "FirstDummyProject",
						"test.FirstDummyTest_Test_A1E92F58589ECB20EC36E43439636630",
						"A1E940B804FE5E10F23FE16464373763");
				testMethod_1.setRtbEnabled(false);
				this.add(testMethod_1);

				super.executeLoop();
			}

		};
		return forLoop;
	}

}