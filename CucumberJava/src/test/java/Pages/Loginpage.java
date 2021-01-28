package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	WebDriver driver;
	
	By txt_Username=By.xpath("//*[@id='name']");
	By txt_Password=By.xpath("//*[@id='password']");
	By btn_Login=By.xpath("//*[@id='login']");
	By btn_Logout=By.xpath("//*[@id='logout']");
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		if(!driver.getTitle().equals("TestProject Demo")) {
			throw new IllegalStateException("This is not Project Demo page.User is on"+driver.getCurrentUrl());
		}
	}
	
	public void login(String user,String pass) {
		driver.findElement(txt_Username).sendKeys(user);
		driver.findElement(txt_Password).sendKeys(pass);
		driver.findElement(btn_Login).click();
	}

}
