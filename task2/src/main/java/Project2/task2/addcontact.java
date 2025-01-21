package Project2.task2;

import java.security.PublicKey;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class addcontact {
       WebDriver driver;
       public addcontact(WebDriver driver) {
       this.driver=driver;
       PageFactory.initElements(driver, this);
       }
       
       @FindBy(id="add-contact")
       WebElement addcontact;
       @FindBy(id="firstName")
       WebElement FName1;
       @FindBy(id="lastName")
       WebElement Lname1;
       @FindBy(id="birthdate")
       WebElement dob1;
       @FindBy(id="email")
       WebElement Email1;
       @FindBy(id="phone")
       WebElement phone1;
       @FindBy(id="street1")
       WebElement street1;
       @FindBy(id="street2")
       WebElement street2;
       @FindBy(id="city")
       WebElement city;
       @FindBy(id="stateProvince")
       WebElement State;
       @FindBy(id="postalCode")
       WebElement pin;
       @FindBy(id="country")
       WebElement country;
       @FindBy(id="submit")
       WebElement submitbtn;
       
       public void Addcontact(String Fname2, String Lname2, String DOB1, String Email2, String Phone1, String Street1, String Street2, String City1, String State1, String Pin1, String Country1)      
       {
       addcontact.click();
       FName1.sendKeys(Fname2);
       Lname1.sendKeys(Lname2);
       dob1.sendKeys(DOB1);
       Email1.sendKeys(Email2);
       phone1.sendKeys(Phone1);
       street1.sendKeys(Street1);
       street2.sendKeys(Street2);
       city.sendKeys(City1);
       State.sendKeys(State1);
       pin.sendKeys(Pin1);
       country.sendKeys(Country1);
       submitbtn.click();
       }
       
       public void addcontact1(String DOB1, String Email2, String Phone1, String Street1, String Street2, String City1, String State1, String Pin1, String Country1)      
       {      
       addcontact.click();
       dob1.sendKeys(DOB1);
       Email1.sendKeys(Email2);
       phone1.sendKeys(Phone1);
       street1.sendKeys(Street1);
       street2.sendKeys(Street2);
       city.sendKeys(City1);
       State.sendKeys(State1);
       pin.sendKeys(Pin1);
       country.sendKeys(Country1);
       submitbtn.click();
       }
       public void addcontact2(String Fname2, String Lname2, String DOB1, String Email2, String Phone1, String Street1, String Street2, String City1, String State1, String Pin1, String Country1)      
       {
       addcontact.click();
       FName1.sendKeys(Fname2);
       Lname1.sendKeys(Lname2);
       dob1.sendKeys(DOB1);
       Email1.sendKeys(Email2);
       phone1.sendKeys(Phone1);
       street1.sendKeys(Street1);
       street2.sendKeys(Street2);
       city.sendKeys(City1);
       State.sendKeys(State1);
       pin.sendKeys(Pin1);
       country.sendKeys(Country1);
       submitbtn.click();
}}
