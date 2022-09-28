package com.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver webdriver = null;
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		webdriver = new ChromeDriver();
		webdriver.manage().window().maximize();

		webdriver.get("http://automationpractice.com/");
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webdriver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		webdriver.findElement(By.name("email_create")).sendKeys("saraah@gmail.com");
		webdriver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();

		webdriver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("Saraah");
		webdriver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys("Arjun");
		webdriver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("sara7aju");

		webdriver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Saraah");
		webdriver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Arjun");

		webdriver.findElement(By.xpath("//*[@id='address1']")).sendKeys("3, Main lane");

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