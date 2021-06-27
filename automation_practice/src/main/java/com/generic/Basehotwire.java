package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.util.HighlighterHotwire;
import com.util.ScreenShotHotWire;

public class Basehotwire implements PhpLogin{

	@Override
	public  void getLoginPHP() {
	System.setProperty("webdriver.firefox.driver", "./Driver/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();	
	driver.get("https://www.hotwire.com/hotels/");
	driver.manage().window().maximize();
	
	ScreenShotHotWire.ScreenShot(driver, "+BefoeLogin+");
	//sign in
	WebElement SigninBtn=driver.findElement(By.xpath("//*[@class='auth-buttons__sign-in']"));
	HighlighterHotwire.getcolour(SigninBtn, driver);
	SigninBtn.click();
	//email
	WebElement Email=driver.findElement(By.xpath("//*[@id='sign-in-email']"));
	HighlighterHotwire.getcolour(Email, driver);
	Email.sendKeys("susmita.z.nishir@gmail.com");
	//pass
	WebElement Pass=driver.findElement(By.xpath("//*[@id='sign-in-password']"));
	HighlighterHotwire.getcolour(Pass, driver);
	Pass.sendKeys("S12345678");
	//
	WebElement FinailSignin=driver.findElement(By.xpath("//*[@class='hw-btn hw-btn-block hw-btn-primary']"));
	HighlighterHotwire.getcolour(FinailSignin, driver);
	FinailSignin.click();
	
	driver.quit();
	}

}
