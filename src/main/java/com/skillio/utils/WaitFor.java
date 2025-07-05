package com.skillio.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.skillio.base.Keyword;

import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor {

public static	WebDriverWait wait;
	static {
		wait=new WebDriverWait(Keyword.driver, Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.withMessage("Element is not available");
		
		
	}
	
	
	
	public static void forElementToBeClickable(By element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void elementToBePresent(By element) {
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
	}
}
