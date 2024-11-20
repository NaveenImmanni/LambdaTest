package Test1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.lambdatest.com/selenium-playground");
			
			WebElement drag = driver.findElement(By.xpath("(//a[@class='text-black text-size-14 hover:text-lambda-900 leading-relaxed'])[13]"));
	
	         drag.click();
	         
	         Thread.sleep(3000);
	         
	         WebElement drop = driver.findElement(By.xpath("(//input[@type='range'])[3]"));
	         
	         Actions btn= new Actions(driver);
	         
	         Thread.sleep(2000);
	         
	         btn.doubleClick(drop);
	         
	        
	         
	         
	         btn.moveByOffset(80, 0).perform();
	         
	        
	         
	         btn.release().perform();
	         
	        
	         
	         
	         
	         
	         
	
	}

}
