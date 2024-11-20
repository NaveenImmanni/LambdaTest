package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputSub {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.lambdatest.com/selenium-playground/");
		
		WebElement inputsub = driver.findElement(By.xpath("(//a[@class='text-black text-size-14 hover:text-lambda-900 leading-relaxed'])[20]"));
	
	       inputsub.click();
	       
	       WebElement btn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	       
	       btn.click();
	       
	      
	       
	       WebElement nameField = driver.findElement(By.id("name"));
	       nameField.sendKeys("John Doe");
           WebElement emailField = driver.findElement(By.id("inputEmail4"));
           emailField.sendKeys("john.doe@example.com");
           WebElement password = driver.findElement(By.name("password"));
           password.sendKeys("1234567890");
           WebElement messageField = driver.findElement(By.id("company"));
           messageField.sendKeys("This is a test message.");
           WebElement Website = driver.findElement(By.id("websitename"));
           Website.sendKeys("uysfuygf.com");
           WebElement country = driver.findElement(By.name("country"));
           country.click();
           
           

           Select s = new Select(country);
           Thread.sleep(2000);
         
          s.selectByVisibleText("United States");
        
          WebElement city = driver.findElement(By.id("inputCity"));
          city.sendKeys("chagallu");
         
          WebElement ad1 = driver.findElement(By.id("inputAddress1"));
          ad1.sendKeys("Nelaturu");
          WebElement ad2 = driver.findElement(By.id("inputAddress2"));
          ad2.sendKeys("village");
          WebElement state = driver.findElement(By.id("inputState"));
          state.sendKeys("AP");
          WebElement pincode = driver.findElement(By.name("zip"));
          pincode.sendKeys("5463746");
           
          
          WebElement btn1 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	       
	       btn1.click();
           

           
	       
	       
	    }
	}
		
		
	


