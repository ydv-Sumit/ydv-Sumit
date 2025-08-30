package terenery;
import java.util.Scanner;

public class mcq_1 {

	
	public static void mcq() {
		Scanner input = new Scanner(System.in);
		
		String question = "1. Who invented Java Programming?";
		String [] option = {" A. ) Guido van Rossum","B. ) James Gosling"," C. ) Dennis Ritchie"," D. ) Bjarne Stroustrup"};
		
		String answer ="B";
		
	     System.out.println(question);
	     for(int i=0; i<option.length;i++) {
	    	 System.out.println(option[i]);
	    	 
	     }
	     
	     System.out.println("please select the option :");
	     String select_option = input.next().toUpperCase();
	     
	     if(select_option.equals( answer)) {
	    	 System.out.println("you chose to correct answer");
	     }else {
	    	 System.out.println("incorrect Answer, correct answer is B,James Gosling");
	     }
	
	}
	
	
}
