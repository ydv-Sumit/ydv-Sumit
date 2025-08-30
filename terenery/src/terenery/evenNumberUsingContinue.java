package terenery;

import java.util.Scanner;

public class evenNumberUsingContinue {
	
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.println("welcome to all even  number sum");
		 int[] input_user=	arrayUtilitiesInput.inputArray();
		 
		 int sum = 0;
		 
		 for(int num:input_user) {
			 
			 if(num%2==0) {
				 continue;
			 }
			sum+=num; 
		 }
		
		System.out.println("even number sum is :"+sum);
		
	}
	

}
