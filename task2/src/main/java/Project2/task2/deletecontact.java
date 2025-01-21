package Project2.task2;

import java.security.PublicKey;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class deletecontact {
	
	   WebDriver driver;
	   public deletecontact(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	   }
       
	   @FindBy(className="contactTable-Body")
	   WebElement contact;
	   @FindBy(id="delete")
	   WebElement deletebtn;
	   @FindBy(className="contactTableBodyRow")
	   WebElement contact1;
	   
	   public void contactdelete()
	   {
	   contact.click();
	   deletebtn.click();
	   contact1.isDisplayed();
	   }}
	   
	

