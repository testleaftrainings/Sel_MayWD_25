package week1.day2;

public class LearnObject {

	public static void main(String[] args) {

		//create object for that class
		LearnMethod lmo=new LearnMethod();
		
		lmo.add();
		int sub = lmo.sub(100, 23);
		System.out.println(sub);

		String data = lmo.data("Testleaf", 2025);
		System.out.println(data);
	}

}
