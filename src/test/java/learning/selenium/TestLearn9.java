package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLearn9 {

	public static void main(String[] args) throws Exception
	{
		//Launch browser and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		//Maximize browser window
		driver.manage().window().maximize();
		// Launch facebook site
		driver.get("http://www.facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(5000);
		/*driver.findElement(By.name("firstname")).sendKeys("ajay");
		driver.findElement(By.name("lastname")).sendKeys("kkk");
		driver.findElement(By.name("reg_email__")).sendKeys("ajaykolluru3@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("2018@JAVA");
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select s =new Select(month);
		s.selectByVisibleText("Dec");
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select s1 =new Select(day);
		s1.selectByVisibleText("27");
		
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select s2 =new Select(year);
		s2.selectByVisibleText("1990");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ajaykolluru3@gmail.com");
	
		driver.findElement(By.name("websubmit")).click();
		String x=driver.findElement(By.xpath("//div[contains(text(),'Please choose')]")).getText();
		System.out.println(x);*/
		//driver.close();
		
	}

}
