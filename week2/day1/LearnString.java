package week2.day1;

public class LearnString {

	public static void main(String[] args) {
		String name="Dilip";
		String name1=new String("Dilip");
		//length()
		System.out.println("No of chars :"+name.length());

		//index value start from '0'
		//charAt()
		System.out.println("Print index 2:"+name.charAt(2));
		
		//equals
		if(name.equals(name1)) {
			System.out.println("name is matched");
		}else {
			System.out.println("name is not matched");
		}
		
		//b/w .equals() -> String Context and == -> check memory address of the value
		if(name==name1) {
			System.out.println("matched");
		}else {
			System.out.println("not matched");
		}
		
		
		//Dilip.eic(dIliP)
		String n="dIliP";
		if(name.equalsIgnoreCase(n)) {
			System.out.println("Matched");
		}else {
			System.out.println("not Matched");
		}
		
		//tocharArray
		String comName="TestLeaf";
		
		char[] ch = comName.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		
		System.out.println("");
		
		//input : Selenium
		//output: muineleS
		
		String input="Selenium";
		char[] chs = input.toCharArray();
		
		for (int i = chs.length-1; i >=0; i--) {
			System.out.print(chs[i]);
		}
		
		
		// input = your name
		//convert into tocharArray
		//print reverse order
		
		
	}

}
