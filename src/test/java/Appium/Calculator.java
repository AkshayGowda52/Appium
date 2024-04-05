package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {
	@Test
	public void Demo() throws Throwable {
		DesiredCapabilities dp = new DesiredCapabilities();
		dp.setCapability(MobileCapabilityType.PLATFORM_VERSION, "Android");
		dp.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dp.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A30s");
		dp.setCapability(MobileCapabilityType.UDID, "RZ8N113AGLX");
		dp.setCapability("app","C:\\Users\\HarshithS\\Downloads\\ApiDemos-debug.apk");
		//dp.setCapability("appPackage","com.oneplus.calculator");
		//dp.setCapability("appActivity","com.oneplus.calculator.Calculator");
		URL url = new URL("http://localhost:4723");
		AndroidDriver ad = new AndroidDriver(url,dp);
		ad.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ad.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		ad.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		ad.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		WebElement peoples = ad.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"People Names\"]"));
		
	    ((JavascriptExecutor)ad).executeScript("mobile:longClickGesture",ImmutableMap.of("elementId",((RemoteWebElement)peoples)
	    		.getId(),"duration",2000)) ;
	}
	
	
	@Test
	public void doubleTap() throws MalformedURLException {
		DesiredCapabilities dp = new DesiredCapabilities();
		dp.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dp.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dp.setCapability("autoGrantPermissions", true);
		dp.setCapability("ignoreHiddenApiPolicyError", true);
		dp.setCapability("noReset", true);
		dp.setCapability(MobileCapabilityType.DEVICE_NAME, "Harshith");
		dp.setCapability(MobileCapabilityType.UDID, "NNEUYDIV65HMIJMV");
		// dp.setCapability("app","C:\\Users\\HarshithS\\Downloads\\ApiDemos-debug.apk");
		dp.setCapability("appPackage", "com.davemorrissey.labs.subscaleview.sample");
		dp.setCapability("appActivity", "com.davemorrissey.labs.subscaleview.sample.MainActivity");
		URL url = new URL("http://localhost:4723");
		AndroidDriver ad = new AndroidDriver(url, dp);
		ad.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ad.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Basic features\"]")).click();
		WebElement img = ad.findElement(AppiumBy.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
		((JavascriptExecutor) ad).executeScript("mobile:doubleClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) img).getId()));
		
	}
	
}


