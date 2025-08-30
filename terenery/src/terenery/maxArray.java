package terenery;

public class maxArray {

	public static void main(String [] arg) {
		
		int[] arrray = inpututility.inputArr();
		
		int max = Integer.MIN_VALUE;
		for(int num:arrray) {
			if(max<num) {
				max=num;
			}
		}
		
		System.out.println("my max num is"+max);
	}
	
}
