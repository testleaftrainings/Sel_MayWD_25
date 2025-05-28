package week3.day3;

public class Chrome {

	boolean status;
	int age;
	
	//default or Zero args
	public Chrome() {
		System.out.println("This my Default constructor");
	}
	
	
	
	public  Chrome(boolean status) {
		
		//constructor chaining  -> call one constructor from another constructor
		this();
		
		this.status=status;
		System.out.println(this.status);
		//this - going refer current class variable, method ,constructor
			
	}

	public Chrome(int age,String Name) {
		
		this();
		
		this.age=age;
		System.out.println(this.age);
		System.out.println(Name);
		
	}
	
	public static void main(String[] args) {
//		Chrome c=new Chrome();
//		System.out.println("Default value :"+c.status);
//		System.out.println("Default value :"+c.age);
		

	//	Chrome c1=new Chrome(true);
	
	Chrome c2=new Chrome(4,"Dilip");
	
	Chrome c3=new Chrome(20,"Selenium");
	
	}
	
}
