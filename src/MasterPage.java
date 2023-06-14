import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MasterPage {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//NAVIGATE TO FORMS PAGE
		driver.findElement(By.cssSelector("a[href='/form']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe("https://formy-project.herokuapp.com/form")); 

		FormPage formPage = new FormPage();
		formPage.submitForm(driver);

		//NAVIGATE BACK TO HOME PAGE
		driver.findElement(By.cssSelector("a#logo")).click();
		//wait.until(ExpectedConditions.urlToBe("https://formy-project.herokuapp.com"));
				
		//SCROLL THROUGH PAGE
		driver.findElement(By.xpath("/html/body/div/div/li[11]/a")).click();
		wait.until(ExpectedConditions.urlToBe("https://formy-project.herokuapp.com/scroll"));
		
		ScrollPage scrollPage = new ScrollPage();
		scrollPage.scroll(driver);
		
		//NAVIGATE BACK TO HOME PAGE
		driver.findElement(By.cssSelector("a#logo")).click();
		
		//NAVIGATE TO DRAG AND DROP
		driver.findElement(By.xpath("/html/body/div/div/li[5]/a")).click();
		wait.until(ExpectedConditions.urlToBe("https://formy-project.herokuapp.com/dragdrop"));
		

		DragAndDrop dragAndDrop = new DragAndDrop();
		dragAndDrop.dragimage(driver);
		
		//NAVIGATE BACK TO HOME PAGE
		driver.findElement(By.cssSelector("a#logo")).click();
		
		Thread.sleep(1000);
		driver.quit();

	}

}
