package etirun;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class stepdefeti {
	
	//In this case- @Before getting called again and again by scenarions--- Ask Sir
	
	WebDriver Driver;
	@Before   // Executes before ech scenario
	public void setuplaunch(){
		System.setProperty("webdriver.chrome.driver", "D:\\Radical2018\\chromedriver_win32_B39\\chromedriver.exe");
		 Driver= new ChromeDriver();
		// Driver.get("https://www.facebook.com/");
	}
	
	@After
	public void TransactionComplete(){    // Executes after each scenario
		System.out.println("Scenario completed");
	}
	
	@Given("^Facebook page is open$")
	public void loginFB() throws InterruptedException
	{
		Driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		System.out.println("Inside Given");
	}
	
	@When("^User enter following")
	public void enter_id_pwd(DataTable userdetails){
		List<List<String>> input= userdetails.raw();
		//to get first data of first set-
		Driver.findElement(By.xpath("//input[@name='email']")).sendKeys(input.get(1).get(0));
		Driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(input.get(1).get(1));
		
		Driver.get("https://www.facebook.com/");   //This is how can we add multipme new scenarions and load data with data table
		
		//Ask Sir: How can you add data in data table
		
		Driver.findElement(By.xpath("//input[@name='email']")).sendKeys(input.get(2).get(0));
		Driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(input.get(2).get(1));
		
	}
	
	@Given("^Login for bla bla car$")
	public void launch_blabla(){
	Driver.get("https://www.blablacar.in/login/email");
	System.out.println("Inside given of blabla car");
	}
	
	// Bla bla car below value not getting passed---- How to Debug this??? Ths has to be used proper
	@When("^login email id is \"([^\"]*)\" $")
	public void enterlogin(String email)
	{
		Driver.findElement(By.xpath("//input(@placeholder='Email')")).sendKeys(email);
		
		System.out.println("Inside When of bla bla car");
		throw new PendingException();
		
	}
	
	
	@When("^password is \"([^\"]*)\" $")
	public void enterpwd(String pwd)
	{
		Driver.findElement(By.xpath("//input(@placeholder='Password')")).sendKeys(pwd);
		System.out.println("Inside When to enter pwd of bla bla bla bla car");
		throw new PendingException();
		
	}
}
	