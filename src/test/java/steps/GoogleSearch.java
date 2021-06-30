package steps;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class GoogleSearch  {

	WebDriver driver = TestBase.getDriver();
	
	@Given("User opens browser")
	public void user_opens_browser() {
		System.out.println("User opens browser");
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

	@When("User enters ANOTHER THING text in search box2")
	public void user_enters_ANOTHER_THING_text_in_search_box() {
		System.out.println("User enters Selenium text in search box");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("ANOTHER THING");
	}

	@And("User hits enter")
	public void user_hits_enter() {
		System.out.println("User hits enter");
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
	}

	@Then("User is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("User is navigated to search results");
	}

}
