class ReverseContinuesNumber{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);

		for(int i = n;i>=1;i--){
			for(int j = 0;j<=i;j++){
				System.out.print(i+"");
			}
			System.out.println();
		}
	}
}