package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationPractice implements PHPExam {

	@Override
	public void Login() {
	System.setProperty("webdriver.firefox.driver", "./Driver/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.navigate().to("http://automationpractice.com/index.php");
	driver.manage().window().maximize();

	MasterPageFactory obj = new MasterPageFactory(driver);
	obj.getSigninBtn().click();;

	obj.getEmail().sendKeys("sarowerny@gmail.com");
	
	obj.getPass().sendKeys("student");

	obj.getLoginbtn().click();
	driver.quit();
	
	}


}
