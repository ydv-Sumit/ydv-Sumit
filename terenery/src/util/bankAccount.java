package util;

public class bankAccount {
	private String accountNumber;
	private String accountName;
	private double balance;
	
	bankAccount(String accountNumber,String accountName){
		this.accountName=accountName;
		this.accountNumber=accountNumber;
	}

	public void deposit(int money){
		if(money<=0) {
			System.out.println("invalid deposit");
		}else {
		balance+=money;}
	}
	public int withdraw(int money) {
		if(money<=0){
			System.out.println("invalid Transation");
		}else if(money>=balance) {
			balance -= money;
			
		}else {
			balance=money;
			balance = 0;
		}
		return (int) balance;
	}
	
}
