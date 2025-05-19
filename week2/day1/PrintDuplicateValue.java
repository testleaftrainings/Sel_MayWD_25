package week2.day1;

import java.util.Arrays;

public class PrintDuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] value= {23,56,12,43,12,56,67,33,68};
		//dn- 12,56
		//for loop -> nested for loop
		//if condition
		//print the value
		for (int i = 0; i < value.length; i++) { //outer loop
			//23
			//56
			//12
			for (int j = i+1; j < value.length; j++) { //inner loop
				//56,12,43,12,56,67,33,68
				//12,43,12,56,67,33,68
				//43,12,56,67,33,68
				
				if(value[i]==value[j]) {
					System.out.println("Duplicate Value :"+value[j]);
				}
			}
			
		}
		int[] v= {34,45,12,34,56,90,45,30};
		Arrays.sort(v);
		//12,30,34,34,45,45,56,90
		for (int i = 0; i < v.length-1; i++) {
			if(v[i]==v[i+1]) {
				//v[7]==v[7+1]=> v[7]==v[8]
				System.out.println(v[i+1]);
				//java.lang.ArrayIndexOutOfBoundsException
			}
		}
		
		

	}

}
