package Script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMobileprice {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.className("Pke_EE")).sendKeys("iphone", Keys.ENTER);

		
		String price = driver
				.findElement(By
						.xpath("//div[text()='APPLE iPhone 14 (Midnight, 128 GB)']/../..//div[contains(@class,'jeq')]"))
				.getText();

		System.out.println(price);
		
		String result = driver.findElement(By.xpath("//span[contains(@class,'Ermr')]")).getText();
		System.out.println(result);
	}

}
