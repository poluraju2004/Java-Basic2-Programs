class IncomeTaxCalUsingSwitch{
	public static void main(String[] args) {
		double salary = Double.parseDouble(args[0]);
		double tax;

		if(salary<0){
			System.out.println("Invalid salary Amount");
		}
		else{
			int switchKey;

		if(salary<=250000){
			tax = 0;
			switchKey = 1;
		}

		else if(salary<=500000){
			tax = salary*5/100;
			switchKey = 2;
		}
		else if(salary<=10000000){
			tax = salary*20/100;
			switchKey = 3;
		}
		else {
			tax = salary*30/100;
			switchKey = 4;
		}

		switch(switchKey){
		case 1:
			System.out.println("Salary = "+salary);
			System.out.println("Tax = "+tax);
			break;
		case 2:
			System.out.println("Salary = "+salary);
			System.out.println("Tax = "+tax);
			break;
		case 3:
			System.out.println("Salary = "+salary);
			System.out.println("Tax = "+tax);
			break;
		case 4:
			System.out.println("Salary = "+salary);
			System.out.println("Tax = "+tax);
			break;
		default:
			System.out.println("Invalid Salary Amount");
			

		}
		}
	}
}