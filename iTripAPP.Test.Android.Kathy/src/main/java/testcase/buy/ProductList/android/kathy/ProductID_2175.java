package testcase.buy.ProductList.android.kathy;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testcase.commonality.android.kathy.CommonClass_iTripAPP;

public class ProductID_2175 extends CommonClass_iTripAPP {
	/**
	 * 
	 * Buy Product_2174
	 * Author.Kathy
	 * 
	 * */
	
	@Test
	public void BuyProduct2175()throws Exception{
		
		//点击首页搜索框，输入产品ID 2110
		getAppiumDriver().findElementsByClassName("android.widget.TextView").get(1).click();
		getAppiumDriver().findElementsByClassName("android.widget.TextView").get(0).sendKeys("2175");
		getAppiumDriver().findElementsByClassName("android.widget.TextView").get(1).click();	
		     	System.out.println('\n'+"点击搜索成功");
		     	 Thread.sleep(5000);
		     	 
		    //点击搜索出来的产品列表，点击需要购买的产品
		getAppiumDriver().findElementsByClassName("android.widget.TextView").get(2).click();
		        System.out.println('\n'+"选择产品成功");
		        Thread.sleep(5000);

		        //点击立即预定按钮
		getAppiumDriver().findElementsByClassName("android.widget.TextView").get(10).click();
		        System.out.print('\n'+"点击立即预定成功");
		        Thread.sleep(5000);
		        
		        //操作webview页面
		        Set<String> ProductContext = getAppiumDriver().getContextHandles();
		        for (String contextName : ProductContext) {
		        	
		            System.out.println(contextName);
		        }
		        
		        //打印当前H5页面的源码集   可选   可打印出来寻找你要定位的元素值等
		       System.out.println(getAppiumDriver().getPageSource());
		       Thread.sleep(5000);
		getAppiumDriver().findElementByXPath("//android.view.View[contains(@content-desc,'更改旅行日期')]").click();
		       Thread.sleep(5000);
		getAppiumDriver().findElementByXPath("//android.view.View[contains(@content-desc,'30')]").click();
		       Thread.sleep(5000);
				        List <WebElement> clickwcxz= getAppiumDriver().findElementsByClassName("android.widget.TextView");
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
				        System.out.println(getAppiumDriver().getPageSource());
				        
				        
			        // 填写旅客基本信息
				        System.out.println(getAppiumDriver().getPageSource());
	
		getAppiumDriver().findElementsByClassName("android.widget.EditText").get(0).sendKeys("2");
		getAppiumDriver().findElementsByClassName("android.widget.EditText").get(0).sendKeys("UserName");
		getAppiumDriver().findElementsByClassName("android.widget.EditText").get(2).sendKeys("Kathy.wang@aoliday.com");
		getAppiumDriver().findElementsByClassName("android.widget.EditText").get(3).sendKeys("15888888888");
		getAppiumDriver().findElementsByClassName("android.widget.EditText").get(4).sendKeys("02890998478");
		
		//旅客附加信息	
		
	getAppiumDriver().findElementsByXPath("//android.widget.EditText[contains(@content-desc,'请输入')]").get(0).sendKeys("HotleEName");
				        	
				        	//屏幕宽度大小
		    	int width=getAppiumDriver().manage().window().getSize().width;
				        	//屏幕高度大小
		     	int height=getAppiumDriver().manage().window().getSize().height;
				        	//屏幕滑动到第二屏
		getAppiumDriver().swipe(width / 2, height * 3 / 4, width / 2, height / 4, 3000);
				        	
		getAppiumDriver().findElementsByXPath("//android.widget.EditText[contains(@content-desc,'请输入')]").get(0).sendKeys("2");
				        	//添加备注
		getAppiumDriver().findElementsByXPath("//android.widget.ListView/android.view.View/android.widget.EditText[contains(@content-desc,'请输入留言信息')]").get(0).sendKeys("csdd");
	
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
