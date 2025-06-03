package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");
	
	WebElement mouseOver = driver.findElement(By.xpath("//span[text()='Home & Kitchen']"));
		
	Actions opt=new Actions(driver);
	opt.moveToElement(mouseOver).perform();
	
	driver.findElement(By.xpath("//span[text()='Juicer Mixer Grinders']")).click();
	
	
	WebElement scroll = driver.findElement(By.xpath("//div[text()='Policy Info']"));
	opt.scrollToElement(scroll).perform();
	
	
	}

}
