package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Asignment {
    public static void main(String[] args) {
		
       System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
	  
       ChromeOptions options=new ChromeOptions();
	   options.addArguments("--remote-allow-origins=*");
       
       WebDriver driver=new ChromeDriver(options);
	   driver.get("http://uitestingplayground.com/");
	   driver.manage().window().maximize();
	 	
       driver.findElement(By.xpath("//a[contains(text(),'Click')]")).click();
    	
       driver.navigate().back();
       
       driver.findElement(By.xpath("//a[contains(text(),'Text Input')]")).click();
    	
	   driver.findElement(By.xpath("//input[@id=\"newButtonName\"]")).sendKeys("welcome to assignment");
	   
	   WebElement button=driver.findElement(By.xpath("//button[@id='updatingButton']"));
	   
	   Actions act=new Actions(driver);
	   act.moveToElement(button).click().build().perform();
	  
	   String text=button.getText();
	   if(text.equalsIgnoreCase("welcome to assignment")) {
		   System.out.println("Element is clickble");
	   }
	   else {
		   System.out.println("Element is not clickable");
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	}
}
