package com.skillio.base;

import static org.testng.Assert.assertThrows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.skillio.exceptions.InvalidBrowserNameException;

public class Keyword {
 public static RemoteWebDriver driver;
 
	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		} else if(browserName.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}else {
			throw new InvalidBrowserNameException(browserName);
		}
		System.out.println(browserName+" browser is launched successfully...! ");
		driver.manage().window().maximize();
		}
	
	public static void launchUrl(String url) {

		driver.get(url);
		System.out.println("Url has been launched succesfully..");
	}
	
	public static void ClickOnElement(String loactorType,String loactor) {
		
		getWebElement(loactorType, loactor).click();
		
	}
	
	
	public static void enterText(String loactorType,String loactor,String TextToEnter) {
		
		getWebElement(loactorType, loactor).sendKeys(TextToEnter);
		
	}
	
	public static WebElement getWebElement(String loactorType,String loactor) {

		WebElement e = null ;
		
		if (loactorType.equalsIgnoreCase("id")) {
			e=driver.findElement(By.id(loactor));
		} else if (loactorType.equalsIgnoreCase("name")){
			e=driver.findElement(By.name(loactor));
		}else if (loactorType.equalsIgnoreCase("classname")) {
			e=driver.findElement(By.className(loactor));
		}else if (loactorType.equalsIgnoreCase("tagname")) {
			e=driver.findElement(By.tagName(loactor));
		}else if (loactorType.equalsIgnoreCase("linktext")) {
			e=driver.findElement(By.linkText(loactor));
		}else if (loactorType.equalsIgnoreCase("partiallinktext")) {
			e=driver.findElement(By.partialLinkText(loactor));
		}else if (loactorType.equalsIgnoreCase("xpath")) {
			e=driver.findElement(By.xpath(loactor));
		}else if (loactorType.equalsIgnoreCase("cssselector")) {
			e=driver.findElement(By.cssSelector(loactor));
		}
		
		return e;
	}
	
	
	
	public static void closeBrowser() {
		driver.close();
	}
	
	
	public static void quitAllWindows() {
		driver.quit();
	}
	
	
}
