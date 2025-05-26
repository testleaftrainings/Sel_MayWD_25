package week3.day1;

public class Child extends Parent{

	public void findElement() {
		
		System.out.println("Name");
		super.findElement();
		
		
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		c.findElement();
	}
}
