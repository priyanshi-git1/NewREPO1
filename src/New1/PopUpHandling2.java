package New1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling2 {
 
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/browser-windows");
        
        // Tab Handling by using Javascript 
        Thread.sleep(2000);
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        jse.executeScript("document.getElementById('tabButton').click()");
        
        //Get the total number of open tabs/windows
        Set<String> allWindowsId = driver.getWindowHandles();
        System.out.println(allWindowsId);
        Iterator<String> abc = allWindowsId.iterator();
        String win1 = abc.next();
        String win2 = abc.next();
        
        // Print the title of parent window
        
       driver.switchTo().window(win1);
       System.out.println("Parentwindowid:"+ win1); // Alphanumeric id of parent window
       System.out.println(driver.getTitle());
       
       //Print the current URL of Child tab
       
       Thread.sleep(2000);
       driver.switchTo().window(win2);
       Thread.sleep(2000);
       System.out.println("Child Window Id"+ win2); //Alphanumeric id of child window
       System.out.println(driver.getCurrentUrl());  // current url of child window
       driver.close();

       // Step2- Windows/ Pop up handling by using javascript
       
       Thread.sleep(2000);
       driver.switchTo().window(win1);
       Thread.sleep(2000);
       jse.executeScript("document.getElementById('windowButton').click()");
       
       //Print the title of Child Window
       
       Set<String> allWindowsId2 = driver.getWindowHandles();
       System.out.println(allWindowsId2);
       Iterator<String> abc1 = allWindowsId2.iterator();
       String win3 = abc1.next();
       String win4 = abc1.next();
      Thread.sleep(2000);
      driver.switchTo().window(win4);
      Thread.sleep(2000);
      System.out.println("ChildWindowId:" + win4); //Alphanumeric Id of child window
      System.out.println(driver.getTitle());  // Get title of Child window
      System.out.println(driver.getCurrentUrl()); // Get current url of child tab
      
      Thread.sleep(2000);
      driver.quit(); // close parent window as well as all associated window
      System.out.println("Windows popup and tab handled");
      
      
      
      
       
       
        

        

	}

}
