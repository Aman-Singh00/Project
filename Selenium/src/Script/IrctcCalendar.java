package Script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IrctcCalendar {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.irctc.co.in/nget/train-search");

		driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("NDLS", Keys.ARROW_DOWN, Keys.ENTER);

		driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("SBC", Keys.ARROW_DOWN, Keys.ENTER);
		driver.findElement(By.className("ui-calendar")).click();
		while (true) {
			String month = driver.findElement(By.className("ui-datepicker-month")).getText();
			String year = driver.findElement(By.className("ui-datepicker-year")).getText();
			if (month.equals("January") && year.equals("2024")) {
				driver.findElement(By.xpath("//a[text()='15']")).click();
				Thread.sleep(2000);
				break;
			} else {
				driver.findElement(By.className("ui-datepicker-next-icon")).click();
			}

		}

		WebElement dropdown = driver.findElement(By.className("ui-dropdown-trigger"));
		dropdown.click();
		driver.findElement(By.xpath("//span[text()='Sleeper (SL)']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[@class='ng-star-inserted'])[1]")).click();

		String msg = driver.findElement(By.className("ui-confirmdialog-message")).getText();
		System.out.println(msg);
		driver.findElement(By.xpath("//span[text()='OK']")).click();

		driver.findElement(By.xpath("//button[text()='Search']")).click();
		//driver.quit();
	}

}
