package terenery;

import java.util.Scanner;


public class occurance {
	public static void main(String[] arg) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("welcome to occurance funcation");
		int[] arr = inpututility.inputArr();
		
		System.out.println("please enter the number who get the occurance :");
		int element = input.nextInt();
		
		
		int occa =occrance(arr, element);
		System.out.println(" num of occrance "+occa);
		
	}
	
	public static  int occrance(int[] arr,int element) {
		int occ =0;
		for(int num:arr) {
			if(num==element) {
				
				occ++;
			}
		}
		
		return occ;
		
		
	}
	

}
