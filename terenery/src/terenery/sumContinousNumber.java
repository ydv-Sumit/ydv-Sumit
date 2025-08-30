package terenery;

import java.util.Scanner;

public class sumContinousNumber {
	
	public static void main(String[] arg){
		
		Scanner input = new Scanner(System.in);
		System.out.println("welcome to positive all positive  number ");
	 int[] input_user=	arrayUtilitiesInput.inputArray();
		int sum = 0;
		
		for(int num:input_user) {
			if(num<0) {
				
				continue;
			}
			sum+=num;

		}
		System.out.println("my all positive num  sum is"+sum);	
		}
		
	}
	
	


