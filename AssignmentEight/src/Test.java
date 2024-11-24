import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		
		Thread.sleep(2000);
		List<WebElement> countryName = driver.findElements(By.className("ui-menu-item-wrapper"));
		
        for(int i = 0; i<countryName.size(); i++ ) {
        	
        	if(countryName.get(i).getText().equalsIgnoreCase("India")) {
        		System.out.println(countryName.get(i).getText());
        		
        		countryName.get(i).click();
        		
        	}
        	 
        }
		

	}

}