package steps;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;

public class GoogleSearch  {
	
	

	public GoogleSearch() {
		// TODO Auto-generated constructor stub
	}
	
	WebDriver driver;
	
	@Given("User opens browser")
	public void user_opens_browser() {
		System.out.println("From class: User opens browser");
		System.setProperty("webdriver.chrome.driver", "C:/codebase/drivers/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(1600, TimeUnit.SECONDS);
	}

	@And("User is on www.google.com page")
	public void user_is_on_www_google_com_page() {
		System.out.println("User is on www.google.com page");
		driver.get("https://www.google.com");
	}

	@When("^User enters (.*) text in search box$")
	public void user_enters_selenium_text_in_search_box(String searchString) {
		System.out.println("User enters Selenium text in search box");
		if(searchString.equals("Fail")) {
		    throw new io.cucumber.java.PendingException();
		}
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(searchString);
	}

	@And("User hits enter")
	public void user_hits_enter() {
		System.out.println("User hits enter");
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
	}

	@Then("User is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("User is navigated to search results");
		System.out.println("tearDown: User closes browser");
		driver.close();
		driver.quit();
		driver = null;
	}

}
