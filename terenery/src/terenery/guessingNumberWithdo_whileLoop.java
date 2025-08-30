package terenery;

import  java.util.Scanner;


public class guessingNumberWithdo_whileLoop {
	
	public static void main(String [] arg) {
		
		Scanner input = new Scanner(System.in);
		
	int guessNumber = 2;
	int num;
	
	do {
		System.out.println("please enter the guessing number :");
	    num =input.nextInt();
	}while(guessNumber != num);
	System.out.println("your are Scussesfully guess the number");
		
		
		
		
	}

}
