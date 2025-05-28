package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllPriceList {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone",Keys.ENTER);
		
		//return for findElements-> List<WebElement>
		List<WebElement> allPhone = driver.findElements(By.className("a-price-whole"));
		int count = allPhone.size();
		System.out.println(count);
		
		//create Empty list
		List<Integer> price=new ArrayList<Integer>();
		
		//print phone price
		for (int i = 0; i < allPhone.size() ; i++) {
			String text = allPhone.get(i).getText();
			
			if(!text.isEmpty()) {
				String replaceAll = text.replaceAll(",", "");
			//8,909=8909
			int parseInt = Integer.parseInt(replaceAll);
			System.out.println(parseInt);
			
			price.add(parseInt);
			}
		}
		
		Collections.sort(price);
		System.out.println(price);
		
		Set<Integer> unqPrice=new TreeSet<Integer>(price);
		System.out.println(unqPrice);
			
		
		
		
		
	}
}
