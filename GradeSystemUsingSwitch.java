import java.util.*;
class GradeSystemUsingSwitch{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a marks: ");
	double marks = sc.nextDouble();
	//double marks = Double.nextDouble(args[0]);

	if(marks <0 || marks > 100){
		System.out.print("Invalid marks");
	}
	else{
		int grade;

	if (marks>=90)
		grade = 1;
	
	else if (marks >= 80)
		grade = 2;
	
	else if(marks >= 70)
		grade = 3;
	
	else if (marks >= 60)
		grade = 4;

	else
		grade = 5;

	switch(grade){
	case 1:
		System.out.print("A");
		break;
	case 2:
		System.out.print("B");
		break;
	case 3:
		System.out.print("C");
		break;
	case 4:
		System.out.print("D");
		break;
	case 5:
		System.out.print("Fail");
		break;
	default :
		System.out.println("Invalid Marks");
	}

	}
	}
	
}
	