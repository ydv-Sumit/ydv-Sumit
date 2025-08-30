package terenery;

public class StringManipulationn {
	public static void main(String[] arg) {
		
		String firstName = "Sumit";
		String SecondName ="Yadav";
		//String fullname = firstName+""+SecondName;
		String fullname = firstName.concat(" ").concat(SecondName);
		System.out.println(fullname.toUpperCase());
		
		
		
		
	}

}
