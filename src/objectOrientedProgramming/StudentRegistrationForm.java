package objectOrientedProgramming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StudentRegistrationForm {
	
	WebDriver driver;
	public StudentRegistrationForm(WebDriver driver) {
		
		this.driver=driver;
		}
	
	public WebElement validateFirstname() {
		
		WebElement firstname=driver.findElement(By.xpath("//*[@id=\"first_4\"]"));
		return firstname;
		
	}
	
	
       public WebElement validatemiddlename() {
		
		WebElement middlename=driver.findElement(By.xpath("//*[@id=\"middle_4\"]"));
		return middlename;
		
	}
       
       
       public WebElement validatelastname() {
   		
   		WebElement lastname=driver.findElement(By.xpath("//*[@id=\"last_4\"]"));
   		return lastname;
   		
   	} 
       
       
       
       public WebElement validateemail() {
   		
   		WebElement email=driver.findElement(By.xpath("//*[@id=\"input_6\"]"));
   		return email;
   		
   	} 
       
       public WebElement validatecoursedropdown() {
      		
      		WebElement coursedropdown=driver.findElement(By.xpath("//*[@id=\"input_46\"]"));
      		return coursedropdown;
      		
      	}  
       
       public WebElement validatesubmitbutton() {
     		
     		WebElement submitbutton=driver.findElement(By.linkText(""));
     		return submitbutton;
     		
     	} 
       
	

}
