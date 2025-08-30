package terenery;

import java.util.Scanner;

public class minFuncation {
	public static void main (String[] arg) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("please enter first num :");
		int num1 = input.nextInt();
		System.out.println("please enter second num");
		int num2 = input.nextInt();
		
		minFuncation ternery = new  minFuncation();
		
        int minNumber=ternery.min(num1, num2) ;
		System.out.println("min numbeer is:"+minNumber);
		
	}
	
	public int min(int num1, int num2) {
		
		
		return num1<num2 ? num1:num2;
	}

}
