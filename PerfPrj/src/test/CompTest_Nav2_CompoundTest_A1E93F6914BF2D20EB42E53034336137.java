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
public class CompTest_Nav2_CompoundTest_A1E93F6914BF2D20EB42E53034336137
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompTest_Nav2_CompoundTest_A1E93F6914BF2D20EB42E53034336137(IContainer parent, String name) {
		super(parent, "CompTest_Nav2", "A1E93F6914BF2D20EB42E53034336137");
	}

	public void execute() {

		For loopNm_1 = Loop_1(this);
		this.add(loopNm_1);
		loopNm_1.addVarsToInit(null);

		super.execute();
	}

	private For Loop_1(IContainer parent) {
		For forLoop = new For(parent, "Loop1", "A1E93F691DA30650EB42E53034336137", 0, 0, 0, 200, 1, true, false, null) {

			public void executeLoop() {

				this.add(new test.Test_A1E58C87AC5C458DEF85E23366663430(this, "A1E93F69187EA620EB42E53034336137") {
					public void execute() {
						this.setRtbEnabled(false);
						super.execute();
					}
				});

				super.executeLoop();
			}

		};
		return forLoop;
	}

}