package testcase.homepage.android.kathy;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testcase.commonality.android.kathy.CommonClass_iTripAPP;
public class Click_LRTC extends CommonClass_iTripAPP {
	
	//懒人套餐
	public  void LRTC() throws InterruptedException{
		
		List <WebElement> textFieldsList = getAppiumDriver().findElementsByClassName("android.widget.TextView");
		 textFieldsList.get(4).click();
		 	Thread.sleep(100);
	}
}
