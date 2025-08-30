package util;

public class customer {
	public static void main(String[] arg) {
		 bankAccount balance = new  bankAccount("001","sumit");
		 balance.deposit(100);
		 System.out.println(balance.withdraw(200));
		
	}	 
}
