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
public class CmpTest5_CompoundTestInSchedule_A1E93B156EDD2760ED24E53863326363
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTestInSchedule {

	public CmpTest5_CompoundTestInSchedule_A1E93B156EDD2760ED24E53863326363(IContainer parent, String invocationId) {
		super(parent, "CmpTest5", invocationId, "A1E93B156EDD2760ED24E53863326363");
	}

	public void execute() {

		IContainer testMethod_1 = (IContainer) loadTest(this, "JqueryUI",
				"test.JqueryAccordion_Test_A1E937F8BB5BE650C8AAE53065613737", "A1E93B15246A5090ED24E53863326363");
		testMethod_1.setRtbEnabled(false);
		this.add(testMethod_1);

		super.execute();
	}

}