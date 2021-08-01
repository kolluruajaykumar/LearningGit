package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class TestLearn11 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Selenium\\CHROMEDRIVEr.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in");
        Thread.sleep(5000);
        WebElement search=driver.findElement(By.className("hsuHs"));
        WebElement mic=driver.findElement(By.className("HPVvwb"));
        RelativeBy textBoxLoc=RelativeLocator.withTagName("input").toRightOf(search).toLeftOf(mic);
        driver.findElement(textBoxLoc).sendKeys("ajay kumar kolluru",Keys.ENTER);
        Thread.sleep(3000);
        //Close driver
        driver.close();

	}

}
