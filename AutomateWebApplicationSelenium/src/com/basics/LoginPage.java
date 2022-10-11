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
		webdriver.get("http://localhost:4200/admin");
		webdriver.findElement(By.name("Username")).sendKeys("admin");
		webdriver.findElement(By.name("Password")).sendKeys("password");
		webdriver.findElement(By.id("login-button")).click();
	}

}