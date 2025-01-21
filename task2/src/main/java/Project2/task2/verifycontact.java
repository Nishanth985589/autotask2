package Project2.task2;

import java.security.PublicKey;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class verifycontact {
       WebDriver driver;
       public verifycontact(WebDriver driver) {
       this.driver=driver;
       PageFactory.initElements(driver, this);
       }
       
       @FindBy(className="contactTableBodyRow")
       WebElement contactid;
       
       public void verifycontact()
       {
       contactid.isDisplayed();
       }}
       
      
