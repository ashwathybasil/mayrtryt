package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookpgm {
	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	@Test
	public void set()
	{
		//driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id='nav-xshop']/a[4]")).click();
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[5]")).click();
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
	}
	

}

	
	
	


