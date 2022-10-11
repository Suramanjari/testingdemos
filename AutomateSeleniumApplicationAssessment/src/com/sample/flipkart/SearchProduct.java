package com.sample.flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SearchProduct {

	WebDriver webdriver = null;
	String URL = "http://www.flipkart.com/";

	@SuppressWarnings("deprecation")
	@Test
	public void searchProduct() {
		System.setProperty("webdriver.edge.driver","C:\\Program Files\\edgedriver_win64\\msedgedriver.exe");
		webdriver = new EdgeDriver();
		webdriver.get(URL);
		webdriver.manage().window().maximize();
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		webdriver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();


		webdriver.findElement(By.xpath("//img[@alt='Mobiles & Tablets']")).click();

		
		webdriver.findElement(By.xpath("(//img[@alt='Moto Edge 30'])[2]")).click();
		webdriver.findElement(By.xpath("//div[normalize-space()='MOTOROLA edge 30 (Aurora Green, 128 GB)']")).click();
	}
}