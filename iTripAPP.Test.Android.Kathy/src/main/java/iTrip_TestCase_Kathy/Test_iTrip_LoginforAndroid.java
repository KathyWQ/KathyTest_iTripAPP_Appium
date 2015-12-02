package iTrip_TestCase_Kathy;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Test_iTrip_LoginforAndroid {
	
	public AppiumDriver driver;
	WebElement el;
	
	@BeforeClass
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
				Thread.sleep(5000);
	}
	
	
	  @Test
	public void addContact()throws Exception{
		  
		  	//点击更新弹出框btn：点击以后更新成功
//		  List <WebElement> Clickupdate = driver.findElementsByClassName("android.widget.Button");
//		       Thread.sleep(1000);
//		       Clickupdate.get(1).click();
//		     System.out.println('\n'+"点击以后更新成功");
		     
		    //点击首页搜索框，输入产品ID 2174
	  List <WebElement> textFieldsList = driver.findElementsByClassName("android.widget.TextView");
		  
		     	//textFieldsList.get(1).getAttribute("text");
		     textFieldsList.get(1).click();
		     	Thread.sleep(100);
		     	textFieldsList.get(0).sendKeys("2174");
		     	Thread.sleep(500);
		     	System.out.println('\n'+"输入产品ID成功");
		     	textFieldsList.get(1).click();
		     	Thread.sleep(5000);		     	
		     	System.out.println('\n'+"点击搜索成功");
		    //点击搜索出来的产品列表，点击需要购买的产品
		  List <WebElement> clicktitle= driver.findElementsByClassName("android.widget.TextView");
		        System.out.println('\n'+"选择产品成功");
		        clicktitle.get(2).click();
		        Thread.sleep(5000);
		        
		        
		        //点击产品详情页的产品图片，放大查看图片查看产品大图
//		  List <WebElement> clickshouchang= driver.findElementsByClassName("android.widget.ImageView");
//		        clickshouchang.get(2).click();
//		        clickshouchang.size();
//	        	System.out.println('\n'+clickshouchang.size());
//		       
		        
		        //产品详情页，点击分享按钮
//	      List <WebElement> clickljyd= driver.findElementsByClassName("android.widget.TextView");
//		        clickljyd.get(2).getAttribute("text");
//		        System.out.println('\n'+"产品详情页对应索引text值："+'\n'+clickljyd.get(2).getAttribute("text")); 
//		        Thread.sleep(100);
//		        clickljyd.get(2).click();
//	        
			
		        //产品详情-点击客户电话
//		List <WebElement> clickljyd= driver.findElementsByClassName("android.widget.TextView");
//					        clickljyd.get(9).getAttribute("text");
//					        System.out.println('\n'+"产品详情页对应索引text值："+'\n'+clickljyd.get(9).getAttribute("text")); 
//					        Thread.sleep(100);
//					        clickljyd.get(9).click();
		        //点击立即预定按钮
		List <WebElement> clickljyd= driver.findElementsByClassName("android.widget.TextView");
		        clickljyd.get(10).click();
		        System.out.print('\n'+"点击立即预定成功");
		        Thread.sleep(5000);
		        
		        //操作webview页面
		        Set<String> context = driver.getContextHandles();
		        for (String contextName : context) {
		        	
		            System.out.println(contextName);
		        }
		        
		        //打印当前H5页面的源码集   可选   可打印出来寻找你要定位的元素值等
		       System.out.println(driver.getPageSource());
		       Thread.sleep(5000);
		       driver.findElementByXPath("//android.view.View[contains(@content-desc,'更改旅行日期')]").click();
		       Thread.sleep(5000);
		       driver.findElementByXPath("//android.view.View[contains(@content-desc,'30')]").click();
		       Thread.sleep(5000);
				        List <WebElement> clickwcxz= driver.findElementsByClassName("android.widget.TextView");
				        for(int i=0;i<clickwcxz.size();i++)
				        {
				        String	wcxz=clickwcxz.get(i).getAttribute("text");
				        	if(wcxz.contains("完成选择"))
				        	{
				        		clickwcxz.get(i).click();
				        		  Thread.sleep(100);
				        		  System.out.println('\n'+"完成选择成功");
				        	}else{
				        		continue;
				        	}
				        }
				        Thread.sleep(5000);				        
				         //填写旅客基本信息
				        List <WebElement>  Passengers_basic_information=driver.findElementsByClassName("android.widget.EditText");
				        	//游客姓名
				        	Passengers_basic_information.get(0).sendKeys("UserName");
				        	//游客姓名拼音	
				        	Passengers_basic_information.get(1).sendKeys("TestPingYingName");
				        	//邮箱
				        	Passengers_basic_information.get(2).sendKeys("Kathy.wang@aoliday.com");
				        	//国内手机号
				        	Passengers_basic_information.get(3).sendKeys("15888888888");
				        	//国际手机号
				        	Passengers_basic_information.get(4).sendKeys("02890998478");
				        		
				        	//旅客附加信息
				        List <WebElement>   Additional_information_about_passengers=driver.findElementsByXPath("//android.widget.EditText[contains(@content-desc,'请输入')]");
				        	//儿童性别和年龄（英文）
				        	Additional_information_about_passengers.get(0).sendKeys("children_age");
				        	//全部旅客姓名拼音		
				        	Additional_information_about_passengers.get(1).sendKeys("All_visitors_name");
				        	//离开航班号及时间
				        	Additional_information_about_passengers.get(2).sendKeys("Leave_the_flight_time");
				        	
				        	//屏幕宽度大小
				        	int width=driver.manage().window().getSize().width;
				        	//屏幕高度大小
				        	int height=driver.manage().window().getSize().height;
				        	//屏幕滑动到第二屏
				        	driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, 5000);
				        	//抵达航班号及时间
				        	Additional_information_about_passengers.get(3).sendKeys("Arrival_the_flight_time");
				        	//小孩姓名		
				        	Additional_information_about_passengers.get(4).sendKeys("The_child's_name");
				      
				        	Thread.sleep(5000);
				        	
				        	 List <WebElement> ToPay = driver.findElementsByClassName("android.widget.TextView");
						        for(int i=0;i<ToPay.size();i++)
						        {
						        String	pay=ToPay.get(i).getAttribute("text");
						        	if(pay.contains("去支付"))
						        	{
						        		ToPay.get(i).click();
						        		  Thread.sleep(100);
						        		  System.out.println('\n'+"点击去支付成功");
						        	}else{
						        		continue;
						        	}
						        }
						        Thread.sleep(5000);	
	  
	        }
				
	  @AfterClass
	public void tearDown(){
		driver.quit();
	}
}
