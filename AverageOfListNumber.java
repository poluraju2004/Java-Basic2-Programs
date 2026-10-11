import java.util.*;
class AverageOfListNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of values : ");
		int n = sc.nextInt();

		int sum = 0;

		for(int i = 0; i<=n; i++){
			System.out.print("Enter number: " + i+":");
			sum = sum + sc.nextInt();
		}
		double avg = (double)sum/n;
		System.out.println("avgerage = "+avg);

	}
}