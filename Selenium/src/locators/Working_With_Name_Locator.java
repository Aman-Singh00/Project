package locators;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Name_Locator {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions act = new Actions(driver);
		act.contextClick().perform();
		
		Robot r = new Robot();
		for (int i = 0; i < 10; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		
	
		
		

	}

}
