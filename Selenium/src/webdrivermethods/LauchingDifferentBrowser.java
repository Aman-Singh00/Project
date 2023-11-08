package webdrivermethods;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LauchingDifferentBrowser {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("choose 1  for Chrome");
		System.out.println("choose 2  for Firefox");
		System.out.println("choose 3  for Edge Browser");
		int num = sc.nextInt();
		WebDriver driver = null;
		
			if (num == 1) {
				driver = new ChromeDriver();
			} else if (num == 2) {
				driver = new FirefoxDriver();

			} else if (num == 3) {
				driver = new EdgeDriver();
			} else {
				System.out.println("Invalid browser");
			}
		}
	
	}

}
