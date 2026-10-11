import java.util.*;
class FactrioalNumber{
	public static void main(String[] args) {
		long fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a factrioal number: ");
		int n = sc.nextInt();

		for(int i = 1;i<=n;i++){
			fact *= i;
		}
		System.out.println("Fact = "+fact);
	}
}