package oddOrEven;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		boolean var = true;
		while(var) {
		System.out.println("ENTER A NUMBER TO CHECK FOR ODD OR EVEN :");
		num1 = sc.nextInt();
		
	
		if (num1 %2==0){
			System.out.println("THE GIVEN NUMBER IS EVEN ");
		}
		else
			System.out.println("THE GIVEN NUMBER IS ODD ");
	}
		var = false;
	}

}
