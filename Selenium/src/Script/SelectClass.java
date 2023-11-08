package Script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='ide']"));
		//WebElement dropdown = driver.findElement(By.xpath("//select[@id='course']"));
		
		Select s = new Select(dropdown);
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(3);
		
//		List<WebElement> option = s.getAllSelectedOptions();
//		
//		for(WebElement opt:option)
//		{
//			System.out.println(opt.getText());
//		}
		
		WebElement opt = s.getFirstSelectedOption();
		
		System.out.println(opt.getText());
			
		
//		Thread.sleep(2000);
//		
//		s.deselectByIndex(1);
//		s.deselectByIndex(3);
	}

}
