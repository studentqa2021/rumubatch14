package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Master_page_factory {// java encapsulation
	public Master_page_factory(WebDriver driver) {//to remove null pointer exception
		 PageFactory.initElements(driver, this);
	}
	 //private WebElement signbtn;
      // private int a;
	 @FindBy(xpath="//*[@class=\\\"login\\")
	 private WebElement signbtn;
	 
	 @FindBy(xpath="//*[@id=\\\"email\\\"]")
	 private WebElement email;
	 
	 @FindBy(xpath="//*[@id=\\\"passwd\\\"]")
	 private WebElement pass;
     
	 @FindBy(xpath="//*[@class=\\\"icon-lock left\\\"]")
	 private WebElement loginbtn;
	 
	 
	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getSignbtn() {
		return signbtn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}
	 
}
