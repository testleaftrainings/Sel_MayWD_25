package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecficMethod {

	
public RemoteWebDriver driver;
	
@Parameters({"userName","url","passWord","browser"})

	@BeforeMethod
	public void preCondition(String uName,String url,String pass,String browser) {
	
	if(browser.equalsIgnoreCase("chrome")) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("guest");
	driver = new ChromeDriver(opt);
	}
	else if(browser.equalsIgnoreCase("edge")) {
		driver= new EdgeDriver();
	} else if(browser.equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();
	}
	
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
