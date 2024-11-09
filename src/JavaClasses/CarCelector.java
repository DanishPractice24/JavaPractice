package JavaClasses;

import java.util.Scanner;

public class CarCelector {

	public static void main(String[] args) {
		
		System.out.println("Do you want to a car yes or no ?");
		Scanner scan = new Scanner(System.in);
		String Ans1 = scan.next();
		
		if (Ans1.equals("yes")) {
			System.out.println("what is your favorite colour between red-blue-yellow ?");
			String Ans2 = scan.next();
			
			if (Ans2.equals("red")) {
				System.out.println("we have it in stock woul you like to see it yes or no ?");
				String Ans3 = scan.next();
				if(Ans3.equals("yes")) {
					System.out.println("Great ! lest's check the car");
				}
				else {
					System.out.println("No warries we will check something else");
				}
			}
			
			else if (Ans2.equals("blue")){
				System.out.println("we can order it");
			}
			else {
				System.out.println("we don't have it in stock");
			}

		}
		else {
			System.out.println("No warries have a good day");
		}

	}

}
