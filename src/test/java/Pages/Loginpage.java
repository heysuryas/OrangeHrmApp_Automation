package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {

    //initialise driver 
	private WebDriver driver;

    public Loginpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    
//Declare elements
    @FindBy(name="username")
    private WebElement usernamefld;
    
    @FindBy(name="password")
    private WebElement passwordfld; 
    
    @FindBy(xpath="//button[@type='submit']")
    private WebElement loginbtn;
    
    @FindBy(xpath=  "//div[contains(@class, 'oxd-topbar-header')]//h6[text()='Dashboard']")
    private WebElement Dashboardtitle;
    
  
         
//declare methods
    
    
    public void userinHomepage() {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         wait.until(ExpectedConditions.visibilityOf(usernamefld));
    }
       
   public void logindetails(String emaiL,String password) {
	   usernamefld.clear();
	   passwordfld.clear();
	   usernamefld.sendKeys(emaiL);
	   passwordfld.sendKeys(password);
   }
    
    
   public void loginbtnclick() {
	   loginbtn.click();
   }
    
 
    public boolean isDashboardVisible() {
    	try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(Dashboardtitle));
            return Dashboardtitle.isDisplayed();
        } catch(Exception e){
            return false;
        }

    }
    
}