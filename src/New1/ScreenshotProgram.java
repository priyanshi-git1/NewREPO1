package New1;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotProgram {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
		driver.get("https://www.amazon.in/");
	File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(screenshot, new File("screenshot.png"));
	
	}
		catch (Exception e){
			e.printStackTrace();
		}
		finally {
			driver.quit();
		}
		}

}
