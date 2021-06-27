package com.generic;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.util.Highlighter;

public class BaseLogin implements Login  {

	public void login() {
	
	System.setProperty("webdriver.firefox.driver", "./Driver/geckodriver.exe");	
	WebDriver driver = new FirefoxDriver();	//upcasting
	//driver.get("https://www.facebook.com/");
	driver.navigate().to("https://www.facebook.com/");
	driver.manage().window().maximize();
	//color sign in
	WebElement  email=driver.findElement(By.xpath("//*[@name='email']"));
	Highlighter.addColour(email, driver);
	email.sendKeys("susmita.russel@gmail.com");
	//pass
	
	WebElement pass= driver.findElement(By.xpath("//*[@name='pass']"));
	Highlighter.addColour(pass, driver);
	pass.sendKeys("S123456");
	
	//last sign in
	WebElement finalsigninBtn = driver.findElement(By.xpath("//*[@name='login']")); 
	finalsigninBtn.click();
	driver.quit();
	
	}

	

}
