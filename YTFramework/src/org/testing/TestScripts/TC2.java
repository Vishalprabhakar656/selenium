package org.testing.TestScripts;

import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base32;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.base;
import org.testing.packages.Login;
import org.testing.packages.Logout;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2 extends base  
{
	
	@Test
	public void login() 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login l = new Login(driver, pr);
		l.signin("vishalprabhakar1991", "Vishal_656");
		WebElement history= driver.findElement(By.xpath(pr.getProperty("history")));
		history.click();
		Logout lg = new Logout(driver, pr);
		lg.logout();
	}
	
	

}
