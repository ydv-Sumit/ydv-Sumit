package terenery;
 import java.util.Scanner;
public class exitFuncation {
	
	public static void main(String[] arg) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("welcome to exit  funcation  ");
		
		for(;;) {
			System.out.println("please enter the input :");
			String user_input=input.next();
			
			if (user_input.equals("exit")) {
				System.out.println("now you are exit");
				 break;
			}
			}
			
		
	}

}
