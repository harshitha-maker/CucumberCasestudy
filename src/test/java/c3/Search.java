package c3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	WebDriver driver;
	
	@Given("User enters the testmeapp and logs in")
	public void user_enters_the_testmeapp_and_logs_in() {
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
		 
		driver= new ChromeDriver();

		 
		driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
		 
		driver.findElement(By.id("details-button")).click();
		 
		driver.findElement(By.id("proceed-link")).click();
		 
		driver.findElement(By.linkText("SignIn")).click();

	}

	@When("User search for a product in search engine")
	public void user_search_for_a_product_in_search_engine() {
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		 
		driver.findElement(By.name("password")).sendKeys("Password123");
		 
		driver.findElement(By.name("Login")).click();
		 
		driver.findElement(By.xpath("//div[@class='autocomplete']/input")).sendKeys("headphone");
		 
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		 
		driver.findElement(By.linkText("Add to cart")).click();

	}

	@Then("User purchases the product")
	public void user_purchases_the_product() {
	    System.out.println("sucessfully add to cart");
	}


}
