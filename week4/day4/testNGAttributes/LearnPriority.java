package testNGAttributes;

import org.testng.annotations.Test;

public class LearnPriority {

	//default value is 0 => ascii
	//-ve -> lower value
	//-1,0,1,2,3,4
	@Test(priority = -1,enabled=false) //0
	public void editLead() {
		System.out.println("editLead");
	}
	
	@Test(priority = 2)
	public void mergeLead() {
		System.out.println("mergeLead");
	}
	
	
	@Test(priority = 2) //0
	public void createLead() {
		System.out.println("createLead");
	}
}
