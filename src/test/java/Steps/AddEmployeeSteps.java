package Steps;
import java.util.List;
import java.util.Map;

import Pages.AddEmployeePage;
import Pages.Employeelist;
import Pages.Loginpage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Hooks.Hooks;

public class AddEmployeeSteps {

    WebDriver driver = Hooks.driver;
    Loginpage loginpage = new Loginpage(driver);
    AddEmployeePage addEmployeePage = new AddEmployeePage(driver);
    Employeelist employeelist = new Employeelist(driver);
    
    // --------------------------- Dashboard & Navigation ---------------------------

    @Given("User is on the Dashboard page")
    public void user_is_on_the_dashboard_page() {
        Assert.assertTrue(loginpage.isDashboardVisible());
    }

    @When("User navigates to the PIM module")
    public void user_navigates_to_the_pim_module() {
    	addEmployeePage.click_PIMSection();
    }

    @And("User opens the Add Employee page")
    public void user_opens_the_add_employee_page() {
    	addEmployeePage.click_AddEmployee();
    }

    // --------------------------- Add Employee ---------------------------

    @And("User provides the employee details:")
    public void user_provides_the_employee_details(DataTable dataTable) {
        Map<String, String> data = dataTable.asMaps().get(0);
        addEmployeePage.enterFormDetails(
                data.get("FirstName"),
                data.get("LastName"),
                data.get("EmployeeID"));
    }


    @And("User saves the employee")
    public void user_saves_the_employee() {
        addEmployeePage.Click_savebtn();
    }

    @Then("A success message {string} should be displayed")
    public void a_success_message_should_be_displayed(String message) {
        Assert.assertTrue(addEmployeePage.getSuccessMessage().contains(message));
    }

    // --------------------------- Search Employee ---------------------------

    @When("User navigates to the Employee List page")
    public void user_navigates_to_the_employee_list_page() {
    	employeelist.clickEmployeeList();
    }



    @When("User searches for the employee using:")
    public void user_searches_for_the_employee_using(DataTable table) {

        Map<String, String> data = table.asMaps().get(0);

        employeelist.searchEmployeeById(data.get("EmployeeID"));
    
    }
    

    @When("User clicks on Search")
    public void user_clicks_on_search() {
    	employeelist.search_click();
    }

    @Then("The employee record should be displayed in the results")
    public void the_employee_record_should_be_displayed_in_the_results() {
        Assert.assertTrue(employeelist.isValuePresentInTable("81010"));
    }
}
