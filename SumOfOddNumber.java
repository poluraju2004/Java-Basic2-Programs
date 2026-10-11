//import java.util.*;
class SumOfOddNumber{
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.print("Enter a odd number:");
		//int odd = sc.nextInt();

		int sum = 0;

		for(int i = 1;i<= 50;i++){
			if(i % 2 != 0){
				sum = sum+i;
			}
		}
		System.out.println("Sum = "+ sum);
	}
}