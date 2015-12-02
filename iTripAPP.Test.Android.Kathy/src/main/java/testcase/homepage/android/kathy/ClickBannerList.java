package testcase.homepage.android.kathy;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testcase.commonality.android.kathy.CommonClass_iTripAPP;
public class ClickBannerList extends CommonClass_iTripAPP {
	
	
	//Banner
	public  void Banner() throws InterruptedException{
		
		List <WebElement> textFieldsList = getAppiumDriver().findElementsByClassName("android.widget.TextView");
		 textFieldsList.get(3).click();
		 	Thread.sleep(100);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
