package Project2.task2;

import java.security.PublicKey;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class webpage {
	   WebDriver driver;
	   public webpage(WebDriver driver ) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	   }
       
	   public void launchurl(String url) {
	   driver.get(url);
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	   }}
	   

