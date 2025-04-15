package tesCase;

import java.util.Scanner;

public class TestCase {
	public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		System.out.println("ENTER A STRING :");
		String A = val.nextLine();
		
		System.out.println("the string is :" + A);
		val.close();
	}

}
