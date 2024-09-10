package pkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignmntpgm 
{
	WebDriver driver;
	@BeforeTest
	public void urlloding()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");	
		driver.manage().window().maximize();
	}
	
	@Test
	public void test1()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		String act=driver.getTitle();
		String exp="Amazon.in : mobilephones//";
		Assert.assertEquals(act, exp);
	}
	@Test
	public void test2()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String pw=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	
		Set<String> wh=driver.getWindowHandles();
		for(String han:wh)
		{
			if(!han.equalsIgnoreCase(pw))
			{
				driver.switchTo().window(han);
				
			//	JavascriptExecutor js=(JavascriptExecutor) driver;
			//	js.executeScript("window.scrollBy(0,20)","");
				
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
				
			}
		}
	}
	

}
