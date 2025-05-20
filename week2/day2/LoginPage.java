package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        Thread.sleep(2000); //- java time  -ms
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(4000);
		driver.findElement(By.className("decorativeSubmit")).click();
		//title 
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		
//		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.partialLinkText("SFA")).click();

		driver.close();
	}

}
