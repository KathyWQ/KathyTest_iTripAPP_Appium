package iTrip_TestCase_Kathy;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


public class Launch_iTripApp_ForAndroid {
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Launch_iTripApp_ForAndroid LaunchiTripAPP=new  Launch_iTripApp_ForAndroid();
		LaunchiTripAPP.Test_setUp();
	}
	
	public AppiumDriver driver;
	
	public void Test_setUp()throws Exception{
	DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android"); 
		capabilities.setCapability("deviceName", "Galaxy Note3");
		capabilities.setCapability("platformVersion", "5.0");
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
		Thread.sleep(100);

	}
	public void UpdateSoftware() throws InterruptedException{
		//点击更新弹出框btn：点击以后更新成功
		  List <WebElement> Clickupdate = driver.findElementsByClassName("android.widget.Button");
		       Thread.sleep(5000);
	       Clickupdate.get(1).click();
//		       Thread.sleep(100);
//		     System.out.println('\n'+"点击以后更新成功");
		    
		
		if(Clickupdate.get(1)!=null){
			Thread.sleep(1000);
		       Clickupdate.get(1).click();
		       Thread.sleep(100);
		     System.out.println('\n'+"点击以后更新成功");
		}else{
			System.out.println("没有找到相关更新");
		}
	}
	
}
