package New1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {

	public static void main(String[] args) throws Exception {
		
//Alert Handling - Using javascriptExecutor
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/alerts");
        
        Thread.sleep(2000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("document.getElementById('confirmButton').click()");
        Thread.sleep(2000);
         
        //Accept the alert
        driver.switchTo().alert().accept();
        System.out.println("Alert Accepted");
        
        // Dismiss the alert 
        
        Thread.sleep(2000);
        jse.executeScript("document.getElementById('confirmButton').click()");
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        System.out.println("Alert Dimissed");
        
        
		
		
		
	}

}
