package learning.selenium;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestLearn6 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser name");
		String browser = sc.nextLine();
		RemoteWebDriver driver = null;
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Selenium\\chromedriver.exe");
			System.setProperty("webdriver.chrome.silentOutput", "true");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Learning\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\Learning\\Selenium\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "D:\\Learning\\Selenium\\iedriverserver.exe");
			driver = new InternetExplorerDriver();
		} else if (browser.equalsIgnoreCase("opera"))// Opera
		{
			System.setProperty("webdriver.opera.driver", "D:\\Learning\\Selenium\\operadriver_win64\\operadriver.exe");
			driver = new OperaDriver();
		} else {

			System.out.println("Invalid browser given");
		}
		Thread.sleep(3000);
		try {
			driver.get("http://www.google.co.in");
			String titleName = driver.getTitle();
			System.out.println("Title name of the current page is   : " + titleName);
			String getCurrentURL = driver.getCurrentUrl();
			System.out.println("Current URL is   :" + getCurrentURL);
			Thread.sleep(3000);
			driver.quit();
			sc.close();
		} catch (Exception ex) {
			System.out.println("Current exception is  :" + ex.getMessage());
		}

	}

}
