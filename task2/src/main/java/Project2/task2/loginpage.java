package Project2.task2;

import java.security.PublicKey;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class loginpage {
       WebDriver driver;
       public loginpage(WebDriver driver) {
       this.driver=driver;
       PageFactory.initElements(driver, this);
       }
       
       @FindBy(id="email")
       WebElement email;
       @FindBy(id="password")
       WebElement password;
       @FindBy(id="submit")
       WebElement submitbtn;
       
       public void dologin (String Email, String Password)
       {
       email.sendKeys(Email);
       password.sendKeys(Password);
       submitbtn.click();
       }}
       
   