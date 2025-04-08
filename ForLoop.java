package forloop;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		
		System.out.println("ENTER THE VALUE TO LIST AND TOTAL  :");
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int sum = 0;
		
		for (int i=0; i<=A; i++) {
			System.out.println(i);
		    sum +=i;
		    {
		    	 System.out.println("TOTAL VALUE IS "+ sum);
		    }
		}
			
	}

}
