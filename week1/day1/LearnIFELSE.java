package week1.day1;

public class LearnIFELSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value= 10;
		//if syntax
		if(value>0) {
			System.out.println("Number is > 0 :"+value);
		}
		
		
		//if-else syntax
		int data= -5;
				if(data>0) {
					System.out.println("Positive Number");
				}else {
					System.out.println("Negative Number");
				}
	
	
	//if - else if- else syntax

				int dv=0;
				
				//String dv="Dilip";
				
 				if(dv>0) { //0>0
					System.out.println("Positive Number");
				}else if(dv==0) { //0==0
					System.out.println("Netural Number");
				}else {
					System.out.println("Negative Number");
				}
				
	
	}

}
