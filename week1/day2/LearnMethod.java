package week1.day2;

public class LearnMethod {

	//public
	public void add() {
		System.out.println(5+6);
	}
	
	//default
	int sub(int a,int b) {
		return a-b;
	}
	//private
	private void mul(int c, int d,int e) {
		System.out.println(c*d*e);
	}
	//protected
	protected String data(String name, int age) {
		return "My Name is :"+name+" My Age is :"+age;	
	}
	public String d() {
		return null;	
	}
	public int d1(int a,int b) {
		return a+b;	
	}
	
	public static void main(String[] args) {
		
		//ClassName objectName=new ClassName();
		LearnMethod lm=new LearnMethod();
		
		//call method -> objectName.methodName();
		lm.add();
		lm.mul(5, 5, 5);
		//if used data types as returnType
		//ctrl+2+l -> local variable an d then print the value
		int sub = lm.sub(10, 5);
		System.out.println(sub);
		
		String data = lm.data("Dilip", 29);
		System.out.println(data);
		
		
	}
	
	
	
}
