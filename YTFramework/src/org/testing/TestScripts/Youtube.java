package org.testing.TestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.base;
import org.testing.utilities.Logscapture;
import org.testing.utilities.ScreenshotCapture;

public class Youtube
{
	
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement signin= driver.findElement(By.xpath("//div[@class='style-scope ytd-masthead']/div[3]/div[2]/ytd-button-renderer"));
		signin.click();
		WebElement email = driver.findElement(By.name("identifier"));
		email.sendKeys("vishalprabhakar1991");
		WebElement click = driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
	    click.click();
		WebElement pass= driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("Vishal_656");		
		driver.findElement(By.xpath("//div[@class='FliLIb DL0QTb']")).click();
		//Logscapture.takelogs("login successfull", "Youtube");
		//ScreenshotCapture.takeascreenshot(driver, "G:\\Deepak Sir tutorial videos and notes\\Java tutorial\\first.png");
		WebElement trend = driver.findElement(By.xpath("//div[@class='style-scope ytd-guide-section-renderer']/ytd-guide-entry-renderer[2]/a[@title='Trending']"));
		trend.click();	
		/*//WebElement video = driver.findElement(By.xpath("//div[@class='style-scope ytd-shelf-renderer']//ytd-video-renderer[1]"));
		video.click();
		WebElement comment = driver.findElement(By.xpath("//div[@id='contenteditable-root']"));  
		comment.sendKeys("nice");
		WebElement comment_click = driver.findElement(By.xpath("//ytd-button-renderer[@id='submit-button']"));
		comment_click.click();
		*/
		
		
	}

}
