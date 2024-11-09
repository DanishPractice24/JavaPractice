package JavaAugustClass;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		
//		int [] arr = new int [6];
//		arr [0] = 10;
//		arr [1] = 11;
//		arr [2] = 18;
//		arr [3] = 22;
//		arr [4] = 25;
//		arr [5] = 20;
//		
//		for (int x:arr) { //advanced for loop (data type variable - array
//			System.out.println(x);
//		}
//		
//		ArrayList list =new ArrayList();
//		list.add(10);
//		list.add("abc");
//		list.add('c');
//		list.add(378.9f);
//		list.add(10);
//		list.add("abc");
//		list.add('c');
//		list.add(378.9f);
//		list.add(10);
//		list.add("abc");
//		list.add('c');
//		list.add(378.9f);
//		System.out.println(list);

		
//		ArrayList list = new ArrayList();
//		list.add(45);
//		list.add(76);
//		list.add(78);
//		list.add(45);
//		list.add(90);
//		
//		System.out.println(list);
//		
//		System.out.println(list.get(3));
//		System.out.println(list.size());
//		
//		ArrayList li = new ArrayList(5);
//		li.add(45);
//		li.add(76);
//		li.add(11);
//		li.add(12);
//		li.add(23);
//		
//		ArrayList list2 = new ArrayList();
//		list2.add(23);
//		list2.add("abc");
//		list2.add("xyz");
//		list2.addAll(li);
//		list2.add(null);
//		
//		
//		System.out.println(list2);
//		list2.removeAll(li);
//		System.out.println(list2);
//		list2.remove(null);
//		System.out.println(list2);
//		list2.remove(0);
//		System.out.println(list2); 
		
		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(879);
		data.add(55);
		data.add(576);
		data.add(600);	
		data.add(555);
		
		data.add(3,500);
		System.out.println(data);
		data.set(3, 434);
		System.out.println(data);
		System.out.println(data.isEmpty());
		System.out.println(data.contains(55));
//		data.clear();
//		System.out.println(data);
		
		
//		for(int x: data) {
//			System.out.println(x+10);
//		}
		
//		for(int i=0; i<data.size();i++) {
//			System.out.println(data.get(i));
//		}
		
		
		Iterator it = data.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		
		}
	}

}
