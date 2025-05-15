package week1.day2;

public class PrintEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value=20;
		//0 to 20 -> 0,2,4,6,8,10,12,14,16,18,20
		//for loop
		//if condition
		
		for (int i = 0; i <=value; i++) {
			if(i%2!=1) {
				//%-> mod -> reminder value
				//0%2=>0==1
				//1%2=>1!=0
				//2%2=> 0!=0
			System.out.println("even number is :"+i);
			}
		}
	}

}
