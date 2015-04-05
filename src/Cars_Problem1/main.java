package Cars_Problem1;

public class main {

	public static void main(String[] args) {
		Car[] carList = new Car[]{new Audi ("Audi A8", 12345f), new BMW("BMW E39 320i"), new VW("Volkswagen Golf III GTi"), new Seat("Seat Torpedo") };
		
		for (Car ride : carList){
			System.out.println(ride.toString());
		}
		
	}

}
