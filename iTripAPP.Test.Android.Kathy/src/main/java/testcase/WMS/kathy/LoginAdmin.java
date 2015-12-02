package testcase.WMS.kathy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginAdmin {

	public void OrderOperating () throws InterruptedException
	{
		
		String UserName="kathy.wang@aoliday.com";
		String Pwd="111111";
		WebDriver  driver=new FirefoxDriver();
		
		driver.get("http://pre1.itrip.com/wms");
//		driver.close();
		System.out.print("打开新订单系统成功");
		Thread.sleep(5000);
//		//登录
//		driver.findElement(By.id("account")).sendKeys(UserName);
//		driver.findElement(By.id("pwd")).sendKeys(Pwd);
//		Thread.sleep(9000);
//		driver.findElement(By.id("btnLogin")).click();

		
		//操作订单
		driver.findElement(By.xpath("//div[@id='left-menus']/div/div/div")).click();
		   
		 driver.findElement(By.cssSelector("div.panel-header.accordion-header > div.panel-title.panel-with-icon")).click();
		 
		  driver.findElement(By.linkText("订单查询(公共)")).click();
		   
		 driver.findElement(By.id("user")).clear();
		  
		  driver.findElement(By.id("user")).sendKeys("kathy.wang@aoliday.com");
		  
		  driver.findElement(By.cssSelector("#search > span.l-btn-left")).click();
		  
		  driver.findElement(By.linkText("查看")).click();
		
	
	}

	
	
}
