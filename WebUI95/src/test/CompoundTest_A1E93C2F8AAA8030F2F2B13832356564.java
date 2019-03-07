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
public class CompoundTest_A1E93C2F8AAA8030F2F2B13832356564
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_A1E93C2F8AAA8030F2F2B13832356564(IContainer parent, String name) {
		super(parent, "Comp-Results_Verify", "A1E93C2F8AAA8030F2F2B13832356564");
	}

	public void execute() {

		this.add(new test.LaunchTest1_Test_A1E93C2DE074D9E0F2F2B13832356564(this, "A1E93C2F96A8DFD0F2F2B13832356564") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.SearchTest1_Test_A1E93C2E041B7038F2F2B13832356564(this, "A1E93C2F96A9A320F2F2B13832356564") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.BrowseTest1_Test_A1E93C2E2E97720BF2F2B13832356564(this, "A1E93C2F96A891B0F2F2B13832356564") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.LoginTest1_Test_A1E93C2E3D97C72CF2F2B13832356564(this, "A1E93C2F96A95500F2F2B13832356564") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.LaunchTest1_Test_A1E93C2DE074D9E0F2F2B13832356564(this, "A1E93C3153C22FD0CAC9B43235383736") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.SearchTest1_Test_A1E93C2E041B7038F2F2B13832356564(this, "A1E93C3153C256E4CAC9B43235383736") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.LoginTest1_Test_A1E93C2E3D97C72CF2F2B13832356564(this, "A1E93C3153C256E1CAC9B43235383736") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}