
package Pages;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Employeelist {

    //initialise driver 
	private WebDriver driver;

    public Employeelist(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

 
 //Employee list elements
 

    @FindBy(xpath="//input[@placeholder=\"Type for hints...\"]")
    private WebElement Employeenamefld;

    @FindBy(xpath="//a[contains(text(),'Employee List')]")
    private WebElement Employeelst;

    @FindBy(xpath="//label[text()='Employee Id']/parent::div/following-sibling::div//input")
    private WebElement EmployeeidSearch;

    @FindBy(xpath="//label[text()='Employment Status']/parent::div/following-sibling::div//div")
    private WebElement Empstatusfld;

    @FindBy(xpath="//div[contains(text(),'Current Employees Only')]")
    private WebElement includefld;
      
    @FindBy(xpath="//label[text()='Supervisor Name']/parent::div/following-sibling::div//div")
    private WebElement Supervisor;

    @FindBy(xpath="//button[@type='submit']")
    private WebElement searchbtn; 
    
    
    
    
 // ------------------- Employee List Methods -------------------

    public void clickEmployeeList() {
    	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           wait.until(ExpectedConditions.visibilityOf(Employeelst));
           Employeelst.click();
       }
    
    public void forceClear(WebElement element) {
        element.click();
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
    }


    public void searchEmployeeById(String id) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOf(EmployeeidSearch));

    	forceClear(EmployeeidSearch);
    	EmployeeidSearch.sendKeys(id);
       
    }

    public void searchEmployeeByName(String name) {
        Employeenamefld.clear();
        Employeenamefld.sendKeys(name);
       
    }
    public void search_click() {
    	searchbtn.click();
    }
    public boolean isValuePresentInTable(String value) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("div.oxd-table-body")
        ));

        List<WebElement> elements = driver.findElements(
                By.xpath("//div[contains(@class,'oxd-table-cell')][normalize-space()='" + value + "']")
        );

        return !elements.isEmpty();
    }

}
      
    
       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
