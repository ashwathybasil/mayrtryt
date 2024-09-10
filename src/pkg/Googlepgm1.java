package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Googlepgm1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String src=driver.getPageSource();
		//System.out.println(actualtitle);
		//String exp="Googleooo";
		if(src.contains("Gmail"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
