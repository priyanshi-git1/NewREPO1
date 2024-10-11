package New1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) throws Exception {
		{
		//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]")).click();
			
			 Thread.sleep(2000);
			 // 1st way to select drop down element by creating list
			 
			 List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='year']/option"));
			 System.out.println("Total dropdown values "  +  birthMonth.size());
			 birthMonth.get(8).click(); //Output- Sep (Get function always require index so getting output sep because indexing starts from 0)
			 
			
			 // 2nd Way to select drop down element by using Select class
			 
			/*WebElement bn = driver.findElement(By.xpath("//select[@id='month']")); // It is a whole suit case
			Select Month = new Select(bn); // Here Month is the reference variable of Select Class and bn is the reference variable of WebElement which is an
			                               // interface and here we are dealing with parameterized constructor as we are passing bn as a parameter
			/* Thread.sleep(2000);
			 Month.selectByVisibleText("Apr"); // Output - Apr
			 Thread.sleep(2000);
			 Month.selectByValue("12"); // This value is taken by inspecting  drop down method and took value attribute from there- Output Dec
			 Thread.sleep(2000);
			 Month.selectByIndex(7);// output-Aug because indexing starts from 0
			 System.out.println(Month.getFirstSelectedOption().getText()); // Output Aug- It will  Print the current selected value */
			 
			 //3rd Way to select drop down by using Select class
		
			 // List<WebElement> dropdown = Month.getOptions(); // This will also use if we do not want to create a new reference of WebElement interface
			/* Select Month1 = new Select(bn);
			 List<WebElement> dropdown = Month1.getOptions(); // here getOptions is function which will always  return all the set of values from drop down list.
			 System.out.println(dropdown.size());
			 for(int i=0; i<dropdown.size();i++)
			 {
				 if(dropdown.get(i).getText().equalsIgnoreCase("Dec")) {
					 dropdown.get(i).click();
				 }
			 }/*
			 
			/* // 4th way
			 Thread.sleep(2000);
				WebElement bn1 = driver.findElement(By.xpath("//select[@id='year']"));
				bn1.sendKeys("Jun"); //Sendkeys method is used to send the desired text or keystrokes to the element.This method is used to simulate typing 
				                     // into a web element.
				
				// 5th way 
				Thread.sleep(2000);
				driver.findElement(By.id("month")).sendKeys("Mar");
				
				// Check if drop down is selecting multiple elements i.e for eg in fb page we have dropdown in dob field , so to check multiple dob are 
				// selected or not
				System.out.println(Month.isMultiple()); // This will give output in Boolean i.e. in true or false it means if the output is true it will
				                                        // select multiple elements in drop down.So, here we get output as false
				
				// But now, let's assume that in any drop down multiselection of elements is allowed like in naukri profile select preferred location we can
				// select multiple elements. So, the code is:
				// We can use any one or two methods from these, to select multiple elements
				Month.selectByVisibleText("Apr"); // Output - Apr
				Month.selectByValue("12"); // This value is taken by inspecting  drop down method and took value attribute from there- Output Dec
				Month.selectByIndex(7);// output-Aug because indexing starts from 0 

				// Deselect the multi selected values from drop down- But this will throw an Exception as here there is no multiselected elements 
				Month.deselectByIndex(7); // Output- Deselected: 7
				Month.deselectByValue("12"); //Output- Deselected: 12
				Month.deselectByVisibleText("Apr");//Output- Deselected: Apr
				Month.deselectAll(); // To deselect all selected elements together*/
		}

	}

	}


