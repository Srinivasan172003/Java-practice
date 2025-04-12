package reverse;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("ENTER THE VALUE OF NUMBER TO GET REVERSED : ");
		
		Scanner val = new Scanner(System.in);
		int Number = val.nextInt();
		int reverse = 0;
		
		while(Number!=0) {
			int remainder = Number % 10;
			//gives modulus value
			reverse = reverse*10 + remainder;
			Number = Number / 10;
		}
		System.out.println("REVERSE OF GIVEN NUMBER IS : " + reverse);
	}

}
