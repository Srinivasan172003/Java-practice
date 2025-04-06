package practice;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		{
			int value = 3;
			
			switch(value) {
			case 1:
			System.out.println("the value is low");
			break;
			case 2:
			System.out.println("the value is mid range");
			break;
			case 3:
			System.out.println("the valuen is equals");
			break;
			default:
				System.out.println("the value is not mentioned");
				break;
			}
		}
	}

}
