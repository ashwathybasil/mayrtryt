package pkg;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autoitpgm {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{

		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@SuppressWarnings("deprecation")
	@Test
	public void test1() throws IOException
	{
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		Runtime.getRuntime().exec("D:\\T5.exe");
		  
		   
		   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
