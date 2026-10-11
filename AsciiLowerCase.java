import java.util.*;
class AsciiLowerCase{
	public static void main(string[] args ){
		Scanner sc = new Scanner();
		char ch = sc.next().charAt(0);

		
		while(ch.toLower() != 0){
			ch++;
			System.out.println("ch = "+ch);

		}
}
}