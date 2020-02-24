package c1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration {
	WebDriver driver;
	  
	@Given("User enters into Registration page")
	public void user_enters_into_Registration_page() {
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
		
		
	    driver = new ChromeDriver();
	    
		driver.get("https://10.232.237.143/TestMeApp/");
		 driver.findElement(By.id("details-button")).click();
		 driver.findElement(By.id("proceed-link")).click();
		 WebDriverWait wait=new  WebDriverWait(driver,5);
		 driver.findElement(By.linkText("SignUp")).click();
	}

	@When("User enters {string} , {string} , {string} , {string} , {string} ,  {string} , {string} , {string} , {string} ,{string}")
	public void user_enters(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10){
		
		driver.findElement(By.name("userName")).sendKeys(string);
	     driver.findElement(By.name("firstName")).sendKeys(string2);
		 driver.findElement(By.name("lastName")).sendKeys(string3);
		 driver.findElement(By.name("password")).sendKeys(string4);
		 driver.findElement(By.name("confirmPassword")).sendKeys(string5);
		 //driver.findElement(By.name("gender")).sendKeys(string6);
		 driver.findElement(By.xpath("//label[contains(@class,'form-control')]")).click();
		 driver.findElement(By.name("emailAddress")).sendKeys(string6);
		 driver.findElement(By.name("mobileNumber")).sendKeys(string7);
		 driver.findElement(By.name("dob")).sendKeys(string8);
		 driver.findElement(By.name("address")).sendKeys(string9);
		 //driver.findElement(By.name("securityQuestion")).sendKeys("What is your Birth Place?");
		 driver.findElement(By.name("answer")).sendKeys(string10);
		 driver.findElement(By.name("Submit")).click();
	}

	@Then("User navigates to login page")
	public void user_navigates_to_login_page() {
	    System.out.println("user in login page");
	}


	
}
