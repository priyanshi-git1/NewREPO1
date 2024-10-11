package New1;

import java.util.Iterator;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPUPHANDLING {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://demoqa.com/browser-windows");
        
        // Step1 - Tab Handling
        
        Thread.sleep(2000);
        driver.findElement(By.id("tabButton")).click();
        
        // Get the total number of tab/Windows
        Set<String> allWindowsId = driver.getWindowHandles();
        System.out.println(allWindowsId);
        Iterator<String> abc = allWindowsId.iterator();
        String Win1 = abc.next();
        String Win2 = abc.next();
        
        // Print the title of parent window
        
        driver.switchTo().window(Win1);
        System.out.println("ParentWindowID:" + Win1); // Alphanumeric ID of Parent Window
        System.out.println(driver.getTitle());
        
        //Print the current URL of Child tab
        
        Thread.sleep(2000);
        driver.switchTo().window(Win2);
        Thread.sleep(2000);
        System.out.println("ChildWindowID:" +Win2); // Alphanumeric ID of Child Window
        System.out.println(driver.getCurrentUrl()); // Current Url of Child tab
        driver.close();
        
        //Step2 - Windows/ Popup Handling
        
        Thread.sleep(2000);
        driver.switchTo().window(Win1);
        Thread.sleep(2000);
        driver.findElement(By.id("windowButton")).click();
        
        
        
        
        
        
        
	}

}
