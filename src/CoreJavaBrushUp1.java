
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		
		int myNum = 5;
		String websit = "Rahul shetty academy";
		char letter = 'r';
		double dec = 6.78;
		boolean myCard = true;
		
		System.out.println(myNum + "is the value stored in the myNume variable");
		System.out.println(websit);
		//Arrays 
		int[] arr = new int [5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		
		// for loop
		for(int i=0; i<arr.length; i++) {
			System.out.println(i);
		}
		for (int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		String [] name = {"rahul", "shetty", "selenium"};
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		for(String s: name) {
			System.out.println(s);
		}

	}

}
