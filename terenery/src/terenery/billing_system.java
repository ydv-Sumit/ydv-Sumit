package terenery;
import java.util.Scanner;

public class billing_system {
	public static void main(String[] arg) {
		System.out.println("welcome to billing System funcation");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Product List Size :");
	    int size=input.nextInt();
	   String [] product = new String[size];
	    int [] price = new int[size];
	   
	   for(int i=0;i<product.length;i++) {
		  System.out.println("enter product "+(i+1)+":");
		   product[i]=input.next();
	  }
	   for(int i = 0;i<product.length;i++) {
		   System.out.println("please enter "+product[i]+" price :");
		   price[i]=input.nextInt();
	   }
	   
	
	     String gst = "yes";
	     boolean gst_input =false;
	     int total =0;
	     System.out.println("Do You Want to add GST [Y/N]");
	     String inputGst =input.next();
	     for(int prices :price) {
	    	 total+=prices;
	     }
	     
	     
	     if(inputGst.equals(gst)) {
	    	 
	    	 gst_input=true;
	    	 System.out.println("please enter gst % =");
	    	int gstPercentage = input.nextInt();
	    	System.out.println("------output------");
	    
	    	for(int i =0;i<product.length;i++) {
	    		System.out.println((i+1)+"."+ product[i]+"="+price[i]);
	    		//total +=price[i];
	    	}
	    	System.out.println("----------------------------/n");
	    	System.out.println("total ="+total);
	    	
	    	double final_total =total*(100+gstPercentage)/100;
	    	
	    	System.out.println("gst ="+gstPercentage+"%");
	    	System.out.println("-----------------------------");
	    	System.out.println("Final-total ="+final_total);
	    	
	     }else {
	    	 	if(inputGst.equals("no")) {
	    	 		for(int i =0;i<product.length;i++) {
	    	    		System.out.println((i+1)+"."+ product[i]+"="+price[i]);
	    	    		
	    	    	}
	    	 		System.out.println("------------------");
	    	 		System.out.println("Total without Gst ="+total);
	    	 	}else {
	    	 		System.out.println("you enter the wrong input");
	    	 	}
	    	
	     }
	
	
	     
	
   
		
	}

}
