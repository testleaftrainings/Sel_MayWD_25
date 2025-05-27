package week3.day2;

public abstract class RemoteDriver implements Webdriver{

	@Override
	public void findElement() {
		System.out.println("Abstract FindElement");		
	}

	@Override
	public void findElements() {
		System.out.println("Abstarct FindElements");		
	}

	//0 to 100% abstract methods

	// own abstract methods
	public abstract void text();

	public static void main(String[] args) {
		//for interface we can able create object? Yes/No -> No

		//	Webdriver wb=new Webdriver();
		
		//for abstract we can able create object> Yes/No-> No
		
		//RemoteDriver rd=new RemoteDriver();







	}
}
