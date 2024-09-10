package pkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Pk {
	@Test
	public void test()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");	
		String act=driver.getTitle();
		System.out.println(act);
		String exp="Online Shopping site in India:";
		Assert.assertEquals(act, exp);
		System.out.println("abc");
		
		
	}

}
