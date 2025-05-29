package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		
		//switch back to main page 
		driver.switchTo().defaultContent();
		
		
		//nested frame
		
		//parent frame -> outer
		driver.switchTo().frame(3);
		
		//child frame -inner
		driver.switchTo().frame("frame2");
	
	//perform action	
		driver.findElement(By.id("Click")).click();
		
		//move to parent frame
		driver.switchTo().parentFrame();
		
		//come back to main page
		driver.switchTo().defaultContent();

		//NoSuchElementException - frame is not handle
		//NoSuchFrameException - index value go beyond 
	
	
	
	}

}
