package JavaClasses;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
	
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("peach");
		fruits.add("melon");
		fruits.add("water melon");
				
		int Listsize = fruits.size();
		String place = fruits.get(4);    // Variable
		fruits.set(1, "green banana");
		
		
		
		System.out.println(fruits);
		
	}

}
