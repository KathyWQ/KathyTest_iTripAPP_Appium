package testcase.login.android.kathy;

import java.util.List;

import org.openqa.selenium.WebElement;

import testcase.commonality.android.kathy.CommonClass_iTripAPP;

public class Not_Installed_WeChat extends CommonClass_iTripAPP{

	public void NotInstalledWeChat() throws InterruptedException{
		
		//找到模块“我”并点击
		getAppiumDriver().findElementsByClassName("android.widget.TextView").get(10).click();
						Thread.sleep(5000);
						
		//点击登录按钮
		getAppiumDriver().findElementsById("com.aoliday.android.phone:id/login").get(0).click();
						Thread.sleep(5000);	
		
		//iTirp选择微信登录
	List<WebElement>	WeChatLogin=getAppiumDriver().findElementsByClassName("android.widget.TextView");
	
		if(WeChatLogin== null){
			
			System.out.print("\n"+"您当前未安装微信，无法使用微信登录");
			
		}else{
		
			WeChatLogin.get(5).click();
			Thread.sleep(5000);
			System.out.print("\n"+"iTirp选择微信登录 OK");
		
		}
									
			
		
	}
		
}
