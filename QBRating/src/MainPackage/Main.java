package MainPackage;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many touchdowns did he throw?");
		double td = input.nextDouble();
		System.out.println("How many yards did he throw for?");
		double yds = input.nextDouble();
		System.out.println("How many interceptions did he throw?");
		double picks = input.nextDouble(); 
		System.out.println("How many passes did he complete?");
		double comp = input.nextDouble();
		System.out.println("How many passes did he attempt?");
		double att = input.nextDouble();
		
		double a = ((comp / att) - .3) * 5;
		double b = ((yds / att) - 3) * .25;
		double c = (td / att) * 20;
		double d = 2.375 - ((picks / att) * 25);
		
		double qbrating = (((a + b + c + d) / 6) * 100);
		System.out.println("QB Rating: " + qbrating);
	}

}
