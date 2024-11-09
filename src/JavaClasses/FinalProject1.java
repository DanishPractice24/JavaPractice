package JavaClasses;

import java.util.Scanner;

public class FinalProject1 {

	public static void main(String[] args) {
		
		System.out.println("Hello welcome to the food app");
		System.out.println("Please create a password: ");
		
		Scanner scan = new Scanner(System.in);    // Variable
		String pass1 = scan.next();
		System.out.println("Your password is now: "+ pass1);
		
		System.out.println("please enter your password: ");
		String pass = scan.next();
		
		while(!pass.equals(pass1)) {
			System.out.println("this is not the right password please try again:");
			pass = scan.next();
		}
		System.out.println("access grented");
		System.out.println("Are you hungry Yes or No :");
		String ans1 = scan.next();
		
		if(ans1.equals("Yes")) {
			System.out.println("Choose what you wnat to eat between pizza, burger or fish");
			String ans2 = scan.next();
			while (!ans2.equals("pizza")&&!ans2.equals("burger")&&!ans2.equals("fish")) {
				System.out.println("sorry we do not have it what would you like between pizza, burger or fish");
				ans2 = scan.next();
			}
			if(ans2.equals("pizza")||ans2.equals("burger")||ans2.equals("fish")) {
				System.out.println("Do you want something to drink?:");
				String ans3 = scan.next();
				
				while(!ans3.equals("yes")&& !ans3.equals("no")) {
					System.out.println("Wrong command please try again: ");
					ans3 = scan.next();
				}
				if(ans3.equals("yes")) {
					System.out.println("what would you like to drink coke or juise ?:");
					String ans4 = scan.next();
					
					while(!ans4.equals("coke")&& !ans4.equals("juice")) {
						System.out.println("sorry we don't have it what would you like between coke and juise: ");
						ans4 = scan.next();
				}
					if(ans4.equals("coke")||ans4.equals("juise")) {
						System.out.println("Great you have orderd "+ ans2 + " and " +ans4 );
					}
					System.out.println("please confirm you password");
					pass= scan.next();
					
					while (!pass.equals(pass1)) {
						System.out.println("This is not the right password please try again");
						pass = scan.next();
					}
			}
				System.out.println("thank you your order is on it's way ");
				
		}
			else {
				System.out.println("you have ordered "+ ans2);
				
			
			System.out.println("please confirm you password");
			pass= scan.next();
			
			while (!pass.equals(pass1)) {
				System.out.println("This is not the right password please try again");
				pass = scan.next();
			}
			}
		}
		else {
			System.out.println("Alright have a good day");
		}

	}

	
}
