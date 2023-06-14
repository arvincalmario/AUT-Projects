import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ScrollPage {

	public void scroll(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.id("name"));
		Actions actions = new Actions(driver);
		
		actions.moveToElement(name);
		Thread.sleep(1000);
		name.sendKeys("test dummy");
		Thread.sleep(1000);
		
		WebElement date = driver.findElement(By.id("date"));
		date.sendKeys("01/01/2001");
		Thread.sleep(1000);
	}
}
