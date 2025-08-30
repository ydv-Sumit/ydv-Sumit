package terenery;

import java.util.Scanner;

public class GuessingGame {
	
	int random;
	
	GuessingGame(){
		random =(int)Math.ceil(Math.random()*100);
		
	}
	
	/**
	 * 
	 * @param guesingNumber the number that player guessed;
	 * @return
	 * - negative if the number is smaller;
	 * - 0 if the number is correct ;
	 * - postive number is highest;
	 * 
	 */
	
	
	int guess(int guesingNumber) {
		
			
		return guesingNumber-random ;
	}
	

	public static void main(String[]arg) {
		
		Scanner input = new Scanner(System.in);
		GuessingGame  game = new GuessingGame();
		System.out.println("welcome to guessing  game, guess the number between 1 to 100 ");
		
		int guessNum;
		int result;
		do {
			System.out.println("please enter guess number :");
			guessNum = input.nextInt();
			 result =game.guess(guessNum);
			 if(result==0) {
				 System.out.println("congrauate you guess correct the number");
			 }else if(result<0){
				 System.out.println("please guess higher number ");
			 }else {
				 System.out.println("please guess lower number");
			 }
			
		}while(result !=0);
		
		
		
	}
	

}
