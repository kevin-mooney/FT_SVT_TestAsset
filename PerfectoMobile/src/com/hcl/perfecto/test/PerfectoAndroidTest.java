package com.hcl.perfecto.test;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class PerfectoAndroidTest {

	private final static String user = "dominique.guilbaud1@hcl.com";
	private final static String pwd = "Welcome1019";
	private final static String host = "partners.perfectomobile.com";
	        
	
	private static AndroidDriver<AndroidElement> driver;
	
	@BeforeClass
	public static void beforeClass() throws Exception {
		driver = new AndroidDriver<>(getURL(), getCapabilities());
		//- set the finding timeout to 10s
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	private static DesiredCapabilities getCapabilities() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("user", user);
        capabilities.setCapability("password", pwd);
        capabilities.setCapability("automationName", "appium");
        //- device stuff
        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("platformVersion", "4.4.2");
//        capabilities.setCapability("model", "Galaxy Note Pro 12.2");
        capabilities.setCapability("model", "Galaxy S6");
		capabilities.setCapability("platformVersion", "7.0");
		//- install app: apiDemo
        capabilities.setCapability("app", "PUBLIC:dom/ApiDemosAppium.apk");
//        capabilities.setCapability("appActivity", ".ApiDemos");
		return capabilities;
	}

	private static URL getURL() throws MalformedURLException {
		String url = "https://" + host + "/nexperience/perfectomobile/wd/hub";
		return new URL(url);
	}

	@AfterClass
    public static void afterClass() throws Exception {
		if (driver != null) {
            driver.quit();
        }
	}
	
	@Before
	public void before() throws Exception {
		Activity activity = new Activity("io.appium.android.apis", ".ApiDemos");
		driver.startActivity(activity);
	}
	
	@Test
	public void apiDemoTest() {
		AndroidElement elt = driver.findElementByClassName("android.widget.TextView");
		assertEquals("API DEMOS", elt.getText());
		elt = driver.findElement(By.xpath(".//*[@text='App']"));
        elt.click();
        List<AndroidElement> elements = driver.findElementsByClassName("android.widget.TextView");
        assertEquals("Activity", elements.get(2).getText());
	}
}
