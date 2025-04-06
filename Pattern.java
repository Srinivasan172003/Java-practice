package pattern;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner valu = new Scanner(System.in);
		
		System.out.println("Enter the number of rows need to get pattern:");
		int rows= valu.nextInt();
		
		for(int i=1; i<=rows; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
