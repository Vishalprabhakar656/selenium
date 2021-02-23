package org.testing.packages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout 
{
	public ChromeDriver driver;
	public Properties pr;
	
	public Logout(ChromeDriver driver, Properties pr)
	{
		
	}
	
	public void logout()
	{
		WebElement topbar_menu= driver.findElement(By.xpath(pr.getProperty("top_menu_bar")));
		topbar_menu.click();
		WebElement signout= driver.findElement(By.xpath(pr.getProperty("sign_out")));
		signout.click();
	}

}
