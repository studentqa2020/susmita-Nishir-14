package com.generic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class automationPracticePOM {
 
	public static void  pomCoding() {
	System.setProperty("webdriver.firefox.driver", "./Driver/geckodriver.exe");	
	WebDriver driver = new FirefoxDriver(); 
	driver.navigate().to("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	
	MasterPageFactory1 obj = new MasterPageFactory1(driver);
	obj.getSignin().click();
	obj.getEmail().sendKeys("sarowerny@gmail.com");
	obj.getPass().sendKeys("student");
	obj.getSubmitBtn().click();
	driver.quit();
	}
}
