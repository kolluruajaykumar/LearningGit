package learning.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestLearn14 {

	public static void main(String[] args) throws Exception
	{
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\learning\\selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("pos116");
		driver.findElement(By.xpath("//*[@name='signin']")).submit();
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("2018@JAVA");
		driver.findElement(By.xpath("//*[contains(text(),'Next')]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Mail']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Compose')]")).click();
		Thread.sleep(3000);
		WebElement e=driver.findElement(By.xpath("//*[@id='message-to-field']"));
		e.sendKeys("pos16@yahoo.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@aria-label='Subject']")).sendKeys("Selenium learning");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@aria-label='Message body']")).sendKeys("Hii Ajay how are you");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sign out']")).click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
