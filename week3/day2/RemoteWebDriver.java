package week3.day2;

//c to c -> extends
//C to I -> implements
//interface is connect direct to class -> we implement all methods inside interface
public class RemoteWebDriver implements Webdriver {

	@Override
	public void findElement() {
		System.out.println("FindElement");
	}

	@Override
	public void findElements() {
		System.out.println("FindElements");
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		
		RemoteWebDriver rwb=new RemoteWebDriver();
		
		//static method -> class or interface name.methodName()
		Webdriver.close();
		
		//normal method -> objectName.methodName()
		rwb.click();
		rwb.findElement();
	}
	

}
