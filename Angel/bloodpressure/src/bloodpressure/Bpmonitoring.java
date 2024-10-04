package bloodpressure;

import java.util.Scanner;

public class Bpmonitoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		float i=250;
		System.out.println("Please Enter your bp:");
		float pressure=input.nextFloat();
		while( pressure>=i) {
			System.out.println("You are doomed!");
			break;
			}
			
			
	}

	}


