package JavaClasses;

import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);        // Variable
	System.out.println("Welcome to the test");
	System.out.println("Question 1: what is 2+2 in letters");
	String ans1 = scan.next();
	
	while(!ans1.equals("four")) {
		System.out.println("you had the wron answer try again what is 2+2 in letters");
		ans1 = scan.next();
		
	}
	System.out.println("Great you had the right answer");
	System.out.println("Question 2: What is toronto ?");
	
	String ans2 = scan.next();   //  Variable
	while(!ans2.equals("Canada")) {
		System.out.println("you had the wron answer please try again :");
		ans2 = scan.next();
		
	}
	System.out.println("Great you passed the test");

	}

}
