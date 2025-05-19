package week2.day1;

public class StringMethods {

	public static void main(String[] args) {

		String data="Selenium Java";
		//split() -> break into words or chars
        //split("e") =>  S l nium Java
		//Selenium   
		//Java
		
		//i/p-> Amazon have 1000 above product
		//o/p -> Amazonhave1000aboveproduct
		
		String[] split = data.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
		}
		
		System.out.println();
		//replace
		String replace= data.replace('a', '6');
		System.out.println(replace);
		
		//replaceAll
		String value="Testleaf.2025@gamil.com";
		String replaceAll = value.replaceAll("[^0-9 a-z A-Z]", "#");
		System.out.println(replaceAll);
		
		//subString -aSel
		String d1="JavaSelenium";
		String substring = d1.substring(4);
		
		System.out.println(substring);
		//(3,6)
		String substring2 = d1.substring(3, 7);
		System.out.println(substring2);
		
		String d="jAva";
		System.out.println(d.toLowerCase());
		System.out.println(d.toUpperCase());
		
		
		
		
		
		
	}

}
