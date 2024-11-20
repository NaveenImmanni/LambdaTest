package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputSub {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.lambdatest.com/selenium-playground/");
		
		WebElement inputsub = driver.findElement(By.xpath("(//a[@class='text-black text-size-14 hover:text-lambda-900 leading-relaxed'])[20]"));
	
	       inputsub.click();
	       
	       WebElement btn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	       
	       btn.click();
	       
	       WebDriverWait wait = new WebDriverWait(driver, 10);
           wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@required]")));

	       
	       
	    }
	}
		
		
	


