package c2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
     System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
	     driver = new ChromeDriver();
	    
		 driver.get("https://10.232.237.143/TestMeApp/");
		 driver.findElement(By.id("details-button")).click();
		 driver.findElement(By.id("proceed-link")).click();	    
	}

	@And("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys(string); 
		 driver.findElement(By.name("password")).sendKeys(string2);
		 driver.findElement(By.name("Login")).click();
		 System.out.println("Login Success");
	    
	}

	@When("clicks submit butoon")
	public void clicks_submit_butoon() {
		System.out.println("user click login button");
	   
	}

	@Then("User does successfull login")
	public void user_does_successfull_login() {
		System.out.println("Login successfully done");
	    
	}

}
