package facebooktest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Stepdefiniton {
	public static WebDriver driver;
	@Given("lunch the browser")
	public void lunch_the_browser() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}

	@And("maximize the browser")
	public void maximize_the_browser() {
	    driver.manage().window().maximize();
	}

	@When("facebook URL lunch")
	public void facebook_URL_lunch() {
		driver.get("https://www.facebook.com/");
	}

	@And("enter user name")
	public void enter_user_name() {
		driver.findElement(By.id("email")).sendKeys("lakshman");
	}

	@And("enter password")
	public void enter_password() {
		driver.findElement(By.id("pass")).sendKeys("123456");
	}

	@Then("click the login button")
	public void click_the_login_button() {
		driver.findElement(By.name("login")).click();
	}



}
