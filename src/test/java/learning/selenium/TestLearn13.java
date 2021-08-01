package learning.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLearn13 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\learning\\selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.newtours.demoaut.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("email")).sendKeys("AJIKUH");
		driver.findElement(By.name("password")).sendKeys("AJay123@",Keys.chord(Keys.CONTROL,"a"));
		driver.findElement(By.name("password")).sendKeys(Keys.chord(Keys.CONTROL,"c"));
		driver.findElement(By.name("confirmPassword")).sendKeys(Keys.chord(Keys.CONTROL,"V"));	
	  Thread.sleep(5000);
	  driver.close();
		
	}

}
