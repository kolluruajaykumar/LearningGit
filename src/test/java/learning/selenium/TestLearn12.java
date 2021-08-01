package learning.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class TestLearn12 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		By countinueToGmailTextLoc =By.xpath("//span[contains(text(),'to continue')]");
		By fogotEmailTextLoc = By.xpath("//button[contains(text(),'Forgot email')]");
		WebElement countinueToGmailText= driver.findElement(countinueToGmailTextLoc);
		WebElement fogotEmailText = driver.findElement(fogotEmailTextLoc);
		RelativeBy emailLoc=RelativeLocator.withTagName("input").above(fogotEmailText).below(countinueToGmailText);
		WebElement email=driver.findElement(emailLoc);
		email.sendKeys("seleniumlearningbyajay@gmail.com");
		Thread.sleep(2000);
		driver.close();
	}

}
