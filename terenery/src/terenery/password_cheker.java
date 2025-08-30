package terenery;

import java.util.Scanner;

public class password_cheker {
	public static void main(String [] arg) {
		Scanner input = new Scanner(System.in);
		
	String  password;

	for(;;) {
		System.out.println("please enter the valid password :");
		password = input.nextLine();
		
		
		if (isValid( password)) {
			
			System.out.println("your password is :"+password);
			break;
			
		}
		
	}
		
	
	}
	
	public static boolean isValid(String  password) {
		
		
		return password.length()>6;
	}

}
