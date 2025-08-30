package terenery;

import java.util.Scanner ;


public class guessingNumber {

	public static void main(String [] arg) {
		Scanner input = new Scanner(System.in); 
		int num = 5;
		System.out.println("welcome to guessing number gamer");
		
		for(;;) {
			System.out.println("please enter the guessing number:");
			int guessing_number=input.nextInt();
			
			if(guessing_number==num) {
				System.out.println("your enter the correct number");
				break;
			}
		}
		
	}
}
