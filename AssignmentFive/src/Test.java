import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		driver.switchTo().frame(0);
		
		driver.switchTo().frame(1);
		
	    System.out.println(driver.findElement(By.id("content")).getText());
	    
	    driver.switchTo().defaultContent();
	    driver.close();

	}

}