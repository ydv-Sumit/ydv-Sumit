package terenery;

import java.util.Scanner;

public class printEvenNumber {
	
	public static void main(String [] arg) {
		Scanner input = new Scanner(System.in);
		System.out.println("Q.1: Creat a programmer using continoue to print only even number using continoue for odd number ?");
		 System.out.println("please enter the number where is print even number :");
		 int num = input.nextInt();
		 
		 for(int i=1;i<num;i++) {
			 
			 if (i%2==1) {
				 continue;
				 
			 }
			System.out.println(i);
		 }
		
		
	}
	

}
