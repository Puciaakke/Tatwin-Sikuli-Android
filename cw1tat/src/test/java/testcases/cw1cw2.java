package testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;;

/**
 * Unit test for simple App.
 */
public class cw1cw2 {
	public static void main(String[] args) throws MalformedURLException,InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.selendroid.testapp");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.selendroid.testapp.HomeScreenActivity");
		
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("visibleButtonTestCD");
		el1.click();
		String tekst1 = driver.findElement(By.id("io.selendroid.testapp:id/visibleTextView")).getText();
		System.out.println(tekst1);
		
		MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("showPopupWindowButtonCD");
		el2.click();
		System.out.println(driver.switchTo().alert());
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}