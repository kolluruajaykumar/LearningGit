package learning.selenium;


import org.openqa.selenium.edge.EdgeDriver;


public class TestLearn3 {

	public static void main(String[] args) throws Exception
	{
	
     System.setProperty("webdriver.edge.driver", "D:\\Learning\\Selenium\\msedgedriver.exe");
      EdgeDriver driver =new EdgeDriver();
      driver.get("https://www.google.co.in");
      Thread.sleep(5000);
     
      driver.close();

	}

}
