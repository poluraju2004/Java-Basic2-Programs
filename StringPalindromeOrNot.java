//import java.util.*;
class StringPalindromeOrNot{
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.print("Enter a String: ");
		//String str = sc.nextLine();
		String str = args[0];

		String rev = "";

		for(int i = str.length()-1;i>=0;i--){
			rev = rev+str.charAt(i);
		}
		if(str.equals(rev))
			System.out.println("Palindrom");
		else 
			System.out.println("Not Palindrome");		
	}
}