//import java.util.*;
class GradeSystem{
public static void main(String[] args) {
	//Scanner sc = new Scanner(System.in);
	//System.out.print("Enter a marks: ");double marks = Double.nextDouble(args[0]);
	
	if(marks <0 || marks > 100){
		System.out.print("Invalid marks");
	}

	else if (marks>=90){
		System.out.println("A");
	}
	else if (marks >= 80){
		System.out.println("B");
	}
	else if(marks >= 70){
		System.out.print("C");
	}
	else if (marks >= 60){
		System.out.println("D");
	}
	else{
		System.out.print("Fail");
	}
	}
	
}
	