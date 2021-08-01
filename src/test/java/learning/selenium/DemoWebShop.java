package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoWebShop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log in"))).click();

		String actualMessage = "Welcome, Please Sign In!";
		String expectedMessage = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='page-title']"))).getText();
		if (actualMessage.equalsIgnoreCase(expectedMessage)) {
			System.out.println("Welcome message Test passed");
		} else {
			System.out.println("Welcome message Test Failed");
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Email']")))
				.sendKeys("testdemowebshop@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Password']")))
				.sendKeys("Test123");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Log in']"))).submit();

		String actualAccountID = "testdemowebshop@gmail.com";
		String expectedAccountID = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[@class='ico-logout']/preceding::a[@class='account']")))
				.getText();
		if (actualAccountID.equalsIgnoreCase(expectedAccountID)) {
			System.out.println("AccountID  Test passed");
		} else {
			System.out.println("AccountID Test Failed");
		}

		String x1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='cart-qty']")))
				.getText();
		String x2 = x1.replaceAll("[^0-9]", "");
		int y = Integer.parseInt(x2);
		// System.out.println(x1+":"+x2+":"+y);
		if (y != 0) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//li[@id='topcartlink']/descendant::span[@class='cart-label']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='removefromcart']")))
					.click();
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Update shopping cart']")))
					.click();
		}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Books"))).click();
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@title='Show details for Fiction']")))
				.click();
		String itemPrice=wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@itemprop='price']")))
				.getText();
		
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@class,'qty-input')]")))
				.clear();
		
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@class,'qty-input')]")))
				.sendKeys("10");
		
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@class,'qty-input')]/following-sibling::input")))
				.click();
		String actualCartMessage=wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='content']")))
				.getText();
		String expectedCartMessage="The product has been added to your shopping cart";
		
		if(expectedCartMessage.equalsIgnoreCase(actualCartMessage))
		{
			System.out.println("cart message Test passed");
		}
		else {
			System.out.println("cart message Test Failed");
		}
	
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='ico-cart']/span[@class='cart-label']")))
				.click();
		
		String subTotal=wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='Sub-Total:']/following::span[@class='product-price'])[1]")))
				.getText();
		int st=(int) Float.parseFloat(subTotal);
		if(st==Integer.parseInt(itemPrice)*10)
		{
			System.out.println("sub-total Test passed");
		}
		else {
			System.out.println("sub-total Test Failed");
		}
	
	
	}

}
