package practice;

import org.junit.Test;

public class SmokeTest extends Base {
	
	
	
	
	@Test
	public void tigerDirect() {
		
		dr.get("http://www.tigerdirect.com/");
		dr.manage().window().maximize();
		
		
	}

}
