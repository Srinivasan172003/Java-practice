package evenNum;

import java.util.Scanner;

public class EvenNum {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("ENTER THE VALUE TO LIST A SERTAIN EVEN NUMBERS :");
		int valu = key.nextInt();
		
		System.out.println("SHOWING GIVEN EVEN NUMBERS");
		int i = 0;
		while(i <= valu) {
			System.out.println(i);
			i = i +2 ;
		}
	}

}
