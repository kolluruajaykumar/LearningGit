package learning.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestLearn20 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\learning\\selenium\\chromdriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");	
				
	}

}
