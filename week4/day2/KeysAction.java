package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysAction {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");
		
		WebElement dd = driver.findElement(By.id("inputValEnter"));
		//.sendKeys("Phone",Keys.ENTER);
		
		//step1 - take snap
		File scr = dd.getScreenshotAs(OutputType.FILE);
		
		//step2 - set path
		File dst= new File("./snaps/img1.png");
	
	    //step 3
		FileUtils.copyFile(scr, dst);
	
	
	
	}

}
