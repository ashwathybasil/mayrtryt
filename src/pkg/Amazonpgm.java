package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazonpgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		
		 driver=new ChromeDriver();
		 //driver.get("https://www.amazon.in");
		 driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void mobiles()
	{
		//driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	//driver.findElement(By.xpath("//*[@id='nav-xshop']/a[4]")).click();
	driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("abc");
	
	}
}
