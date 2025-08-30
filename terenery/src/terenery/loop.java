package terenery;

import java.util.Scanner;

public class loop {

	public static  void  main(String []arg ) {
		
		Scanner input = new Scanner (System.in);
		//System.out.println("please enter the  age :");
		//int age =input.nextInt();
		
		
	/*	while(age<0||age>100) {
			System.out.println("please enter age :");
			age =input.nextInt();
		
			age++;
		}
		
		System.out.println("please enter the age :"+age);
	}
	*/
        int age;
		do {
			System.out.println("please enter the age :");
		 age =input.nextInt();
			
		} while(age<0||age>100);
		  System.out.println("your age is : "+age);
     
	}
}

