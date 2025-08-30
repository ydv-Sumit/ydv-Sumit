package terenery;

public class stringPractice {
	String  name;
	
	int age;
	String rollNumber;
	String  house;
	
	public stringPractice(String  name,int age,String rollNumber,String  house){
		this.name=name;
		this.age=age;
		this.rollNumber=rollNumber;
		this.house=house;
	}
	
	@Override
	public String toString() {
		return "student Details:{name:"+name+" ,age :"+age+" ,RollNumber :"+rollNumber+", House :"+house+"}";
	}
	
	
	public static void main(String[] arg) {
		
		stringPractice str = new stringPractice("Sumit",14,"001","up");
		System.out.println(str);
		
	}
	
}

