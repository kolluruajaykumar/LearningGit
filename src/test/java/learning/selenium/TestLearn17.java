package learning.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLearn17 {

	public static void main(String[] args) throws Exception
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Selenium\\chromedriver.exe");
	System.setProperty("webdriver.chrome.silentOutput", "true");
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.gmail.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Locate visible element
	WebElement e=driver.findElement(By.name("identifier"));
	Thread.sleep(5000);
	int h1= e.getSize().getHeight();
	int w1= e.getSize().getWidth();
	System.out.println("h1:"+"   " +h1);
	System.out.println("w1:"+"   " +w1);
	int x1=e.getLocation().getX();
	int y1=e.getLocation().getY();
	System.out.println("x1:"+"   " +x1);
	System.out.println("y1:"+"   " +y1);
	int h11= e.getRect().getHeight();
	int w11= e.getRect().getWidth();
	int x11= e.getRect().getX();
	int y11 =e.getRect().getY();
	System.out.println("h11:  "+h11+"w11:    "+w11+"x11:  "+x11+"y11:   "+y11);
	//Locate hidden element
	WebElement e2=driver.findElement(By.xpath("//*[@name='hiddenPassword']"));
	Thread.sleep(5000);
	int h2= e2.getSize().getHeight();
	int w2= e2.getSize().getWidth();
	System.out.println("h2:"+"   " +h2);
	System.out.println("w2:"+"   " +w2);
	int x2=e2.getLocation().getX();
	int y2=e2.getLocation().getY();
	System.out.println("x2:"+"   " +x2);
	System.out.println("y2:"+"   " +y2);
	int h22= e2.getRect().getHeight();
	int w22= e2.getRect().getWidth();
	int x22= e2.getRect().getX();
	int y22 =e2.getRect().getY();
	System.out.println("h22:  "+h22+"w22:    "+w22+"x22:  "+x22+"y22:   "+y22);
	
	//close driver
	driver.close();

	
		
	}

}
