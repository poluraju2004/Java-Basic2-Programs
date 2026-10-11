import java.util.*;
class CalculatePower{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a base number: ");
		int base = sc.nextInt();
		System.out.print("Enter a Exponent number: ");
		int exponent = sc.nextInt();
		int result = 1;
		for(int i = 0;i<exponent;i++){
			result = result *base;
		}
		System.out.println("Power value = "+result);
	}
}