package New1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://paytm.com/");
        driver.findElement(By.xpath("//*[text() = 'Sign In']")).click();
        Thread.sleep(5000);
        
        // Find the total number of frames Present 
        
       int allFrames = driver.findElements(By.tagName("iframe")).size();
       System.out.println("Total frames:" +allFrames);
       
       //Check if the element is present or not
       
       for(int i =0; i<allFrames;i++) {
    	   driver.switchTo().frame(i);
    	   driver.switchTo().frame(i);
    	   String expText= "Open Paytm App";
    	   
    	   String abc = driver.findElement(By.xpath("//*[text()= 'Open Paytm App']")).getText();
          if(abc.equalsIgnoreCase(expText)) {
	     System.out.println("Element Found");
	
}     
        else {
	    System.out.println("Element not found");
} 
       }

	}

}
