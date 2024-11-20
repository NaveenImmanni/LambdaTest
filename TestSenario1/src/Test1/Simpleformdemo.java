package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simpleformdemo {
	
	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.lambdatest.com/selenium-playground");
				
				WebElement simpleform = driver.findElement(By.xpath("(//a[@class='text-black text-size-14 hover:text-lambda-900 leading-relaxed'])[34]"));
				
				
				simpleform.click();
				
				String title = driver.getCurrentUrl();
				
				System.out.println(title);
				
				
				
				String message = "Welcome to LambdaTest";
				
				WebElement entermessage = driver.findElement(By.id("user-message"));
				
				entermessage.sendKeys(message);
				
				WebElement btn = driver.findElement(By.id("showInput"));
				
				btn.click();
	}
		
		
		
		
		
	

}
