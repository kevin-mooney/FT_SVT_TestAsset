package com.hcl.perfecto.test;

import static org.junit.Assert.assertEquals;
 
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class PerfectoIOSTest {

	private final static String user = "dominique.guilbaud1@hcl.com";
	private final static String pwd = "Welcome1019";
	private final static String host = "partners.perfectomobile.com";
	        
	
	private static IOSDriver<IOSElement> driver;
	
	@BeforeClass
	public static void beforeClass() throws Exception {
		driver = new IOSDriver<>(getURL(), getCapabilities());
		//- set the finding timeout to 10s
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	private static DesiredCapabilities getCapabilities() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("user", user);
        capabilities.setCapability("password", pwd);
        capabilities.setCapability("automationName", "appium");
        //- device stuff
        capabilities.setCapability("platformName", "iOS");
//        capabilities.setCapability("platformVersion", "10.3.1");
        capabilities.setCapability("model", "iPhone-6");

		//- install app: Recipes
        capabilities.setCapability("app", "PUBLIC:Samples/Recipes.ipa");
        capabilities.setCapability("appName", "Recipes");
        capabilities.setCapability("bundleId", "com.example.apple-samplecode.Recipes");
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
	
	@Test
	public void apiDemoTest() {
		//- click on +
		IOSElement elt = driver.findElement(By.name("Add"));
		elt.click();
		//- enter Crumble + done
		List<IOSElement> elements = driver.findElementsByClassName("UIATextField");
		elements.get(0).sendKeys("Crumble");
		elt = driver.findElement(By.name("Done"));
		elt.click();
		//- Back
		elt = driver.findElement(By.name("Recipes"));
		elt.click();
		
		//- check Crumble has been added
		elements = driver.findElementsByClassName("UIAStaticText");
		assertEquals("Crumble", elements.get(7).getText());
	}
}
