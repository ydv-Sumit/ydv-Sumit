package terenery;
import java.util.Scanner;


public class oddOrEven {
	
	public static void main(String[] arg) {
		
		Scanner input = new  Scanner(System.in);
		System.out.println("please enter the number:");
		int num = input.nextInt();
		
		String result = num%2==0?"even":"odd"; 
		System.out.println("your number is "+result);
		
		/*oddOrEven number = new oddOrEven();
		number.chekTheValue(num);*/
		
	}
	
	/*public  void chekTheValue(int num) {
	if (num%2==0) {
		System.out.println("this  number is even");
	}else {
		
		System.out.println("this number is odd");
	}
		
	
	}*/
	

}
