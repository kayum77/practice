package practice;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	ChromeDriver dr;

	@Before
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kayum\\Downloads\\chromedriver_win32\\chromedriver.exe");

		dr = new ChromeDriver();

	}

	@After
	public void closeBrowser() {
		dr.close();

	}

}
