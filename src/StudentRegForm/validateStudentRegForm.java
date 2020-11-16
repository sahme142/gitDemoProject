package StudentRegForm;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class validateStudentRegForm {
	
	ChromeOptions options;
	WebDriver driver;
	
	
	
	@BeforeTest
	public void preRequsite() {
		
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\samad\\Desktop\\seluniam and chrome library\\chromedriver.exe");	
    
    options=new ChromeOptions();
    options.addArguments("headless");
    
    
	driver=new ChromeDriver(options);	
	
	driver.get("https://www.jotform.com/form-templates/class-registration-3");
	String a=driver.getTitle();
	System.out.println(a);
	
		
		
	
	
	}
	
	
	
	
@Test
public void middlename() {
	driver.findElement(By.xpath("//*[@id=\"first_4\"]")).sendKeys("samasS");
		
		Set<String>windowIds=driver.getWindowHandles();
		Iterator<String>iter=windowIds.iterator();	
		
		        String mainWindow=iter.next();		
		        String childWindow=iter.next();
				driver.switchTo().window(childWindow);	

	
	
	}
	
	
	
	
}

