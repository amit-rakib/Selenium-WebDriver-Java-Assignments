
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	     WebElement table =	driver.findElement(By.id("product"));
	     int totalTr = table.findElements(By.tagName("tr")).size();
	     System.out.println(totalTr);
	     
	     int totalTh = table.findElements(By.tagName("th")).size();
	     System.out.println(totalTh);
	     
	   String text =  table.findElement(By.xpath("(//tr)[3]")).getText();
	   System.out.println(text);
	}

}
