package testcase.login.android.kathy;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testcase.commonality.android.kathy.CommonClass_iTripAPP;

public class Login_iTripAPP_SinaWeibo extends CommonClass_iTripAPP {
	
	@Test
	@Parameters({"WeChatUser","WeChatPWD"})
	public  void Login_iTripAPP_sinaweibo() throws InterruptedException{
	
		//找到模块“我”并点击
		getAppiumDriver().findElementsByClassName("android.widget.TextView").get(10).click();
						Thread.sleep(5000);
						
		//点击登录按钮     	
		getAppiumDriver().findElementsById("com.aoliday.android.phone:id/login").get(0).click();
						Thread.sleep(5000);
						
		//选择sina微博登录方式
		getAppiumDriver().findElementsByClassName("android.widget.TextView").get(4).click();	
						Thread.sleep(5000);
	}
	
	
}
