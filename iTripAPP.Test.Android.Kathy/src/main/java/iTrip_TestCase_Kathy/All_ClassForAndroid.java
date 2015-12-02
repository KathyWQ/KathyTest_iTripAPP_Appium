package iTrip_TestCase_Kathy;

import java.util.List;

import org.openqa.selenium.WebElement;

public class All_ClassForAndroid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//获取class=android.widget.TextView
	public List<WebElement> android_widget_TextView() throws Exception{
		Launch_iTripApp_ForAndroid LaunchiTripAPP=new  Launch_iTripApp_ForAndroid();
		LaunchiTripAPP.Test_setUp();
		String classname = "android.widget.TextVie"; 
		LaunchiTripAPP.driver.findElementByClassName(classname);
		return null;
	}

}
