package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class SignInTestCase extends BaseTest {
	
	//As using testNG no need of a main method
	
	@Test
	public static void  SigninTest() throws InterruptedException {
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login_id")).sendKeys("sashinigayasha2@gmail.com");
		driver.findElement(By.xpath("//form[@id='login']//button[@id='nextbtn']")).click();
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(10, null);
		driver.findElement(By.id("password")).sendKeys("passwordTest");
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Enter password")).sendKeys("passwordTest");
		driver.findElement(By.xpath("//form[@id='login']//button[@id='nextbtn']")).click();	
		Thread.sleep(2000);
		
	}
	
}
