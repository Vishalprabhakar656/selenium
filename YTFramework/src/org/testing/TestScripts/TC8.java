package org.testing.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.base;
import org.testing.packages.Login;
import org.testing.packages.Logout;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC8 extends base
{
	
	@Test
	public void login() 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login l = new Login(driver, pr);
		l.signin("vishalprabhakar1991", "Vishal_656");
		 
		WebElement library = driver.findElement(By.xpath(pr.getProperty("library")));
		library.click();
		
		Logout lg = new Logout(driver, pr);
		lg.logout();
	}
	


}
