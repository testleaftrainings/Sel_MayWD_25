package week4.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleWithChromeOptions {

	public static void main(String[] args) {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--start-maximized");
		opt.addArguments("--headless");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		

	}

}
