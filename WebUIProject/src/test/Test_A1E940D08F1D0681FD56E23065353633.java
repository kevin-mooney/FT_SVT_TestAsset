/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM
* IBM Rational Web UI Test
* Copyright IBM Corporation 2013. All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.moeb.action.EndMoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.services.*;
import com.ibm.rational.test.lt.execution.moeb.services.MoebActionFailedEvent;
import com.ibm.rational.test.lt.execution.moeb.services.MoebFatalErrorEvent;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class Test_A1E940D08F1D0681FD56E23065353633 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[1];
	
    
    
	
	public Test_A1E940D08F1D0681FD56E23065353633(IContainer container, String invocationId) {
		super(container, "webuitest-2", invocationId, "A1E940D08F1D0681FD56E23065353633");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		
	}

    public void execute() {
    	try {
			
	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun()){
this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	this.addEventBehavior(new RPTEventStructure(new MoebActionFailedEvent(), new RPTContinueEvent("Playback of Mobile or Web UI Action failed"), 0, "Playback of Mobile or Web UI Action failed"));
	this.addEventBehavior(new RPTEventStructure(new MoebFatalErrorEvent(), new RPTStopUserEvent("Playback of Mobile or Web UI step has a fatal error"), 0, "Playback of Mobile or Web UI step has a fatal error"));
	}
	
	
	        	this.add(varAction_1(this));
	this.add(applicationContext_1(this));
	this.add(applicationContext_2(this));
	this.add(applicationContext_3(this));
	this.add(applicationContext_4(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: Test_A1E940D08F1D0681FD56E23065353633 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		
		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1E938D3B615D5D0F90CB73137383237");	
			vars[0] = new DataVar("RTW_WebUI_Browser_Selection", "Chrome", IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Start www.google.com",
												  "A1E938D3B637DCC0F90CB73137383237",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E938D3B637DCC0F90CB73137383237\",\"application_package\":\"com.ibm.rational.test.mobile.android.browser\",\"application_os\":\"WebUI\",\"isWeb\":false,\"description\":\"Start <b>www.google.com<\\/b>\",\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"start\",\"parameters\":[{\"name\":\"activity\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"com.ibm.rational.test.mobile.android.browser.BrowserMainActivity\"},{\"name\":\"rmot_kind_of_launch\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"playback\"},{\"name\":\"starting_url\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"http:\\/\\/www.google.com\\/?gws_rd=ssl\"},{\"name\":\"web_app_address\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"www.google.com\"},{\"name\":\"web_app_protocol\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"http:\\/\\/\"},{\"name\":\"web_app_context\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"\\/?gws_rd=ssl\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"to_overriden\":true,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"881d2f65-2000-4899-bc12-176ac569099a\",\"timeout\":20}],\"timeout\":10}",
												  "/WebUIProject/Tests/webuitest-2.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Edit text - www.google.com",
												  "A1E938D3B64634A4F90CB73137383237",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E938D3B64634A4F90CB73137383237\",\"preferredThinktime\":0,\"thinktime\":1000,\"isWeb\":false,\"description\":\"Think <i>1,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"881d2f65-2000-4899-bc12-176ac569099a\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Edit text<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"881d2f65-2000-4899-bc12-176ac569099a\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E938D3B64634A4F90CB73137383237\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:321;left:690;bottom:355;right:1210\\\", \\\"Geometry\\\": { \\\"height\\\": 34, \\\"width\\\": 520, \\\"x\\\": 690, \\\"y\\\": 321 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgba(0, 0, 0, 0.87);font-family:arial, sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:34px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:-37px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:start;text-decoration:none solid rgba(0, 0, 0, 0.87);visibility:visible;z-index:auto;\\\", \\\"aria-autocomplete\\\": \\\"both\\\", \\\"aria-haspopup\\\": \\\"false\\\", \\\"aria-label\\\": \\\"Search\\\", \\\"autocapitalize\\\": \\\"off\\\", \\\"autocomplete\\\": \\\"off\\\", \\\"autocorrect\\\": \\\"off\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 355, \\\"class\\\": \\\"gLFyf gsfi\\\", \\\"color\\\": \\\"000000DE\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"arial, sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"jsaction\\\": \\\"paste:puy29d\\\", \\\"left\\\": 690, \\\"line-height\\\": \\\"34\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": -37, \\\"maxlength\\\": \\\"2048\\\", \\\"name\\\": \\\"q\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputtext\\\", \\\"right\\\": 1210, \\\"role\\\": \\\"combobox\\\", \\\"spellcheck\\\": \\\"false\\\", \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgba(0, 0, 0, 0.87)\\\", \\\"title\\\": \\\"Search\\\", \\\"top\\\": 321, \\\"type\\\": \\\"text\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"104\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/body\\\\\\/div\\\\\\/div[3]\\\\\\/form\\\\\\/div[2]\\\\\\/div\\\\\\/div\\\\\\/div\\\\\\/div\\\\\\/input\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Submit button whose Content is Google Search - www.google.com",
												  "A1E938D3B6AE9364F90CB73137383237",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E938D3B6AE9364F90CB73137383237\",\"preferredThinktime\":0,\"thinktime\":1000,\"isWeb\":false,\"description\":\"Think <i>1,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"881d2f65-2000-4899-bc12-176ac569099a\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Submit button<\\/b> whose <b>Content<\\/b> is <b>Google Search<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"881d2f65-2000-4899-bc12-176ac569099a\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E938D3B6AE9364F90CB73137383237\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Google Search\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:393;left:819;bottom:429;right:945\\\", \\\"Geometry\\\": { \\\"height\\\": 36, \\\"width\\\": 126, \\\"x\\\": 819, \\\"y\\\": 393 }, \\\"Style$array$\\\": \\\"background-color:rgb(248, 248, 248);background-repeat:repeat;color:rgb(34, 34, 34);font-family:arial, sans-serif;font-size:13px;font-style:normal;font-weight:700;line-height:27px;margin-bottom:11px;margin-left:4px;margin-right:4px;margin-top:11px;opacity:1;padding-bottom:0px;padding-left:16px;padding-right:16px;padding-top:0px;text-align:center;text-decoration:none solid rgb(34, 34, 34);visibility:visible;z-index:auto;\\\", \\\"aria-label\\\": \\\"Google Search\\\", \\\"background-color\\\": \\\"F8F8F8FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 429, \\\"color\\\": \\\"222222FF\\\", \\\"content\\\": \\\"Google Search\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"arial, sans-serif\\\", \\\"font-size\\\": 13, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"700\\\", \\\"left\\\": 819, \\\"line-height\\\": \\\"27\\\", \\\"margin-bottom\\\": 11, \\\"margin-left\\\": 4, \\\"margin-right\\\": 4, \\\"margin-top\\\": 11, \\\"name\\\": \\\"btnK\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 16, \\\"padding-right\\\": 16, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"inputsubmit\\\", \\\"right\\\": 945, \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(34, 34, 34)\\\", \\\"top\\\": 393, \\\"type\\\": \\\"submit\\\", \\\"value\\\": \\\"Google Search\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"192\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/body\\\\\\/div\\\\\\/div[3]\\\\\\/form\\\\\\/div[2]\\\\\\/div\\\\\\/div[3]\\\\\\/center\\\\\\/input\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputsubmit\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Close browser window - www.google.com",
												  "A1E938D3B6F2EF67F90CB73137383237",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E938D3B6F2EF67F90CB73137383237\",\"revealPref\":\"true\",\"isWeb\":true,\"description\":\"<b>Close<\\/b> browser window\",\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"close\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"881d2f65-2000-4899-bc12-176ac569099a\",\"timeout\":0,\"screenshotPref\":\"ALL\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

}
