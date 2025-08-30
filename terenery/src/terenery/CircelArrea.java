package terenery;

import java.util.Scanner;

 class CircelArrea {
	double radiusInMm;
	
	 CircelArrea(double radiusInMm){
		 this.radiusInMm=radiusInMm;
		 
	 }
	
	double getCircumference() {
		return 2*radiusInMm*Math.PI;
	}
	
	double Area() {
		return Math.PI*Math.pow(radiusInMm, 2);
	}
	
	@Override
	public String toString() {
		
		return "circel prop: Radius in mm :"+radiusInMm+
				", Circumference in mm :"+getCircumference()+
				", Area in Mm2 :"+Area();
	}
	
	public static void main(String[]arg) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to circel funcation \n");
		System.out.println("please enter your radius :");
		double radius =input.nextDouble();
		
		 CircelArrea circel = new  CircelArrea(radius);
		 System.out.println(circel);
	}
         
}
