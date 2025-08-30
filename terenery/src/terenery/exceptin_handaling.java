package terenery;

import java.util.InputMismatchException;
import java.util.Scanner;


public class exceptin_handaling {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		
		try {
		System.out.println("please enter your name ");
		String name = input.next();
		System.out.println("please enter  your age :");
		int age = input.nextInt();
		}catch(Exception e){
			System.out.println("please enter only number ");
		}
		
	}
	

}
