package testcase.commonality.android.kathy;

import iTrip_TestCase_Kathy.Launch_iTripApp_ForAndroid;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;

import org.hamcrest.Factory;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CommonClass_iTripAPP{

	/**
	 * 
	 * @throws Exception
	 * 
	 */
	
	private AppiumDriver driver;
	
	@BeforeMethod
	public void Test_setUp () throws Exception{
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
	 		capabilities.setCapability("platformName", "Android"); 
	 		capabilities.setCapability("deviceName", "PE-TL20");
			capabilities.setCapability("platformVersion", "4.4.2");
			capabilities.setCapability("appPackage", "com.aoliday.android.phone");
			capabilities.setCapability("appActivity", "com.aoliday.android.phone.Main");
			//设置unicode支持中文输入  appium自带输入法
			capabilities.setCapability("unicodeKeyboard","True");
			//重置输入法为系统输入法  把appium设置为默认asd
			capabilities.setCapability("resetkeyboard","True");
			//安装apk时不对apk进行重签名
			capabilities.setCapability("noSign","True");	
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				System.out.print("设备启动成功");
				Thread.sleep(5000);
				
	}
	

	
	//设置private AppiumDriver driver 返回值
	public AppiumDriver getAppiumDriver(){
		return driver;
		
	}
	
	@AfterClass
	public  void tearDown(){
			driver.quit();
			System.out.print("quit OK!");
		}
	
	

}
