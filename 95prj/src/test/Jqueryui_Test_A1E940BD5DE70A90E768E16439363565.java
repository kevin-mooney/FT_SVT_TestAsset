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
public class Jqueryui_Test_A1E940BD5DE70A90E768E16439363565 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[1];
	
    
    
	
	public Jqueryui_Test_A1E940BD5DE70A90E768E16439363565(IContainer container, String invocationId) {
		super(container, "jqueryui", invocationId, "A1E940BD5DE70A90E768E16439363565");
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
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: Jqueryui_Test_A1E940BD5DE70A90E768E16439363565 ",e);
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

	VariableAction vc = new VariableAction(parent, "", "A1E940BD5DF95A10E768E16439363565");	
			vars[0] = new DataVar("RTW_WebUI_Browser_Selection", "Chrome", IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Start jqueryui.com",
												  "A1E940BD5E080010E768E16439363565",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E940BD5E080010E768E16439363565\",\"application_package\":\"com.ibm.rational.test.mobile.android.browser\",\"application_os\":\"WebUI\",\"isWeb\":false,\"description\":\"Start <b>jqueryui.com<\\/b>\",\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"start\",\"parameters\":[{\"name\":\"activity\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"com.ibm.rational.test.mobile.android.browser.BrowserMainActivity\"},{\"name\":\"rmot_kind_of_launch\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"playback\"},{\"name\":\"starting_url\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"http:\\/\\/jqueryui.com\\/\"},{\"name\":\"web_app_address\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"jqueryui.com\"},{\"name\":\"web_app_protocol\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"http:\\/\\/\"},{\"name\":\"web_app_context\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"\\/\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"to_overriden\":true,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"bb9c1259-96d3-4168-a7d6-2a1facd46f81\",\"timeout\":12}],\"timeout\":10}",
												  "/95prj/Tests/jqueryui.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Datepicker - jqueryui.com",
												  "A1E940BD5E0DA564E768E16439363565",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Datepicker<\\/b>\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"application_uid\":\"bb9c1259-96d3-4168-a7d6-2a1facd46f81\",\"timeout\":12,\"screenshotPref\":\"ALL\",\"uid\":\"A1E940BD5E0DA564E768E16439363565\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Datepicker\"},\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:540;left:60;bottom:562;right:228\\\", \\\"Geometry\\\": { \\\"height\\\": 22, \\\"width\\\": 168, \\\"x\\\": 60, \\\"y\\\": 540 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(77, 77, 77);font-family:\\\\\\\"Helvetica Neue\\\\\\\", HelveticaNeue, Helvetica, Arial, sans-serif;font-size:15px;font-style:normal;font-weight:400;line-height:22.5px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:left;text-decoration:underline solid rgb(77, 77, 77);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 562, \\\"color\\\": \\\"4D4D4DFF\\\", \\\"content\\\": \\\"Datepicker\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Helvetica Neue\\\\\\\", HelveticaNeue, Helvetica, Arial, sans-serif\\\", \\\"font-size\\\": 15, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"http:\\\\\\/\\\\\\/jqueryui.com\\\\\\/datepicker\\\\\\/\\\", \\\"left\\\": 60, \\\"line-height\\\": \\\"22.5\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 228, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"left\\\", \\\"text-decoration\\\": \\\"underline solid rgb(77, 77, 77)\\\", \\\"top\\\": 540, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"675\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/body\\\\\\/div\\\\\\/div[2]\\\\\\/div\\\\\\/div[2]\\\\\\/aside[2]\\\\\\/ul\\\\\\/li[6]\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value '03/05/2019' in JQuery DateInput Field whose Label is Date: - jqueryui.com",
												  "A1E940BD5E4975E4E768E16439363565",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E940BD5E4975E4E768E16439363565\",\"preferredThinktime\":0,\"thinktime\":3232,\"isWeb\":false,\"description\":\"Think <i>3,232<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"bb9c1259-96d3-4168-a7d6-2a1facd46f81\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>03\\/05\\/2019<\\/b>' in <b>JQuery DateInput Field<\\/b> whose <b>Label<\\/b> is <b>Date:<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"bb9c1259-96d3-4168-a7d6-2a1facd46f81\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E940BD5E4975E4E768E16439363565\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"03\\/05\\/2019\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Date:\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:411;left:325;bottom:432;right:498\\\", \\\"Geometry\\\": { \\\"height\\\": 21, \\\"width\\\": 173, \\\"x\\\": 325, \\\"y\\\": 411 }, \\\"Style$array$\\\": \\\"background-color:rgb(255, 255, 255);background-repeat:repeat;color:rgb(0, 0, 0);font-family:Arial;font-size:13.3333px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:1px;padding-left:0px;padding-right:0px;padding-top:1px;text-align:start;text-decoration:none solid rgb(0, 0, 0);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"FFFFFFFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 432, \\\"class\\\": \\\"hasDatepicker\\\", \\\"color\\\": \\\"000000FF\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"jquery\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"Arial\\\", \\\"font-size\\\": \\\"13.3333\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"datepicker\\\", \\\"label\\\": \\\"Date:\\\", \\\"left\\\": 325, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 1, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 1, \\\"proxyClass\\\": \\\"JQueryUIDateInputProxy\\\", \\\"proxyName\\\": \\\"jquidateinput\\\", \\\"right\\\": 498, \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(0, 0, 0)\\\", \\\"top\\\": 411, \\\"type\\\": \\\"text\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"545\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id='datepicker']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Checkboxradio - jqueryui.com",
												  "A1E940BD5E6AB984E768E16439363565",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E940BD5E6AB984E768E16439363565\",\"preferredThinktime\":0,\"thinktime\":4446,\"isWeb\":false,\"description\":\"Think <i>4,446<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"bb9c1259-96d3-4168-a7d6-2a1facd46f81\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Checkboxradio<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"bb9c1259-96d3-4168-a7d6-2a1facd46f81\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E940BD5E6AB984E768E16439363565\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Checkboxradio\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:676;left:60;bottom:698;right:228\\\", \\\"Geometry\\\": { \\\"height\\\": 22, \\\"width\\\": 168, \\\"x\\\": 60, \\\"y\\\": 676 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(77, 77, 77);font-family:\\\\\\\"Helvetica Neue\\\\\\\", HelveticaNeue, Helvetica, Arial, sans-serif;font-size:15px;font-style:normal;font-weight:400;line-height:22.5px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:left;text-decoration:underline solid rgb(77, 77, 77);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 698, \\\"color\\\": \\\"4D4D4DFF\\\", \\\"content\\\": \\\"Checkboxradio\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Helvetica Neue\\\\\\\", HelveticaNeue, Helvetica, Arial, sans-serif\\\", \\\"font-size\\\": 15, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"http:\\\\\\/\\\\\\/jqueryui.com\\\\\\/checkboxradio\\\\\\/\\\", \\\"left\\\": 60, \\\"line-height\\\": \\\"22.5\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 228, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"left\\\", \\\"text-decoration\\\": \\\"underline solid rgb(77, 77, 77)\\\", \\\"top\\\": 676, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"809\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/body\\\\\\/div\\\\\\/div[2]\\\\\\/div\\\\\\/div[2]\\\\\\/aside[2]\\\\\\/ul\\\\\\/li[4]\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_5(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on JQuery Radio button whose Content is  New York - jqueryui.com",
												  "A1E940BD5E8B39D4E768E16439363565",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E940BD5E8B39D4E768E16439363565\",\"preferredThinktime\":0,\"thinktime\":2112,\"isWeb\":false,\"description\":\"Think <i>2,112<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"bb9c1259-96d3-4168-a7d6-2a1facd46f81\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>JQuery Radio button<\\/b> whose <b>Content<\\/b> is <b> New York<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"bb9c1259-96d3-4168-a7d6-2a1facd46f81\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E940BD5E8B39D4E768E16439363565\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\" New York\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:605;left:298;bottom:638;right:420\\\", \\\"Geometry\\\": { \\\"height\\\": 33, \\\"width\\\": 122, \\\"x\\\": 298, \\\"y\\\": 605 }, \\\"Style$array$\\\": \\\"background-color:rgb(237, 237, 237);background-repeat:repeat;color:rgb(43, 43, 43);font-family:Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:1.6px;margin-top:0px;opacity:1;padding-bottom:6.4px;padding-left:16px;padding-right:16px;padding-top:6.4px;text-align:center;text-decoration:none solid rgb(43, 43, 43);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"EDEDEDFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 638, \\\"checked\\\": false, \\\"class\\\": \\\"ui-checkboxradio-label ui-corner-all ui-button ui-widget ui-checkboxradio-radio-label\\\", \\\"color\\\": \\\"2B2B2BFF\\\", \\\"content\\\": \\\" New York\\\", \\\"domainName\\\": \\\"jquery\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"Arial, Helvetica, sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"for\\\": \\\"radio-1\\\", \\\"label\\\": \\\" New York\\\", \\\"left\\\": 298, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": \\\"1.6\\\", \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": \\\"6.4\\\", \\\"padding-left\\\": 16, \\\"padding-right\\\": 16, \\\"padding-top\\\": \\\"6.4\\\", \\\"proxyClass\\\": \\\"JQueryUIButtonProxy\\\", \\\"proxyName\\\": \\\"jqmradio\\\", \\\"right\\\": 420, \\\"tagname\\\": \\\"label\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(43, 43, 43)\\\", \\\"top\\\": 605, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"548\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/body\\\\\\/div\\\\\\/fieldset\\\\\\/label\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jqmradio\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_6(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on JQuery Check box whose Content is  5 Star - jqueryui.com",
												  "A1E940BD5EABBA24E768E16439363565",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E940BD5EABBA24E768E16439363565\",\"preferredThinktime\":0,\"thinktime\":2191,\"isWeb\":false,\"description\":\"Think <i>2,191<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"bb9c1259-96d3-4168-a7d6-2a1facd46f81\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>JQuery Check box<\\/b> whose <b>Content<\\/b> is <b> 5 Star<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"bb9c1259-96d3-4168-a7d6-2a1facd46f81\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E940BD5EABBA24E768E16439363565\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\" 5 Star\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:611;left:298;bottom:644;right:395\\\", \\\"Geometry\\\": { \\\"height\\\": 33, \\\"width\\\": 97, \\\"x\\\": 298, \\\"y\\\": 611 }, \\\"Style$array$\\\": \\\"background-color:rgb(237, 237, 237);background-repeat:repeat;color:rgb(43, 43, 43);font-family:Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:1.6px;margin-top:0px;opacity:1;padding-bottom:6.4px;padding-left:16px;padding-right:16px;padding-top:6.4px;text-align:center;text-decoration:none solid rgb(43, 43, 43);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"EDEDEDFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 644, \\\"checked\\\": false, \\\"class\\\": \\\"ui-checkboxradio-label ui-corner-all ui-button ui-widget\\\", \\\"color\\\": \\\"2B2B2BFF\\\", \\\"content\\\": \\\" 5 Star\\\", \\\"domainName\\\": \\\"jquery\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"Arial, Helvetica, sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"for\\\": \\\"checkbox-4\\\", \\\"label\\\": \\\" 5 Star\\\", \\\"left\\\": 298, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": \\\"1.6\\\", \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": \\\"6.4\\\", \\\"padding-left\\\": 16, \\\"padding-right\\\": 16, \\\"padding-top\\\": \\\"6.4\\\", \\\"proxyClass\\\": \\\"JQueryUIButtonProxy\\\", \\\"proxyName\\\": \\\"jqmcheckbox\\\", \\\"right\\\": 395, \\\"tagname\\\": \\\"label\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(43, 43, 43)\\\", \\\"top\\\": 611, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"799\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/body\\\\\\/div\\\\\\/fieldset[2]\\\\\\/label[4]\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jqmcheckbox\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_7(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on JQuery Check box whose Content is  2 Double  - jqueryui.com",
												  "A1E940BD5ECB7724E768E16439363565",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E940BD5ECB7724E768E16439363565\",\"preferredThinktime\":0,\"thinktime\":3249,\"isWeb\":false,\"description\":\"Think <i>3,249<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"bb9c1259-96d3-4168-a7d6-2a1facd46f81\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>JQuery Check box<\\/b> whose <b>Content<\\/b> is <b> 2 Double <\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"bb9c1259-96d3-4168-a7d6-2a1facd46f81\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E940BD5ECB7724E768E16439363565\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\" 2 Double\\n\\t\\t\\t\\n\\t\\t\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:547;left:298;bottom:580;right:416\\\", \\\"Geometry\\\": { \\\"height\\\": 33, \\\"width\\\": 118, \\\"x\\\": 298, \\\"y\\\": 547 }, \\\"Style$array$\\\": \\\"background-color:rgb(237, 237, 237);background-repeat:repeat;color:rgb(43, 43, 43);font-family:Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:1.6px;margin-top:0px;opacity:1;padding-bottom:6.4px;padding-left:16px;padding-right:16px;padding-top:6.4px;text-align:center;text-decoration:none solid rgb(43, 43, 43);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"EDEDEDFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 580, \\\"checked\\\": false, \\\"class\\\": \\\"ui-checkboxradio-label ui-corner-all ui-button ui-widget\\\", \\\"color\\\": \\\"2B2B2BFF\\\", \\\"content\\\": \\\" 2 Double\\\\n\\\\t\\\\t\\\\t\\\\n\\\\t\\\\t\\\", \\\"domainName\\\": \\\"jquery\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"Arial, Helvetica, sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"for\\\": \\\"checkbox-nested-1\\\", \\\"label\\\": \\\" 2 Double\\\\n\\\\t\\\\t\\\\t\\\\n\\\\t\\\\t\\\", \\\"left\\\": 298, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": \\\"1.6\\\", \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": \\\"6.4\\\", \\\"padding-left\\\": 16, \\\"padding-right\\\": 16, \\\"padding-top\\\": \\\"6.4\\\", \\\"proxyClass\\\": \\\"JQueryUIButtonProxy\\\", \\\"proxyName\\\": \\\"jqmcheckbox\\\", \\\"right\\\": 416, \\\"tagname\\\": \\\"label\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(43, 43, 43)\\\", \\\"top\\\": 547, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"1040\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/body\\\\\\/div\\\\\\/fieldset[3]\\\\\\/label\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jqmcheckbox\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_8(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Selectmenu - jqueryui.com",
												  "A1E940BD5EE95F64E768E16439363565",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E940BD5EE95F64E768E16439363565\",\"preferredThinktime\":0,\"thinktime\":6519,\"isWeb\":false,\"description\":\"Think <i>6,519<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"bb9c1259-96d3-4168-a7d6-2a1facd46f81\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Selectmenu<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"bb9c1259-96d3-4168-a7d6-2a1facd46f81\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E940BD5EE95F64E768E16439363565\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Selectmenu\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:468;left:60;bottom:490;right:228\\\", \\\"Geometry\\\": { \\\"height\\\": 22, \\\"width\\\": 168, \\\"x\\\": 60, \\\"y\\\": 468 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(77, 77, 77);font-family:\\\\\\\"Helvetica Neue\\\\\\\", HelveticaNeue, Helvetica, Arial, sans-serif;font-size:15px;font-style:normal;font-weight:400;line-height:22.5px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:left;text-decoration:underline solid rgb(77, 77, 77);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 490, \\\"color\\\": \\\"4D4D4DFF\\\", \\\"content\\\": \\\"Selectmenu\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Helvetica Neue\\\\\\\", HelveticaNeue, Helvetica, Arial, sans-serif\\\", \\\"font-size\\\": 15, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"http:\\\\\\/\\\\\\/jqueryui.com\\\\\\/selectmenu\\\\\\/\\\", \\\"left\\\": 60, \\\"line-height\\\": \\\"22.5\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 228, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"left\\\", \\\"text-decoration\\\": \\\"underline solid rgb(77, 77, 77)\\\", \\\"top\\\": 468, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"1325\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/body\\\\\\/div\\\\\\/div[2]\\\\\\/div\\\\\\/div[2]\\\\\\/aside[2]\\\\\\/ul\\\\\\/li[10]\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_9(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Select 'Fast' in JQuery Select menu whose Content is Medium - jqueryui.com",
												  "A1E940BD5F04D6A4E768E16439363565",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E940BD5F04D6A4E768E16439363565\",\"preferredThinktime\":0,\"thinktime\":2517,\"isWeb\":false,\"description\":\"Think <i>2,517<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"bb9c1259-96d3-4168-a7d6-2a1facd46f81\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Select '<b>Fast<\\/b>' in <b>JQuery Select menu<\\/b> whose <b>Content<\\/b> is <b>Medium<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"bb9c1259-96d3-4168-a7d6-2a1facd46f81\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E940BD5F04D6A4E768E16439363565\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onchange\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Fast\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Medium\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:478;left:296;bottom:511;right:554\\\", \\\"Geometry\\\": { \\\"height\\\": 33, \\\"width\\\": 258, \\\"x\\\": 296, \\\"y\\\": 478 }, \\\"Style$array$\\\": \\\"background-color:rgb(237, 237, 237);background-repeat:repeat;color:rgb(43, 43, 43);font-family:Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:1.6px;margin-top:0px;opacity:1;padding-bottom:6.4px;padding-left:16px;padding-right:16px;padding-top:6.4px;text-align:left;text-decoration:none solid rgb(43, 43, 43);visibility:visible;z-index:auto;\\\", \\\"aria-activedescendant\\\": \\\"ui-id-3\\\", \\\"aria-autocomplete\\\": \\\"list\\\", \\\"aria-disabled\\\": \\\"false\\\", \\\"aria-expanded\\\": \\\"true\\\", \\\"aria-haspopup\\\": \\\"true\\\", \\\"aria-labelledby\\\": \\\"ui-id-3\\\", \\\"aria-owns\\\": \\\"speed-menu\\\", \\\"background-color\\\": \\\"EDEDEDFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 511, \\\"class\\\": \\\"ui-selectmenu-button ui-button ui-widget ui-selectmenu-button-open ui-corner-top\\\", \\\"color\\\": \\\"2B2B2BFF\\\", \\\"content\\\": \\\"Medium\\\", \\\"domainName\\\": \\\"jquery\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"Arial, Helvetica, sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"speed-button\\\", \\\"label\\\": \\\"Select a speed\\\", \\\"left\\\": 296, \\\"length\\\": 5, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": \\\"1.6\\\", \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"options\\\": \\\"Slower, Slow, Medium, Fast, Faster\\\", \\\"padding-bottom\\\": \\\"6.4\\\", \\\"padding-left\\\": 16, \\\"padding-right\\\": 16, \\\"padding-top\\\": \\\"6.4\\\", \\\"proxyClass\\\": \\\"JQueryUISelectmenuProxy\\\", \\\"proxyName\\\": \\\"jqmselect\\\", \\\"right\\\": 554, \\\"role\\\": \\\"combobox\\\", \\\"tabindex\\\": \\\"0\\\", \\\"tagname\\\": \\\"span\\\", \\\"text-align\\\": \\\"left\\\", \\\"text-decoration\\\": \\\"none solid rgb(43, 43, 43)\\\", \\\"top\\\": 478, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"506\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/span[@id='speed-button']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jqmselect\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_10(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Select '5' in JQuery Select menu whose Content is 2 - jqueryui.com",
												  "A1E940BD5F2270C4E768E16439363565",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E940BD5F2270C4E768E16439363565\",\"preferredThinktime\":0,\"thinktime\":2591,\"isWeb\":false,\"description\":\"Think <i>2,591<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"bb9c1259-96d3-4168-a7d6-2a1facd46f81\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Select '<b>5<\\/b>' in <b>JQuery Select menu<\\/b> whose <b>Content<\\/b> is <b>2<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"bb9c1259-96d3-4168-a7d6-2a1facd46f81\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E940BD5F2270C4E768E16439363565\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onchange\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"5\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"2\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:640;left:296;bottom:673;right:554\\\", \\\"Geometry\\\": { \\\"height\\\": 33, \\\"width\\\": 258, \\\"x\\\": 296, \\\"y\\\": 640 }, \\\"Style$array$\\\": \\\"background-color:rgb(237, 237, 237);background-repeat:repeat;color:rgb(43, 43, 43);font-family:Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:1.6px;margin-top:0px;opacity:1;padding-bottom:6.4px;padding-left:16px;padding-right:16px;padding-top:6.4px;text-align:left;text-decoration:none solid rgb(43, 43, 43);visibility:visible;z-index:auto;\\\", \\\"aria-activedescendant\\\": \\\"ui-id-7\\\", \\\"aria-autocomplete\\\": \\\"list\\\", \\\"aria-disabled\\\": \\\"false\\\", \\\"aria-expanded\\\": \\\"true\\\", \\\"aria-haspopup\\\": \\\"true\\\", \\\"aria-labelledby\\\": \\\"ui-id-7\\\", \\\"aria-owns\\\": \\\"number-menu\\\", \\\"background-color\\\": \\\"EDEDEDFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 673, \\\"class\\\": \\\"ui-selectmenu-button ui-button ui-widget ui-selectmenu-button-open ui-corner-top\\\", \\\"color\\\": \\\"2B2B2BFF\\\", \\\"content\\\": \\\"2\\\", \\\"domainName\\\": \\\"jquery\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"Arial, Helvetica, sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"number-button\\\", \\\"label\\\": \\\"Select a number\\\", \\\"left\\\": 296, \\\"length\\\": 19, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": \\\"1.6\\\", \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"options\\\": \\\"1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19\\\", \\\"padding-bottom\\\": \\\"6.4\\\", \\\"padding-left\\\": 16, \\\"padding-right\\\": 16, \\\"padding-top\\\": \\\"6.4\\\", \\\"proxyClass\\\": \\\"JQueryUISelectmenuProxy\\\", \\\"proxyName\\\": \\\"jqmselect\\\", \\\"right\\\": 554, \\\"role\\\": \\\"combobox\\\", \\\"tabindex\\\": \\\"0\\\", \\\"tagname\\\": \\\"span\\\", \\\"text-align\\\": \\\"left\\\", \\\"text-decoration\\\": \\\"none solid rgb(43, 43, 43)\\\", \\\"top\\\": 640, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"734\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/span[@id='number-button']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jqmselect\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_11(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Select 'Mrs.' in JQuery Select menu whose Content is Please pick one - jqueryui.com",
												  "A1E940BD5F41B894E768E16439363565",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E940BD5F41B894E768E16439363565\",\"preferredThinktime\":0,\"thinktime\":2559,\"isWeb\":false,\"description\":\"Think <i>2,559<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"bb9c1259-96d3-4168-a7d6-2a1facd46f81\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Select '<b>Mrs.<\\/b>' in <b>JQuery Select menu<\\/b> whose <b>Content<\\/b> is <b>Please pick one<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"bb9c1259-96d3-4168-a7d6-2a1facd46f81\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E940BD5F41B894E768E16439363565\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onchange\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Mrs.\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Please pick one\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:721;left:296;bottom:754;right:554\\\", \\\"Geometry\\\": { \\\"height\\\": 33, \\\"width\\\": 258, \\\"x\\\": 296, \\\"y\\\": 721 }, \\\"Style$array$\\\": \\\"background-color:rgb(237, 237, 237);background-repeat:repeat;color:rgb(43, 43, 43);font-family:Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:1.6px;margin-top:0px;opacity:1;padding-bottom:6.4px;padding-left:16px;padding-right:16px;padding-top:6.4px;text-align:left;text-decoration:none solid rgb(43, 43, 43);visibility:visible;z-index:auto;\\\", \\\"aria-activedescendant\\\": \\\"ui-id-25\\\", \\\"aria-autocomplete\\\": \\\"list\\\", \\\"aria-disabled\\\": \\\"false\\\", \\\"aria-expanded\\\": \\\"true\\\", \\\"aria-haspopup\\\": \\\"true\\\", \\\"aria-labelledby\\\": \\\"ui-id-25\\\", \\\"aria-owns\\\": \\\"salutation-menu\\\", \\\"background-color\\\": \\\"EDEDEDFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 754, \\\"class\\\": \\\"ui-selectmenu-button ui-button ui-widget ui-selectmenu-button-open ui-corner-top\\\", \\\"color\\\": \\\"2B2B2BFF\\\", \\\"content\\\": \\\"Please pick one\\\", \\\"domainName\\\": \\\"jquery\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"Arial, Helvetica, sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"salutation-button\\\", \\\"label\\\": \\\"Select a title\\\", \\\"left\\\": 296, \\\"length\\\": 6, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": \\\"1.6\\\", \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"options\\\": \\\"Please pick one, Mr., Mrs., Dr., Prof., Other\\\", \\\"padding-bottom\\\": \\\"6.4\\\", \\\"padding-left\\\": 16, \\\"padding-right\\\": 16, \\\"padding-top\\\": \\\"6.4\\\", \\\"proxyClass\\\": \\\"JQueryUISelectmenuProxy\\\", \\\"proxyName\\\": \\\"jqmselect\\\", \\\"right\\\": 554, \\\"role\\\": \\\"combobox\\\", \\\"tabindex\\\": \\\"0\\\", \\\"tagname\\\": \\\"span\\\", \\\"text-align\\\": \\\"left\\\", \\\"text-decoration\\\": \\\"none solid rgb(43, 43, 43)\\\", \\\"top\\\": 721, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"974\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/span[@id='salutation-button']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jqmselect\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_12(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Close browser window - jqueryui.com",
												  "A1E940BD5F5D7E07E768E16439363565",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E940BD5F5D7E07E768E16439363565\",\"revealPref\":\"true\",\"isWeb\":true,\"description\":\"<b>Close<\\/b> browser window\",\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"close\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"bb9c1259-96d3-4168-a7d6-2a1facd46f81\",\"timeout\":0,\"screenshotPref\":\"ALL\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

}
