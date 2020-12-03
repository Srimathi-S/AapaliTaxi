package car;

import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int km=sc.nextInt();
		Mini mini=new Mini(km);
		Sedan sedan=new Sedan(km);
		SUV suv=new SUV(km);
		System.out.print("Mini - Rs. "+mini.calculate()+", ");
		System.out.print("Sedan - Rs. "+sedan.calculate()+", ");
		System.out.print("SUV - Rs. "+suv.calculate());
	}
}
