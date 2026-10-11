class IncomeTaxCal{
	public static void main(String[] args) {
		double salary = Double.parseDouble(args[0]);
		double tax;

		if(salary <0){
				System.out.println("Invalid salary income");
		}

		else if(salary <= 250000){
			tax = 0;
			System.out.println("salary = "+salary);
			System.out.println("Income Tax = "+tax);
		}
		else if (salary <= 500000){
			tax = salary*5/100;
			System.out.println("salary = "+salary);
			System.out.println("Income Tax = "+tax);
		}
		else if(salary <= 1000000){
			tax = salary*20/100;
			System.out.println("salary = "+salary);
			System.out.println("Income Tax = "+tax);
		}
		else{
			tax = salary*30/100;
			System.out.println("salary = "+salary);
			System.out.println("Income Tax = "+tax);
		}
		
	}
	
}