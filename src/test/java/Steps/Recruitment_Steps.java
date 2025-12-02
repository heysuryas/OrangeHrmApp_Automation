package Steps;
import static org.testng.Assert.assertTrue;

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
	
	//verify the dashboard page 
	Assert.assertTrue(Recruitmentpage.user_inDashboardpage());
	    }
@When("User clicks on Recruitment module")
public void user_clicks_recruitmentmod() {
	Recruitmentpage.Recruitment_mod_click();
	
}
@And("User click on Add module")
public void user_clicks_candidatemod() {
	Recruitmentpage.Add_button_click();

}


@And("And enters candidate details")
public void user_enters_candidatedtls(DataTable dataTable)  {
	Map<String, String> data = dataTable.asMaps().get(0);
	Recruitmentpage.candidate_dtls(
	                data.get("Fullname"),
	                data.get("Lastname"),
	                data.get("Vacancy"),
	                data.get("Email"));
	
}


@And("clicks on consent check box")
public void user_consent_check() {
	Recruitmentpage.checkbox_click();
	
}
@Then("success message will displayed")
public void candidate_dtls_visible() {
   Assert.assertTrue(Recruitmentpage.isSuccessMessageDisplayed());
  
	
}

@When("User enters candidate name")
public void user_enters_candidatename(DataTable dataTable) {
	Recruitmentpage.candidatemod_click();
	
	
	Map<String, String> data = dataTable.asMaps().get(0);
	Recruitmentpage.check_username(
	                data.get("Name"));
	
	
}

@And("clicks on search button")
public void user_search_click() {
	Recruitmentpage.submit_click();
	
}
@Then("Candidate name is visible")
public void username_isvisible() {
	
	
}


}





























 

