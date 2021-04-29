package testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

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
public class cw1cw {
	public static void main(String[] args) throws MalformedURLException,InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.selendroid.testapp");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.selendroid.testapp.HomeScreenActivity");
		
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("startUserRegistrationCD");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementById("io.selendroid.testapp:id/inputUsername");
		el2.click();
		el2.sendKeys("TOnieJA");
		MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("email of the customer");
		el3.click();
		el3.sendKeys("xd@xd.xd");
		MobileElement el4 = (MobileElement) driver.findElementById("io.selendroid.testapp:id/inputPassword");
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementById("io.selendroid.testapp:id/inputPassword");
		el5.sendKeys("12345");
		MobileElement el6 = (MobileElement) driver.findElementById("io.selendroid.testapp:id/inputName");
		el6.click();
		el6.clear();
		el6.sendKeys("Pan Admin\n");
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner\r\n" + 
				"");
		el7.click();
				
		MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[6]");
		el8.click();
		
		MobileElement el9 = (MobileElement) driver.findElementById("io.selendroid.testapp:id/input_adds");
		el9.click();
		
		MobileElement el10 = (MobileElement) driver.findElementById("io.selendroid.testapp:id/btnRegisterUser");
		el10.click();
				
		MobileElement el11 = (MobileElement) driver.findElementById("io.selendroid.testapp:id/buttonRegisterUser");
		el11.click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}