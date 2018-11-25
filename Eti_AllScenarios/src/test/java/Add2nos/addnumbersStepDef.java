package Add2nos;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addnumbersStepDef {
	
	int x ;
	int y;
	int sum;
	
	@Before
	public void set_data(){
		int x =0 ;
		int y= 0 ;
		int sum= 0;
	}
	@Given("^I want addition$")
	public void imingiven()
	{
		System.out.println("in given");
	}
	
	@When("^I enter 2 numbers$")
	public void addition_xy(){
		x=1;
		y=4;
		sum= x+y;
	}
	@Then("^Sum is displayed as addition$")
	public void sumIs(){
		System.out.println("Summ is"+sum);
	}	
	
	@Given("^Enter numbers from data$")
	public void add_nofrom_ex(){
		
		System.out.println("Given is");
	}
	
	@When("^Sum of  \"([^\"]*)\" and \"([^\"]*)\" $")
	public void summis(int x, int y){
		
		System.out.println("Summation is" + x+ y);
	}
		
	@Then("^summation is displayed as \"([^\"]*)\" is$")
	public void result(int sum){
	System.out.println("Given is" + sum);
		}
}