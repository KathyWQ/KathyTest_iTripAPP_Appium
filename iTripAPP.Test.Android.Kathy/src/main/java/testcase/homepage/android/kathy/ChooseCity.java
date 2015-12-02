package testcase.homepage.android.kathy;

import java.util.List;

import org.openqa.selenium.WebElement;

import testcase.commonality.android.kathy.CommonClass_iTripAPP;

public class ChooseCity extends CommonClass_iTripAPP {
	
	
	//切换定位城市
	public  void City () throws InterruptedException{
		
		List <WebElement> textFieldsList = getAppiumDriver().findElementsByClassName("android.widget.TextView");
     textFieldsList.get(1).click();
     	Thread.sleep(100);
  
		
	}
}
