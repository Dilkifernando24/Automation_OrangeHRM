package pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	By username = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By loginBtn = By.xpath("//button[@type='submit']");
	By dashboard = By.xpath("//h6[text()='Dashboard'][1]");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void enterCredentials(String Username, String Password) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys(Username);
		wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(Password);
	}
	
	public void clickLogin() {
		wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
	}
	
	public void verifylogin() {
		String dashboardHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(dashboard)).getText();
		Assert.assertEquals("Login was not successful!", "Dashboard", dashboardHeader);
		System.out.println("User Successfully Login to the OrangeHRM" + dashboardHeader );
	}

}
