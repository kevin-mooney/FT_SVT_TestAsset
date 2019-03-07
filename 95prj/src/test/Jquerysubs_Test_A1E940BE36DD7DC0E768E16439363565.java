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
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class Jquerysubs_Test_A1E940BE36DD7DC0E768E16439363565 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[2];
	
    
    
	
	public Jquerysubs_Test_A1E940BE36DD7DC0E768E16439363565(IContainer container, String invocationId) {
		super(container, "jquerysubs", invocationId, "A1E940BE36DD7DC0E768E16439363565");
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
	this.add(applicationContext_5(this));
	this.add(applicationContext_6(this));
	this.add(applicationContext_7(this));
	this.add(applicationContext_8(this));
	this.add(applicationContext_9(this));
	this.add(applicationContext_10(this));
	this.add(applicationContext_11(this));
	this.add(applicationContext_12(this));
	this.add(applicationContext_13(this));
	this.add(applicationContext_14(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: Jquerysubs_Test_A1E940BE36DD7DC0E768E16439363565 ",e);
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

	VariableAction vc = new VariableAction(parent, "", "A1E940BE36DD7DDEE768E16439363565");	
			vars[0] = new DataVar("RTW_WebUI_Browser_Selection", "Chrome", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[1] = new DataVar("Quantity", "5", IDataArea.TEST, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Start www.ikea.com",
												  "A1E940BE36E34A20E768E16439363565",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E940BE36E34A20E768E16439363565\",\"application_package\":\"com.ibm.rational.test.mobile.android.browser\",\"application_os\":\"WebUI\",\"isWeb\":false,\"description\":\"Start <b>www.ikea.com<\\/b>\",\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"start\",\"parameters\":[{\"name\":\"activity\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"com.ibm.rational.test.mobile.android.browser.BrowserMainActivity\"},{\"name\":\"rmot_kind_of_launch\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"playback\"},{\"name\":\"starting_url\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"https:\\/\\/www.ikea.com\\/\"},{\"name\":\"web_app_address\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"www.ikea.com\"},{\"name\":\"web_app_protocol\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"https:\\/\\/\"},{\"name\":\"web_app_context\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"\\/\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"to_overriden\":true,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":37}],\"timeout\":10}",
												  "/95prj/Tests/jquerysubs.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Acc\u00E9der au site IKEA.fr - www.ikea.com",
												  "A1E940BE36E43484E768E16439363565",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Acc\\u00e9der au site IKEA.fr<\\/b>\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":16,\"screenshotPref\":\"ALL\",\"uid\":\"A1E940BE36E43484E768E16439363565\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Acc\\u00e9der au site IKEA.fr\"},\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:393;left:80;bottom:450;right:432\\\", \\\"Geometry\\\": { \\\"height\\\": 57, \\\"width\\\": 352, \\\"x\\\": 80, \\\"y\\\": 393 }, \\\"Style$array$\\\": \\\"background-color:rgb(58, 110, 159);background-repeat:repeat;color:rgb(255, 255, 255);font-family:Verdana, Helvetica, Arial, sans-serif;font-size:13px;font-style:normal;font-weight:700;line-height:19.5px;margin-bottom:0px;margin-left:16px;margin-right:0px;margin-top:12px;opacity:1;padding-bottom:18px;padding-left:18px;padding-right:18px;padding-top:18px;text-align:center;text-decoration:none solid rgb(255, 255, 255);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"3A6E9FFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 450, \\\"class\\\": \\\"gateway-header__cta\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Acc\\\\u00e9der au site IKEA.fr\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"Verdana, Helvetica, Arial, sans-serif\\\", \\\"font-size\\\": 13, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"700\\\", \\\"href\\\": \\\"https:\\\\\\/\\\\\\/www.ikea.com\\\\\\/fr\\\\\\/fr\\\\\\/\\\", \\\"left\\\": 80, \\\"line-height\\\": \\\"19.5\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 16, \\\"margin-right\\\": 0, \\\"margin-top\\\": 12, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 18, \\\"padding-left\\\": 18, \\\"padding-right\\\": 18, \\\"padding-top\\\": 18, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 432, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(255, 255, 255)\\\", \\\"top\\\": 393, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"313\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/body\\\\\\/section\\\\\\/div\\\\\\/div[3]\\\\\\/div[2]\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Edit text whose Label is RECHERCHER ... - www.ikea.com",
												  "A1E940BE370B4484E768E16439363565",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E940BE370B4484E768E16439363565\",\"preferredThinktime\":0,\"thinktime\":6121,\"isWeb\":false,\"description\":\"Think <i>6,121<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Edit text<\\/b> whose <b>Label<\\/b> is <b>RECHERCHER ...<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E940BE370B4484E768E16439363565\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"RECHERCHER ...\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:45;left:714;bottom:78;right:952\\\", \\\"Geometry\\\": { \\\"height\\\": 33, \\\"width\\\": 238, \\\"x\\\": 714, \\\"y\\\": 45 }, \\\"Style$array$\\\": \\\"background-color:rgb(255, 255, 255);background-repeat:repeat;color:rgb(51, 51, 51);font-family:Verdana, sans-serif;font-size:12px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:8px;margin-top:2px;opacity:1;padding-bottom:8px;padding-left:8px;padding-right:8px;padding-top:8px;text-align:start;text-decoration:none solid rgb(51, 51, 51);visibility:visible;z-index:auto;\\\", \\\"autocomplete\\\": \\\"off\\\", \\\"background-color\\\": \\\"FFFFFFFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 78, \\\"color\\\": \\\"333333FF\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"Verdana, sans-serif\\\", \\\"font-size\\\": 12, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"search\\\", \\\"label\\\": \\\"RECHERCHER ...\\\", \\\"left\\\": 714, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 8, \\\"margin-top\\\": 2, \\\"name\\\": \\\"query\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 8, \\\"padding-left\\\": 8, \\\"padding-right\\\": 8, \\\"padding-top\\\": 8, \\\"placeholder\\\": \\\"RECHERCHER ...\\\", \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputtext\\\", \\\"right\\\": 952, \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(51, 51, 51)\\\", \\\"top\\\": 45, \\\"type\\\": \\\"text\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"2219\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id='search']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value 'table' in Edit text whose Label is RECHERCHER ... - www.ikea.com",
												  "A1E940BE37648814E768E16439363565",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E940BE37648814E768E16439363565\",\"preferredThinktime\":0,\"thinktime\":1306,\"isWeb\":false,\"description\":\"Think <i>1,306<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>table<\\/b>' in <b>Edit text<\\/b> whose <b>Label<\\/b> is <b>RECHERCHER ...<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E940BE37648814E768E16439363565\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"table\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"RECHERCHER ...\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:45;left:714;bottom:78;right:952\\\", \\\"Geometry\\\": { \\\"height\\\": 33, \\\"width\\\": 238, \\\"x\\\": 714, \\\"y\\\": 45 }, \\\"Style$array$\\\": \\\"background-color:rgb(255, 255, 255);background-repeat:repeat;color:rgb(51, 51, 51);font-family:Verdana, sans-serif;font-size:12px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:8px;margin-top:2px;opacity:1;padding-bottom:8px;padding-left:8px;padding-right:8px;padding-top:8px;text-align:start;text-decoration:none solid rgb(51, 51, 51);visibility:visible;z-index:auto;\\\", \\\"autocomplete\\\": \\\"off\\\", \\\"background-color\\\": \\\"FFFFFFFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 78, \\\"color\\\": \\\"333333FF\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"Verdana, sans-serif\\\", \\\"font-size\\\": 12, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"search\\\", \\\"label\\\": \\\"RECHERCHER ...\\\", \\\"left\\\": 714, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 8, \\\"margin-top\\\": 2, \\\"name\\\": \\\"query\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 8, \\\"padding-left\\\": 8, \\\"padding-right\\\": 8, \\\"padding-top\\\": 8, \\\"placeholder\\\": \\\"RECHERCHER ...\\\", \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputtext\\\", \\\"right\\\": 952, \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(51, 51, 51)\\\", \\\"top\\\": 45, \\\"type\\\": \\\"text\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"3233\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id='search']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_5(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Division whose Content is table basse - www.ikea.com",
												  "A1E940BE37C14E14E768E16439363565",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E940BE37C14E14E768E16439363565\",\"preferredThinktime\":0,\"thinktime\":11662,\"isWeb\":false,\"description\":\"Think <i>11,662<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Division<\\/b> whose <b>Content<\\/b> is <b>table basse<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E940BE37C14E14E768E16439363565\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"table basse\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:78;left:720;bottom:102;right:790\\\", \\\"Geometry\\\": { \\\"height\\\": 24, \\\"width\\\": 70, \\\"x\\\": 720, \\\"y\\\": 78 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(51, 51, 51);font-family:Verdana, Arial, sans-serif;font-size:11px;font-style:normal;font-weight:700;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:left;text-decoration:none solid rgb(51, 51, 51);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 102, \\\"class\\\": \\\"text\\\", \\\"color\\\": \\\"333333FF\\\", \\\"content\\\": \\\"table basse\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"Verdana, Arial, sans-serif\\\", \\\"font-size\\\": 11, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"700\\\", \\\"left\\\": 720, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlElementProxy\\\", \\\"proxyName\\\": \\\"div\\\", \\\"right\\\": 790, \\\"tagname\\\": \\\"div\\\", \\\"text-align\\\": \\\"left\\\", \\\"text-decoration\\\": \\\"none solid rgb(51, 51, 51)\\\", \\\"top\\\": 78, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"6117\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/body\\\\\\/div[4]\\\\\\/ul\\\\\\/li\\\\\\/a\\\\\\/div\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.div\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_6(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image whose Source is /PIAimages/0452461_PE601413_S3.JPG located at position 1 - www.ikea.com",
												  "A1E940BE381D02A4E768E16439363565",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Click on <b>Image<\\/b> whose <b>Source<\\/b> is <b>\\/PIAimages\\/0452461_PE601413_S3.JPG<\\/b> located at position 1\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":25,\"screenshotPref\":\"ALL\",\"uid\":\"A1E940BE381D02A4E768E16439363565\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"src\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"\\/PIAimages\\/0452461_PE601413_S3.JPG\"},\"name\":\"src\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:205;left:549;bottom:452;right:796\\\", \\\"Geometry\\\": { \\\"height\\\": 247, \\\"width\\\": 247, \\\"x\\\": 549, \\\"y\\\": 205 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(51, 153, 253);font-family:Verdana, Arial, sans-serif;font-size:9.6px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:left;text-decoration:none solid rgb(51, 153, 253);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"border\\\": \\\"0\\\", \\\"bottom\\\": 452, \\\"class\\\": \\\"prodImg\\\", \\\"color\\\": \\\"3399FDFF\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"Verdana, Arial, sans-serif\\\", \\\"font-size\\\": \\\"9.6\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"imgThmbProduct4\\\", \\\"left\\\": 549, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlElementProxy\\\", \\\"proxyName\\\": \\\"img\\\", \\\"right\\\": 796, \\\"src\\\": \\\"\\\\\\/PIAimages\\\\\\/0452461_PE601413_S3.JPG\\\", \\\"tagname\\\": \\\"img\\\", \\\"text-align\\\": \\\"left\\\", \\\"text-decoration\\\": \\\"none solid rgb(51, 153, 253)\\\", \\\"top\\\": 205, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"3643\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/img[@id='imgThmbProduct4']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.img\",\"locator\":{\"parameter\":{\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LPosition\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_7(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image whose Source is /PIAimages/0326098_PE518133_S3.JPG - www.ikea.com",
												  "A1E940BE38A7DD84E768E16439363565",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E940BE38A7DD84E768E16439363565\",\"preferredThinktime\":0,\"thinktime\":4123,\"isWeb\":false,\"description\":\"Think <i>4,123<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Image<\\/b> whose <b>Source<\\/b> is <b>\\/PIAimages\\/0326098_PE518133_S3.JPG<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E940BE38A7DD84E768E16439363565\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"src\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"\\/PIAimages\\/0326098_PE518133_S3.JPG\"},\"name\":\"src\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:690;left:247;bottom:804;right:361\\\", \\\"Geometry\\\": { \\\"height\\\": 114, \\\"width\\\": 114, \\\"x\\\": 247, \\\"y\\\": 690 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(51, 153, 253);font-family:Verdana, Arial, sans-serif;font-size:9.6px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:0.8;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:left;text-decoration:none solid rgb(51, 153, 253);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 804, \\\"color\\\": \\\"3399FDFF\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"Verdana, Arial, sans-serif\\\", \\\"font-size\\\": \\\"9.6\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"imgID_1\\\", \\\"left\\\": 247, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"0.8\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlElementProxy\\\", \\\"proxyName\\\": \\\"img\\\", \\\"right\\\": 361, \\\"src\\\": \\\"\\\\\\/PIAimages\\\\\\/0326098_PE518133_S3.JPG\\\", \\\"tagname\\\": \\\"img\\\", \\\"text-align\\\": \\\"left\\\", \\\"text-decoration\\\": \\\"none solid rgb(51, 153, 253)\\\", \\\"top\\\": 690, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"2187\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/img[@id='imgID_1']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.img\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_8(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Edit text whose Label is Quantit\u00E9: - www.ikea.com",
												  "A1E940BE3901BD54E768E16439363565",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E940BE3901BD54E768E16439363565\",\"preferredThinktime\":0,\"thinktime\":6753,\"isWeb\":false,\"description\":\"Think <i>6,753<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Edit text<\\/b> whose <b>Label<\\/b> is <b>Quantit\\u00e9:<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E940BE3901BD54E768E16439363565\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Quantit\\u00e9:\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:515;left:1029;bottom:549;right:1087\\\", \\\"Geometry\\\": { \\\"height\\\": 34, \\\"width\\\": 58, \\\"x\\\": 1029, \\\"y\\\": 515 }, \\\"Style$array$\\\": \\\"background-color:rgb(255, 255, 255);background-repeat:repeat;color:rgb(51, 51, 51);font-family:Verdana, Arial, sans-serif;font-size:13px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:10px;margin-left:0px;margin-right:0px;margin-top:5px;opacity:1;padding-bottom:1px;padding-left:0px;padding-right:0px;padding-top:1px;text-align:center;text-decoration:none solid rgb(51, 51, 51);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"FFFFFFFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 549, \\\"class\\\": \\\"inputQuantity\\\", \\\"color\\\": \\\"333333FF\\\", \\\"content\\\": \\\"1\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"Verdana, Arial, sans-serif\\\", \\\"font-size\\\": 13, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"quantity\\\", \\\"label\\\": \\\"Quantit\\\\u00e9:\\\", \\\"left\\\": 1029, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 10, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 5, \\\"maxlength\\\": \\\"3\\\", \\\"name\\\": \\\"quantity\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 1, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 1, \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputtext\\\", \\\"right\\\": 1087, \\\"size\\\": \\\"3\\\", \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(51, 51, 51)\\\", \\\"title\\\": \\\"Quantit\\\\u00e9\\\", \\\"top\\\": 515, \\\"type\\\": \\\"text\\\", \\\"value\\\": \\\"1\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"3218\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id='quantity']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_9(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value '4' in Edit text whose Label is Quantit\u00E9: - www.ikea.com",
												  "A1E940BE395AD9D4E768E16439363565",
												  "{\"variables\":[{\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"4\",\"key\":\"MOEB_FIELD\\/TPM:A1E940BE39BEF2D7E768E16439363565\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E940BE395AD9D4E768E16439363565\",\"preferredThinktime\":0,\"thinktime\":3818,\"isWeb\":false,\"description\":\"Think <i>3,818<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b><subst key=\\\"MOEB_FIELD\\/TPM:A1E940BE39BEF2D7E768E16439363565\\\">4<\\/subst><\\/b>' in <b>Edit text<\\/b> whose <b>Label<\\/b> is <b>Quantit\\u00e9:<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E940BE395AD9D4E768E16439363565\",\"substitutionParameters\":[{\"name\":\"newtext\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E940BE39BEF2D7E768E16439363565\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"4\"}],\"isWeb\":true,\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"$ref\":\"3\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Quantit\\u00e9:\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:515;left:1029;bottom:549;right:1087\\\", \\\"Geometry\\\": { \\\"height\\\": 34, \\\"width\\\": 58, \\\"x\\\": 1029, \\\"y\\\": 515 }, \\\"Style$array$\\\": \\\"background-color:rgb(255, 255, 255);background-repeat:repeat;color:rgb(51, 51, 51);font-family:Verdana, Arial, sans-serif;font-size:13px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:10px;margin-left:0px;margin-right:0px;margin-top:5px;opacity:1;padding-bottom:1px;padding-left:0px;padding-right:0px;padding-top:1px;text-align:center;text-decoration:none solid rgb(51, 51, 51);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"FFFFFFFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 549, \\\"class\\\": \\\"inputQuantity\\\", \\\"color\\\": \\\"333333FF\\\", \\\"content\\\": \\\"1\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"Verdana, Arial, sans-serif\\\", \\\"font-size\\\": 13, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"quantity\\\", \\\"label\\\": \\\"Quantit\\\\u00e9:\\\", \\\"left\\\": 1029, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 10, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 5, \\\"maxlength\\\": \\\"3\\\", \\\"name\\\": \\\"quantity\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 1, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 1, \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputtext\\\", \\\"right\\\": 1087, \\\"size\\\": \\\"3\\\", \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(51, 51, 51)\\\", \\\"title\\\": \\\"Quantit\\\\u00e9\\\", \\\"top\\\": 515, \\\"type\\\": \\\"text\\\", \\\"value\\\": \\\"1\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"4192\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id='quantity']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/TPM:A1E940BE39BEF2D7E768E16439363565", 0, 1, false, (IDCCoreVar)vars[1], false, "Quantit\u00E9:", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_10(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image button whose Content is Acheter en ligne - www.ikea.com",
												  "A1E940BE39C05264E768E16439363565",
												  "{\"variables\":[{\"id\":\"20\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"4\",\"key\":\"MOEB_FIELD\\/TEX:A1E940D35DBCC44DE768E16439363565\\/TPM:A1E940D35DBCC451E768E16439363565\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E940BE39C05264E768E16439363565\",\"preferredThinktime\":0,\"thinktime\":2306,\"isWeb\":false,\"description\":\"Think <i>2,306<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Verify that <b>Content<\\/b> equals <b>4<\\/b> on <b>Edit text<\\/b> whose <b>Label<\\/b> is <b>Quantit\\u00e9:<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"4\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Content\",\"operator\":\"TEquals\"},\"uid\":\"A1E940C96D3B2E70E768E16439363565\",\"isWeb\":true,\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Quantit\\u00e9:\"},\"name\":\"label\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}},{\"revealPref\":\"true\",\"description\":\"Verify that <b>Content<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E940D35DBCC44DE768E16439363565\\/TPM:A1E940D35DBCC451E768E16439363565\\\">4<\\/subst><\\/b> on <b>Edit text<\\/b> whose <b>Label<\\/b> is <b>Quantit\\u00e9:<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"$ref\":\"9\"},\"name\":\"content\",\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Content\",\"operator\":\"TEquals\"},\"uid\":\"A1E940D35DBCC447E768E16439363565\",\"substitutionParameters\":[{\"name\":\"content\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E940D35DBCC44DE768E16439363565\\/TPM:A1E940D35DBCC451E768E16439363565\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"4\"}],\"isWeb\":true,\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Quantit\\u00e9:\"},\"name\":\"label\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}},{\"revealPref\":\"true\",\"description\":\"Click on <b>Image button<\\/b> whose <b>Content<\\/b> is <b>Acheter en ligne<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E940BE39C05264E768E16439363565\",\"isWeb\":true,\"action\":{\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"19\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Acheter en ligne\"},\"name\":\"content\",\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:559;left:667;bottom:605;right:1087\\\", \\\"Geometry\\\": { \\\"height\\\": 46, \\\"width\\\": 420, \\\"x\\\": 667, \\\"y\\\": 559 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(255, 255, 255);font-family:Verdana;font-size:12px;font-style:normal;font-weight:700;line-height:12px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:17px;padding-left:0px;padding-right:0px;padding-top:17px;text-align:center;text-decoration:none solid rgb(255, 255, 255);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 605, \\\"class\\\": \\\"blueBtn\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Acheter en ligne\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"Verdana\\\", \\\"font-size\\\": 12, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"700\\\", \\\"id\\\": \\\"jsButton_buyOnline_lnk\\\", \\\"left\\\": 667, \\\"line-height\\\": \\\"12\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 17, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 17, \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"button\\\", \\\"right\\\": 1087, \\\"tagname\\\": \\\"button\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(255, 255, 255)\\\", \\\"top\\\": 559, \\\"type\\\": \\\"button\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"6144\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/button[@id='jsButton_buyOnline_lnk']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.button\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_2 = new DataSub();
		stepBatch.addDataSub(subContainer_2);
	ISubRule sub_1 = new SubRule("MOEB_FIELD/TEX:A1E940D35DBCC44DE768E16439363565/TPM:A1E940D35DBCC451E768E16439363565", 0, 1, false, (IDCCoreVar)vars[1], false, "4", null, 0, false);
	subContainer_2.addSubInstruction(sub_1);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_11(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is au panier, cliquer ici pour y acc\u00E9der. - www.ikea.com",
												  "A1E940BE3A249274E768E16439363565",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E940BE3A249274E768E16439363565\",\"preferredThinktime\":0,\"thinktime\":2931,\"isWeb\":false,\"description\":\"Think <i>2,931<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>au panier, cliquer ici pour y acc\\u00e9der.<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E940BE3A249274E768E16439363565\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"au panier, cliquer ici pour y acc\\u00e9der.\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:491;left:696;bottom:517;right:837\\\", \\\"Geometry\\\": { \\\"height\\\": 26, \\\"width\\\": 141, \\\"x\\\": 696, \\\"y\\\": 491 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(51, 153, 253);font-family:Verdana, Arial, sans-serif;font-size:11px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:16.06px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:left;text-decoration:underline solid rgb(51, 153, 253);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 517, \\\"class\\\": \\\"link\\\", \\\"color\\\": \\\"3399FDFF\\\", \\\"content\\\": \\\"au panier, cliquer ici pour y acc\\\\u00e9der.\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"Verdana, Arial, sans-serif\\\", \\\"font-size\\\": 11, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/webapp\\\\\\/wcs\\\\\\/stores\\\\\\/servlet\\\\\\/OrderItemDisplay?storeId=4&langId=-2&catalogId=11001&orderId=.&newLinks=true\\\", \\\"left\\\": 696, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": \\\"16.06\\\", \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"rel\\\": \\\"nofollow\\\", \\\"right\\\": 837, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"left\\\", \\\"text-decoration\\\": \\\"underline solid rgb(51, 153, 253)\\\", \\\"top\\\": 491, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"7125\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/body\\\\\\/div[3]\\\\\\/div\\\\\\/div[4]\\\\\\/div[2]\\\\\\/div\\\\\\/div[3]\\\\\\/div[3]\\\\\\/form\\\\\\/div[3]\\\\\\/div\\\\\\/div\\\\\\/div[2]\\\\\\/div[3]\\\\\\/div\\\\\\/div\\\\\\/div\\\\\\/form\\\\\\/div\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_12(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Tout supprimer - www.ikea.com",
												  "A1E940BE3A950784E768E16439363565",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Tout supprimer<\\/b>\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":37,\"screenshotPref\":\"ALL\",\"uid\":\"A1E940BE3A950784E768E16439363565\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Tout supprimer\"},\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:397;left:955;bottom:413;right:1054\\\", \\\"Geometry\\\": { \\\"height\\\": 16, \\\"width\\\": 99, \\\"x\\\": 955, \\\"y\\\": 397 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(2, 105, 206);font-family:Verdana, Arial, sans-serif;font-size:13px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:right;text-decoration:underline solid rgb(2, 105, 206);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 413, \\\"color\\\": \\\"0269CEFF\\\", \\\"content\\\": \\\"Tout supprimer\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"Verdana, Arial, sans-serif\\\", \\\"font-size\\\": 13, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"link_remove_all_shopping_cart\\\", \\\"left\\\": 955, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 1054, \\\"tagname\\\": \\\"a\\\", \\\"target\\\": \\\"_blank\\\", \\\"text-align\\\": \\\"right\\\", \\\"text-decoration\\\": \\\"underline solid rgb(2, 105, 206)\\\", \\\"top\\\": 397, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"1408\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/a[@id='link_remove_all_shopping_cart']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_13(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Button whose Content is Supprimer - www.ikea.com",
												  "A1E940BE3AD2D3D4E768E16439363565",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E940BE3AD2D3D4E768E16439363565\",\"preferredThinktime\":0,\"thinktime\":1276,\"isWeb\":false,\"description\":\"Think <i>1,276<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Button<\\/b> whose <b>Content<\\/b> is <b>Supprimer<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E940BE3AD2D3D4E768E16439363565\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Supprimer\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:461;left:686;bottom:491;right:779\\\", \\\"Geometry\\\": { \\\"height\\\": 30, \\\"width\\\": 93, \\\"x\\\": 686, \\\"y\\\": 461 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(0, 0, 0);font-family:Verdana, Arial, sans-serif;font-size:12px;font-style:normal;font-weight:700;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:10px;margin-top:0px;opacity:1;padding-bottom:7px;padding-left:10px;padding-right:10px;padding-top:6px;text-align:center;text-decoration:none solid rgb(0, 0, 0);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 491, \\\"color\\\": \\\"000000FF\\\", \\\"content\\\": \\\"Supprimer\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"Verdana, Arial, sans-serif\\\", \\\"font-size\\\": 12, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"700\\\", \\\"left\\\": 686, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 10, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 7, \\\"padding-left\\\": 10, \\\"padding-right\\\": 10, \\\"padding-top\\\": 6, \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputbutton\\\", \\\"right\\\": 779, \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(0, 0, 0)\\\", \\\"top\\\": 461, \\\"type\\\": \\\"button\\\", \\\"value\\\": \\\"Supprimer\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"2278\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/body\\\\\\/div[13]\\\\\\/div[2]\\\\\\/a[2]\\\\\\/input\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputbutton\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_14(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Close browser window - www.ikea.com",
												  "A1E940BE3B0C3350E768E16439363565",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E940BE3B0C3350E768E16439363565\",\"revealPref\":\"true\",\"isWeb\":true,\"description\":\"<b>Close<\\/b> browser window\",\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"close\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"2cc83ffb-4614-4458-81f6-a0dbc8c09cea\",\"timeout\":0,\"screenshotPref\":\"ALL\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

}
