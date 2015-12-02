package testcase.commonality.android.kathy;

import org.openqa.selenium.WebElement;
import java.util.List;

public class UpdateSoftware_No extends CommonClass_iTripAPP {
	
	private static WebElement el;
	
public  void UpdateiTripAPP_No()throws Exception{

		  	//点击更新弹出框btn：点击以后更新成功
	  List <WebElement> Clickupdate = getAppiumDriver().findElementsByClassName("android.widget.Button");
	  					Thread.sleep(1000);
	  					Clickupdate.get(1).click();
	  					System.out.println('\n'+"点击以后更新成功");
		

	}

}