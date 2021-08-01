package learning.selenium;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class TestLearn4 {

	public static void main(String[] args) throws Exception
	{
	
      
      System.setProperty("webdriver.ie.driver", "D:\\Learning\\Selenium\\IEDriverServer.exe");
      InternetExplorerDriver driver =new InternetExplorerDriver();
      Thread.sleep(5000);
      driver.get("https://www.google.co.in");
     Thread.sleep(5000);
     
     driver.close();

      driver.quit();

	}

}
