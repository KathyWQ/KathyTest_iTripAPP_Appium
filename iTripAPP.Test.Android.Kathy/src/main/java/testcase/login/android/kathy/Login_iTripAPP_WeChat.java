package testcase.login.android.kathy;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testcase.commonality.android.kathy.CommonClass_iTripAPP;

public class Login_iTripAPP_WeChat extends CommonClass_iTripAPP {

	@Test
	public  void Login_iTripAPP_weixin () throws InterruptedException{
	
		//找到模块“我”并点击
		getAppiumDriver().findElementsByClassName("android.widget.TextView").get(10).click();
						Thread.sleep(5000);
						
		//点击登录按钮
		getAppiumDriver().findElementsById("com.aoliday.android.phone:id/login").get(0).click();
						Thread.sleep(5000);	
		
		//iTirp选择微信登录
		getAppiumDriver().findElementsByClassName("android.widget.TextView").get(5).click();
					Thread.sleep(5000);
					System.out.print("\n"+"iTirp选择微信登录 OK");
									
						/*
						 * getAppiumDriver().tap(arg0, arg1, arg2, arg3);
						 * arg0=手机指针值P  P代表触点数（一般为1表示点击）
						 * arg1=手机指针值dX dX代表当前触点X坐标
						 * arg2=手机指针值dY dY代表当前触点坐标
						 * arg3 代表触点时间 (一般为0，表示不做停留，如果想长按，值一般设置为500，值越大，长按越久)
						 * 手机开启查看坐标位置：设置---开发人员选项--指针位置
						 * 其中的值和含义：p dx dy xv yv prs size(Xv和Yv代表触点当前移动速度)
						 * */
		 //得到微信用户名输入框
		 List<WebElement> WeChatUName = getAppiumDriver().findElementsById("com.tencent.mm:id/f8");
		 
		 //得到微信密码输入框
		 List<WebElement> WeChatPwd = getAppiumDriver().findElementsById("com.tencent.mm:id/f8");
								   	
						//如果微信用户名密码输入框不为空，或者com.tencent.mm:id/f8  size不等于0，就输入微信用户名和密码并点击登录和授权，
						//如果没有微信登录页面，就直接点击授权按钮
						if(WeChatUName.size() > 0 && WeChatPwd .size() > 0 ){
								   			
								WeChatUName.get(0).sendKeys("771797557");
								WeChatPwd.get(1).sendKeys("ygq520@wq");
								getAppiumDriver().findElementById("com.tencent.mm:id/axd").click();
								
						}else{
								   
						    	   getAppiumDriver().tap(1, 550, 1020, 0);
						    	   
						       }
						
						//由于微信授权页面加载时间较慢，预留等待时间教材
						Thread.sleep(15000);
						//微信登录成功后需点击授权
						getAppiumDriver().tap(1, 550, 1020, 0);
						
						Thread.sleep(500);
						
						//判断Itrip 微信登录是否成功
						List<WebElement> WeChatName=getAppiumDriver().findElementsById("com.aoliday.android.phone:id/nick_name_text_view");
						
							if(WeChatName.toString().isEmpty()){
								
								System.out.print("\n"+"WeChat login Pass");
							
							}else{
							
								System.out.print("\n"+"WeChat logion Fail");
								
								//关闭app
								getAppiumDriver().closeApp();
						}
						     
	}	     
}

