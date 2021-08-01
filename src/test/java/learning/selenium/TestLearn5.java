package learning.selenium;
import org.openqa.selenium.opera.OperaDriver;

public class TestLearn5 {

	public static void main(String[] args) throws Exception
	{
	
		   System.setProperty("webdriver.opera.driver", "D:\\Learning\\Selenium\\operadriver_win64\\operadriver.exe");
		      OperaDriver driver =new OperaDriver();
		      Thread.sleep(5000);
		      driver.manage().window().maximize();
		      driver.get("https://www.google.co.in");
		     Thread.sleep(5000);
		     driver.quit();

	}

}
