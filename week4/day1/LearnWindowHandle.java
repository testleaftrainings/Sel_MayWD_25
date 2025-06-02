package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver(); //method will call classes
	//	WebDriver dr=new ChromeDriver(); //method will call interface
		
		
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		String pt = driver.getTitle();
		System.out.println("Parent title : "+pt);
		
		
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);
		
		//convert set into list to use get()

		List<String> getWindow=new ArrayList<String>(allWindow);
		
		driver.switchTo().window(getWindow.get(1));
		
	String ct = driver.getTitle();
	System.out.println(ct);
	
	driver.findElement(By.id("email")).sendKeys("dilip@testleaf.com");	
		
	//close child window 
	driver.close(); // close current window
	
	//after closing child window whether driver focus will be switch parent window
	
	//transfer driver focus form child to parent 
	driver.switchTo().window(getWindow.get(0));
	
	driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
	
	Set<String> threeWindow = driver.getWindowHandles();
	System.out.println(threeWindow);
	
	//driver.quit();
	
		
	}

}
