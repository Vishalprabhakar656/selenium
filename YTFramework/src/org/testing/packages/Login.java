package org.testing.packages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
	public ChromeDriver driver;
	public Properties pr;
	public Login(ChromeDriver driver, Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
		
	}
	
	
	public void signin(String username, String password) 
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement signin= driver.findElement(By.xpath(pr.getProperty("sign")));
		signin.click();
		WebElement email = driver.findElement(By.name(pr.getProperty("email")));
		email.sendKeys(username);
		WebElement click = driver.findElement(By.xpath(pr.getProperty("click")));
		click.click();
		WebElement pass= driver.findElement(By.xpath(pr.getProperty("loginpassword")));
		pass.sendKeys(password);
		driver.findElement(By.xpath(pr.getProperty("pass_click"))).click();
		
	}

}
