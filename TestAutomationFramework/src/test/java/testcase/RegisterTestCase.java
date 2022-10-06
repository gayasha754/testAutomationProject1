package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		//download chrome driver and store it in the location.
		WebDriverManager.chromedriver().setup();
		
		//create object of WebDriver
		WebDriver driver = new ChromeDriver();
		
		//open the zoho website
		driver.get("https://www.zoho.com/");
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login_id")).sendKeys("sashinigayasha2@gmail.com");
		driver.findElement(By.xpath("//form[@id='login']//button[@id='nextbtn']")).click();
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(10, null);
		driver.findElement(By.id("password")).sendKeys("passwordTest");
		//driver.findElement(By.linkText("Enter password")).sendKeys("passwordTest");
		driver.findElement(By.xpath("//form[@id='login']//button[@id='nextbtn']")).click();		
		
	}
}
