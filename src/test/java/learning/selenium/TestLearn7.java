package learning.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestLearn7 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.sentia.in");
		String title=driver.getTitle();
		System.out.println("The title of current page is : \t"+ title);
		String URL=driver.getCurrentUrl();
		if(URL.startsWith("https"))
		{
			System.out.println("Secured site");
		}
		else {
			System.out.println("Unsecured site");
		}
		driver.close();
	}

}
