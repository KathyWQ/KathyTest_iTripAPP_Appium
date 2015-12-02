package testcase.buy.ProductList.android.kathy;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testcase.commonality.android.kathy.CommonClass_iTripAPP;
import java.util.List;
import java.util.Set;

public class ProductID_2174 extends CommonClass_iTripAPP{
	/**
	 * 
	 * Buy Product_2174
	 * Author.Kathy
	 * 
	 * */
	@Test
	public void BuyProduct2174 () throws Exception {
	
		    //点击首页搜索框，输入产品ID 2174
		  List <WebElement> IputProductID = getAppiumDriver().findElementsByClassName("android.widget.TextView");
		  		IputProductID.get(1).click();
		     	Thread.sleep(100);
		     	IputProductID.get(0).sendKeys("2174");
		     	Thread.sleep(500);
		     	System.out.println('\n'+"输入产品ID成功");
		     	IputProductID.get(1).click();
		     	Thread.sleep(5000);		     	
		     	System.out.println('\n'+"点击搜索成功");
		     	
		     	//点击搜索出来的产品列表，点击需要购买的产品
		  getAppiumDriver().findElementsByClassName("android.widget.TextView").get(2).click();
		        System.out.println('\n'+"选择产品成功");
		        Thread.sleep(5000);
		        
		        //点击立即预定按钮
		  getAppiumDriver().findElementsByClassName("android.widget.TextView").get(10).click();
		  
		        System.out.print('\n'+"点击立即预定成功");
		        Thread.sleep(5000);
		        
		        //操作webview页面
		  Set<String> context = getAppiumDriver().getContextHandles();
		        for (String contextName : context) {
		        	
		            System.out.println(contextName);
		            
		        }
		        
		        //打印当前H5页面的源码集   可选   可打印出来寻找你要定位的元素值等
		        System.out.println(getAppiumDriver().getPageSource());
		        Thread.sleep(5000);
		        getAppiumDriver().findElementByXPath("//android.view.View[contains(@content-desc,'更改旅行日期')]").click();
		        Thread.sleep(5000);
		        getAppiumDriver().findElementByXPath("//android.view.View[contains(@content-desc,'13')]").click();
		        Thread.sleep(5000);
		        //点击完成选择按钮
		  List <WebElement> clickwcxz= getAppiumDriver().findElementsByClassName("android.widget.TextView");
         
				        for(int i=0;i<clickwcxz.size();i++){
				        	String	wcxz=clickwcxz.get(i).getAttribute("text");
				        
				        	if(wcxz.contains("完成选择")){
				        		clickwcxz.get(i).click();
				        		  Thread.sleep(100);
				        		  System.out.println('\n'+"完成选择成功");
				        	}else{
				        		
				        		continue;
				        		
				        	}
				        }
				        
				        Thread.sleep(5000);		
				        System.out.println(getAppiumDriver().getPageSource());
				 //填写旅客基本信息
	      List <WebElement>  TouristsBasicInformation=getAppiumDriver().findElementsByClassName("android.widget.EditText");
				        	//游客姓名
				        	TouristsBasicInformation.get(0).sendKeys("UserName");
				        	//游客姓名拼音	
				        	//TouristsBasicInformation.get(1).sendKeys("TestPingYingName");
				        	//邮箱
				        	TouristsBasicInformation.get(2).sendKeys("Kathy.wang@aoliday.com");
				        	//国内手机号
				        	TouristsBasicInformation.get(3).sendKeys("15888888888");
				        	//国际手机号
				        	TouristsBasicInformation.get(4).sendKeys("02890998478");
				        	System.out.print(getAppiumDriver().getPageSource());
				        	
				        	//旅客附加信息
	     List <WebElement>   TouristAdditionalInformation=getAppiumDriver().findElementsByXPath("//android.widget.EditText[contains(@content-desc,'请输入')]");
				        	//儿童性别和年龄（英文）
				        	TouristAdditionalInformation.get(0).sendKeys("女,7岁");
				        	//全部旅客姓名拼音		
				        	TouristAdditionalInformation.get(1).sendKeys("TestName");
				        	//屏幕宽度大小
				        	int width=getAppiumDriver().manage().window().getSize().width;
				        	//屏幕高度大小
				        	int height=getAppiumDriver().manage().window().getSize().height;
				        	//屏幕滑动到第二屏
				        	getAppiumDriver().swipe(width / 2, height * 3 / 4, width / 2, height / 4, 1000);
				        	//离开航班号及时间
				        	TouristAdditionalInformation.get(2).sendKeys("1222,12:30");
				        	//抵达航班号及时间
				        	TouristAdditionalInformation.get(3).sendKeys("12222,19:40");
				        	//小孩姓名		
				        	TouristAdditionalInformation.get(4).sendKeys("child's_name");
				        	//屏幕宽度大小
				        	int width1=getAppiumDriver().manage().window().getSize().width;
				        	//屏幕高度大小
				        	int height1=getAppiumDriver().manage().window().getSize().height;
				        	//屏幕滑动到第二屏
				        	getAppiumDriver().swipe(width / 2, height * 3 / 4, width / 2, height / 4, 1000);
				        	
				        	getAppiumDriver().findElementsByXPath("//android.widget.EditText[contains(@content-desc,'请输入留言信息')]").get(0).sendKeys("csdd");
				        	Thread.sleep(500);
				

				        	 List <WebElement> ToPay = getAppiumDriver().findElementsByClassName("android.widget.TextView");
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
	  
	        }
}
