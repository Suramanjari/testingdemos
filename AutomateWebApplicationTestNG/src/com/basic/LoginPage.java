package com.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
	
	WebDriver webdriver = null;
	String URL = "http://localhost:4200/admin";

	@SuppressWarnings("deprecation")
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get(URL);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webdriver.manage().window().maximize();


		// Login
		webdriver.findElement(By.name("Username")).sendKeys("admin");
		webdriver.findElement(By.name("Password")).sendKeys("password");
		webdriver.findElement(By.id("login-button")).click();
	}
}