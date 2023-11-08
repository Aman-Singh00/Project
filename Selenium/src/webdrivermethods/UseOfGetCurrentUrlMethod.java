package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetCurrentUrlMethod {

	public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
			
			String actual_Url = driver.getCurrentUrl();
			
			System.out.println(actual_Url);
			
			if(actual_Url.contains("amazon.in"))
			{
				System.out.println("Test case is pass");
			}
			else
			{
				System.out.println("Test case is fail");
			}
			
			
			
	
	}

}
