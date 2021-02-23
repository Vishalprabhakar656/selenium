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

public class TC5 extends base
{
	
	@Test
	public void login() 
	{
		Login l = new Login(driver, pr);
		l.signin("vishalprabhakar1991", "Vishal_656");

		WebElement trend = driver.findElement(By.xpath(pr.getProperty("trending")));
		trend.click();	
		WebElement video = driver.findElement(By.xpath(pr.getProperty("play_video")));
		video.click();
		WebElement subscribe = driver.findElement(By.xpath(pr.getProperty("subscribe")));
		subscribe.click();
		
		Logout lg = new Logout(driver, pr);
		lg.logout();
	}
	

}
