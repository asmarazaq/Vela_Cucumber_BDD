package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LoginStepDefinition {

	
	WebDriver driver;
	@Given("^user is already on Login page$")
    public void user_is_already_on_Login_page(){
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\arazaq\\Documents\\Vela_Cucumber_BDD\\webdrivers\\geckodriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		//driver.manage().window().maximize();
	driver.get("https:www.freecrm.com");	
		
		
	}
			
    @When ("^the page title is FreeCRM") 
	public void the_page_title_is_FreeCRM(){
    String title=driver.getTitle();
    System.out.println(title);
    	
    }
    
    @Then("^user enters valid user name and password$")
    public void user_enters_valid_user_name_and_password(){
    driver.findElement(By.name("username")).sendKeys("Asma.Razaq");
    driver.findElement(By.name("password")).sendKeys("Obsession66!");
	}
		
    @Then ("^user clicks on Login button$")
    public void user_clicks_on_login_button(){
    WebElement loginBtn=driver.findElement(By.xpath("//button[@name='login']"));
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();", loginBtn);
    
}	
	
    @Then ("^user is on homepage$")
    public void user_is_on_home_page(){
    	String title=driver.getTitle();
        System.out.println("Homepage title::" + title);
       
    }
}

