package terenery;

import java.util.Scanner;

public class AbsoluteTernary {
	public static void main(String[] arg) {
		
		Scanner input = new  Scanner(System.in);
		System.out.println("please enter the number:");
		int num = input.nextInt();
		int AbsoluteNumber = num>=0?num:-num;
	     System.out.println("your AbsoluteNuber is :"+AbsoluteNumber);
	     
	
		
	}
}
