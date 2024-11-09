package JavaClasses;

public class ForLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] Data = new String[5];
		Data[0]="red";
		Data[1] = "blue";
		Data[2] = "yellow";
		Data[3] = "grey";
		Data[4] = "blue";
		
		for(int i =0; i<Data.length; i++) {
			if(Data[i].equals("blue")) {
				System.out.println("car number "+i+" is bule");
			}
			else {
				System.out.println("car number "+i+" is not bule");
			}
		}

	}

}
