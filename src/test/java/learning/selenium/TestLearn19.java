package learning.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLearn19 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\learning\\selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Locate radio button
		WebElement radioButton=driver.findElement(By.xpath("//label[text()='Round Trip']/preceding-sibling::*"));
		//WebElement radioButton=driver.findElement(By.xpath("//label[text()='Round Trip']"));
		Thread.sleep(5000);
		if(radioButton.isSelected())
		{
			System.out.println("Radio button is on");
		}else {
			System.out.println("Radio button is off");
		}
		
		//Locate Check box
		WebElement checkBox=driver.findElement(By.xpath("//label[text()=' Senior Citizen']/preceding-sibling::*"));
		Thread.sleep(5000);
		if(checkBox.isSelected())
		{
			System.out.println("Check box is on");
		}
		else {
			System.out.println("check box is off");
		}
		//Locate drop down
		
		//WebElement dropDown=driver.findElement(By.xpath("(//label[contains(text(),'FROM')]/parent::div/following-sibling::span)[1]"));
		WebElement dropDown=driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT"));
		Thread.sleep(5000);
		if(dropDown.isSelected())
		{
			System.out.println("default item is selected in Drop down");
		}
		else {
			System.out.println("item is not selected in dropDown ");
		}
		//close driver 
		driver.close();	
	}

}
