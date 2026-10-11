class ElectricityBillCalUsingSwitch{
	public static void main(String[] args) {
		double units = Double.parseDouble(args[0]);
		//double  bill;
		//int power;
		if(units<0){
			System.out.println("Invalid units");
		}
		else {
			
			double  bill;
			int power;

		if(units<=100){
			bill = units*5;		
			power = 1;	
		}
		else if(units<=200){
			bill = units*6;
			power = 2;
		}
		else if(units<=300){
			bill =units*7;
			power = 3;
		}
		else{
			bill = units*8;
			power = 4;
		}
		switch(power){
		case 1:
			System.out.println("units = "+units);
			System.out.println("bill = "+bill);
			break;

		case 2:
			System.out.println("units = "+units);
			System.out.println("bills = "+bill);
			break;

		case 3:
			System.out.println("units = "+units);
			System.out.println("bills = "+bill);
			break;

		case 4:
			System.out.println("units = "+units);
			System.out.println("bills = "+bill);
			break;

		default:
			System.out.println("Invalid units");



}
		}

		
}

	}
