package util;

import geometery.circel;
import geometery.rectangel;

public class calculator {
public static void main(String[] arg){
	
	circel Circel = new circel(5.4);
	rectangel Rectangel = new rectangel(10,5); 
	
    double circelArea = Math.PI*Math.pow(Circel.radius, 2);
	double RecArea = Rectangel.breadth*Rectangel.length;
	System.out.printf("Area of circel is : %f, Area of rectangel is:%f",circelArea,RecArea);
	
}
}
