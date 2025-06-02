package week4.day1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWithTitle {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver(); //method will call classes
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);
		
		String childWindow="Dashboard";
		String parentWindow="Window";
		
		for (String s : allWindow) {		
			driver.switchTo().window(s);
			if(driver.getTitle().contains(childWindow)) {
				driver.findElement(By.id("email")).sendKeys("dilip@testleaf.com");	
				driver.close();
				
			}
			
		}
		
	}

}
