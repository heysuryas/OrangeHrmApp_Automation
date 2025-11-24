
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
    
    @FindBy(xpath="//label[text()='Employee Id']/parent::div/following-sibling::div//input")
    private WebElement Employeeidfld;		
    	
    @FindBy(xpath="//button[@type='submit']")
    private WebElement savebtn;
  
    @FindBy(xpath = "//div[@class='oxd-toast-content oxd-toast-content--success']")
    private WebElement successToast; 
    
    @FindBy(xpath="//span[contains(normalize-space(),'PIM')]")
    private WebElement PIMsection;
    
    
   
    
    
    // ------------------- Add Employee Page Methods -------------------

    public void click_PIMSection() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(PIMsection));
        PIMsection.click();
    }

    public void click_AddEmployee() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(Addempbtn));
        Addempbtn.click();
    }
    
    
    public void forceClear(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
    }


    public void enterFormDetails(String fname, String lname, String empId) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitForLoaderToDisappear();
        wait.until(ExpectedConditions.visibilityOf(Firstname));

        
        
        forceClear(Employeeidfld);
        Firstname.sendKeys(fname);
        Lastname.sendKeys(lname);
        Employeeidfld.sendKeys(empId);

        
    }
    public void waitForLoaderToDisappear() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.cssSelector("div.oxd-form-loader")
        ));
    }

    public void Click_savebtn() {
    	waitForLoaderToDisappear();
    	savebtn.click();
    }
    
    public String getSuccessMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement toast = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("div.oxd-toast.oxd-toast--success .oxd-toast-content")
                )
        );

        return toast.getText();
     
    }
}
    
    
    
    
    
    
    
 
