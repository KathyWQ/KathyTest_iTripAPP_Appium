package testcase.login.android.kathy;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testcase.commonality.android.kathy.CommonClass_iTripAPP;

public class LoginPage_For_Register extends CommonClass_iTripAPP {
	
	@Test
	@Parameters({"UserName","PWD"})
	public  void LoginPage_Register() throws InterruptedException{
		//找到模块“我”并点击
				getAppiumDriver().findElementsByClassName("android.widget.TextView").get(10).click();
						Thread.sleep(5000);
						
				//点击登录按钮     	
				getAppiumDriver().findElementsById("com.aoliday.android.phone:id/login").get(0).click();
						Thread.sleep(5000);
	}
}
