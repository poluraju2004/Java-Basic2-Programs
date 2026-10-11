class ArmStrongNumber{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int temp = n;

		int r,sum = 0;
		while(n>0){
		r = n%10;
		n = n/10;
		//sum = sum+r*r*r;
		sum = sum + (int)Math.pow(r,3);
	}
	if(temp == sum){
		System.out.println("It is arm strong number");
	}
	else{
		System.out.println("It is not a arm storng number");
	}

	}
}   
