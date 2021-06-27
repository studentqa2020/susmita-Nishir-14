package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory1 {
	
public	MasterPageFactory1(WebDriver driver){
	PageFactory.initElements(driver, this);	
	}
	
	
@FindBy(xpath="//*[@class='login']")
private WebElement signin;

@FindBy(xpath="//*[@id='email']")
private WebElement email;

@FindBy(xpath="//*[@name='passwd']")
private WebElement pass;

@FindBy(xpath="//*[@name='SubmitLogin']")
private WebElement submitBtn;

public WebElement getSignin() {
	return signin;
}

public WebElement getEmail() {
	return email;
}

public WebElement getPass() {
	return pass;
}

public WebElement getSubmitBtn() {
	return submitBtn;
}


}
