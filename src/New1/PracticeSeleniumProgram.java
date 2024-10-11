package New1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSeleniumProgram {

	public static void main(String[] args) {
		
		
		        WebDriver driver = new ChromeDriver();  // Initialize WebDriver (adjust for your setup)

		        // Open Flipkart website
		        driver.get("https://www.flipkart.com");

		        // Close the login popup if present
		        try {
		            WebElement closeButton = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
		            closeButton.click();
		        } catch (Exception e) {
		            // Popup not present, continue
		        }

		        // Hover over the "Women" dropdown
		        WebElement womenDropdown = driver.findElement(By.xpath("//span[text()='Women']"));
		        womenDropdown.click();  // If hover is required, you might need to use Actions class in Selenium

		        // Select the "Ethnic Wear" option
		        WebElement ethnicWearOption = driver.findElement(By.xpath("//span[text()='Women']/following::a[text()='Ethnic Wear']"));
		        ethnicWearOption.click();
		    }
		


	}


