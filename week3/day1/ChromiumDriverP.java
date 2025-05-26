package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromiumDriverP extends RemoteWebDriverGP {

	
	public void close() {
		System.out.println("Driver.close");
	}
	
//	public void browserName() {
//		super.browserName();
//	}
	
	
	public static void main(String[] args) {
		ChromiumDriverP cd=new ChromiumDriverP();
		cd.browserName();
		cd.browserLog();
		System.out.println(cd.browserVersion);
		cd.close();
		
		
		
		ChromeDriver driver=new ChromeDriver();
		
	}
}
