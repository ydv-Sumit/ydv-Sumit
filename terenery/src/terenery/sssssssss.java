package terenery;

import java.util.Scanner;

public class sssssssss {
	
	public static void main(String[] arg) {
		
		Scanner  input = new Scanner(System.in);
		System.out.println("please enter the first number:");
		int num1 =input.nextInt();
		System.out.println("please enter the Second number:");
		int num2 =input.nextInt();

		System.out.println("please enter the arthmatics operater:");
		String arthmetics = input.next();
		
		switch(arthmetics) {
		case "+":  System.out.println("the number of Sum :"+(num1+num2));
		break;
		case "-":  System.out.println("the number of sub  :"+(num1-num2));
		break;
		case "*":  System.out.println("the number of multi :"+(num1*num2));
		break;
		case "/":  System.out.println("the number of division :"+(num1/num2));
		break;
		
		default: System.out.println("this is not valid  operater");
		}
	
		
		
	/*	switch (monthNumber) {
		case 1: System.out.println("january");
		break;
		
		case 2: System.out.println("feburary");
		break;
		
		case 3: System.out.println("march");
		break;
		
		case 4: System.out.println("april");
		break;
		
		case 5: System.out.println("may");
		break;
		
		case 6: System.out.println("june");
		break;
		
		case 7: System.out.println("july");
		break;
		
		case 8: System.out.println("August");
		break;
		
		case 9: System.out.println("september");
		break;
		
		case 10: System.out.println("octuber");
		break;
		
		case 11: System.out.println("novmber");
		break;
		
		case 12: System.out.println("december");
		break;
		
		default :System.out.println("this is invalid number of month");
		}
		*/
		
		
	}	
	
	
	

}
