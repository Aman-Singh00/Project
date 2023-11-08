package Script;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.className("Pke_EE")).sendKeys("iphone", Keys.ENTER);

		//List<WebElement> mobileName = driver.findElements(By.xpath("//div[contains(@class,'rR')]"));
		//List<WebElement> mobile_price = driver.findElements(By.xpath("//div[contains(@class,'jeq')]"));
//
////		for(WebElement mobile:mobileName)
////		{
////			System.out.println(mobile.getText());
////		}
//
//		for (int i = 0; i < mobileName.size(); i++) {
//
//			System.out.println(mobileName.get(i).getText() + "============>" + mobile_price.get(i).getText());
//
//		}

		driver.quit();

	}

}
