package terenery;

import java.util.Scanner;

public class StudentScoreTernarry {

public static void main(String[] arg) {
		
		Scanner input = new  Scanner(System.in);
		System.out.println("please enter student  the marks:");
		int marks = input.nextInt();
		String catergory = marks>80?"high":(marks>50?"moderate":"low");
		System.out.println("marks is "+catergory);
		
		
}
}
