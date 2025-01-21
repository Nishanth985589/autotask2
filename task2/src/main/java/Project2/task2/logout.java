package Project2.task2;

import java.security.PublicKey;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class logout {
       WebDriver driver;
       public logout(WebDriver driver) {
       this.driver=driver;
       PageFactory.initElements(driver, this);
       }
       
       @FindBy(id="logout")
       WebElement logoutbtn;
       
       public void dologout()
       {
       logoutbtn.click();
       }}
