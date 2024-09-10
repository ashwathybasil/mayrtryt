package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
	
		driver=new EdgeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/droppable");
	}
	@Test
	public void test1()
	{
		
		driver.manage().window().maximize();
		 WebElement src=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement dest=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	
		

	       Actions act=new Actions(driver);
	      act.dragAndDrop(src, dest);
	    
	      act.perform();
	         String text=dest.getText();
	       if(text.equals("Dropped"))
	       {
	    	   System.out.println("dropped");
	       }
	       else
	       {
	    	   System.out.println("not expected");
	       }


	}
	
	//JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("window.scrollBy(0,1000)", "");

}
