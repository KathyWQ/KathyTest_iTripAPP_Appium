package testcase.shareApp.android.kathy;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testcase.commonality.android.kathy.CommonClass_iTripAPP;
public class Share_iTripAPP_QQ extends CommonClass_iTripAPP {

	
	
	public  void Share_APP_QQ() throws InterruptedException{
		
		//产品详情页，点击分享按钮
	      List <WebElement> clickljyd= getAppiumDriver().findElementsByClassName("android.widget.TextView");
		        clickljyd.get(2).getAttribute("text");
		        System.out.println('\n'+"产品详情页对应索引text值："+'\n'+clickljyd.get(2).getAttribute("text")); 
		        Thread.sleep(100);
		        clickljyd.get(2).click();

	}
}
