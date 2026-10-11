import java.util.*;
class FibonacciSeries{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Fibonacci number: ");
		int n = sc.nextInt();
		int a=0,b=1;
		int c;


		for(int i = 1;i<=n; i++){
			System.out.print(a+" ");//Enter a Fibonacci number: 5
										//0 1 1 2 3
			c = a+b;
			a = b;
			b = c;
			//System.out.print(" "+c);//Enter a Fibonacci number: 5 
										//1 2 3 5 8
		}
		

	}
} 