package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecficMethod{
	@DataProvider(name="getData")
	public String[][] setData(){
		String[][] data=new String[3][3];
		//index value will start from '0'
		data[0][0]="Testleaf";
		data[0][1]="Dilip";
		data[0][2]="Kumar";
		
		data[1][0]="Qeagle";
		data[1][1]="Harrish";
		data[1][2]="A";
		
		data[2][0]="Hcl";
		data[2][1]="Udaya";
		data[2][2]="Prasath";
		
		return data;
		}
	@Test(dataProvider = "getData")
	public  void runCreateLead(String cName,String fName,String lName) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		
}
	
}






