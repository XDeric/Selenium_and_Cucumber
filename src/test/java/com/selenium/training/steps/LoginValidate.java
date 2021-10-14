package com.selenium.training.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.selenium.training.factory.HomePageFactory;
import com.selenium.training.factory.LoginPageFactory;
import com.selenium.training.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginValidate {
	
	public static WebDriver driver;
	public static String browser = "chrome";
	//LoginPage loginPage; // old way
	LoginPageFactory loginFactory;
	HomePageFactory homeFactory;

	@Given("browser is opened")
	public void browser_is_opened() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    loginFactory = new LoginPageFactory(driver); //calling page constructor
	    homeFactory = new HomePageFactory(driver);
	    
	}
	
	@And("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("At login page");
	    driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String user, String pass) {
//	    driver.findElement(By.id("name")).sendKeys(user);
//	    driver.findElement(By.id("password")).sendKeys(pass);
		loginFactory.enterPassword(pass);
		loginFactory.enterUserName(user);
	}

	@And("clicks on login page")
	public void clicks_on_login_page() {
//		driver.findElement(By.id("login")).click();
		loginFactory.clickLogin();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
//		boolean display = driver.findElement(By.id("logout")).isDisplayed();
		boolean display = homeFactory.checkLogout();
		Assert.assertEquals(true, display);
		
		driver.close();
		driver.quit();
	}
	
}
