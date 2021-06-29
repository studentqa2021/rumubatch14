package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUSA implements Base_login {
	//inheritance + polymorphism(override)

	@Override
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");  //for chrome
		WebDriver driver = new ChromeDriver();
		// To open facebook
		driver.get("https://www.facebook.com");
		// To maximize the window
		driver.manage().window().maximize();
		
		JavascriptExecutor obj = (JavascriptExecutor)driver; //type casting

		obj.executeScript("arguments[0].setAttribute('style', arguments[1]);", driver.findElement(By.xpath("//*[@id='email']")), "color: red; border: 2px solid red;");
		// To enter email, password and click on log in button
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("rumu_af@yahoo.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	
	//	driver.quit();
		
	}

	

}
