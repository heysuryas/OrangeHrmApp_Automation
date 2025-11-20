
package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {

    //initialise driver 
	private WebDriver driver;

    public AddEmployeePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    
   
  //Declare elements
    @FindBy(xpath="//span[contains(normalize-space(),'PIM')]")
    private WebElement PIMsection;

    //Declare elements
      @FindBy(xpath="//input[@placeholder=\"Type for hints...\"]")
      private WebElement Employeenamefld;

      //Declare elements
        @FindBy(xpath="//a[contains(text(),'Employee List')]")
        private WebElement Employeelst;

        //Declare elements
          @FindBy(xpath="//label[text()='Employee Id']/parent::div/following-sibling::div//input")
          private WebElement Employeeidfld;
          
          //Declare elements
          @FindBy(xpath="//label[text()='Employment Status']/parent::div/following-sibling::div//div")
            private WebElement Empstatusfld;

    
    

    
    
    
    
    
    
    
}