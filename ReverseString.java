package day8;

import java.util.*;

public class ReverseString {
	public static void main(String[] args) {
		
		Scanner val = new Scanner(System.in);
		
		System.out.println("Enter a string to reverse :");
		String string = val.nextLine();
		String B = " ";
		
		for(int i=string.length()-1 ;i>=0;i--) {
			B = B + string.charAt(i);
			//This is in between for loop so it execute un till the reversed value obtained
		}
		System.out.print(B.trim());
		
		val.close();
	}
}
