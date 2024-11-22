import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

		driver.findElement(By.id("okayBtn")).click();

		WebElement item = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select selectedItem = new Select(item);
		selectedItem.selectByIndex(1);

		driver.findElement(By.id("terms")).click();

		driver.findElement(By.id("signInBtn")).click();

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(text(),'Add')]")));

		List<WebElement> products = driver.findElements(By.xpath("//button[contains(text(),'Add')]"));

		for (int i = 0; i < products.size(); i++) {
			products.get(i).click();
		}

		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();

	}

}
