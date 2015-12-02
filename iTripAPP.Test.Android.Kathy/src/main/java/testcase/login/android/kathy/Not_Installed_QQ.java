package testcase.login.android.kathy;

import java.util.List;

import org.openqa.selenium.WebElement;

import testcase.commonality.android.kathy.CommonClass_iTripAPP;

public class Not_Installed_QQ extends CommonClass_iTripAPP {
	
	
	public void NotInstalledQQ() throws InterruptedException{
		//点击模块 "我"
		getAppiumDriver().findElementsByClassName("android.widget.TextView").get(10).click();
		Thread.sleep(5000);
		
		//点击登录按钮
		getAppiumDriver().findElementsById("com.aoliday.android.phone:id/login").get(0).click();
		Thread.sleep(5000);	

		//iTirp选择QQ登录
		List<WebElement>	QQLogin=getAppiumDriver().findElementsByClassName("android.widget.TextView");

			if(QQLogin!= null){
	
					System.out.print("\n"+"您当前未安装QQ，无法使用QQ登录");

			}else{

					QQLogin.get(6).click();
						Thread.sleep(5000);
						System.out.print("\n"+"iTirp选择QQ登录 OK");
}
					

	}
	//找到模块“我”并点击
			
}
