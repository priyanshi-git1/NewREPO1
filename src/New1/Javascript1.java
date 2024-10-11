  package New1;
    
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	  public class Javascript1{
	    

		public static void main(String[] args) throws Exception {
		//  System.setProperty("webdriver.chrome.driver", "E:\\Software\\SeleniumPrograms (2).zip\\projectselenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	        driver.get("https://www.facebook.com/");
	        
			// Javascript Executor
	        
	        JavascriptExecutor jse = (JavascriptExecutor) driver ; // Type casting- Narrowing(Manual Casting)
	        
	        //Locate Web element using Javascript
	        
	        jse.executeScript("document.getElementById('email').value='abc@gmail.com'");      
	        jse.executeScript("document.getElementById('pass').value='1234567'");
	        jse.executeScript("document.getElementsByName('login')[0].click();");  
	        
	        //Scroll down using Javascript
	        
	        Thread.sleep(3000);
	        jse.executeScript("window.scrollBy(0,500)"); // This 500 coordinate we take depending on page length for all 4 cases i.e here facebook page length
	        
	      //Scroll up using Javascript
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-500)" );
		
		//Scroll right using javascript
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(500,0);");
		
		//Scroll left using javascript
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(-500,0);");
		
		
		
		}
	}


