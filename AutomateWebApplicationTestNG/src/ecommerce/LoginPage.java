package ecommerce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
	
	WebDriver webdriver = null;
	String URL = "http://automationpractice.com/";

	@SuppressWarnings("deprecation")
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get(URL);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webdriver.manage().window().maximize();

		// Click on Sign in
		webdriver.findElement(By.linkText("Sign in")).click();
		// Login
		webdriver.findElement(By.id("email")).sendKeys("arjun35@gmail.com");
		webdriver.findElement(By.id("passwd")).sendKeys("ajura110");
		webdriver.findElement(By.id("SubmitLogin")).click();
	}

}
