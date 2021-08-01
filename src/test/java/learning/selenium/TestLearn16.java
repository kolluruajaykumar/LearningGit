package learning.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLearn16 {

	public static void main(String[] args) throws Exception
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Selenium\\chromedriver.exe");
	System.setProperty("webdriver.chrome.silentOutput", "true");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://semantic-ui.com/modules/dropdown.html");
	Thread.sleep(3000);
	List<WebElement> l=driver.findElements(By.xpath("//div[contains(@class,'ui fluid search dropdown selection multiple')]/select/option"));
	System.out.println(l.size()-1);
	 System.out.println("----for Each---");
		
		 for(WebElement e:l) {
			
		  System.out.println((String)driver.executeScript("return(arguments[0].textContent);", e)); 
		  }
		 System.out.println("----Normal for loop---");
		 for(int i=1;i<l.size();i++) 
		 {
				System.out.println((String)driver.executeScript("return(arguments[0].textContent);", l.get(i))); 
			}

	WebElement e=driver.findElement(By.xpath("//h4[text()='Selection']/following-sibling::div[2]/div[2]/div[1]"));
	String x=e.getAttribute("class");
	String y=e.getCssValue("color");
	String z=e.getText();
	
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	
	String w= (String)driver.executeScript("return(arguments[0].textContent);", e);
	System.out.println("w   : " +w);
	
	driver.close();
	
	}

}
