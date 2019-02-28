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
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class Test_A1E4ADD985CF95F3FA9AB33134613337 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[1];
	
    
    
	
	public Test_A1E4ADD985CF95F3FA9AB33134613337(IContainer container, String invocationId) {
		super(container, "fvt_aries-web_jqueryUI1.10DatePickerControl_chrome40", invocationId, "A1E4ADD985CF95F3FA9AB33134613337");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		
	}

    public void execute() {
    	try {
			
	    		if (!isScheduleRun()) setThinkMax(2000);
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 0, "Custom Code reported an unhandled exception"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of datapool reached"), 0, "End of datapool reached"));
	
	if (!isScheduleRun()){
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
	this.add(applicationContext_15(this));
	this.add(applicationContext_16(this));
	this.add(applicationContext_17(this));
	this.add(applicationContext_18(this));
	this.add(applicationContext_19(this));
	this.add(applicationContext_20(this));
	this.add(applicationContext_21(this));
	this.add(applicationContext_22(this));
	this.add(applicationContext_23(this));
	this.add(applicationContext_24(this));
	this.add(applicationContext_25(this));
	this.add(applicationContext_26(this));
	this.add(applicationContext_27(this));
	this.add(applicationContext_28(this));
	this.add(applicationContext_29(this));
	this.add(applicationContext_30(this));
	this.add(applicationContext_31(this));
	this.add(applicationContext_32(this));
	this.add(applicationContext_33(this));
	this.add(applicationContext_34(this));
	this.add(applicationContext_35(this));
	this.add(applicationContext_36(this));
	this.add(applicationContext_37(this));
	this.add(applicationContext_38(this));
	this.add(applicationContext_39(this));
	this.add(applicationContext_40(this));
	this.add(applicationContext_41(this));
	this.add(applicationContext_42(this));
	this.add(applicationContext_43(this));
	this.add(applicationContext_44(this));
	this.add(applicationContext_45(this));
	this.add(applicationContext_46(this));
	this.add(applicationContext_47(this));
	this.add(applicationContext_48(this));
	this.add(applicationContext_49(this));
	this.add(applicationContext_50(this));
	this.add(applicationContext_51(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: Test_A1E4ADD985CF95F3FA9AB33134613337 ",e);
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

	VariableAction vc = new VariableAction(parent, "", "A1E4AD49292FBDEEFA9AB33134613337");	
			vars[0] = new DataVar("RTW_WebUI_Browser_Selection", "Chrome", IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Start Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD4929451A90FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD4929451A90FA9AB33134613337\",\"application_package\":\"com.ibm.rational.test.mobile.android.browser\",\"application_os\":\"WebUI\",\"isWeb\":false,\"description\":\"Start <b>Aries-web jqueryui1.10.4 samples home page<\\/b>\",\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"start\",\"parameters\":[{\"name\":\"activity\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"com.ibm.rational.test.mobile.android.browser.BrowserMainActivity\"},{\"name\":\"rmot_kind_of_launch\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"playback\"},{\"name\":\"starting_url\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"http:\\/\\/bnegl045.in.ibm.com\\/aries-web\\/JQueryUI\\/jquery-ui-1.10.4\\/demos\\/index.html\"},{\"name\":\"web_app_address\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"bnegl045.in.ibm.com\"},{\"name\":\"web_app_protocol\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"http:\\/\\/\"},{\"name\":\"web_app_context\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"\\/aries-web\\/JQueryUI\\/jquery-ui-1.10.4\\/demos\\/index.html\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0}],\"timeout\":10}",
												  "/rtw.eclipseClient.automation.project/WebAppTests/Desktop/JQuery/fvt_aries-web_jqueryUI1.10DatePickerControl_chrome40.testsuite",
												  "211b4d427e31220aa5cfc9f30a416c4d",
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is datepicker - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD49294541A9FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>datepicker<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD49294541A9FA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"datepicker\"},\"name\":\"content\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Default functionality - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD492954AAFBFA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD492954AAFBFA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":2298,\"isWeb\":false,\"description\":\"Think <i>2,298<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Default functionality<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD492954AAFBFA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Default functionality\"},\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value '02/12/2015' in JQuery DateInput Field - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD49295D0F64FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD49295D0F64FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":5455,\"isWeb\":false,\"description\":\"Think <i>5,455<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Verify that <b>Id<\\/b> equals <b>datepicker<\\/b> on <b>JQuery DateInput Field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"id\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"datepicker\"},\"name\":\"id\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Id\",\"operator\":\"TEquals\"},\"uid\":\"A1E4ADD771103920FA9AB33134613337\",\"isWeb\":true,\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}},{\"revealPref\":\"true\",\"description\":\"Verify that <b>Type<\\/b> equals <b>text<\\/b> on <b>JQuery DateInput Field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"type\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"text\"},\"name\":\"type\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Type\",\"operator\":\"TEquals\"},\"uid\":\"A1E4ADD775CD4C00FA9AB33134613337\",\"isWeb\":true,\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}},{\"revealPref\":\"true\",\"description\":\"Verify that <b>Class<\\/b> equals <b>hasDatepicker<\\/b> on <b>JQuery DateInput Field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"class\",\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"hasDatepicker\"},\"name\":\"class\",\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Class\",\"operator\":\"TEquals\"},\"uid\":\"A1E4ADD787031EA0FA9AB33134613337\",\"isWeb\":true,\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}},{\"revealPref\":\"true\",\"description\":\"Verify that <b>Content<\\/b> equals <b><\\/b> on <b>JQuery DateInput Field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"content\",\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"\"},\"name\":\"content\",\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Content\",\"operator\":\"TEquals\"},\"uid\":\"A1E4ADD788FCA4B0FA9AB33134613337\",\"isWeb\":true,\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>02\\/12\\/2015<\\/b>' in <b>JQuery DateInput Field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD49295D0F64FA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"19\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"20\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"02\\/12\\/2015\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"21\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_5(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Go Back - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4ADD71A47E253FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4ADD71A47E253FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":1000,\"isWeb\":false,\"description\":\"Think <i>1,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Verify that <b>Content<\\/b> equals <b>02\\/12\\/2015<\\/b> on <b>JQuery DateInput Field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"02\\/12\\/2015\"},\"name\":\"content\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Content\",\"operator\":\"TEquals\"},\"uid\":\"A1E4ADD77B2C4430FA9AB33134613337\",\"isWeb\":true,\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}},{\"uid\":\"A1E4ADD71A47E253FA9AB33134613337\",\"revealPref\":\"true\",\"isWeb\":true,\"description\":\"Go <b>Back<\\/b>\",\"action\":{\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"back\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"6\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_6(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Format date - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD4929601CA4FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD4929601CA4FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":5202,\"isWeb\":false,\"description\":\"Think <i>5,202<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Format date<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD4929601CA4FA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Format date\"},\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_7(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value '02/11/2015' in JQuery DateInput Field - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD49296832F4FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD49296832F4FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":5046,\"isWeb\":false,\"description\":\"Think <i>5,046<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Verify that <b>Size<\\/b> equals <b>30<\\/b> on <b>JQuery DateInput Field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"size\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"30\"},\"name\":\"size\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Size\",\"operator\":\"TEquals\"},\"uid\":\"A1E4ADD795C3AB80FA9AB33134613337\",\"isWeb\":true,\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>02\\/11\\/2015<\\/b>' in <b>JQuery DateInput Field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD49296832F4FA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"02\\/11\\/2015\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_8(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Select 'ISO 8601 - yy-mm-dd' in Drop-down list whose Content is Default - mm/dd/yy - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD49296C0384FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Verify that <b>Content<\\/b> equals <b>02\\/11\\/2015<\\/b> on <b>JQuery DateInput Field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"content\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"02\\/11\\/2015\"},\"name\":\"content\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Content\",\"operator\":\"TEquals\"},\"uid\":\"A1E4ADD79BFAB430FA9AB33134613337\",\"isWeb\":true,\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}},{\"revealPref\":\"true\",\"description\":\"Verify that <b>Id<\\/b> equals <b>format<\\/b> on <b>Drop-down list<\\/b> whose <b>Content<\\/b> is <b>Default - mm\\/dd\\/yy<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"id\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"format\"},\"name\":\"id\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Id\",\"operator\":\"TEquals\"},\"uid\":\"A1E4ADD7B0277FB7FA9AB33134613337\",\"isWeb\":true,\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Default - mm\\/dd\\/yy\"},\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.select\"}},{\"revealPref\":\"true\",\"description\":\"Verify that <b>Length<\\/b> equals <b>6<\\/b> on <b>Drop-down list<\\/b> whose <b>Content<\\/b> is <b>Default - mm\\/dd\\/yy<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"length\",\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TLong\",\"value\":\"6\"},\"name\":\"length\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Length\",\"operator\":\"TEquals\"},\"uid\":\"A1E4ADD7B1AFA657FA9AB33134613337\",\"isWeb\":true,\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Default - mm\\/dd\\/yy\"},\"name\":\"content\",\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.select\"}},{\"revealPref\":\"true\",\"description\":\"Verify that <b>Content<\\/b> equals <b>Default - mm\\/dd\\/yy<\\/b> on <b>Drop-down list<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"content\",\"id\":\"20\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Default - mm\\/dd\\/yy\"},\"name\":\"content\",\"id\":\"19\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Content\",\"operator\":\"TEquals\"},\"uid\":\"A1E4ADD7B61B64E0FA9AB33134613337\",\"isWeb\":true,\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.select\"}},{\"revealPref\":\"true\",\"description\":\"Verify that <b>Options<\\/b> equals <b>Default - mm\\/dd\\/yy, ISO 8601 - yy-mm-dd, Short - d... text - 'day' d 'of' MM 'in the year' yy<\\/b> on <b>Drop-down list<\\/b> whose <b>Content<\\/b> is <b>Default - mm\\/dd\\/yy<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"options\",\"id\":\"26\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Default - mm\\/dd\\/yy, ISO 8601 - yy-mm-dd, Short - d M, y, Medium - d MM, y, Full - DD, d MM, yy, With text - 'day' d 'of' MM 'in the year' yy\"},\"name\":\"options\",\"id\":\"25\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Options\",\"operator\":\"TEquals\"},\"uid\":\"A1E4ADD7B87867B5FA9AB33134613337\",\"isWeb\":true,\"id\":\"21\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"24\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Default - mm\\/dd\\/yy\"},\"name\":\"content\",\"id\":\"23\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"22\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.select\"}},{\"revealPref\":\"true\",\"description\":\"Select '<b>ISO 8601 - yy-mm-dd<\\/b>' in <b>Drop-down list<\\/b> whose <b>Content<\\/b> is <b>Default - mm\\/dd\\/yy<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD49296C0384FA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"28\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onchange\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"29\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"ISO 8601 - yy-mm-dd\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"27\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"32\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Default - mm\\/dd\\/yy\"},\"name\":\"content\",\"id\":\"31\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"30\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.select\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_9(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Select 'Short - d M, y' in Drop-down list whose Content is ISO 8601 - yy-mm-dd - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD49296E9BA2FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD49296E9BA2FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":8549,\"isWeb\":false,\"description\":\"Think <i>8,549<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Verify that <b>Content<\\/b> equals <b>ISO 8601 - yy-mm-dd<\\/b> on <b>Drop-down list<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"ISO 8601 - yy-mm-dd\"},\"name\":\"content\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Content\",\"operator\":\"TEquals\"},\"uid\":\"A1E4ADD7E17802B0FA9AB33134613337\",\"isWeb\":true,\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.select\"}},{\"revealPref\":\"true\",\"description\":\"Verify that <b>Content<\\/b> equals <b>2015-02-11<\\/b> on <b>JQuery DateInput Field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"content\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"2015-02-11\"},\"name\":\"content\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Content\",\"operator\":\"TEquals\"},\"uid\":\"A1E4ADD7CA9BF5B0FA9AB33134613337\",\"isWeb\":true,\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}},{\"revealPref\":\"true\",\"description\":\"Select '<b>Short - d M, y<\\/b>' in <b>Drop-down list<\\/b> whose <b>Content<\\/b> is <b>ISO 8601 - yy-mm-dd<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD49296E9BA2FA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onchange\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Short - d M, y\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"ISO 8601 - yy-mm-dd\"},\"name\":\"content\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.select\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_10(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Go Back - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4ADD71E2B3703FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4ADD71E2B3703FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":1000,\"isWeb\":false,\"description\":\"Think <i>1,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"uid\":\"A1E4ADD71E2B3703FA9AB33134613337\",\"revealPref\":\"true\",\"isWeb\":true,\"description\":\"Go <b>Back<\\/b>\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"back\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_11(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Restrict date range - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD49297133B2FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD49297133B2FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":9637,\"isWeb\":false,\"description\":\"Think <i>9,637<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Restrict date range<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD49297133B2FA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Restrict date range\"},\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_12(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value '02/12/2015' in JQuery DateInput Field - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD49297922EBFA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Enter value '<b>02\\/12\\/2015<\\/b>' in <b>JQuery DateInput Field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD49297922EBFA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"02\\/12\\/2015\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_13(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Go Back - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4ADD721521983FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4ADD721521983FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":1000,\"isWeb\":false,\"description\":\"Think <i>1,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Verify that <b>Content<\\/b> equals <b>02\\/12\\/2015<\\/b> on <b>JQuery DateInput Field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"02\\/12\\/2015\"},\"name\":\"content\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Content\",\"operator\":\"TEquals\"},\"uid\":\"A1E4ADD7EFA50220FA9AB33134613337\",\"isWeb\":true,\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}},{\"uid\":\"A1E4ADD721521983FA9AB33134613337\",\"revealPref\":\"true\",\"isWeb\":true,\"description\":\"Go <b>Back<\\/b>\",\"action\":{\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"back\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"6\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_14(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Localize calendar - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD49297C091BFA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD49297C091BFA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":6352,\"isWeb\":false,\"description\":\"Think <i>6,352<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Localize calendar<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD49297C091BFA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Localize calendar\"},\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_15(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value '13/02/2015' in JQuery DateInput Field - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD492983D14BFA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD492983D14BFA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":3714,\"isWeb\":false,\"description\":\"Think <i>3,714<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>13\\/02\\/2015<\\/b>' in <b>JQuery DateInput Field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD492983D14BFA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"13\\/02\\/2015\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_16(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Select 'Chinese Traditional (\u7E41\u9AD4\u4E2D\u6587)' in Drop-down list whose Content is French (Fran\u00E7ais) - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD4929866954FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Verify that <b>Content<\\/b> equals <b>13\\/02\\/2015<\\/b> on <b>JQuery DateInput Field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"content\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"13\\/02\\/2015\"},\"name\":\"content\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Content\",\"operator\":\"TEquals\"},\"uid\":\"A1E4ADD80274FCC0FA9AB33134613337\",\"isWeb\":true,\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}},{\"revealPref\":\"true\",\"description\":\"Select '<b>Chinese Traditional (\\u7e41\\u9ad4\\u4e2d\\u6587)<\\/b>' in <b>Drop-down list<\\/b> whose <b>Content<\\/b> is <b>French (Fran\\u00e7ais)<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD4929866954FA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onchange\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Chinese Traditional (\\u7e41\\u9ad4\\u4e2d\\u6587)\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"French (Fran\\u00e7ais)\"},\"name\":\"content\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.select\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_17(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value '2015/02/14' in JQuery DateInput Field whose Content is 2015/02/13 - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD492988B352FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD492988B352FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":17728,\"isWeb\":false,\"description\":\"Think <i>17,728<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Verify that <b>Content<\\/b> equals <b>2015\\/02\\/13<\\/b> on <b>JQuery DateInput Field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"2015\\/02\\/13\"},\"name\":\"content\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Content\",\"operator\":\"TEquals\"},\"uid\":\"A1E4ADD8227399A0FA9AB33134613337\",\"isWeb\":true,\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>2015\\/02\\/14<\\/b>' in <b>JQuery DateInput Field<\\/b> whose <b>Content<\\/b> is <b>2015\\/02\\/13<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD492988B352FA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"2015\\/02\\/14\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"2015\\/02\\/13\"},\"name\":\"content\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_18(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Go Back - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4ADD7264111D3FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4ADD7264111D3FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":1000,\"isWeb\":false,\"description\":\"Think <i>1,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"uid\":\"A1E4ADD7264111D3FA9AB33134613337\",\"revealPref\":\"true\",\"isWeb\":true,\"description\":\"Go <b>Back<\\/b>\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"back\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_19(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Populate alternate field - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD49298B2452FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD49298B2452FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":10422,\"isWeb\":false,\"description\":\"Think <i>10,422<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Populate alternate field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD49298B2452FA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Populate alternate field\"},\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_20(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value '02/12/2015' in JQuery DateInput Field - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD4929933A94FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Enter value '<b>02\\/12\\/2015<\\/b>' in <b>JQuery DateInput Field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD4929933A94FA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"02\\/12\\/2015\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_21(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Edit text whose Content is Thursday, 12 February, 2015 - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD49299620C4FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD49299620C4FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":7137,\"isWeb\":false,\"description\":\"Think <i>7,137<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Verify that <b>Content<\\/b> equals <b>Thursday, 12 February, 2015<\\/b> on <b>Edit text<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Thursday, 12 February, 2015\"},\"name\":\"content\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Content\",\"operator\":\"TEquals\"},\"uid\":\"A1E4ADD84BB65820FA9AB33134613337\",\"isWeb\":true,\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}},{\"revealPref\":\"true\",\"description\":\"Click on <b>Edit text<\\/b> whose <b>Content<\\/b> is <b>Thursday, 12 February, 2015<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD49299620C4FA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Thursday, 12 February, 2015\"},\"name\":\"content\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_22(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Go Back - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4ADD8520D1DD3FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4ADD8520D1DD3FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":1000,\"isWeb\":false,\"description\":\"Think <i>1,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"uid\":\"A1E4ADD8520D1DD3FA9AB33134613337\",\"revealPref\":\"true\",\"isWeb\":true,\"description\":\"Go <b>Back<\\/b>\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"back\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_23(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Display inline - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD49299906F4FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD49299906F4FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":3029,\"isWeb\":false,\"description\":\"Think <i>3,029<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Display inline<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD49299906F4FA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Display inline\"},\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_24(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value '02/11/2015' in JQuery DateInput Field - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD4929A0F63BFA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Enter value '<b>02\\/11\\/2015<\\/b>' in <b>JQuery DateInput Field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD4929A0F63BFA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"02\\/11\\/2015\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_25(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Go Back - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4ADD72D2634D3FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4ADD72D2634D3FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":1000,\"isWeb\":false,\"description\":\"Think <i>1,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"uid\":\"A1E4ADD72D2634D3FA9AB33134613337\",\"revealPref\":\"true\",\"isWeb\":true,\"description\":\"Go <b>Back<\\/b>\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"back\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_26(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Display button bar - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD4929A2CAFBFA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD4929A2CAFBFA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":12155,\"isWeb\":false,\"description\":\"Think <i>12,155<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Display button bar<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD4929A2CAFBFA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Display button bar\"},\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_27(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value '02/12/2015' in JQuery DateInput Field - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD4929AAE14BFA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD4929AAE14BFA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":3031,\"isWeb\":false,\"description\":\"Think <i>3,031<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>02\\/12\\/2015<\\/b>' in <b>JQuery DateInput Field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD4929AAE14BFA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"02\\/12\\/2015\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_28(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Go Back - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4ADD72F264A93FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4ADD72F264A93FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":1000,\"isWeb\":false,\"description\":\"Think <i>1,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"uid\":\"A1E4ADD72F264A93FA9AB33134613337\",\"revealPref\":\"true\",\"isWeb\":true,\"description\":\"Go <b>Back<\\/b>\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"back\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_29(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Display month & year menus - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD4929AD7954FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD4929AD7954FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":9216,\"isWeb\":false,\"description\":\"Think <i>9,216<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Display month &amp; year menus<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD4929AD7954FA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Display month & year menus\"},\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_30(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value '02/12/2015' in JQuery DateInput Field - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD4929B5689BFA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD4929B5689BFA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":2963,\"isWeb\":false,\"description\":\"Think <i>2,963<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>02\\/12\\/2015<\\/b>' in <b>JQuery DateInput Field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD4929B5689BFA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"02\\/12\\/2015\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_31(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Go Back - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4ADD73186A8C3FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4ADD73186A8C3FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":1000,\"isWeb\":false,\"description\":\"Think <i>1,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"uid\":\"A1E4ADD73186A8C3FA9AB33134613337\",\"revealPref\":\"true\",\"isWeb\":true,\"description\":\"Go <b>Back<\\/b>\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"back\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_32(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Dates in other months - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD4929B800ABFA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD4929B800ABFA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":4334,\"isWeb\":false,\"description\":\"Think <i>4,334<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Dates in other months<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD4929B800ABFA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Dates in other months\"},\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_33(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value '02/13/2015' in JQuery DateInput Field - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD4929BFEFE4FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD4929BFEFE4FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":2883,\"isWeb\":false,\"description\":\"Think <i>2,883<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>02\\/13\\/2015<\\/b>' in <b>JQuery DateInput Field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD4929BFEFE4FA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"02\\/13\\/2015\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_34(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Go Back - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4ADD732D7E0E3FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4ADD732D7E0E3FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":1000,\"isWeb\":false,\"description\":\"Think <i>1,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"uid\":\"A1E4ADD732D7E0E3FA9AB33134613337\",\"revealPref\":\"true\",\"isWeb\":true,\"description\":\"Go <b>Back<\\/b>\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"back\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_35(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Show week of the year - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD4929C212C4FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD4929C212C4FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":2769,\"isWeb\":false,\"description\":\"Think <i>2,769<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Show week of the year<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD4929C212C4FA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Show week of the year\"},\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_36(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value '02/28/2015' in JQuery DateInput Field - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD4929C9B3EBFA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Enter value '<b>02\\/28\\/2015<\\/b>' in <b>JQuery DateInput Field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD4929C9B3EBFA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"02\\/28\\/2015\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_37(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Go Back - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4ADD734FF7BD3FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4ADD734FF7BD3FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":1000,\"isWeb\":false,\"description\":\"Think <i>1,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"uid\":\"A1E4ADD734FF7BD3FA9AB33134613337\",\"revealPref\":\"true\",\"isWeb\":true,\"description\":\"Go <b>Back<\\/b>\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"back\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_38(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Display multiple months - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD4929CBFDDBFA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD4929CBFDDBFA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":7385,\"isWeb\":false,\"description\":\"Think <i>7,385<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Display multiple months<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD4929CBFDDBFA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Display multiple months\"},\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_39(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value '03/20/2015' in JQuery DateInput Field - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD4929D3C60BFA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD4929D3C60BFA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":4494,\"isWeb\":false,\"description\":\"Think <i>4,494<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>03\\/20\\/2015<\\/b>' in <b>JQuery DateInput Field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD4929D3C60BFA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"03\\/20\\/2015\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_40(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Go Back - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4ADD7378D2B93FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4ADD7378D2B93FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":1000,\"isWeb\":false,\"description\":\"Think <i>1,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"uid\":\"A1E4ADD7378D2B93FA9AB33134613337\",\"revealPref\":\"true\",\"isWeb\":true,\"description\":\"Go <b>Back<\\/b>\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"back\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_41(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Icon trigger - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD4929D60FF4FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD4929D60FF4FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":10552,\"isWeb\":false,\"description\":\"Think <i>10,552<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Icon trigger<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD4929D60FF4FA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Icon trigger\"},\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_42(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value '05/15/2015' in JQuery DateInput Field - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD4929DDD82BFA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD4929DDD82BFA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":7194,\"isWeb\":false,\"description\":\"Think <i>7,194<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>05\\/15\\/2015<\\/b>' in <b>JQuery DateInput Field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD4929DDD82BFA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"05\\/15\\/2015\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_43(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Go Back - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4ADD739883843FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4ADD739883843FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":1000,\"isWeb\":false,\"description\":\"Think <i>1,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"uid\":\"A1E4ADD739883843FA9AB33134613337\",\"revealPref\":\"true\",\"isWeb\":true,\"description\":\"Go <b>Back<\\/b>\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"back\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_44(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Animations - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD4929E04924FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Animations<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD4929E04924FA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Animations\"},\"name\":\"content\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_45(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value '05/22/2015' in JQuery DateInput Field - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD4929EB1E94FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD4929EB1E94FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":8685,\"isWeb\":false,\"description\":\"Think <i>8,685<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>05\\/22\\/2015<\\/b>' in <b>JQuery DateInput Field<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD4929EB1E94FA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"05\\/22\\/2015\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_46(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Select 'Blind (UI Effect)' in Drop-down list whose Content is Show (default) - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD4929EDDDBBFA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD4929EDDDBBFA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":9094,\"isWeb\":false,\"description\":\"Think <i>9,094<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Select '<b>Blind (UI Effect)<\\/b>' in <b>Drop-down list<\\/b> whose <b>Content<\\/b> is <b>Show (default)<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD4929EDDDBBFA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onchange\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Blind (UI Effect)\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Show (default)\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.select\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_47(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Go Back - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4ADD73D2B4FA3FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4ADD73D2B4FA3FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":1000,\"isWeb\":false,\"description\":\"Think <i>1,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"uid\":\"A1E4ADD73D2B4FA3FA9AB33134613337\",\"revealPref\":\"true\",\"isWeb\":true,\"description\":\"Go <b>Back<\\/b>\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"back\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_48(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Date Range - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD4929F09CD4FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD4929F09CD4FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":4984,\"isWeb\":false,\"description\":\"Think <i>4,984<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Date Range<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD4929F09CD4FA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Date Range\"},\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_49(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value '04/15/2015' in JQuery DateInput Field whose Label is From - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD4929F88C14FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD4929F88C14FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":3677,\"isWeb\":false,\"description\":\"Think <i>3,677<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Verify that <b>Id<\\/b> equals <b>from<\\/b> on <b>JQuery DateInput Field<\\/b> whose <b>Label<\\/b> is <b>From<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"id\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"from\"},\"name\":\"id\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Id\",\"operator\":\"TEquals\"},\"uid\":\"A1E4ADD869CA3C05FA9AB33134613337\",\"isWeb\":true,\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"From\"},\"name\":\"label\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}},{\"revealPref\":\"true\",\"description\":\"Verify that <b>Label<\\/b> equals <b>From<\\/b> on <b>JQuery DateInput Field<\\/b> whose <b>Type<\\/b> is <b>text<\\/b> located at position 1\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"label\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"From\"},\"name\":\"label\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Label\",\"operator\":\"TEquals\"},\"uid\":\"A1E4ADD86B794BA6FA9AB33134613337\",\"isWeb\":true,\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"parameter\":{\"name\":\"type\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"text\"},\"name\":\"type\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\",\"locator\":{\"parameter\":{\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LPosition\"}}},{\"revealPref\":\"true\",\"description\":\"Verify that <b>Id<\\/b> equals <b>to<\\/b> on <b>JQuery DateInput Field<\\/b> whose <b>Label<\\/b> is <b>to<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"id\",\"id\":\"21\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"to\"},\"name\":\"id\",\"id\":\"20\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Id\",\"operator\":\"TEquals\"},\"uid\":\"A1E4ADD86E676AD7FA9AB33134613337\",\"isWeb\":true,\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"19\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"to\"},\"name\":\"label\",\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}},{\"revealPref\":\"true\",\"description\":\"Verify that <b>Label<\\/b> equals <b>to<\\/b> on <b>JQuery DateInput Field<\\/b> whose <b>Type<\\/b> is <b>text<\\/b> located at position 2\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"label\",\"id\":\"29\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"to\"},\"name\":\"label\",\"id\":\"28\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Label\",\"operator\":\"TEquals\"},\"uid\":\"A1E4ADD86F93DCF6FA9AB33134613337\",\"isWeb\":true,\"id\":\"22\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"parameter\":{\"name\":\"type\",\"id\":\"25\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"text\"},\"name\":\"type\",\"id\":\"24\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"23\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\",\"locator\":{\"parameter\":{\"id\":\"27\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"2\"},\"id\":\"26\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LPosition\"}}},{\"revealPref\":\"true\",\"description\":\"Verify that <b>Name<\\/b> equals <b>to<\\/b> on <b>JQuery DateInput Field<\\/b> whose <b>Label<\\/b> is <b>to<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"name\",\"id\":\"35\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"to\"},\"name\":\"name\",\"id\":\"34\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Name\",\"operator\":\"TEquals\"},\"uid\":\"A1E4ADD870B15AD7FA9AB33134613337\",\"isWeb\":true,\"id\":\"30\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"33\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"to\"},\"name\":\"label\",\"id\":\"32\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"31\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>04\\/15\\/2015<\\/b>' in <b>JQuery DateInput Field<\\/b> whose <b>Label<\\/b> is <b>From<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD4929F88C14FA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"37\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"38\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"04\\/15\\/2015\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"36\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"41\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"From\"},\"name\":\"label\",\"id\":\"40\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"39\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_50(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value '05/14/2015' in JQuery DateInput Field whose Label is to - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD4929FB4B42FA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD4929FB4B42FA9AB33134613337\",\"preferredThinktime\":0,\"thinktime\":3648,\"isWeb\":false,\"description\":\"Think <i>3,648<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>05\\/14\\/2015<\\/b>' in <b>JQuery DateInput Field<\\/b> whose <b>Label<\\/b> is <b>to<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1E4AD4929FB4B42FA9AB33134613337\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"05\\/14\\/2015\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"to\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.jquidateinput\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_51(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Close browser window - Aries-web jqueryui1.10.4 samples home page",
												  "A1E4AD4929FDE34EFA9AB33134613337",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E4AD4929FDE34EFA9AB33134613337\",\"revealPref\":\"true\",\"isWeb\":true,\"description\":\"<b>Close<\\/b> browser window\",\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"close\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\",\"application_uid\":\"7da9b72f-1e45-44ab-82fa-dac1382addcb\",\"timeout\":0,\"screenshotPref\":\"ALL\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

}
