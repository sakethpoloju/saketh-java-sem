package sakethh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class all  {
	public class DataFromXML {
		@Test
		@Parameter(converter="browser");;
		public void test1(string browser)
		{
			WebDriver driver=new ChromeDriver();
					driver.get("https://www.facebook.com/");
		}
		
	}

}
