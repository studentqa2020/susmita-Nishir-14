package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	MasterPageFactory(WebDriver driver)	{
		PageFactory.initElements(driver, this);	
	}
	
public WebElement getSigninBtn() {
		return signinBtn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

@FindBy(xpath="//*[@class='login']")
private WebElement signinBtn;

@FindBy(xpath="//*[@id='email']")
private WebElement email;

@FindBy(xpath="//*[@id='passwd']")
private WebElement pass;

@FindBy(xpath="//*[@class='icon-lock left']")
private WebElement loginbtn;

}
