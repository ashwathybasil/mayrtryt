package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpathamazon {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
		@Test
		public void xpath()
		{
		
			driver.manage().window().maximize();
			
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);
			driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
			driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
			driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("abc123@gmail.com");
			driver.findElement(By.xpath("//input[@id='continue']")).click();
			driver.navigate().back();
			driver.navigate().back();
			driver.findElement(By.xpath("//*[@id='nav-xshop']/a[9]")).click();
			driver.findElement(By.xpath("//span[@class='hm-icon-label']")).click();

			
		}

	}
	




