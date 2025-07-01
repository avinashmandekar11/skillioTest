package com.skillio.pages;

import org.openqa.selenium.By;

import com.skillio.base.Keyword;
import com.skillio.base.LocatorType;
//static import
import static com.skillio.base.Keyword.*;
public class HomePage {

	static By loginSignupPopupCloseBtn =By.cssSelector("span.icClose");
	static By from_text_box=By.cssSelector("div.sc-12foipm-2:nth-child(1)");
		static By	from_text_input=By.cssSelector("div.sc-12foipm-25.fbAAhv input");
		static By	city_name=By.cssSelector("div.sc-12foipm-25 input");
	
	
	public static void clickOnloginSignupPopupCloseBtn() {
		ClickOnElement(loginSignupPopupCloseBtn);
	}
	
	public static void clickOnFromTextBox() {
		ClickOnElement(from_text_box);
	}
	
	public static void clickOnFromTextBoxInput() {
		ClickOnElement(from_text_input);
	}
	
	public static void enterCityNameInTextBox(CharSequence... cityName) {
		enterText(from_text_input,cityName);
	}

	

	

	
	
	
	
}
