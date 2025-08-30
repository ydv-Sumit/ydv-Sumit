package terenery;

public class overloading {
	
	void details_info() {
		System.out.println("welcome to overloding funcation");
	}
	
	void details_info(int number) {
		System.out.println("please enter the number :"+number);
	}
	void details_info(String name) {
	}
	
	
	public static void main(String [] arg) {
		
		overloading  sss = new overloading ();
		sss.details_info();
		sss.details_info(9889);
		sss.details_info("sumit");
	}

}
