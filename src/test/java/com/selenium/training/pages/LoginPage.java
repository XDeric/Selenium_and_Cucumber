package com.selenium.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By txt_username = By.id("name");
	By txt_password = By.id("password");
	By btn_login = By.id("login");
	By btn_logout = By.id("logout");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUserName(String user) {
		driver.findElement(txt_username).sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(txt_username).sendKeys(pass);
	}
	
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	
	public boolean checkLogout() {
		return driver.findElement(btn_logout).isDisplayed();
	}

}
