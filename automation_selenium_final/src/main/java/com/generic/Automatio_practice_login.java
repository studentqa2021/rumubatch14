package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automatio_practice_login {
	
	void baselogin(){
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");  //for chrome
		WebDriver driver = new ChromeDriver();
		//driver.get("http://automationpractice.com/index.php");
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		// Clicking on the Sign in button
		Master_page_factory obj = new Master_page_factory(driver);
		obj.getSignbtn().click();
		obj.getEmail().sendKeys("sarowerny@gmail.com");
		obj.getPass().sendKeys("student");
		obj.getLoginbtn().click();
		
		
		/*WebElement signbtn =driver.findElement(By.xpath("//*[@class=\"login\"]"));
		signbtn.submit();
		
		// To enter email
		WebElement email =driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("sarowerny@gmail.com");
		// To enter password
		WebElement pass= driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		pass.sendKeys("student");
		// to click on submit
		//driver.findElement(By.xpath("//*[@type='submit']")).click();
		WebElement loginbtn =driver.findElement(By.xpath("//*[@class=\"icon-lock left\"]"));
		loginbtn.click();*/

		
		// To close the driver
		//driver.quit();
		
		
	
	}

}
