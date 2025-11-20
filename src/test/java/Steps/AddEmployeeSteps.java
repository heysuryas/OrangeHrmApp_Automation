package Steps;
import org.testng.Assert;

import Hooks.Hooks;
import Pages.AddEmployeePage;
import Pages.Loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class AddEmployeeSteps {
	AddEmployeePage addemppage;
	  
	 
@Given("User is on Dashboard page")
	    public void user_launches_browser() {
	        // pass the driver created in Hooks  
	addemppage = new AddEmployeePage(Hooks.driver);
	Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("dashboard/")); // verify the dashboard page}
}

	
	

@When("User clicks on PIM section")
public void Pim_sectionclick() {
	
}

@And("User clicks on Add Employee")
public void Add_emoloyeeclick() {
}


@And("Enter user details")
public void enter_userdetails() {
}

 
@And("User clicks on Save button")
public void savebutton_click() {
}

@Then("User should see a success message Successfully Saved")	
public void sucessmsgdisplayed() {
}



// Employee list search

@When("User navigates to Employee List page")
public void Employeelistpageclick() {
	
	Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("Details/empNumber/"));
	
}

@And("User enters employee name {String} ")
public void Employeelistpageclick(String name) {
}

@And("User clicks on Search button")
public void searchbutton() {
	
}
@Then("Employee should be displayed in the results")
public void Employeedetils_isdisplayed() {
	
}


























}



