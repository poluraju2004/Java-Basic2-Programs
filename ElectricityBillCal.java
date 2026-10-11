class ElectricityBillCal{
	public static void main(String[] args) {
		double units = Double.parseDouble(args[0]);
		double bill;
		if(units < 0){
			System.out.println("Invalid units");
		}
		else if(units <= 100){
			bill = units * 5;
			System.out.println("Units = "+units);
			System.out.println("Electricity bill = "+bill);
			}
			else if(units <= 200){
			bill = units * 6;
			System.out.println("Units = "+units);
			System.out.println("Electricity bill = "+bill);
			}
			else if(units <= 300){
			bill = units * 7;
			System.out.println("Units = "+units);
			System.out.println("Electricity bill = "+bill);
			}
			else {
			bill = units * 8;
			System.out.println("Units = "+units);
			System.out.println("Electricity bill = "+bill);
			}

	}
}