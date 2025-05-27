package week3.day2;

public class Execution extends RemoteDriver{
	@Override
	public void get() {
System.out.println("Execution get");
		
	}

	@Override
	public void text() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Execution e= new Execution();
e.click();
e.findElement();
e.get();


	}

}
