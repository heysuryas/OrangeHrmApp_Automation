package Steps;
import java.util.List;
import java.util.Map;
import Pages.Loginpage;

import org.testng.Assert;

import Hooks.Hooks;

import Pages.Loginpage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginSteps {
	 Loginpage loginPage;
	  
	 
@Given("User launches in Homepage")
	    public void user_launches_browser() {
	        // pass the driver created in Hooks  
	        loginPage = new Loginpage(Hooks.driver);
	        loginPage.userinHomepage();
	    }
	 

@When("User enters below details")
public void user_enters_below_details(DataTable dataTable) {
    // Convert DataTable to List of Maps
    List<Map<String, String>> userDetails = dataTable.asMaps(String.class, String.class);

    // Loop through each row (if multiple)
    for (Map<String, String> row : userDetails) {
        String username = row.get("Username");
        String password = row.get("Password");
        loginPage.logindetails(username, password);
    }
}
@And("User clicks on Login button")
public void login_click() {
	loginPage.loginbtnclick();
	}

@Then("User dashboard page is visible")
public void Dashboardisdisplayed() {
	Assert.assertTrue(loginPage.isDashboardVisible(), "Dashboard is not displayed");
}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}