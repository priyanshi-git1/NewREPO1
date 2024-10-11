package New1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation3 {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/draggable/");
        
        // Switch to Frame
        driver.switchTo().frame(0);
        
        
        // Draggable Web Element
        
        WebElement  drag = driver.findElement(By.xpath("//*[@id = 'draggable']"));
        
        //Drag and Drop using Actions class
        Thread.sleep(2000);
        Actions act = new Actions(driver);
        act.dragAndDropBy(drag, 100, 60).build().perform();
        
	}

}
