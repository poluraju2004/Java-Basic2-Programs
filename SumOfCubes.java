class SumOfCubes{
	public static void main(String[] args) {
		//int n = Integer.parseInt(args[0]); // input is takinge a user then use this; 
		int cube = 0;
		for(int i = 1;i<=10;i++){
			//cube = cube + i*i*i;
			cube = cube +(int)Math.pow(i,3);

		}
		System.out.println("Cube = "+cube);
	}
}