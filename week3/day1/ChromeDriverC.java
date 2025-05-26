package week3.day1;

public class ChromeDriverC extends ChromiumDriverP{

	public void chromeOptions() {
		System.out.println("Options");
	}
	
	public static void main(String[] args) {
		ChromeDriverC cdc=new ChromeDriverC();
		cdc.browserLog();
		cdc.browserName();
		cdc.chromeOptions();
		cdc.close();
	}
}
