package greatestNum;

import java.util.Scanner;

public class GreatestNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A,B,C;
		
		System.out.println("Enter the number for A :");
		A = scanner.nextInt();
		System.out.println("Enter the number for B :");
		B = scanner.nextInt();
		System.out.println("Enter the number for C :");
		C = scanner.nextInt();
		
		if(A>=B && A>=C) {
			System.out.println("value A greater");
		}
		else if(B>=A && B>=C) {
			System.out.println("value B greater");
		}
		else {
			System.out.println("value C is greater");
		}
	}

}
