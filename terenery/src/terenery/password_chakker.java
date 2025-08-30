package terenery;
import java.util.Scanner;

public class password_chakker {

	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		
	    String password = "p4n@in";
	   
		boolean pass_correct = false;
		
		for(int i=1; i<=3;i++) {
			 System.out.println("please enter the password :");
				String  inpPassword = input.next();
			if(inpPassword.equals(password)) {
				System.out.println("user select right password then start MCQ EXAM...");
				pass_correct = true;
				break;
		}else {
			
			System.out.println( "wrong password ... try"+(3-i)+" more time out of 3");
			
		}
	
		
	}
	
		if(!pass_correct) {
			System.out.println("you reached maximum limit");
		}else {
			// mcq_1.mcq();
			 mcqWithSwitchCase.mcq();
		}
		
		
		
	}
}
