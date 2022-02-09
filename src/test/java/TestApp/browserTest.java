package TestApp;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class browserTest {

	
	@Parameters({"browser"})
	
	@Test
	
	public void browserTest(String browser) {
	   if (browser=="chrome") {
		 //write code to open chrome browser
	    }
		if (browser=="ie") {
		}
		//write code to open internet explore browser
		if (browser=="mozila") {
			//write code to open mozila firefox browser
		}
		
	}}				

