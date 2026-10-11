class factorialOfNumber{
	public static void main(String[] args) {
		int fact = 1;
		for(int i = 1; i<=10;i++)
			fact *= i;
		
		System.out.println("Fact 1 to 10 = "+fact);
	}
}