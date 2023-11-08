package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickAndHold {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		WebElement a = driver.findElement(By.xpath("//li[text()='A']"));
		WebElement b = driver.findElement(By.xpath("//li[text()='B']"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(a).perform();
		Thread.sleep(2000);
		act.moveToElement(b).perform();
		Thread.sleep(2000);
		act.release().perform();
		
	}

}
