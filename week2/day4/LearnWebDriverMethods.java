package week2.day4;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebDriverMethods {

	public static void main(String[] args) {
	
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/?locale=in");
		
		//title 
		String title = driver.getTitle();
		System.out.println("Title of the page : "+title);
		
		if(title.contains("Login")) {
			System.out.println("Title is printed");
		}else {
			System.out.println("Title is not printed");
		}
		
		
		//current url
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url :"+currentUrl);
		
		//getText
		String text = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		System.out.println(text);
		
		if(text.equals("Ramkumar")) {
			System.out.println("lead is created");
		}else {
			System.out.println("Lead is not created");
		}
		
		//selenium -  before -> 4.27.0 - getAttribute now ->deprecated
		//after 4.27.0 -> getDomAttribute
		
		//getDomAttribute
	
		String domAttribute = driver.findElement(By.id("username")).getDomAttribute("type");
		System.out.println(domAttribute);
		
		
		boolean enabled = driver.findElement(By.id("username")).isEnabled();
		System.out.println(enabled);
		
		// driver.navigate().back();
		
		
		
	}

}
