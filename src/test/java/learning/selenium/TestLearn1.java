package learning.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestLearn1 {

	public static void main(String[] args) throws Exception
	{
	//Open browser and avoid browser driver logs
     System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Selenium\\chromedriver.exe");
     System.setProperty("webdriver.chrome.silentOutput","true");
     ChromeDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     //launch site
     driver.get("https://www.google.co.in/");
     Thread.sleep(5000);
     driver.close();
	}

}
