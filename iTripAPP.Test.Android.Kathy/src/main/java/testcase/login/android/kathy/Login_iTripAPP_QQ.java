package testcase.login.android.kathy;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testcase.commonality.android.kathy.CommonClass_iTripAPP;
	
public class Login_iTripAPP_QQ extends CommonClass_iTripAPP {
	
	@Test
	public  void Login_iTripAPP_QQ() throws InterruptedException{
		
		//找到模块“我”并点击
		getAppiumDriver().findElementsByClassName("android.widget.TextView").get(10).click();
								Thread.sleep(5000);
								
		//点击登录按钮     	
		getAppiumDriver().findElementsById("com.aoliday.android.phone:id/login").get(0).click();
								Thread.sleep(5000);
						
		//选择QQ登录方式						
		getAppiumDriver().findElementsByClassName("android.widget.TextView").get(6).click();	
	   							Thread.sleep(5000);		
	   	
	   							System.out.print(getAppiumDriver().getPageSource());
	   	//点击第三方QQ登录按钮
	   	getAppiumDriver().findElementByClassName("android.widget.Button").click();
	   							Thread.sleep(5000);
	
	}
	
}
