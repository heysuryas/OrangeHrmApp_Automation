package Steps;
import Hooks.Hooks;
import Pages.AddEmployeePage;
import Pages.Loginpage;
import io.cucumber.java.en.Given;

public class AddEmployeeSteps {
	AddEmployeePage addemppage;
	  
	 
@Given("User launches in Homepage")
	    public void user_launches_browser() {
	        // pass the driver created in Hooks  
	addemppage = new AddEmployeePage(Hooks.driver);

	    }




























}



