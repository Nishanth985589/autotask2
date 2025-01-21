package Project2.task2;

import java.security.PublicKey;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signup {
     WebDriver driver;
     public signup(WebDriver driver ) {
     this.driver=driver;
     PageFactory.initElements(driver, this);
     }
     
     @FindBy(id="signup")
     WebElement signupbtn;
     @FindBy(id="firstName")
     WebElement firstname;
     @FindBy(id="lastName")
     WebElement lastname;
     @FindBy(id="email")
     WebElement email;
     @FindBy(id="password")
     WebElement password;
     @FindBy(id="submit")
     WebElement submit;
     
     
     public void dosignin(String Firstname, String Lastname, String Email, String Password)
     {
     signupbtn.click();
     firstname.sendKeys(Firstname);
     lastname.sendKeys(Lastname);
     email.sendKeys(Email);
     password.sendKeys(Password);
     submit.click();
     }} 
     
     
     
     
    	 
    	 	
	
