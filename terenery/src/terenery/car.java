package terenery;

public class car {
	
	int number ;
	String name;
	
	public  car(){
		
	System.out.println("welcome to overloading funcation ");
	
	}
	
	public  car(int number){
		this.number = number;
	System.out.println("My car number :"+number);
	
	}
	
	public  car(String name){
		this.name =name;
		System.out.println("My car name :"+name);
		
		}
	
	
	public static void main(String[] arg) {
		
		car Car =new car();
		car car1 =new car(9889);
		car car2 = new car("bmw");
		
		
		
	}

}
