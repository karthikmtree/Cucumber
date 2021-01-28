package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginFactory;
import io.cucumber.java.en.*;

public class Demofactory {
	
		
		WebDriver driver=null;
		
		@Given("user is on website")
		public void user_is_on_website() {
			String path=System.getProperty("user.dir");
			System.out.println(path);
			System.setProperty("webdriver.chrome.driver", path+"/src/test/resources/drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.navigate().to("https://example.testproject.io/web/");
		}

		@When("^user enters (.*) and (.*)$")
		public void user_enters_name_and_password(String name,String password) throws InterruptedException  {
			LoginFactory log1=new LoginFactory(driver);
			log1.cred(name, password);
		}

		
		@And("user clicks on login")
		public void user_clicks_on_login() throws InterruptedException {
			
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//*[@id='login']")).click();
		}

		@Then("logout button should be displayed")
		public void logout_button_should_be_displayed() {
			boolean status=driver.findElement(By.xpath("//*[@id='logout']")).isDisplayed();
			if (status) {
				System.out.println("Test is passed");
			}else {
				System.out.println("Test is failed");
			}
		}

	}


