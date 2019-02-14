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
public class DistributedTests1_Schedule_A1E93044AFCE40F0FE67E23836366663
		extends com.ibm.rational.test.lt.kernel.action.impl.Schedule {

	public DistributedTests1_Schedule_A1E93044AFCE40F0FE67E23836366663(IContainer parent, String name) {
		super(parent, name, "A1E93044AFCE40F0FE67E23836366663");
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

		this.addUserGroup(new UserGroup_3(this));

		this.addUserGroup(new UserGroup_4(this));

		setMaxHealthFailuresToLog(50, -1, 0);
		super.execute();
	}

	public class UserGroup_1 extends UserGroup {

		public UserGroup_1(IContainer parent) {
			super(parent, "chrome 1", "A1E93044AFD2FCCAFE67E23836366663");

			setNumUsers(1.0);

		}

		public IContainer createTesterWorkload(IContainer parent) {
			return scenario_1(parent);
		}

		private Container scenario_1(IContainer parent) {
			Container scenario = new Container(parent, "scenario_1", "A1E93044AFD2FCD5FE67E23836366663") {

				public void reportStopMessage() {
				}

				public void reportForcedStopMessage() {
				}

				public void execute() {
					this.add(new test.Test1_2__Test_A1E93044968CF3C0FE67E23836366663(this,
							"A1E93044AFD2FCE2FE67E23836366663") {
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
			super(parent, "chrome 2", "A1E93044AFD2FCEFFE67E23836366663");

			setNumUsers(1.0);

		}

		public IContainer createTesterWorkload(IContainer parent) {
			return scenario_2(parent);
		}

		private Container scenario_2(IContainer parent) {
			Container scenario = new Container(parent, "scenario_2", "A1E93044AFD56CE0FE67E23836366663") {

				public void reportStopMessage() {
				}

				public void reportForcedStopMessage() {
				}

				public void execute() {
					this.add(new test.Test1_Test_A1E930332F64A0A0FE67E23836366663(this,
							"A1E93044AFD56CEDFE67E23836366663") {
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

	public class UserGroup_3 extends UserGroup {

		public UserGroup_3(IContainer parent) {
			super(parent, "firefox 3", "A1E93044AFD56CFAFE67E23836366663");

			setNumUsers(1.0);

		}

		public IContainer createTesterWorkload(IContainer parent) {
			return scenario_3(parent);
		}

		private Container scenario_3(IContainer parent) {
			Container scenario = new Container(parent, "scenario_3", "A1E93044AFD56D05FE67E23836366663") {

				public void reportStopMessage() {
				}

				public void reportForcedStopMessage() {
				}

				public void execute() {
					this.add(new test.Test1_2__Test_A1E93044968CF3C0FE67E23836366663(this,
							"A1E93044AFD56D12FE67E23836366663") {
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

	public class UserGroup_4 extends UserGroup {

		public UserGroup_4(IContainer parent) {
			super(parent, "firefox 4", "A1E93044AFD56D1FFE67E23836366663");

			setNumUsers(1.0);

		}

		public IContainer createTesterWorkload(IContainer parent) {
			return scenario_4(parent);
		}

		private Container scenario_4(IContainer parent) {
			Container scenario = new Container(parent, "scenario_4", "A1E93044AFD56D2AFE67E23836366663") {

				public void reportStopMessage() {
				}

				public void reportForcedStopMessage() {
				}

				public void execute() {
					this.add(new test.Test1_Test_A1E930332F64A0A0FE67E23836366663(this,
							"A1E93044AFD56D37FE67E23836366663") {
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