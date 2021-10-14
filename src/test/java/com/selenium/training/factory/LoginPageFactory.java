package com.selenium.training.factory;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	
	WebDriver driver;
	
	@FindBy(id = "name")
	WebElement txt_username;
	
	@FindBy(id = "password")
	WebElement txt_password;
	
	@FindBy(id = "login")
	WebElement btn_login;
	
	@FindBy(id = "logout")
	WebElement btn_logout;
	
//	By txt_username = By.id("name");
//	By txt_password = By.id("password");
//	By btn_login = By.id("login");
//	By btn_logout = By.id("logout");
	
	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String user) {
		txt_username.sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		txt_password.sendKeys(pass);
	}
	
	public void clickLogin() {
		btn_login.click();
	}
	
	//moved to home page cause logout not in login page
//	public boolean checkLogout() {
//		return btn_logout.isDisplayed();
//	}

}
