package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestLearn15 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Learning\\selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.co.in");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.linkText("Gmail"));
		//Before Focus
		//opacity
		//text-decoration
		String opacityValue =e.getCssValue("opacity");
		String textDecorationValue =e.getCssValue("text-decoration");
		System.out.println("opacityValue Before Focus is"+ opacityValue);
		System.out.println("textDecorationValue Before Focus is"+ textDecorationValue);
		Thread.sleep(5000);
		Actions a= new Actions(driver);
		a.moveToElement(e).perform();
		//After Focus
		//opacity
		//text-decoration
		String opacityValueAfterFocus =e.getCssValue("opacity");
		System.out.println("  opacityValueAfterFocus "+ opacityValueAfterFocus);
		if(e.getCssValue("opacity")!= "1")
		{
			System.out.println("Focused element is shaded and test is passed");
		}
		else {
			System.out.println("Focused element is not shaded and test is failed");
		}
		String textDecorationValueAfterFocus =e.getCssValue("text-decoration");
		System.out.println("textDecorationValueAfterFocus   "+ textDecorationValueAfterFocus);
		if(textDecorationValueAfterFocus.contains("underline"))
		{
			
			System.out.println("Focused element is underlined and test is passed");
		}
		else {
			System.out.println("Focused element is not underlined and test is failed");
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
