package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
	
	
	
	
	
	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		
		 driver=new ChromeDriver();
		 driver.get("C:/Users/lumin/OneDrive/Desktop/DESKTOP FILES/alert.html");
		
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		driver.switchTo().alert().accept();
		/*Alert a=driver.switchTo().alert();
		String actualtext=a.getText();
		if(actualtext.equals("hello i am an alert box"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		a.accept();*/
		
			 
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("ABC");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("abc12");
		
	}
	
	
	

}
