package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbloginpage;
import pagepkg.Passworderrorpage;


public class Fbtest {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		//driver=new ChromeDriver(options);
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.facebook.com/");
	}
	
	
	@Test
	public void testlogin() throws Exception
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("abc@gmail.com","acbd");
		ob.login();
	//Thread.sleep(1000);
		//driver.navigate().back();
		Passworderrorpage ob1=new Passworderrorpage(driver);
		ob1.linkclick();
		ob1.setvalues("abc");
		ob1.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	



}
