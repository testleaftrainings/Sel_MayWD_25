package week3.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] values= {'e','t','d','e','f','a','g','d'};
		
		Set<Character>unq=new TreeSet<Character>();
		
		for (Character i : values) {
			unq.add(i);
		}
		System.out.println(unq);
		
		//print index 3
		//convert set into list
		List<Character> getValue=new ArrayList<Character>(unq);
		Character character = getValue.get(3);
		
		System.out.println(character);
		
	}

}
