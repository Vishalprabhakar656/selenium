package org.testing.TestScripts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.base;
import org.testing.packages.Login;
import org.testing.packages.Logout;
import org.testing.utilities.Data_provider;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class Testcase1
{
	@Test(dataProvider = "dp")
	public void testcase1(String user, String password) throws IOException, InterruptedException
	{
		Thread.sleep(5000);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement signin= driver.findElement(By.xpath("//div[@class='style-scope ytd-masthead']/div[3]/div[2]/ytd-button-renderer"));
		signin.click();
		WebElement email = driver.findElement(By.name("identifier"));
		email.sendKeys(user);
		WebElement click = driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
	    click.click();
		WebElement pass= driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys(password);		
		driver.findElement(By.xpath("//div[@class='FliLIb DL0QTb']")).click();
	
	}
	public Object[][] dp() throws BiffException, IOException
	{
		File f = new File("C:\\Users\\admin\\Desktop\\input.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet  ws = wk.getSheet(0);
		int r = ws.getRows();
		int c = ws.getColumns();
		
		Object [][] obj = new Object[r][c];
		
		for(int i = 0; i < r; i++)
		{
			for (int j = 0 ; j < c ; j++)
			{
				Cell c1 = ws.getCell(j, i);
				obj[i][j]	=c1.getContents();
			}
		}
	return obj;
	}

}
