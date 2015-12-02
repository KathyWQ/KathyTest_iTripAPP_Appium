package testcase.login.android.kathy;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testcase.commonality.android.kathy.CommonClass_iTripAPP;

public class Login_iTripAPP_Email extends CommonClass_iTripAPP{
	
	@Test
	@Parameters({"EmailUser","Email_PWD"})
	public  void Login_iTripAPP_ForEmail(String EmailUser,String Email_PWD) throws InterruptedException{
	

	  	//找到模块“我”并点击
		getAppiumDriver().findElementsByClassName("android.widget.TextView").get(10).click();
						Thread.sleep(5000);
		//点击登录按钮
     	getAppiumDriver().findElementsById("com.aoliday.android.phone:id/login").get(0).click();;
     					Thread.sleep(100);
//     	if()
//     	{
//     	else{
//     		
//     		continue;
//     	}
//     	}
     	//输入用户名邮箱
     	getAppiumDriver().findElementsByClassName("android.widget.EditText").get(0).sendKeys(EmailUser);        
     					Thread.sleep(5000);
     	//输入邮箱密码
     	getAppiumDriver().findElementsByClassName("android.widget.EditText").get(1).sendKeys(Email_PWD);
     					Thread.sleep(5000);
     	//点击登录按钮
     	getAppiumDriver().findElementsByClassName("android.widget.TextView").get(3).click();
     					Thread.sleep(5000);		

		

	
	}
	
}
