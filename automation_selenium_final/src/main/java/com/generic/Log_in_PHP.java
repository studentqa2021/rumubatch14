package com.generic;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.Highlighter;

public class Log_in_PHP {
	
	 public void getLogin()   {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		//ChromeOptions driver = new ChromeOptions();
		driver.navigate().to("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		//Screenshot= to take pictures
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("./Screenshot/Homepage.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	WebElement	 signbtn =driver.findElement(By.xpath("//*[@class='lvl-0 sign-in btn btn-md btn-white-outline']"));
	
	//highlight
		Highlighter.addColor(driver, signbtn);
		//Screenshot/picture
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile1, new File("./Screenshot/Before_Login_Click.png"));
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		signbtn.click();
		//wait
		
		File scrFile2= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Thread.sleep(3000);
		try {
			FileUtils.copyFile(scrFile2, new File("./Screenshot/AfterLoginClick.png"));
		} catch (IOException e2) {
			
			e2.printStackTrace();
		}
	

}
}
