package terenery;

import java.util.Scanner;

public class inpututility {
	public static int[] inputArr(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("please enter size of array: ");
		int size = input.nextInt();
		
		int[] num = new int[size];
		int i  = 0;
		while(i<num.length) {
			System.out.println("num "+(i+1)+" value of array :");
			num[i] =input.nextInt();
			i++;
		}
		return num;
		
	}
}
