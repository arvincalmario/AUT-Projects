import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class FormPage {
	
	public void submitForm(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input#first-name")).sendKeys("Arvin");
		Thread.sleep(500);
		
		driver.findElement(By.cssSelector("input[placeholder='Enter last name']")).sendKeys("Almario");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@id=\"job-title\"]")).sendKeys("Test Engineer");
		Thread.sleep(500);
		
		driver.findElement(By.cssSelector("input#radio-button-1")).click();
		driver.findElement(By.xpath("//*[@id=\"radio-button-2\"]")).click();
		driver.findElement(By.cssSelector("input[value='radio-button-3']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.cssSelector("input#checkbox-1")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox-2\"]")).click();
		driver.findElement(By.cssSelector("input[value='checkbox-3']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.cssSelector("input#checkbox-2")).click();
		driver.findElement(By.cssSelector("#checkbox-3")).click();
		Thread.sleep(500);
		
		driver.findElement(By.cssSelector("select#select-menu")).click();
		driver.findElement(By.xpath("//*[@id=\"select-menu\"]/option[5]")).click();
		Thread.sleep(500);
		
		driver.findElement(By.cssSelector("input[placeholder='mm/dd/yyyy']")).sendKeys("01/01/2023");
		Thread.sleep(500);
		
		driver.findElement(By.cssSelector("input[placeholder='mm/dd/yyyy']")).sendKeys(Keys.RETURN);
		Thread.sleep(500);
		
		driver.findElement(By.xpath("/html/body/div/form/div")).click();
		Thread.sleep(500);
		
		driver.findElement(By.cssSelector("input#datepicker")).click();
		Thread.sleep(500);
		
		driver.findElement(By.cssSelector("th.next")).click();
		Thread.sleep(500);
		
		driver.findElement(By.cssSelector("td[data-date='1677283200000']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.cssSelector("a[class='btn btn-lg btn-primary']")).click();
		Thread.sleep(1000);

	}

}
