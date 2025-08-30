package terenery;

import java.util.Scanner;

public class mcqWithSwitchCase {
	
	public static  void mcq() {
		Scanner input = new Scanner(System.in);
		String[] question = {" 1. Who invented Java Programming?"," 2. Which component is used to compile, debug and execute the java programs?"};
		String [] []option = {{" A. ) Guido van Rossum","B. ) James Gosling"," C. ) Dennis Ritchie"," D. ) Bjarne Stroustrup"},{" 1. ) JRE"," 2. ) JIT","  3. ) JDK","  4. ) JVM"}};
		String []answers = {"B","C"};
		
		for(int i =0; i<question.length;i++) {
			  
		     System.out.println(question[i]);
		     for(String opt:option[i]){
		    	 System.out.println(opt);
		     }

		
		
		System.out.println("Please select the option (A/B/C/D): ");
		String select_option =input.next().toUpperCase();
		
		switch(select_option) {
		case"A":
		case"B":
		case"C":
		case "D":
			  if (select_option.equals(answers[i])) {
                  System.out.println("You chose the correct answer!\n");
              } else {
                  System.out.println("Incorrect Answer. Correct answer is " + answers[i] + ".\n");
              }
              break;
          default:
              System.out.println("Invalid option. Please select A, B, C, or D.\n");
      }
			
	}
	}

}

