package week3.day1;

public class Parent {
	
	//method overriding
	//same method inside two different class -parent and child
	
	public void findElement() {
		System.out.println("ID");
	}
	
	public static void main(String[] args) {
		Parent p=new Parent();
		p.findElement();
	}
}
