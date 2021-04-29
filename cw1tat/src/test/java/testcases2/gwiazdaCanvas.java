package testcases2;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;;

/**
 * Unit test for simple App.
 */
public class gwiazdaCanvas {
	public static void main(String[] args) throws MalformedURLException,InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.selendroid.testapp");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.selendroid.testapp.HomeScreenActivity");
		
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.findElement(By.id("io.selendroid.testapp:id/touchTest")).click();
		Thread.sleep(1000);
		
		TouchAction action = new TouchAction(driver);
		MultiTouchAction multiAction = new MultiTouchAction(driver);
		
		driver.findElement(By.id("io.selendroid.testapp:id/canvas_button")).click();
		Thread.sleep(1000);
		
		TouchAction action1 = new TouchAction(driver);
		TouchAction action2 = new TouchAction(driver);
		TouchAction action3 = new TouchAction(driver);
		TouchAction action4 = new TouchAction(driver);
		TouchAction action5 = new TouchAction(driver);
		/*action1.longPress(PointOption.point(200,540));
		action1.moveTo(PointOption.point(800,240));
		//action2.press(PointOption.point(800,240));
		action1.moveTo(PointOption.point(500,940));
		//action3.press(PointOption.point(500,940));
		action1.moveTo(PointOption.point(500,140));
		//action4.press(PointOption.point(500,140));
		action1.moveTo(PointOption.point(800,840));
		//action5.press(PointOption.point(800,840));
		action1.moveTo(PointOption.point(200,540));*/
		Thread.sleep(1000);
		
		action1.perform();
		action2.release();
		action2.perform();
		action3.release();
		action3.perform();
		action4.release();
		action4.perform();
		action5.release();
		action5.perform();
		action1.longPress(PointOption.point(200,540)).moveTo(PointOption.point(800,240));
		action2.longPress(PointOption.point(800,240)).moveTo(PointOption.point(500,940));
		action3.longPress(PointOption.point(500,940)).moveTo(PointOption.point(500,140));
		action4.longPress(PointOption.point(500,140)).moveTo(PointOption.point(800,840));
		action5.longPress(PointOption.point(800,840)).moveTo(PointOption.point(200,540));
		
		multiAction.add(action1).add(action2).add(action3).add(action4).add(action5).perform();
		Thread.sleep(10000);
		driver.quit();
		
	
	}
}