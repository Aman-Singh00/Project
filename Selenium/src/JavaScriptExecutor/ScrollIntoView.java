package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/india");

		WebElement australia = driver.findElement(By.xpath("//h5[text()='Australia']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", australia);// if true webelements will show top of the
																			// webpage
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false);", australia);// if false webelements will show bottam of
																			// the webpage
	}

}
