package terenery;

 class arrToString {
	
	public static void main(String[] arg) {
		
		String[] arr = new String[] {"this","is","the","best","course","in","the","whole","internet."};
		
		StringBuilder str = new StringBuilder();
		for(String stradd :arr) {
			str.append(stradd).append(" ");
		}
		System.out.println(str);
	}

}
