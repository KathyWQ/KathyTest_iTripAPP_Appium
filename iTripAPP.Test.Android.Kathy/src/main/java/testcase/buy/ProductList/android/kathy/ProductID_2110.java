package testcase.buy.ProductList.android.kathy;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testcase.commonality.android.kathy.CommonClass_iTripAPP;

public class ProductID_2110 extends CommonClass_iTripAPP {
	/**
	 * 
	 * Buy Product_2110
	 * Author.Kathy
	 * 
	 * */
	@Test
	public void BuyProduct2110()throws Exception{
		//点击首页搜索框，输入产品ID 2110
		getAppiumDriver().findElementsByClassName("android.widget.TextView").get(1).click();
		getAppiumDriver().findElementsByClassName("android.widget.TextView").get(0).sendKeys("2110");
		//点击搜索按钮
		getAppiumDriver().findElementsByClassName("android.widget.TextView").get(1).click();
		     	 Thread.sleep(5000);	 
		//搜索出来的产品列表，点击需要购买的产品
		getAppiumDriver().findElementsByClassName("android.widget.TextView").get(2).click();
		        Thread.sleep(5000);
		//产品详情页，点击立即预定按钮
		getAppiumDriver().findElementsByClassName("android.widget.TextView").get(10).click();
		        Thread.sleep(5000);
		        
		        /*
		         *操作H5页面【预定流程】
		         *
		         * */
		        //返回应用的上下文并循环输出(NATIVE_APP and WEBVIEW)
		        Set<String> context = getAppiumDriver().getContextHandles();
		        	for (String contextName : context) {
		        	
		            System.out.println(contextName);
		        }
		        
		        //打印当前H5页面的源码集   可选   可打印出来寻找你要定位的元素值等
		       System.out.println(getAppiumDriver().getPageSource());
		       Thread.sleep(5000);
		//操作H5页面元素
		//定位日期控件       
		getAppiumDriver().findElementByXPath("//android.view.View[contains(@content-desc,'更改旅行日期')]").click();
		       Thread.sleep(5000);
		       
		getAppiumDriver().tap(1, 960, 1046, 0);
		Thread.sleep(5000);
		//选择出行日期
		getAppiumDriver().findElementByXPath("//android.view.View[contains(@content-desc,'13')]").click();
		       Thread.sleep(5000);
		 
		getAppiumDriver().findElementByXPath("//android.view.View[contains(@content-desc,'更改旅客类型')]").click();
		Thread.sleep(5000);
		getAppiumDriver().tap(1, 956, 868, 0);
		Thread.sleep(5000);
		getAppiumDriver().tap(1, 982, 682, 0);
		Thread.sleep(5000);
//		getAppiumDriver().findElementsByClassName("android.view.View").get(7).click();
		
		//点击完成选择按钮
		List <WebElement> FinishChoice= getAppiumDriver().findElementsByClassName("android.widget.TextView");
				        for(int i=0;i<FinishChoice.size();i++)
				        {
				        String	Click_FinishChoice=FinishChoice.get(i).getAttribute("text");
				        	if(Click_FinishChoice.contains("完成选择"))
				        	{
				        		FinishChoice.get(i).click();
				        		  Thread.sleep(100);
				        	}else{
				        		continue;
				        	}
				        }
				        Thread.sleep(5000);
				        //打印出填写订单所需元素
				        System.out.println(getAppiumDriver().getPageSource());
				        
			/*
			 * 填写旅客基本信息
			 * 
			 * */
				        
		//游客姓名		      
		getAppiumDriver().findElementsByClassName("android.widget.EditText").get(0).sendKeys("UserName");
		
		//邮箱
		getAppiumDriver().findElementsByClassName("android.widget.EditText").get(2).sendKeys("Kathy.wang@aoliday.com");
		
		//国内手机号
		getAppiumDriver().findElementsByClassName("android.widget.EditText").get(3).sendKeys("15888888888");
		
		//国际手机号
		getAppiumDriver().findElementsByClassName("android.widget.EditText").get(4).sendKeys("02890998478");
		Thread.sleep(5000);
		
		
		/*
		 * 填写旅客附加信息
		 * 
		 * */
		
		//输入酒店名
		getAppiumDriver().findElementsByXPath("//android.widget.EditText[contains(@content-desc,'请输入')]").get(0).sendKeys("HotleEName");
				        	
				//屏幕宽度大小
		    	int width=getAppiumDriver().manage().window().getSize().width;
		    	
				//屏幕高度大小
		     	int height=getAppiumDriver().manage().window().getSize().height;
		     	
		//屏幕滑动到第二屏
		getAppiumDriver().swipe(width / 2, height * 3 / 4, width / 2, height / 4, 3000);
				        	
		//输入备注
		getAppiumDriver().findElementsByXPath("//android.widget.ListView/android.view.View/android.widget.EditText[contains(@content-desc,'请输入留言信息')]").get(0).sendKeys("csdd");
				        	
							 //点击去支付按钮
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
						        Thread.sleep(5000);	
	  
	        }
}
