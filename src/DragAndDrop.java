import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public void dragimage(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement image = driver.findElement(By.xpath("//*[@id=\"image\"]/img"));
		
		WebElement box = driver.findElement(By.xpath("//*[@id=\"box\"]"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(image,box).build().perform();
		Thread.sleep(1000);
	}
	
}
