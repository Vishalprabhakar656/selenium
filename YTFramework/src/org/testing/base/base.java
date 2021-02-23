package org.testing.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.PropertiesFile;


public class base 
{
	public ChromeDriver driver;
	public Properties pr;
	@BeforeMethod
	public void browser_launch() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		File f = new File("../YTFramework/object.properties");
		FileInputStream fi = new FileInputStream(f);
		pr = new Properties();
		pr.load(fi);
		
		
	}
	@AfterMethod
	public void browser_close()
	{
		driver.close();
		
	}

}
