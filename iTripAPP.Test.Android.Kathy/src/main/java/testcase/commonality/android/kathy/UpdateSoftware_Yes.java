package testcase.commonality.android.kathy;

import java.util.List;

import org.openqa.selenium.WebElement;

public class UpdateSoftware_Yes extends CommonClass_iTripAPP {

	private static WebElement el;
	
public  void UpdateiTripAPP_Yes()throws Exception{
		  
		  	//点击更新弹出框btn：点击以后更新成功
	  List <WebElement> Clickupdate = getAppiumDriver().findElementsByClassName("android.widget.Button");
		       Thread.sleep(1000);
		       Clickupdate.get(0).click();
		     System.out.println('\n'+"点击以后更新成功");
		     Thread.sleep(50000);
		
	}
	
}
