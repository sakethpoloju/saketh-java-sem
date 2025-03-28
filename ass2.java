package sakethh;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ass2 {
@Test
public void test2()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://practice.expandtesting.com/login");
	driver.findElement(By.id("username")).sendKeys("practiex");
	driver.findElement(By.id("password")).sendKeys(" SuperSecretPassword!");
	driver.findElement(By.xpath(" //button[@type='button']")).click();
	 //assetions
	WebElement ele=driver.findElement(By.xpath("//div[@id='flash']/b"));
			String str=ele.getText(); 
			boolean b=str.contains("secure areal");
	Assert.assertEquals(b, true);
	Assert.assertTrue(b);

}
}
