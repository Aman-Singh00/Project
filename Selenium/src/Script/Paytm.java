package Script;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[contains(text(),'Flight')])[1]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Delhi']")).click();
		driver.findElement(By.xpath("//img[contains(@class,'Wp')]")).click();
		driver.findElement(By.id("text-box")).sendKeys("IXC");
		
		driver.findElement(By.xpath("//span[text()='BLR']")).click();
		driver.findElement(By.xpath("//img[contains(@class,'Wp')]")).click();
		driver.findElement(By.id("text-box")).sendKeys("BLR");
		
		
		driver.findElement(By.xpath("//div[contains(@class,'SrH')]//div/div/div//div[text()='IXC']")).click();
		driver.findElement(By.id("flightSearch")).click();

		List<WebElement> flight_list = driver.findElements(By.xpath("//div[contains(@class,'kpV')]"));
		List<WebElement> flightName = driver.findElements(By.xpath("//span[contains(@class,'cP')]"));
		List<WebElement> flightPrice = driver.findElements(By.xpath("//div[contains(@class,'Mk')]"));

		System.out.println(flight_list.size());

//		for(WebElement list:flight_list)
//		{
//			System.out.println(list.getText());
//			System.out.println("*******************************************");	
//		}

//		for (int i = 0; i < flight_list.size(); i++) {
//			
//			System.out.println(flight_list.get(i).getText());
//			System.out.println("*************************************");
//			
//			
//		}

		for (int i = 0; i < flight_list.size(); i++) {
			
			System.out.println(flightName.get(i).getText());
			System.out.println(flightPrice.get(i).getText());
			System.out.println("============***********************************======================");

		}

		driver.quit();

	}

}
