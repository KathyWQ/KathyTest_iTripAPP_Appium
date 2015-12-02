package testcase.login.android.kathy;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testcase.commonality.android.kathy.CommonClass_iTripAPP;


public class Login_iTripAPP_PhoneNumber  extends CommonClass_iTripAPP{

	@Test
	@Parameters({"PhoneUser","Phone_PWD"})
	public  void Login_iTripAPP_For_PhoneNumber(String PhoneUser,String Phone_PWD) throws Exception{
		
		//找到模块“我”并点击
		getAppiumDriver().findElementsByClassName("android.widget.TextView").get(10).click();
						Thread.sleep(5000);
						
		//点击登录按钮     	
		getAppiumDriver().findElementsById("com.aoliday.android.phone:id/login").get(0).click();
						Thread.sleep(5000);
	     	
	     	//输入手机号
	     getAppiumDriver().findElementsByClassName("android.widget.EditText").get(0).sendKeys(PhoneUser);        
	     				Thread.sleep(5000);
	     	
	     	//输入密码
	     getAppiumDriver().findElementsByClassName("android.widget.EditText").get(1).sendKeys(Phone_PWD);
	     				Thread.sleep(5000);
	     	//点击登录按钮
	     getAppiumDriver().findElementsByClassName("android.widget.TextView").get(3).click();
	     				Thread.sleep(5000);	
	/**
	 	for(int i=0;i<LoginBtn.size();i++){
			LoginBtn.get(i).getAttribute("text");
  	        System.out.println('\n'+"索引对应text值："+'\n'+LoginBtn.get(i).getAttribute("text")); 
  	        Thread.sleep(100);
       }
       */
	     	
	     		
	}

}

