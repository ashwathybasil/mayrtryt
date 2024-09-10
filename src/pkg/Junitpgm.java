package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junitpgm {
	@Before
	public void browseropen()
	{
		System.out.println("browseropen");
	}
	@Test
	public void titleverify()
	{
	System.out.println("testactivities");
	}
	
	@After
	public void browserclose()
	{
		System.out.println("browserclose");
	}
	
	
	
	

}
