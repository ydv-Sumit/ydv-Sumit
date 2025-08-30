package terenery;

import java.util.Scanner;

public class billing_systeminput {

	public static int[] billingInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Product List Size :");
	    int size=input.nextInt();
	   String [] product = new String[size];
	    int [] price = new int[size];
	   
	   for(int i=0;i<product.length;i++) {
		  System.out.println("enter product "+(i+1)+":");
		   product[i]=input.next();
	  }
	   for(int i = 0;i<product.length;i++) {
		   System.out.println("please enter "+product[i]+" price :");
		   price[i]=input.nextInt();
	   }
	   
		
		return price;
		
	}
	
}
