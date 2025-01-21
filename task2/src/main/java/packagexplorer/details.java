package packagexplorer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Project2.task2.addcontact;
import Project2.task2.deletecontact;
import Project2.task2.editcontact;
import Project2.task2.loginpage;
import Project2.task2.logout;
import Project2.task2.signup;
import Project2.task2.verifycontact;
import Project2.task2.webpage;

public class details {

	   WebDriver driver = new ChromeDriver();
	   webpage launchurl = new webpage(driver);
	   signup  Signup    = new signup(driver);
	   loginpage Login = new loginpage(driver);
	   addcontact Addcontact = new addcontact(driver);
	   verifycontact Contact = new verifycontact(driver);
	   editcontact Editcontact = new editcontact(driver);
	   deletecontact delete = new deletecontact(driver);
	   logout Logout = new logout(driver);
	   
	   @Test(priority=0)
	   public void runsignin() {
	   launchurl.launchurl("https://thinking-tester-contact-list.herokuapp.com/");
	   Signup.dosignin("Nishu", "anth", "abcdhnm@gmail.com", "abcderd");
	   Logout.dologout();
	   }
	   
	   @Test(priority=1)
	   public void runlogin() {
	   launchurl.launchurl("https://thinking-tester-contact-list.herokuapp.com/");
	   Login.dologin("abcdhnm@gmail.com", "abcderd");
	   }
       
	   @Test(priority=2)
       public void addcontact() {
	   launchurl.launchurl("https://thinking-tester-contact-list.herokuapp.com/");
	   Login.dologin("abcdhnm@gmail.com", "abcderd");
	   Addcontact.Addcontact("Nisha", "nth", "1998-06-09", "abcd@gmail.com", "80506487889", "Anna nagar", "7th street", "Chennai", "Tamilnadu", "603204", "India");
	   }
       
	   @Test(priority=3)
	   public void addcontacts() {
	   launchurl.launchurl("https://thinking-tester-contact-list.herokuapp.com/");
	   Login.dologin("abcdhnm@gmail.com", "abcderd");
	   Addcontact.addcontact1("1997-05-09", "adcr@gmail.com", "6589785896", "Anna square", "11th street", "Chennai", "Tamilnadu", "658981", "India");
	   }

	   @Test(priority=4)
	   public void Addcontacts() {
	   launchurl.launchurl("https://thinking-tester-contact-list.herokuapp.com/");
	   Login.dologin("abcdhnm@gmail.com", "abcderd");
	   Addcontact.addcontact2("moni", "sha", "1997-08-06", "qwer@gmail.com", "8976541589", "Anna square", "11th strert", "chennai", "Tamilnadu", "603204", "India");
	   }
	   
	   @Test(priority=5)
	   public void verifycontact() {
	   launchurl.launchurl("https://thinking-tester-contact-list.herokuapp.com/");
	   Login.dologin("abcdhnm@gmail.com", "abcderd");
	   Contact.verifycontact();
	   }
	   
	   @Test(priority=6)
	   public void editcontact() {
	   launchurl.launchurl("https://thinking-tester-contact-list.herokuapp.com/");
	   Login.dologin("abcdhnm@gmail.com", "abcderd");
	   Editcontact.editcontact("Kheerthi", "kheerthi@gmail.com", "8787898585");
	   }
	   
	   @Test(priority=7)
	   public void delete() {
	   launchurl.launchurl("https://thinking-tester-contact-list.herokuapp.com/");
	   Login.dologin("abcdhnm@gmail.com", "abcderd");
	   delete.contactdelete();
	   }
	   
	   @Test(priority=8)
	   public void logout() {
	   launchurl.launchurl("https://thinking-tester-contact-list.herokuapp.com/");
	   Login.dologin("abcdhnm@gmail.com", "abcderd");
	   Logout.dologout();
	   }
}
		   
	   