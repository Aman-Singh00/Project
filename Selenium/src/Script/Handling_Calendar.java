package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Calendar {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");

		driver.switchTo().frame(0);

		driver.findElement(By.id("datepicker")).click();

		while (true) {
			String month = driver.findElement(By.className("ui-datepicker-month")).getText();
			String year = driver.findElement(By.className("ui-datepicker-year")).getText();

			if (month.equals("November") && year.equals("2000")) {
				driver.findElement(By.xpath("//a[text()='15']")).click();
				break;
			} else {
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			}

		}
	}

}
