package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpathAndWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Selenium wait  - implicitly wait  -> common all the lines of code present inside class
		//all findElement() and findElements()
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dilip");

		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
	}

}
