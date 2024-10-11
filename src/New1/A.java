package New1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://designsystem.digital.gov/components/checkbox/");
		 driver.findElement(By.xpath("//label[@for='check-historical-truth']")).click();
		 driver.findElement(By.xpath("//label[@for='check-historical-douglass']")).click();
		 driver.findElement(By.xpath("//label[@for='check-historical-washington']")).click();
	}
	
	
	}


