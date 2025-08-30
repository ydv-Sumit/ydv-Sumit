package terenery;

public class DiceFuncation {
	
	
	int roll(){
		double random =Math.random()*6;
		return (int)Math.ceil(random);
	}

	public static void main(String[] main ) {
		
		DiceFuncation diceRoll = new DiceFuncation();
		for (int i = 0; i<100;i++) {
			System.out.println(diceRoll.roll());
		}
	}
	
}
