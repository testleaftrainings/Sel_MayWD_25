package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num= {2,5,3,1,4,3,6,7,4};
		//3,4
		//add into list and remove duplicate
		
		List<Integer> printDuplicate=new ArrayList<Integer>();
		
		System.out.println("Before adding value :"+printDuplicate);
//		for (int i = 0; i < num.length; i++) {
//			printDuplicate.add(num[i]);
//		}
		
		//for-each loop 
		for (Integer i : num) {
			printDuplicate.add(i);
		}
		
		System.out.println("After adding value :"+printDuplicate);

		for (int i = 0; i < printDuplicate.size(); i++) {
			
				System.out.println(printDuplicate.get(i));
			
		}
		
	}

}
