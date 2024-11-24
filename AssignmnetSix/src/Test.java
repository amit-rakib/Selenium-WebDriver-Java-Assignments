import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Test {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("#checkBoxOption2")).click();
		String label = driver.findElement(By.cssSelector("label[for='benz']")).getText();
		System.out.println(label);
		
        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
        Select drop = new Select(dropdown);
        
        drop.selectByVisibleText(label);
        
        driver.findElement(By.id("name")).sendKeys(label);
        driver.findElement(By.id("alertbtn")).click();
        
        Alert alert = driver.switchTo().alert();
        
        String alertText = alert.getText();
        
        if(alertText.contains(label)) {
        	System.out.println(label+" is presnt in alert text");
        }else {
        	System.out.println("Not present");
        }
        
        alert.accept();
        
        driver.switchTo().defaultContent();
        driver.close();
        
        
	}

}
