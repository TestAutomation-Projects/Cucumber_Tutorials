package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps
{
	public static WebDriver driver;
@Given("^User is on Home page$")
public void user_is_on_Home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//change

//change2
//change3
	    driver=new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://www.store.demoqa.com");
	}

@When("^User Navigate to LogIn Page$")
public void user_Navigate_to_LogIn_Page() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath(".//*[@id='account']/a")).click();
}
@When("^User enters username and pwd$")
public void user_enters_and() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("log")).sendKeys("rr"); 	 
    driver.findElement(By.id("pwd")).sendKeys("bbb");
    driver.findElement(By.id("login")).click();
}

@Then("^Message displayed login Successfully$")
public void message_displayed_login_Successfully() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Login Successfully");
}

@When("^User Logout from the Application$")
public void user_Logout_from_the_Application() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
}

@Then("^Message displayed logout Successfully$")
public void message_displayed_logout_successfully() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("LogOut Successfully");
}

}