package pkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepickerpgm2 {
	
	
	
	WebDriver driver;
	// String baseurl="https://www.booking.com";

	 @BeforeTest
	 public void setUp()
	 {
	 
	 driver=new ChromeDriver();

	 }
	 @BeforeMethod
	 public void url()
	 {
	 driver.get("https://www.booking.com");
	 driver.manage().window().maximize();

	 }

	 @Test
	 public void testlogin()
	 {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		 driver.navigate().refresh();
	 driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div[1]/button[1]")).click();

	 while(true)
	 {
		WebElement month= driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3"));
	// WebElement month=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3"));

	  String month1=month.getText();
	 if(month1.equals("August 2023"))
	 {
	 System.out.println(month1);
	 break;
	 }
	 else
	 {
	 driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button/span/span/svg")).click();
	 }

	 }

	 List<WebElement> alldates1=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr/td/span/span"));

	 for(WebElement dateelement:alldates1)
	 {
	 String date=dateelement.getText();
	// System.out.println(date);
	 if(date.equals("23"))
	 {
	 //System.out.println(date);
	 dateelement.click();
	 break;
	 //System.out.println("date selected");
	 }

	 }
	// while(true)

}}
