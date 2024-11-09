package JavaClasses;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		Map cars = new HashMap();
		cars.put("BMW", 3);
		cars.put("Audi",2);
		cars.put("Honda", 5);
		cars.put("Tata", 4);
		cars.put("Mercedez", 8);
		
		cars.remove("key: BMW");
		int size = cars.size();
		
		
		System.out.println(cars.get("Audi"));
		
	}

}
