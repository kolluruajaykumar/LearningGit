package learning.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLearn8 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.partialLinkText("Sign in")).click();;
		
		Set<String> s =driver.getWindowHandles();
        System.out.println(s);
        driver.quit();
        
	}

}

