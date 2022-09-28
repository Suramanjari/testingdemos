package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		WebDriver webdriver = null;
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		webdriver = new ChromeDriver();
		webdriver.manage().window().maximize();
		webdriver.get("https://practicetestautomation.com/practice-test-login/");
		webdriver.findElement(By.name("user-name")).sendKeys("student");
		webdriver.findElement(By.name("password")).sendKeys("Password123");
		webdriver.findElement(By.id("login-button")).click();
	}

}