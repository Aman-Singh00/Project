package Script;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class demoWebshop_StaleWebElement {
	
	
	@Test
	public void demo() throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("BOOKS")).click();

		WebElement dropdown = driver.findElement(By.id("products-orderby"));
		dropdown.click();

		Select s = new Select(dropdown);
		List<WebElement> option = s.getOptions();

		System.out.println(option.size());
		for (int i = 0; i < option.size(); i++) {

			WebElement dropdown1 = driver.findElement(By.id("products-orderby"));
			Select s1 = new Select(dropdown1);
			s.selectByIndex(i);
			Thread.sleep(2000);
		}

		driver.quit();

	}

}
