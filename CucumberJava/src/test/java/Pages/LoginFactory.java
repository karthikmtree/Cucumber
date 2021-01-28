package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFactory {
	WebDriver driver;

	@FindBy(xpath="//*[text()='Full Name:']//following::input[@id='name']")
	WebElement txt_name;

	@FindBy(xpath="//*[text()='Password:']//following::input[@id='password']")
	WebElement txt_password;

	@FindBy(xpath="//*[@id='login']")
	WebElement btn_login;

	public LoginFactory(WebDriver driver1) {
		driver=driver1;
		PageFactory.initElements(driver, this);
	}

	public void cred(String user,String pass) throws InterruptedException {
		txt_name.sendKeys(user);
		txt_password.sendKeys(pass);
		Thread.sleep(2000);
		btn_login.click();
	}
}
