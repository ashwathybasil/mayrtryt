package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void set()
	{
		
		//driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abc");
		driver.findElement(By.name("login")).click();
		
		
		
	}
	

}
