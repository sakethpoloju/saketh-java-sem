package sakethh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class parmeters {
@Test
//@Parameters(value="browsere")
public void test1()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
}

}
