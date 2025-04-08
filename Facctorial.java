package factorial;

import java.util.Scanner;

public class Facctorial {
	public static void main(String[] args) {
		
		int i,fact=1;
		System.out.println("ENTER VALUE TO FIND FACTORIAL: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for( i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial value of "+number+"is:"+fact);
	}

}
