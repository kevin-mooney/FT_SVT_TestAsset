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

import com.ibm.rational.test.lt.datacorrelation.datapoolAction.Datapool;
import com.ibm.rational.test.lt.datacorrelation.datapoolAction.DatapoolAction;
import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.moeb.action.EndMoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.services.*;
import com.ibm.rational.test.lt.execution.moeb.services.MoebActionFailedEvent;
import com.ibm.rational.test.lt.execution.moeb.services.MoebFatalErrorEvent;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.For;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class Cleartrip_Test_A1E943EC3FFE8B20F7BAB43534643730 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(2);
	private DataVar[] vars = new DataVar[1];
	
    
    
	
	public Cleartrip_Test_A1E943EC3FFE8B20F7BAB43534643730(IContainer container, String invocationId) {
		super(container, "cleartrip", invocationId, "A1E943EC3FFE8B20F7BAB43534643730");
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
	
	
	        	this.add(datapool_1(this));
	this.add(varAction_1(this));
		For loopNm_1 = Loop_1(this);
		this.add(loopNm_1);
		loopNm_1.addVarsToInit(null);
		
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: Cleartrip_Test_A1E943EC3FFE8B20F7BAB43534643730 ",e);
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
	
	
	private DatapoolAction datapool_1(IContainer parent) {
		DatapoolAction dpAction = new DatapoolAction(parent, "Flight_Search.csv", "A1E943ED16530340F7BAB43534643730", false);
		Datapool dp = new Datapool(
				 "/L1dlYlVJUHJvamVjdC9GbGlnaHRfU2VhcmNoLmNzdg==.csv",
				 "D:\\git\\FT_SVT_TestAsset\\WebUIProject\\Flight_Search.csv",
				 0,
				 true,
				 false,
				 Datapool.SEQUENTIAL,
				 null, 0, false, getVirtualUserName());
		dp.addHarvestInstruction("Column1", dcVars[0], false);
dp.addHarvestInstruction("Column2", dcVars[1], false);
		dpAction.setDatapool(dp);
		return dpAction;
	}

private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1E943EC3FFE8B3EF7BAB43534643730");	
			vars[0] = new DataVar("RTW_WebUI_Browser_Selection", "firefox", IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	private For Loop_1(IContainer parent) {
		For forLoop = new For(parent,
				 "Loop1",
				 "A1E943EFEE7F0FA0FF07E46265393234",
				 0,
				 0,
				 0,
				 2,
				 1,
				 true, 
				 false,
				 null) {

			
		  
		    public void executeLoop() { 
		    	
	
	
	
	               
				this.add(datapool_1(this));
	this.add(applicationContext_1(this));
	this.add(applicationContext_2(this));
	this.add(applicationContext_3(this));
	this.add(applicationContext_4(this));
	this.add(applicationContext_5(this));
	this.add(applicationContext_6(this));
	this.add(applicationContext_7(this));
	this.add(applicationContext_8(this));
	this.add(applicationContext_9(this));
	this.add(applicationContext_10(this));
			super.executeLoop();
		    }
		
		};
		return forLoop;
	}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Start www.cleartrip.com",
												  "A1E943EC400CBBF0F7BAB43534643730",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E943EC400CBBF0F7BAB43534643730\",\"application_package\":\"com.ibm.rational.test.mobile.android.browser\",\"application_os\":\"WebUI\",\"isWeb\":false,\"description\":\"Start <b>www.cleartrip.com<\\/b>\",\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"start\",\"parameters\":[{\"name\":\"activity\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"com.ibm.rational.test.mobile.android.browser.BrowserMainActivity\"},{\"name\":\"rmot_kind_of_launch\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"playback\"},{\"name\":\"starting_url\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"http:\\/\\/www.cleartrip.com\\/\"},{\"name\":\"web_app_address\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"www.cleartrip.com\"},{\"name\":\"web_app_protocol\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"http:\\/\\/\"},{\"name\":\"web_app_context\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"\\/\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"b6549099-0313-418f-9ee9-90381acb5240\",\"timeout\":0}],\"timeout\":10}",
												  "/WebUIProject/Tests/cleartrip.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on JQuery Search field whose Label is From - www.cleartrip.com",
												  "A1E943EC400CBC04F7BAB43534643730",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Click on <b>JQuery Search field<\\/b> whose <b>Label<\\/b> is <b>From<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b6549099-0313-418f-9ee9-90381acb5240\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E943EC400CBC04F7BAB43534643730\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"From\"},\"name\":\"label\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:311;left:116;bottom:339;right:384\\\", \\\"Geometry\\\": { \\\"height\\\": 28, \\\"width\\\": 268, \\\"x\\\": 116, \\\"y\\\": 311 }, \\\"Style$array$\\\": \\\"background-color:rgb(255, 255, 255);background-repeat:repeat;color:rgb(204, 204, 204);font-family:-apple-system, BlinkMacSystemFont, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", Ubuntu, Arial, sans-serif;font-size:13px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:-0.65625px;margin-top:0px;opacity:1;padding-bottom:2px;padding-left:4px;padding-right:4px;padding-top:2px;text-align:start;text-decoration:none solid rgb(204, 204, 204);visibility:visible;z-index:auto;\\\", \\\"autocapitalize\\\": \\\"off\\\", \\\"autocomplete\\\": \\\"off\\\", \\\"autocorrect\\\": \\\"off\\\", \\\"background-color\\\": \\\"FFFFFFFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 339, \\\"class\\\": \\\"keyValue span span24 required arabicChars ui-autocomplete-input placeholderlight\\\", \\\"color\\\": \\\"CCCCCCFF\\\", \\\"content\\\": \\\"Any worldwide city or airport\\\", \\\"data-autocomplete-ui\\\": \\\"true\\\", \\\"data-close\\\": \\\"true\\\", \\\"data-idfield\\\": \\\"from\\\", \\\"data-responsemodifier\\\": \\\"responseModifierFlight\\\", \\\"data-selectionhandler\\\": \\\"originAirlineSelectionHandler\\\", \\\"data-url\\\": \\\"\\\\\\/places\\\\\\/airports\\\\\\/search?string=\\\", \\\"domainName\\\": \\\"jquery\\\", \\\"enabled\\\": true, \\\"etitle\\\": \\\"From\\\", \\\"font-family\\\": \\\"-apple-system, BlinkMacSystemFont, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", Ubuntu, Arial, sans-serif\\\", \\\"font-size\\\": 13, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"FromTag\\\", \\\"label\\\": \\\"From\\\", \\\"left\\\": 116, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": \\\"-0.65625\\\", \\\"margin-top\\\": 0, \\\"name\\\": \\\"origin\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 2, \\\"padding-left\\\": 4, \\\"padding-right\\\": 4, \\\"padding-top\\\": 2, \\\"placeholder\\\": \\\"Any worldwide city or airport\\\", \\\"proxyClass\\\": \\\"JQueryUITextInputProxy\\\", \\\"proxyName\\\": \\\"jqmsearchinput\\\", \\\"right\\\": 384, \\\"tabindex\\\": \\\"4\\\", \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(204, 204, 204)\\\", \\\"title\\\": \\\"Any worldwide city or airport\\\", \\\"tooltip\\\": \\\"Any worldwide city or airport\\\", \\\"top\\\": 311, \\\"type\\\": \\\"text\\\", \\\"value\\\": \\\"\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"609\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id='FromTag']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jqmsearchinput\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value 'Hyderabad' in JQuery Search field whose Label is From - www.cleartrip.com",
												  "A1E943EC40483E62F7BAB43534643730",
												  "{\"variables\":[{\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Hyderabad\",\"key\":\"MOEB_FIELD\\/TPM:A1E943EC4083C0B7F7BAB43534643730\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E943EC40483E62F7BAB43534643730\",\"preferredThinktime\":0,\"thinktime\":1909,\"isWeb\":false,\"description\":\"Think <i>1,909<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"b6549099-0313-418f-9ee9-90381acb5240\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b><subst key=\\\"MOEB_FIELD\\/TPM:A1E943EC4083C0B7F7BAB43534643730\\\">Hyderabad<\\/subst><\\/b>' in <b>JQuery Search field<\\/b> whose <b>Label<\\/b> is <b>From<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b6549099-0313-418f-9ee9-90381acb5240\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E943EC40483E62F7BAB43534643730\",\"substitutionParameters\":[{\"name\":\"newtext\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E943EC4083C0B7F7BAB43534643730\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Hyderabad\"}],\"isWeb\":true,\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"$ref\":\"3\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"From\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:311;left:116;bottom:339;right:384\\\", \\\"Geometry\\\": { \\\"height\\\": 28, \\\"width\\\": 268, \\\"x\\\": 116, \\\"y\\\": 311 }, \\\"Style$array$\\\": \\\"background-color:rgb(255, 255, 255);background-repeat:repeat;color:rgb(0, 0, 0);font-family:-apple-system, BlinkMacSystemFont, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", Ubuntu, Arial, sans-serif;font-size:13px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:-0.65625px;margin-top:0px;opacity:1;padding-bottom:2px;padding-left:4px;padding-right:4px;padding-top:2px;text-align:start;text-decoration:none solid rgb(0, 0, 0);visibility:visible;z-index:auto;\\\", \\\"autocapitalize\\\": \\\"off\\\", \\\"autocomplete\\\": \\\"off\\\", \\\"autocorrect\\\": \\\"off\\\", \\\"background-color\\\": \\\"FFFFFFFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 339, \\\"class\\\": \\\"keyValue span span24 required arabicChars ui-autocomplete-input\\\", \\\"color\\\": \\\"000000FF\\\", \\\"content\\\": \\\"\\\", \\\"data-autocomplete-ui\\\": \\\"true\\\", \\\"data-close\\\": \\\"true\\\", \\\"data-idfield\\\": \\\"from\\\", \\\"data-responsemodifier\\\": \\\"responseModifierFlight\\\", \\\"data-selectionhandler\\\": \\\"originAirlineSelectionHandler\\\", \\\"data-url\\\": \\\"\\\\\\/places\\\\\\/airports\\\\\\/search?string=\\\", \\\"domainName\\\": \\\"jquery\\\", \\\"enabled\\\": true, \\\"etitle\\\": \\\"From\\\", \\\"font-family\\\": \\\"-apple-system, BlinkMacSystemFont, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", Ubuntu, Arial, sans-serif\\\", \\\"font-size\\\": 13, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"FromTag\\\", \\\"label\\\": \\\"From\\\", \\\"left\\\": 116, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": \\\"-0.65625\\\", \\\"margin-top\\\": 0, \\\"name\\\": \\\"origin\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 2, \\\"padding-left\\\": 4, \\\"padding-right\\\": 4, \\\"padding-top\\\": 2, \\\"placeholder\\\": \\\"Any worldwide city or airport\\\", \\\"proxyClass\\\": \\\"JQueryUITextInputProxy\\\", \\\"proxyName\\\": \\\"jqmsearchinput\\\", \\\"right\\\": 384, \\\"tabindex\\\": \\\"4\\\", \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(0, 0, 0)\\\", \\\"title\\\": \\\"Any worldwide city or airport\\\", \\\"tooltip\\\": \\\"Any worldwide city or airport\\\", \\\"top\\\": 311, \\\"type\\\": \\\"text\\\", \\\"value\\\": \\\"\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"871\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id='FromTag']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jqmsearchinput\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/TPM:A1E943EC4083C0B7F7BAB43534643730", 0, 9, false, (IDCCoreVar)dcVars[0], false, "From", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content contains Hyderabad, IN - Rajiv Gandhi International (HYD) - www.cleartrip.com",
												  "A1E943EC4083C0CBF7BAB43534643730",
												  "{\"variables\":[{\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Hyderabad, IN - Rajiv Gandhi International (HYD)\",\"key\":\"MOEB_FIELD\\/IDB:A1E943EC40C1B410F7BAB43534643730\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E943EC4083C0CBF7BAB43534643730\",\"preferredThinktime\":0,\"thinktime\":7443,\"isWeb\":false,\"description\":\"Think <i>7,443<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"b6549099-0313-418f-9ee9-90381acb5240\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> contains <b><subst key=\\\"MOEB_FIELD\\/IDB:A1E943EC40C1B410F7BAB43534643730\\\">Hyderabad, IN - Rajiv Gandhi International (HYD)<\\/subst><\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b6549099-0313-418f-9ee9-90381acb5240\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E943EC4083C0CBF7BAB43534643730\",\"substitutionParameters\":[{\"name\":\"content\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E943EC40C1B410F7BAB43534643730\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Hyderabad, IN - Rajiv Gandhi International (HYD)\"}],\"isWeb\":true,\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"$ref\":\"3\"},\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TContains\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:339;left:117;bottom:366;right:383\\\", \\\"Geometry\\\": { \\\"height\\\": 27, \\\"width\\\": 266, \\\"x\\\": 117, \\\"y\\\": 339 }, \\\"Style$array$\\\": \\\"background-color:rgb(60, 119, 212);background-repeat:repeat;color:rgb(255, 255, 255);font-family:-apple-system, BlinkMacSystemFont, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", Ubuntu, Arial, sans-serif;font-size:13px;font-style:normal;font-weight:400;line-height:13px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:7px;padding-left:7px;padding-right:7px;padding-top:7px;text-align:left;text-decoration:none solid rgb(255, 255, 255);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"3C77D4FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 366, \\\"class\\\": \\\"uiSelected\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Hyderabad, IN - Rajiv Gandhi International (HYD)\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"-apple-system, BlinkMacSystemFont, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", Ubuntu, Arial, sans-serif\\\", \\\"font-size\\\": 13, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"ui-id-4\\\", \\\"left\\\": 117, \\\"line-height\\\": \\\"13\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 7, \\\"padding-left\\\": 7, \\\"padding-right\\\": 7, \\\"padding-top\\\": 7, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 383, \\\"tabindex\\\": \\\"-1\\\", \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"left\\\", \\\"text-decoration\\\": \\\"none solid rgb(255, 255, 255)\\\", \\\"top\\\": 339, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"1589\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/a[@id='ui-id-4']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_2 = new DataSub();
		stepBatch.addDataSub(subContainer_2);
	ISubRule sub_1 = new SubRule("MOEB_FIELD/IDB:A1E943EC40C1B410F7BAB43534643730", 0, 48, false, (IDCCoreVar)dcVars[0], false, "Hyderabad, IN - Rajiv Gandhi International (HYD)", null, 0, false);
	subContainer_2.addSubInstruction(sub_1);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_5(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on JQuery Search field whose Label is To - www.cleartrip.com",
												  "A1E943EC40C1B422F7BAB43534643730",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E943EC40C1B422F7BAB43534643730\",\"preferredThinktime\":0,\"thinktime\":3179,\"isWeb\":false,\"description\":\"Think <i>3,179<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"b6549099-0313-418f-9ee9-90381acb5240\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>JQuery Search field<\\/b> whose <b>Label<\\/b> is <b>To<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b6549099-0313-418f-9ee9-90381acb5240\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E943EC40C1B422F7BAB43534643730\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"To\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:311;left:443;bottom:339;right:712\\\", \\\"Geometry\\\": { \\\"height\\\": 28, \\\"width\\\": 269, \\\"x\\\": 443, \\\"y\\\": 311 }, \\\"Style$array$\\\": \\\"background-color:rgb(255, 255, 255);background-repeat:repeat;color:rgb(204, 204, 204);font-family:-apple-system, BlinkMacSystemFont, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", Ubuntu, Arial, sans-serif;font-size:13px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:-0.65625px;margin-top:0px;opacity:1;padding-bottom:2px;padding-left:4px;padding-right:4px;padding-top:2px;text-align:start;text-decoration:none solid rgb(204, 204, 204);visibility:visible;z-index:auto;\\\", \\\"autocapitalize\\\": \\\"off\\\", \\\"autocomplete\\\": \\\"off\\\", \\\"autocorrect\\\": \\\"off\\\", \\\"background-color\\\": \\\"FFFFFFFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 339, \\\"class\\\": \\\"keyValue span span24 required arabicChars ui-autocomplete-input placeholderlight\\\", \\\"color\\\": \\\"CCCCCCFF\\\", \\\"content\\\": \\\"Any worldwide city or airport\\\", \\\"data-autocomplete-ui\\\": \\\"true\\\", \\\"data-close\\\": \\\"true\\\", \\\"data-idfield\\\": \\\"to\\\", \\\"data-responsemodifier\\\": \\\"responseModifierFlight\\\", \\\"data-selectionhandler\\\": \\\"destinationAirlineSelectionHandler\\\", \\\"data-url\\\": \\\"\\\\\\/places\\\\\\/airports\\\\\\/search?string=\\\", \\\"domainName\\\": \\\"jquery\\\", \\\"enabled\\\": true, \\\"etitle\\\": \\\"To\\\", \\\"font-family\\\": \\\"-apple-system, BlinkMacSystemFont, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", Ubuntu, Arial, sans-serif\\\", \\\"font-size\\\": 13, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"ToTag\\\", \\\"label\\\": \\\"To\\\", \\\"left\\\": 443, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": \\\"-0.65625\\\", \\\"margin-top\\\": 0, \\\"name\\\": \\\"destination\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 2, \\\"padding-left\\\": 4, \\\"padding-right\\\": 4, \\\"padding-top\\\": 2, \\\"placeholder\\\": \\\"Any worldwide city or airport\\\", \\\"proxyClass\\\": \\\"JQueryUITextInputProxy\\\", \\\"proxyName\\\": \\\"jqmsearchinput\\\", \\\"right\\\": 712, \\\"tabindex\\\": \\\"5\\\", \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(204, 204, 204)\\\", \\\"title\\\": \\\"Any worldwide city or airport\\\", \\\"tooltip\\\": \\\"Any worldwide city or airport\\\", \\\"top\\\": 311, \\\"type\\\": \\\"text\\\", \\\"validate\\\": \\\"true\\\", \\\"value\\\": \\\"\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"1677\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id='ToTag']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jqmsearchinput\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_6(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value 'Bangalore' in JQuery Search field whose Label is To - www.cleartrip.com",
												  "A1E943EC40FD3682F7BAB43534643730",
												  "{\"variables\":[{\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Bangalore\",\"key\":\"MOEB_FIELD\\/TPM:A1E943EC4138B8D7F7BAB43534643730\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E943EC40FD3682F7BAB43534643730\",\"preferredThinktime\":0,\"thinktime\":2275,\"isWeb\":false,\"description\":\"Think <i>2,275<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"b6549099-0313-418f-9ee9-90381acb5240\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b><subst key=\\\"MOEB_FIELD\\/TPM:A1E943EC4138B8D7F7BAB43534643730\\\">Bangalore<\\/subst><\\/b>' in <b>JQuery Search field<\\/b> whose <b>Label<\\/b> is <b>To<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b6549099-0313-418f-9ee9-90381acb5240\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E943EC40FD3682F7BAB43534643730\",\"substitutionParameters\":[{\"name\":\"newtext\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E943EC4138B8D7F7BAB43534643730\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Bangalore\"}],\"isWeb\":true,\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"$ref\":\"3\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"To\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:311;left:443;bottom:339;right:712\\\", \\\"Geometry\\\": { \\\"height\\\": 28, \\\"width\\\": 269, \\\"x\\\": 443, \\\"y\\\": 311 }, \\\"Style$array$\\\": \\\"background-color:rgb(255, 255, 255);background-repeat:repeat;color:rgb(0, 0, 0);font-family:-apple-system, BlinkMacSystemFont, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", Ubuntu, Arial, sans-serif;font-size:13px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:-0.65625px;margin-top:0px;opacity:1;padding-bottom:2px;padding-left:4px;padding-right:4px;padding-top:2px;text-align:start;text-decoration:none solid rgb(0, 0, 0);visibility:visible;z-index:auto;\\\", \\\"autocapitalize\\\": \\\"off\\\", \\\"autocomplete\\\": \\\"off\\\", \\\"autocorrect\\\": \\\"off\\\", \\\"background-color\\\": \\\"FFFFFFFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 339, \\\"class\\\": \\\"keyValue span span24 required arabicChars ui-autocomplete-input\\\", \\\"color\\\": \\\"000000FF\\\", \\\"content\\\": \\\"\\\", \\\"data-autocomplete-ui\\\": \\\"true\\\", \\\"data-close\\\": \\\"true\\\", \\\"data-idfield\\\": \\\"to\\\", \\\"data-responsemodifier\\\": \\\"responseModifierFlight\\\", \\\"data-selectionhandler\\\": \\\"destinationAirlineSelectionHandler\\\", \\\"data-url\\\": \\\"\\\\\\/places\\\\\\/airports\\\\\\/search?string=\\\", \\\"domainName\\\": \\\"jquery\\\", \\\"enabled\\\": true, \\\"etitle\\\": \\\"To\\\", \\\"font-family\\\": \\\"-apple-system, BlinkMacSystemFont, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", Ubuntu, Arial, sans-serif\\\", \\\"font-size\\\": 13, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"ToTag\\\", \\\"label\\\": \\\"To\\\", \\\"left\\\": 443, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": \\\"-0.65625\\\", \\\"margin-top\\\": 0, \\\"name\\\": \\\"destination\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 2, \\\"padding-left\\\": 4, \\\"padding-right\\\": 4, \\\"padding-top\\\": 2, \\\"placeholder\\\": \\\"Any worldwide city or airport\\\", \\\"proxyClass\\\": \\\"JQueryUITextInputProxy\\\", \\\"proxyName\\\": \\\"jqmsearchinput\\\", \\\"right\\\": 712, \\\"tabindex\\\": \\\"5\\\", \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(0, 0, 0)\\\", \\\"title\\\": \\\"Any worldwide city or airport\\\", \\\"tooltip\\\": \\\"Any worldwide city or airport\\\", \\\"top\\\": 311, \\\"type\\\": \\\"text\\\", \\\"validate\\\": \\\"true\\\", \\\"value\\\": \\\"\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"1939\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id='ToTag']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jqmsearchinput\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_3 = new DataSub();
		stepBatch.addDataSub(subContainer_3);
	ISubRule sub_2 = new SubRule("MOEB_FIELD/TPM:A1E943EC4138B8D7F7BAB43534643730", 0, 9, false, (IDCCoreVar)dcVars[1], false, "To", null, 0, false);
	subContainer_3.addSubInstruction(sub_2);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_7(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content contains Bangalore, IN - Kempegowda International Airport (BLR) - www.cleartrip.com",
												  "A1E943EC413B02C4F7BAB43534643730",
												  "{\"variables\":[{\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Bangalore, IN - Kempegowda International Airport (BLR)\",\"key\":\"MOEB_FIELD\\/IDB:A1E943EC41743B30F7BAB43534643730\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E943EC413B02C4F7BAB43534643730\",\"preferredThinktime\":0,\"thinktime\":8263,\"isWeb\":false,\"description\":\"Think <i>8,263<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"b6549099-0313-418f-9ee9-90381acb5240\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> contains <b><subst key=\\\"MOEB_FIELD\\/IDB:A1E943EC41743B30F7BAB43534643730\\\">Bangalore, IN - Kempegowda International Airport (BLR)<\\/subst><\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b6549099-0313-418f-9ee9-90381acb5240\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E943EC413B02C4F7BAB43534643730\",\"substitutionParameters\":[{\"name\":\"content\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E943EC41743B30F7BAB43534643730\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Bangalore, IN - Kempegowda International Airport (BLR)\"}],\"isWeb\":true,\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"$ref\":\"3\"},\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TContains\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:339;left:445;bottom:366;right:711\\\", \\\"Geometry\\\": { \\\"height\\\": 27, \\\"width\\\": 266, \\\"x\\\": 445, \\\"y\\\": 339 }, \\\"Style$array$\\\": \\\"background-color:rgb(60, 119, 212);background-repeat:repeat;color:rgb(255, 255, 255);font-family:-apple-system, BlinkMacSystemFont, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", Ubuntu, Arial, sans-serif;font-size:13px;font-style:normal;font-weight:400;line-height:13px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:7px;padding-left:7px;padding-right:7px;padding-top:7px;text-align:left;text-decoration:none solid rgb(255, 255, 255);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"3C77D4FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 366, \\\"class\\\": \\\"uiSelected\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Bangalore, IN - Kempegowda International Airport (BLR)\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"-apple-system, BlinkMacSystemFont, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", Ubuntu, Arial, sans-serif\\\", \\\"font-size\\\": 13, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"ui-id-6\\\", \\\"left\\\": 445, \\\"line-height\\\": \\\"13\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 7, \\\"padding-left\\\": 7, \\\"padding-right\\\": 7, \\\"padding-top\\\": 7, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 711, \\\"tabindex\\\": \\\"-1\\\", \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"left\\\", \\\"text-decoration\\\": \\\"none solid rgb(255, 255, 255)\\\", \\\"top\\\": 339, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"2652\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/a[@id='ui-id-6']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_4 = new DataSub();
		stepBatch.addDataSub(subContainer_4);
	ISubRule sub_3 = new SubRule("MOEB_FIELD/IDB:A1E943EC41743B30F7BAB43534643730", 0, 54, false, (IDCCoreVar)dcVars[1], false, "Bangalore, IN - Kempegowda International Airport (BLR)", null, 0, false);
	subContainer_4.addSubInstruction(sub_3);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_8(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is 11 located at position 2 - www.cleartrip.com",
												  "A1E943EC41768524F7BAB43534643730",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E943EC41768524F7BAB43534643730\",\"preferredThinktime\":0,\"thinktime\":5929,\"isWeb\":false,\"description\":\"Think <i>5,929<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"b6549099-0313-418f-9ee9-90381acb5240\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>11<\\/b> located at position 2\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b6549099-0313-418f-9ee9-90381acb5240\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E943EC41768524F7BAB43534643730\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"11\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:550;left:123;bottom:584;right:153\\\", \\\"Geometry\\\": { \\\"height\\\": 34, \\\"width\\\": 30, \\\"x\\\": 123, \\\"y\\\": 550 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(255, 255, 255);font-family:-apple-system, BlinkMacSystemFont, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", Ubuntu, Arial, sans-serif;font-size:13px;font-style:normal;font-weight:700;line-height:13px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:13px;padding-left:8px;padding-right:8px;padding-top:8px;text-align:center;text-decoration:none solid rgb(255, 255, 255);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 584, \\\"class\\\": \\\"ui-state-default ui-state-highlight ui-state-active \\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"11\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"-apple-system, BlinkMacSystemFont, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", Ubuntu, Arial, sans-serif\\\", \\\"font-size\\\": 13, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"700\\\", \\\"href\\\": \\\"javascript:void(0);\\\", \\\"left\\\": 123, \\\"line-height\\\": \\\"13\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 13, \\\"padding-left\\\": 8, \\\"padding-right\\\": 8, \\\"padding-top\\\": 8, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 153, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(255, 255, 255)\\\", \\\"top\\\": 550, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"2964\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/body\\\\\\/div\\\\\\/div\\\\\\/table\\\\\\/tbody\\\\\\/tr[3]\\\\\\/td\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\",\"locator\":{\"parameter\":{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"2\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LPosition\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_9(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Submit button whose Content is Search flights - www.cleartrip.com",
												  "A1E943EC41E68504F7BAB43534643730",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E943EC41E68504F7BAB43534643730\",\"preferredThinktime\":0,\"thinktime\":6101,\"isWeb\":false,\"description\":\"Think <i>6,101<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"b6549099-0313-418f-9ee9-90381acb5240\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Submit button<\\/b> whose <b>Content<\\/b> is <b>Search flights<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b6549099-0313-418f-9ee9-90381acb5240\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E943EC41E68504F7BAB43534643730\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Search flights\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:576;left:586;bottom:611;right:712\\\", \\\"Geometry\\\": { \\\"height\\\": 35, \\\"width\\\": 126, \\\"x\\\": 586, \\\"y\\\": 576 }, \\\"Style$array$\\\": \\\"background-color:rgb(235, 94, 7);background-repeat:repeat;color:rgb(249, 249, 249);font-family:-apple-system, BlinkMacSystemFont, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", Ubuntu, Arial, sans-serif;font-size:15px;font-style:normal;font-weight:700;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:6.75px;padding-left:14.25px;padding-right:14.25px;padding-top:6px;text-align:center;text-decoration:none solid rgb(249, 249, 249);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"EB5E07FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 611, \\\"class\\\": \\\"booking large\\\", \\\"color\\\": \\\"F9F9F9FF\\\", \\\"content\\\": \\\"Search flights\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"-apple-system, BlinkMacSystemFont, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", Ubuntu, Arial, sans-serif\\\", \\\"font-size\\\": 15, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"700\\\", \\\"id\\\": \\\"SearchBtn\\\", \\\"left\\\": 586, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": \\\"6.75\\\", \\\"padding-left\\\": \\\"14.25\\\", \\\"padding-right\\\": \\\"14.25\\\", \\\"padding-top\\\": 6, \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"inputsubmit\\\", \\\"right\\\": 712, \\\"tabindex\\\": \\\"10\\\", \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(249, 249, 249)\\\", \\\"title\\\": \\\"Search flights\\\", \\\"top\\\": 576, \\\"type\\\": \\\"submit\\\", \\\"value\\\": \\\"Search flights\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"3238\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id='SearchBtn']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputsubmit\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_10(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Close browser window - www.cleartrip.com",
												  "A1E943EC421D256EF7BAB43534643730",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E943EC421D256EF7BAB43534643730\",\"revealPref\":\"true\",\"isWeb\":true,\"description\":\"<b>Close<\\/b> browser window\",\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"close\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"b6549099-0313-418f-9ee9-90381acb5240\",\"timeout\":0,\"screenshotPref\":\"ALL\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

}
