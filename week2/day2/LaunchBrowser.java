package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		/*
		 * //Edge EdgeDriver driver1=new EdgeDriver();
		 * 
		 * //firefox FirefoxDriver driver2=new FirefoxDriver();
		 */		
		
		//load the url
		driver.get("https://github.com/SeleniumHQ");
		
		driver.manage().window().maximize();
		
		driver.close();
	}

}
