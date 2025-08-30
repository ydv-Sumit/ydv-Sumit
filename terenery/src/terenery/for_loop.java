package terenery;

import java.util.Scanner;

public class for_loop {
	public static void main(String[] arg){
		
		Scanner input = new Scanner(System.in);
		System.out.println("please enter the number where the get counting :");
		int num = input.nextInt();
		
	 /* int i = 1;
	  while(i<=num) {
		   
		  System.out.println(i+" ");
		  i++;
	  }*/
	  
	  for( int j=1 ; j<=num; j +=2) {
		  System.out.println(j + " ");
	  }
		
	}

}
