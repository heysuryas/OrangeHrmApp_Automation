package Steps;
import java.util.List;
import java.util.Map;
import Pages.Recruitment_Page;

import org.testng.Assert;

import Hooks.Hooks;

import Pages.Loginpage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Recruitment_Steps {
	Recruitment_Page Recruitmentpage;
	  
	 
@Given("User in Dashboard page")
	    public void user_launches_browser() {
	        // pass the driver created in Hooks  
	Recruitmentpage = new Recruitment_Page(Hooks.driver);
	
	//verify 
	    }
@When("User clicks on Recruitment module")
public void user_clicks_recruitmentmod() {
	
	
}
@And("User click on candidates module")
public void user_clicks_candidatemod() {
	
	
}


@And("And enters candidate details")
public void user_enters_candidatedtls() {
	
	
}


@And("clicks on consent check box")
public void user_consent_check() {
	
	
}
@Then("Candidate details added message will displayed")
public void candidate_dtls_visible() {
	
	
}

@When("User enters candidate name")
public void user_enters_candidatename() {
	
	
}

@And("clicks on search button")
public void user_search_click() {
	
	
}
@Then("Candidate name is visible")
public void username_isvisible() {
	
	
}


}





























 

