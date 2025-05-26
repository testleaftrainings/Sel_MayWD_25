package week3.day1;

public class Browser {
// method overloading 
	//inside same class multiple method with same name but different agrs
	
	public void browserDetails(String browserName,int version) {		
		System.out.println(browserName +"  "+ version);
	}
	

	public void browserDetails(String browserName) {
		System.out.println(browserName);
	}
	
	
	public void browserDetails() {
		System.out.println("Done");
	}
	
	public static void main(String[] args) {
		Browser b=new Browser();
		b.browserDetails();
		b.browserDetails("Edge");
		b.browserDetails("Chrome", 131);
		b.browserDetails("Edge", 129);
		
		//ex - syso -> println()-> method overloading
		//ex- subString-> substring(start index), substring(start index, end index) 
		//ex - selenium -> frame -> frame(index),frame(string),frame(WebElement)
		System.out.println();
	}
}
