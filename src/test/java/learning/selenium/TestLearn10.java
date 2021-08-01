package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLearn10 {
    // Compose a mail in G-mail 
	public static void main(String[] args) throws Exception
	{
        // Open browse and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver","D:\\Learning\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		// Maximize browser window
		driver.manage().window().maximize();
		//Lunch g-mail site
		driver.get("https://mail.google.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("seleniumlearningbyajay");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("2020@SDK");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(text(),'Compose')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@aria-label='To']")).sendKeys("seleniumlearningbyajay@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='subjectbox']")).sendKeys("Automation");		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@aria-label='Message Body' and @role='textbox']")).sendKeys("Hi Ajay\n How are you");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Send']")).click();
		Thread.sleep(3000);	
	    driver.findElement(By.xpath("//*[contains(@aria-label,'Google Account')]")).
		click(); Thread.sleep(2000);
		driver.findElement(By.linkText("Sign out")).click(); Thread.sleep(3000);
		 
		//close driver
		driver.close();
		
	}

}
