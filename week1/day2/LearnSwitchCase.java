package week1.day2;

public class LearnSwitchCase {

	public static void main(String[] args) {

		String browserName="IE";

		int age =18;
		switch (browserName) {
		case "Google":
			System.out.println("Chrome Browser");
			break; //jump stmts
		case "Mozilla":
			System.out.println("Firefox browser");
			break;
		case "Apple":
			System.out.println("Safari Browser");
			break;
		default:
			System.out.println("No browser");
			break;
		}
	}
}
