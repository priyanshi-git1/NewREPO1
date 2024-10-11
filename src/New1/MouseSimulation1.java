package New1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws Exception   {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com/big-billion-day-store?param=2793&s_kwcid=AL!739!3!676201929245!b!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gad_source=1&gclid=Cj0KCQjwjNS3BhChARIsAOxBM6piJgwwNcBBm-KGheBOZwUq5DR7WPaQfnbc-sJMvJjIbxqoiHr-1OcaAuLjEALw_wcB");
        
        // Create Electronics WebElement Reference
        
        WebElement Electronics = driver.findElement(By.xpath("//*[text()='Electronics']")); // For mouse hovering on any text we use text function in Xpath
       
        // Mouse Simulation using Actions class
        
        Actions act = new Actions(driver); // Type casting- Manual casting 
        
        // Mouse hover to Electronics
        Thread.sleep(3000);
        act.moveToElement(Electronics).build().perform();
        
        //keyboard operations
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        WebElement Men = driver.findElement(By.xpath("//*[text()='Men']"));
        Thread.sleep(3000);
        act.sendKeys(Men, Keys.ENTER).build().perform();
        System.out.println("Men Option clicked");
        
        //Right click on web page
        
        Thread.sleep(3000);
       // act.contextClick(Electronics); // right click on particular web element
        act.contextClick().build().perform();

        

        
		

	}

}
