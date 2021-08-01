package learning.selenium;


import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLearn2 {

	public static void main(String[] args) throws Exception
	{
	
     System.setProperty("webdriver.gecko.driver", "D:\\Learning\\Selenium\\geckodriver.exe");
      FirefoxDriver driver= new FirefoxDriver();
      driver.get("https://www.google.co.in");
      Thread.sleep(5000);
     
      driver.close();

	}

}
