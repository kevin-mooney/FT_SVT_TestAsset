/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.execution.moeb.services.MoebFatalErrorEvent;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKThinkControl;
import com.ibm.rational.test.lt.kernel.action.impl.Container;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.action.impl.UserGroup;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.HashMap;

@SuppressWarnings("all")
public class AFT_asset_nav__1_Schedule_N21E8B20004711E98000DA4D1F2AFAAE
		extends com.ibm.rational.test.lt.kernel.action.impl.Schedule {

	public AFT_asset_nav__1_Schedule_N21E8B20004711E98000DA4D1F2AFAAE(IContainer parent, String name) {
		super(parent, name, "N21E8B20004711E98000DA4D1F2AFAAE");
		setThinkMax(2000);
		setThinkScheme(IKThinkControl.RECORDED);

	}

	public void execute() {

		this.addEventBehavior(new RPTEventStructure(new MoebFatalErrorEvent(),
				new RPTStopUserEvent("Playback of Mobile or Web UI step has a fatal error"), 0,
				"Playback of Mobile or Web UI step has a fatal error"));
		this.addEventBehavior(
				new RPTEventStructure(new RPTFailVPEvent(), null, 1, "Content Verification Point failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), null, 1, "Connection failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), null, 1, "Authentication failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(),
				new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
		this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), null, 1, "Failed to extract reference"));
		this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), null, 1, "Substitution failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), null, 1, "Timeout"));
		this.addEventBehavior(
				new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), null, 1, "Custom Verification Point failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(),
				new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1,
				"Custom Code reported an unhandled exception"));

		this.addUserGroup(new UserGroup_1(this));

		this.addUserGroup(new UserGroup_2(this));

		setMaxHealthFailuresToLog(50, -1, 0);
		super.execute();
	}

	public class UserGroup_1 extends UserGroup {

		public UserGroup_1(IContainer parent) {
			super(parent, "chrome 1", "A1E9304742365B17FE67E23836366663");

			setNumUsers(1.0);

		}

		public IContainer createTesterWorkload(IContainer parent) {
			return scenario_1(parent);
		}

		private Container scenario_1(IContainer parent) {
			Container scenario = new Container(parent, "scenario_1", "A1E9304742365B22FE67E23836366663") {

				public void reportStopMessage() {
				}

				public void reportForcedStopMessage() {
				}

				public void execute() {
					this.add(new test.Test1_2__Test_A1E93044968CF3C0FE67E23836366663(this,
							"A1E9304742365B2FFE67E23836366663") {
						public void execute() {
							this.setRtbEnabled(false);
							super.execute();
						}
					});

					this.add(new com.ibm.rational.test.lt.execution.protocol.impl.HTTPUserComplete(this));
					super.execute();
				}
			};

			return scenario;
		}

	}

	public class UserGroup_2 extends UserGroup {

		public UserGroup_2(IContainer parent) {
			super(parent, "chrome 2", "A1E9304742365B3CFE67E23836366663");

			setNumUsers(1.0);

		}

		public IContainer createTesterWorkload(IContainer parent) {
			return scenario_2(parent);
		}

		private Container scenario_2(IContainer parent) {
			Container scenario = new Container(parent, "scenario_2", "A1E9304742365B47FE67E23836366663") {

				public void reportStopMessage() {
				}

				public void reportForcedStopMessage() {
				}

				public void execute() {
					this.add(new test.Test1_3__Test_A1E9304724512620FE67E23836366663(this,
							"A1E9304742365B54FE67E23836366663") {
						public void execute() {
							this.setRtbEnabled(false);
							super.execute();
						}
					});

					this.add(new com.ibm.rational.test.lt.execution.protocol.impl.HTTPUserComplete(this));
					super.execute();
				}
			};

			return scenario;
		}

	}

}