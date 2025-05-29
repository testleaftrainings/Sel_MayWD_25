package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//simple alert
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		alert.accept();
		//UnhandledAlertException - when alert is present we not handle it 
		
		//alert.dismiss();
		//NoAlertPresentException - no alert this there, i we try to handle it 
		
		String text2 = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text2);
		
		Thread.sleep(5000);
		
	//confirmation alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
	
	String text3 = alert.getText();
	System.out.println(text3);
	alert.dismiss();
	String text4 = driver.findElement(By.id("result")).getText();
	System.out.println(text4);
	
//	Thread.sleep(5000);
//	//Non-modal alert -> sweet alert
//	
//	driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-closethick']")).click();
//	
	
	
	}
}
