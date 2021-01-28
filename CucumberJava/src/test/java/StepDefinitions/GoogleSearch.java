package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearch {
	WebDriver driver=null;
	
	@Given("user has browser open")
	public void user_has_browser_open() {
		String path=System.getProperty("user.dir");
		System.out.println(path);
	    System.setProperty("webdriver.chrome.driver", path+"/src/test/resources/drivers/chromedriver.exe");
	     driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.navigate().to("https://www.google.com/");
	
	}

	@When("user enters text in search bar")
	public void user_enters_text_in_search_bar() {
	   driver.findElement(By.id("input")).sendKeys("Automation step by step");
	}

	@And("user clicks on enter or search")
	public void user_clicks_on_enter_or_search() {
		   driver.findElement(By.id("input")).sendKeys(Keys.ENTER);
	}

	@Then("Search results are displayed")
	public void search_results_are_displayed() {
	  driver.getPageSource().contains("Docker");
	}

}
