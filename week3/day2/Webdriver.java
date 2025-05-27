package week3.day2;

public interface Webdriver {
	//till java 1.7-> 100% abstract method -> unimplements methods
	public void findElement();
	
	public void findElements();
	public void get();
	//java 1.8 and above
	//implementation method -static and default
	static void close() {
		System.out.println("Static");
	}
	
	default void quit() {
		System.out.println("default");
	}
	
	default void click() {
		System.out.println("click");
	}
	
	static void doubleValue() {
		System.out.println("doubleValue");
	}
}
