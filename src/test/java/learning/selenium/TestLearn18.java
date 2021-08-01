package learning.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLearn18 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement UserID=driver.findElement(By.name("identifier"));
		Thread.sleep(5000);
		if(UserID.isDisplayed())
		{
			if(UserID.isEnabled())
			{
				System.out.println("UserID is visible and enabled");
			}else {
				System.out.println("UserID is visible but not enabled");
			}
		}
		else {
			System.out.println("UserID is hidden");
		}
		
		WebElement pass=driver.findElement(By.name("hiddenPassword"));
		Thread.sleep(5000);
		if(pass.isDisplayed())
		{
			if(pass.isEnabled())
			{
				System.out.println("Password is visible and enabled");
			}else {
				System.out.println("Password is visible but not enabled");
			}
		}
		else {
			System.out.println("Password is hidden");
		}
		
		//Close driver
		driver.close();
	}

}
