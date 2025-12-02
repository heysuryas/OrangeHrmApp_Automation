package Pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Recruitment_Page {

    //initialise driver 
	private WebDriver driver;

    public Recruitment_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
  
    }
    
    
    
    //declare elements 
       @FindBy(xpath="//span[text()='Recruitment']") 
       private WebElement Recruitmentmod;
     
       @FindBy(xpath="//button[contains(.,'Add')]") 
       private WebElement Addbtn;
       
       @FindBy(name="firstName") 
       private WebElement firstnamefld;
       
       @FindBy(name="lastName") 
       private WebElement lastnamefld;
       
       
       @FindBy(xpath="//label[text()='Vacancy']/parent::div/following-sibling::div//div[contains(@class,'select-text')]") 
       private WebElement vaccanydropdown;
     
       
       @FindBy(xpath="//label[text()='Email']/ancestor::div[contains(@class,'oxd-input-group')]//input") 
       private WebElement Emailfld;
     
       
       @FindBy(xpath="//label[text()='Contact Number']/ancestor::div[contains(@class,'oxd-input-group')]//input")  
       private WebElement contactnumber;
       
       @FindBy(xpath=" //label[text()='Date of Application']/ancestor::div[contains(@class,'oxd-input-group')]//input")  
       private WebElement datefld;
    
       @FindBy(xpath="//label[text()='Keywords']/ancestor::div[contains(@class,'oxd-input-group')]//input") 
       private WebElement Keywords;
     
       @FindBy(xpath="//input[@type='checkbox']") 
       private WebElement checkboxbtn;
       
       @FindBy(xpath="//button[@type='submit']") 
       private WebElement savebtn;
       
       @FindBy(xpath=" //a[text()='Candidates']")
       private WebElement candidatemod;
       
       @FindBy(xpath="//button[@type='submit']") 
       private WebElement submitbtn;
       
       @FindBy(xpath = "//div[contains(@class,'oxd-toast')]//p[contains(text(),'Success')]")
       private WebElement successMsg;

       
        @FindBy(xpath=")//label[normalize-space()='Name']/ancestor::div[contains(@class,'oxd-input-group')]//p")
        private WebElement verifynamefld;

        private final String OPTION_LOCATOR_TEMPLATE = "//div[@role='option']//span[text()='{}']";
       
   // declare methods
       
       private void selectVacancyOption(String optionText) {
           // Construct the specific XPath using the text
           String actualXpath = OPTION_LOCATOR_TEMPLATE.replace("{}", optionText);
           
           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           // Wait for and click the specific option element
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath(actualXpath))).click();
       }

       public Boolean user_inDashboardpage() {
      	   if (driver.getCurrentUrl().contains("dashboard/index")) {
     		    System.out.println("On Dashboard Page");
     		}
      	   else {
     		  System.out.println("User not in Dashboard page");
        }
		   return false;
         
       }
       
       public void Recruitment_mod_click() {
      	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           wait.until(ExpectedConditions.visibilityOf(Recruitmentmod));
           Recruitmentmod.click();
        }
    
       public void Add_button_click() {
    	   Addbtn.click(); 
       }
 
       public void checkbox_click() {
    	   if (!checkboxbtn.isSelected()) {
       	    checkboxbtn.click();
       	}
       }
    
       public void save_clickbtn() {
    	   savebtn.click();
       }


	   public boolean isSuccessMessageDisplayed() {
		    try {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.visibilityOf(successMsg));
		        return successMsg.isDisplayed();
		    } catch (Exception e) {
		        return false;
		    }
		}

	   public void verify_isnamevisible() {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           wait.until(ExpectedConditions.visibilityOf(verifynamefld));
           
	   }  
    
	   public void check_username(String name)
	   {
			// TODO Auto-generated method stub
		     verifynamefld.sendKeys(name);
	   }
	   
	   public void candidatemod_click() {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		      wait.until(ExpectedConditions.visibilityOf(candidatemod));
			   candidatemod.click();
	   }

	   public void candidate_dtls(String fname, String lname, String vacancy, String email) {
	
		   
		// TODO Auto-generated method stub
		   firstnamefld.sendKeys(fname);
	    	// VACANCY FIELD: Two-step click logic
	           // 1. Click the main dropdown element to reveal the list
		   lastnamefld.sendKeys(lname);
	       vaccanydropdown.click();   
	           // 2. Select the specific option using the passed 'vacancy' text
	       selectVacancyOption(vacancy); 
	    	Emailfld.sendKeys(email);  
	   }
		     	 
	   
	   public void submit_click() {
		   submitbtn.click();
	   }
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }

