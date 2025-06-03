package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LlearnWebTable {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/table.xhtml");
		
		//find first data in webtable
		String rowText = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td")).getText();
		System.out.println(rowText);
		
		//find 4th row and 5 col
		String status = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[4]/td[5]")).getText();
		System.out.println(status);
		
		//row value
		List<WebElement> rowCount = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
		System.out.println("Row Count :"+rowCount.size());
		
		//col value
		List<WebElement> colCount = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));
		System.out.println("col Count :"+colCount.size());
		
		//print 3row fully
		for (int i = 1; i <=colCount.size(); i++) {
			
			String thirdRow = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[3]/td["+i+"]")).getText();
			System.out.println(thirdRow);
		}
	
		//print all the values from webtable
		
		//row
		for (int i = 1; i <=rowCount.size(); i++) {
			
			//col
			for (int j = 1; j <=colCount.size(); j++) {
				
				String allValues = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(allValues);
				
			}
			
		}
		
		
	
	//driver.close();
	
	}

}
