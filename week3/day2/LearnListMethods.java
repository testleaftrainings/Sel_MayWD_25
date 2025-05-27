package week3.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LearnListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//index value start from'0'
		
		List<Integer> value=new ArrayList<Integer>();
		value.add(3);
		value.add(4);
		value.add(4);
		value.add(5);
		value.add(10);
		value.add(6);
		
		System.out.println(value);
		
		value.add(1, 9);
		System.out.println(value);
		
		System.out.println("Total size of List :"+value.size());
		
		System.out.println("Check whether number 10 present :"+value.contains(10));
		
		System.out.println("Remove index of 5 :"+value.remove(5));
		System.out.println("Update the list :"+value);
		
		System.out.println("Get value  present in index 4 :"+value.get(4));
		
		//sort 
		Collections.sort(value);
		//3,4,4,5,6,9
		System.out.println("After sort index 2:"+value.get(2));
		
		
		
		value.clear();
		System.out.println(value);
		
		
		

// List<WebElement> findElements = driver.findElements(By.id(""));
		
	}

}
