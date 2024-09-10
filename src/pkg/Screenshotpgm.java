package pkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpgm {

	ChromeDriver driver;
	@Before
	public void set()
	{
		
		driver=new ChromeDriver();

		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void scrnsht() throws Exception 
	{
		
	
		
		//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(src,new File("D://error8.png"));
		
		
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	File src1=dayelement.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src1,new File("./Screenshotq//Elementscreenshot1.png"));
		
	}
	
	
	
	
	

}
