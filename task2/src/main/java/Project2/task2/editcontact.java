package Project2.task2;

import java.security.PublicKey;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class editcontact {
      WebDriver driver;
      public editcontact(WebDriver driver) {
      this.driver=driver;
      PageFactory.initElements(driver, this);
      }
      @FindBy(className="contactTable-Body")
      WebElement contact;
      @FindBy(id="edit-contact")
      WebElement editbtn;
      @FindBy(id="firstName")
      WebElement editfname;
      @FindBy(id="email")
      WebElement editEmail;
      @FindBy(id="phone")
      WebElement editphone;
      @FindBy(id="city")
      WebElement city;
      @FindBy(id="submit")
      WebElement submitbtn;
      @FindBy(id="return")
      WebElement returnbtn;
      
      
      public void editcontact(String EditFname, String EditEMail, String Editphone)
      {
      contact.click();
      editbtn.click();
      editfname.clear();
      editfname.sendKeys(EditFname);
      editEmail.clear();
      editEmail.sendKeys(EditEMail);
      editphone.clear();
      editphone.sendKeys(Editphone);
      city.clear();
      submitbtn.click();
      returnbtn.click();
      }}
      
   