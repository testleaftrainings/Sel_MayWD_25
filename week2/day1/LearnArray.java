package week2.day1;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {

		int[] number= {23,22,12,49,89,54,56,47,67};
		//int d=2,4,5,6,1;
		//1-9 -> 0-8
		
		//find total length array
		int arrayLength = number.length;
		System.out.println("Total number of Array :"+arrayLength);
		
		//find last value in the array
		System.out.println("Last value in the array :"+number[arrayLength-1]);
		//number[9-1]=> number[8] => 67
		
		//find first value in the array
		System.out.println("First value in the array :"+number[0]);
		
		//sort array
		Arrays.sort(number);
		//12,22,23,47,49,54,56,67,89
		System.out.println("After sorting first value in the array :"+number[0]);
		
		//for loop
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		
	}

}
