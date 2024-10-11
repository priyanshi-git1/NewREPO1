package New1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 
	
		 // To click on create new account button on fb login page
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		 
		 //1st way to handle Radio button
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@value='1']")).click(); // Female- differentiate acc. to value (taking xpath of Female Radio button)
		 driver.findElement(By.xpath("//input[@value='2']")).click(); //Male - differentiate acc. to value (taking xpath of Male Radio button)
		 driver.findElement(By.xpath("//input[@value='-1']")).click(); //Custom -differentiate acc. to value (taking xpath of Custom Radio button)
		 
		 //2nd way to handle Radio Button- by creating a list  of three diff. radio buttons by using their radio buttons
		 Thread.sleep(2000);
		 List<WebElement> radios =  driver.findElements(By.xpath("//input[@type='radio']"));
		 System.out.println("Total Radio Buttons: " +radios.size());// size is a function which returns the number of elements in a list.
		 System.out.println(radios.get(0).isSelected()); //this 0 is the index value in which 'Female'element is stored so, it will shows output false as per 
		                                                 // previous code custom index is selected.
		 System.out.println(radios.get(1).isEnabled());// 1 index is associated with Male and it is enabled so output will be true
		 System.out.println(radios.get(2).isDisplayed()); // 2nd index is associated with  custom and it is displayed so output will be true
		Thread.sleep(2000);
		radios.get(1).click(); // to click on Male radio button or select male radio button
		 System.out.println(radios.get(2).isSelected()); // output is false as now currently male element is selected as per previous code
		 
		// 3rd way to handle Radio Button by creating list by using text field and it is correct approach to handle radio button
		 List<WebElement> radiosText = driver.findElements(By.xpath("//label[@class='_58mt']"));
		 System.out.println("\"Total Radio Button Text:"+radiosText.size());
		 String expresult= "Custom" ; // Here, that radio button which we want to click we store that radio button into string data type
		 for(int i =0; i<radiosText.size(); i++) {
			 if(radiosText.get(i).getText().equalsIgnoreCase(expresult))// here we compare the text with the expresult
				 {
				// radios.get(i).click();// here we need to click with the help of radio button
				 radiosText.get(i).click();// here we need to click with the help of text field
				 System.out.println(expresult + "  Clicked");
				 break;
			 }
		 }

	}

}
