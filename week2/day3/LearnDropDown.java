package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml;");
		
		//select class
		WebElement dd = driver.findElement(By.className("ui-selectonemenu"));
		//WebElement-> reuse code -> avoid  write code multiple time
		//return type for findElement-> WebElement
		
		Select opt=new Select(dd);
		
		//index - start from '0'
		opt.selectByIndex(2);
		
		Thread.sleep(3000);
		
		opt.selectByVisibleText("Cypress");
		
		
		//Non select dropdown
		driver.findElement(By.id("j_idt87:country_label")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("j_idt87:country_2")).click();
		

	}

}
