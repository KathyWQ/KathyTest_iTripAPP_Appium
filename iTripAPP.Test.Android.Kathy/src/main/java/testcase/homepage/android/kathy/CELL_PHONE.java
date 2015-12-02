package testcase.homepage.android.kathy;

import java.util.List;

import org.openqa.selenium.WebElement;

import testcase.commonality.android.kathy.CommonClass_iTripAPP;

public class CELL_PHONE extends CommonClass_iTripAPP {
			
			//手机专享
			public  void Phone () throws InterruptedException{
				
				List <WebElement> textFieldsList = getAppiumDriver().findElementsByClassName("android.widget.TextView");
		     textFieldsList.get(7).click();
		     	Thread.sleep(100);
		  
			
		}
}
