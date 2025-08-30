package terenery;

import java.util.Scanner;

public class arrayUtilitiesInput {
	public static int[] inputArray() {
		
		Scanner input =  new Scanner(System.in);
        System.out.println("please enter the size of Array");
        int size = input.nextInt();
        
        int[] num = new int[size];
        
        for(int i =0;i<num.length;i++) {
        	System.out.println("please enter the num "+(i+1)+":");
        	      num[i]=input.nextInt();
        	
        	  
        }
		return num;
		
		
		
	}

}
