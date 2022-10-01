package ecommerce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AddToCart {
	

	WebDriver webdriver = null;
	String URL = "http://automationpractice.com/";

	@SuppressWarnings("deprecation")
	@Test
	public void addToCart() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get(URL);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webdriver.manage().window().maximize();

		webdriver.findElement(By.linkText("Sign in")).click();

		webdriver.findElement(By.id("email")).sendKeys("arjun35@gmail.com");
		webdriver.findElement(By.id("passwd")).sendKeys("ajura110");
		webdriver.findElement(By.id("SubmitLogin")).click();
		webdriver.findElement(By.linkText("WOMEN")).click();

		WebElement SecondImg = webdriver
				.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[1]/div/a[1]/img"));
		WebElement MoreBtn = webdriver.findElement(
				By.xpath("/html/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul/li[2]/div[1]/div[2]/div[2]/a[2]"));
		Actions actions = new Actions(webdriver);
		actions.moveToElement(SecondImg).moveToElement(MoreBtn).click().perform();

		webdriver.findElement(By.id("quantity_wanted")).clear();
		webdriver.findElement(By.id("quantity_wanted")).sendKeys("3");

		WebElement Sizedrpdwn = webdriver.findElement(By.xpath("//*[@id='group_1']"));
		Select oSelect = new Select(Sizedrpdwn);
		oSelect.selectByVisibleText("L");

		webdriver.findElement(By.id("color_11")).click();

		webdriver.findElement(By.xpath("//p[@id='add_to_cart']//span[.='Add to cart']")).click();

		webdriver.findElement(By.xpath("/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span")).click();

		webdriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
		webdriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();

		webdriver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
		webdriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button/span")).click();

		webdriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a")).click();

		webdriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();

		String ConfirmationText = webdriver
				.findElement(By.xpath("//div[@id='center_column']/p[@class='alert alert-success']")).getText();

		if (ConfirmationText.contains("complete")) {
			System.out.println("Order Completed: Test Case Passed");
		} else {
			System.out.println("Order Not Successfull: Test Case Failed");
		}

	}

}
