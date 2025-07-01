package com.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.bidi.browsingcontext.Locator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.skillio.base.Keyword;
import com.skillio.base.LocatorType;
import com.skillio.base.Locators;
import com.skillio.base.TestBase;
import com.skillio.pages.HomePage;

import static com.skillio.base.Keyword.*; //Static import
import static com.skillio.base.LocatorType.*;//
import static com.skillio.utils.FileUtility.*;


import static com.skillio.pages.HomePage.*;
public class goibibo extends TestBase {
	//RemoteWebDriver driver ;
	
	@Test
	public void homepage() throws InterruptedException {
	//driver.get("https://www.goibibo.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("span.icClose")).click();
	driver.findElement(By.cssSelector("div.sc-12foipm-2:nth-child(1)")).click();
	driver.findElement(By.cssSelector("div.sc-12foipm-25.fbAAhv input")).click();
	driver.findElement(By.cssSelector("div.sc-12foipm-25 input")).sendKeys("Mumbai",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("div.sc-12foipm-25 input")).sendKeys(Keys.ENTER);
	driver.findElement(By.cssSelector("div.sc-12foipm-25 input")).sendKeys("Pune");
	
	driver.findElement(By.cssSelector("div.sc-12foipm-25 input")).sendKeys(Keys.ENTER);
}
	
	
	@Test
	private void HomePageUsingKeyword() throws InterruptedException {
		
		//driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("span.icClose")).click();
		driver.findElement(By.cssSelector("div.sc-12foipm-2:nth-child(1)")).click();
		driver.findElement(By.cssSelector("div.sc-12foipm-25.fbAAhv input")).click();
		driver.findElement(By.cssSelector("div.sc-12foipm-25 input")).sendKeys("Mumbai",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.sc-12foipm-25 input")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("div.sc-12foipm-25 input")).sendKeys("Pune");
		
		driver.findElement(By.cssSelector("div.sc-12foipm-25 input")).sendKeys(Keys.ENTER);

	}
	
	@Test
	public void sample() throws InterruptedException {
		//launchUrl(null);
		
		Thread.sleep(3000);
		//ClickOnElement(CSSSELECTOR,"span.icClose");
		
		ClickOnElement(CSSSELECTOR,getLocator("login_signup_popup_close_btn"));  
		//locators.property and fileutility vala he yeh
		
		//ClickOnElement(CSSSELECTOR, "div.sc-12foipm-2:nth-child(1)");
		//ClickOnElement(CSSSELECTOR, "div.sc-12foipm-25.fbAAhv input");
		//enterText(CSSSELECTOR, "div.sc-12foipm-25 input","Mumbai");

		ClickOnElement(CSSSELECTOR, Locators.from_text_box);
		ClickOnElement(CSSSELECTOR, Locators.from_text_input);
		enterText(CSSSELECTOR, Locators.city_name,"Mumbai");
		
	}
	
	//sing Homepage static import and Page Object Model
	@Test
	public void usingPOM() throws InterruptedException {
		//imported from homepage new pacakage
		Thread.sleep(3000);
		clickOnloginSignupPopupCloseBtn();
		clickOnFromTextBox();
		clickOnFromTextBoxInput();
		enterCityNameInTextBox("Mumbai",Keys.ENTER);
		
		
		
	}


	
	
}










