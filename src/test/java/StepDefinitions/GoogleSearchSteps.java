package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver = null;

	@SuppressWarnings("deprecation")
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside steps - browser is open");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pasindu Ishan\\eclipse-workspace\\CucumberJava\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
	}

	@And("user is on google page")
	public void user_is_on_google_page() throws InterruptedException {
		System.out.println("Inside steps - user is on google page");
		
		driver.navigate().to("http://google.com");
		Thread.sleep(3000);
		
		
	}
	
	

	@When("user enter a text in serach box")
	public void user_enter_a_text_in_serach_box() throws InterruptedException {
		System.out.println("Inside steps - user enter a text in serach box");
		
		driver.findElement(By.name("q")).sendKeys("ishop.lk");
		Thread.sleep(3000);
		
		
	}
	
	

	@And("hits enter")
	public void hits_enter() {
		System.out.println("Inside steps - hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		
	}
	
	

	@Then("user  is navigated to search result")
	public void user_is_navigated_to_search_result() throws InterruptedException {
		System.out.println("Inside steps - user is navigated to serach result");
		
		driver.getPageSource().contains("iSHOP.LK");
		
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
		
	}


}
