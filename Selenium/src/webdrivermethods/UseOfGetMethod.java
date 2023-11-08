package webdrivermethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetMethod {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.amazon.in/");
		driver.get("https://www.flipkart.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		File actual = new File("./screenshot/photo.png");
		FileUtils.copyFile(file, actual);
		
		
		
		
	}

}
