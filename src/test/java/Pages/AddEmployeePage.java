
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
    //Add Employee elements
    @FindBy(xpath="//a[contains(text(),'Add Employee')]")
    private WebElement Addempbtn;
    
    @FindBy(name="firstName")
    private WebElement Firstname;
    
    @FindBy(name="middleName")
    private WebElement Middlename;
    
    @FindBy(name="lastName")
    private WebElement Lastname;
    
    @FindBy(name="//label[text()='Employee Id']/parent::div/following-sibling::div//input")
    private WebElement Employeeid;		
    	
    @FindBy(xpath="//button[@type='submit']")
    private WebElement savebtn;
  
    
    //Employee list elements
      @FindBy(xpath="//span[contains(normalize-space(),'PIM')]")
      private WebElement PIMsection;

      @FindBy(xpath="//input[@placeholder=\"Type for hints...\"]")
      private WebElement Employeenamefld;

      @FindBy(xpath="//a[contains(text(),'Employee List')]")
      private WebElement Employeelst;

      @FindBy(xpath="//label[text()='Employee Id']/parent::div/following-sibling::div//input")
       private WebElement Employeeidfld;

      @FindBy(xpath="//label[text()='Employment Status']/parent::div/following-sibling::div//div")
      private WebElement Empstatusfld;

      @FindBy(xpath="//div[contains(text(),'Current Employees Only')]")
      private WebElement includefld;
      
      @FindBy(xpath="//label[text()='Supervisor Name']/parent::div/following-sibling::div//div")
      private WebElement Supervisor;

      
    
    
    // Add Employee page methods
      
    // Employee list methods
      
    
    
}