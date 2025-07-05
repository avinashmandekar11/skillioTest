package com.skillio.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.skillio.base.Keyword;
import com.skillio.base.LocatorType;
import com.skillio.utils.WaitFor;

//static import
import static com.skillio.base.Keyword.*;
public class HomePage {

		static By loginSignupPopupCloseBtn =By.cssSelector("span.icClose");
		static By from_text_box=By.cssSelector("div.sc-12foipm-2:nth-child(1)");
		static By	from_text_input=By.cssSelector("div.sc-12foipm-25.fbAAhv input");
		static By	city_name=By.cssSelector("div.sc-12foipm-25 input");
	
		// page factory model
		//static WebElement loginSignupPopupCloseBtnn=driver.findElement(By.cssSelector("span.icClose"));
		
		
		@FindBy(css="span.icClose")
		static WebElement loginSignupPopupCloseBtnn;
		
		
		
	public static void clickOnloginSignupPopupCloseBtn() {
		WaitFor.forElementToBeClickable(loginSignupPopupCloseBtn);
		ClickOnElement(loginSignupPopupCloseBtn);
	}
	
	public static void clickOnFromTextBox() {
		ClickOnElement(from_text_box);
	}
	
	public static void clickOnFromTextBoxInput() {
		ClickOnElement(from_text_input);
	}
	
	public static void enterCityNameInTextBox(String cityName) {
		
		enterText(from_text_input,cityName);
	}

	public static void inputKey(Keys key) {
		enterKey(from_text_input, key); 
	}
	
	
	//in this we dont need Keyword class we can directly perform action through webelemet 
	public static void closePopUp() {
		loginSignupPopupCloseBtnn.click();
	}

	

	
	
	
	
}
