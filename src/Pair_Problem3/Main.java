package Pair_Problem3;

public class Main {

	public static void main(String[] args) {
		Pair first = new Pair("Nemo", 256f);
		Pair second = new Pair("Nemo", 256);
		Pair third = new Pair("Nemo", 256);
		
		if (first.equals(second)) System.out.println("First and Second are an equal pair..."); 
		else System.out.println("First and Second are not equal!");
		if (second.equals(third)) System.out.println("Second and Third are an equal pair..."); 
		else System.out.println("Second and Third are not equal!");
		

	}

}
