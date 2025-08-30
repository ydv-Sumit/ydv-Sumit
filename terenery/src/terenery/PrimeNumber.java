package terenery;

import java.util.Scanner;
public class PrimeNumber {
	
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter the number :");
		int num = input.nextInt();	
	  boolean isPrime = isPrime( num);
	  
	  if(isPrime) {
		  System.out.println(num+" is prime number");
	  }else {
		  System.out.println(num+" is not prime number");
	  }
		
	}
	
	
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		
		return true;
	}

}

