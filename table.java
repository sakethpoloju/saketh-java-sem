package sakethh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table  {
	public static void main(String[] args) throws InterruptedException {
		 table t = new table();
		 t.table1();
		 Thread.sleep(6000);
		 t.table2();
		 Thread.sleep(5000);
		 t.table3();
	
	}
	public void table1() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login"); 
		WebElement user=driver.findElement(By.id("username"));
		WebElement pass=driver.findElement(By.id("password"));
		user.sendKeys("admin1");
		pass.sendKeys("pass1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
		
		
	}

	public void table2() throws InterruptedException 
	{
			WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login"); 
		WebElement user=driver.findElement(By.id("username"));
		WebElement pass=driver.findElement(By.id("password"));
		user.sendKeys("admin4");
		pass.sendKeys("pass2");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
//		Thread.sleep(5000);
	}
	public void table3() 
	{
			WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login"); 
		WebElement user=driver.findElement(By.id("username"));
		WebElement pass=driver.findElement(By.id("password"));
		user.sendKeys("admin3");
		pass.sendKeys("pass3");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
	
	}
}
