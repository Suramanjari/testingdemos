package ecommerce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegistrationPage {
	
	WebDriver webdriver = null;

	String URL = "http://automationpractice.com/";

	@SuppressWarnings("deprecation")
	@Test
	public void registration() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get(URL);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webdriver.manage().window().maximize();
		webdriver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		webdriver.findElement(By.name("email_create")).sendKeys("arjun35@gmail.com");
		webdriver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();

		webdriver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("Arjun");
		webdriver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys("Saraah");
		webdriver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("ajura110");

		webdriver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Arjun");
		webdriver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Saraah");

		webdriver.findElement(By.xpath("//*[@id='address1']")).sendKeys("78, North Lane");

		webdriver.findElement(By.xpath("//*[@id='city']")).sendKeys("Tulsa");

		Select sState = new Select(webdriver.findElement(By.xpath("//*[@id='id_state']")));
		sState.selectByVisibleText("Oklahoma");

		webdriver.findElement(By.xpath("//*[@id='postcode']")).sendKeys("74101");

		Select sCountry = new Select(webdriver.findElement(By.xpath("//*[@id='id_country']")));
		sCountry.selectByVisibleText("United States");

		webdriver.findElement(By.xpath("//*[@id='phone_mobile']")).sendKeys("9123456789");
		webdriver.findElement(By.xpath("//*[@id='alias']")).sendKeys("Home");
		webdriver.findElement(By.xpath("//*[@id='submitAccount']")).click();
	}
}