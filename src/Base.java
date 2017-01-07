import java.util.Scanner;


public class Base {

	/**
	 * @param args
	 */
	
	public static Scanner in = new Scanner(System.in);
	
	public static void strwork(){
		String str = "";
		System.out.println("Write your name");
		str = in.nextLine();
		System.out.print("Hello "+ str);
	}
	
	public static void massive(){
		int[] mas = new int [10];
		
		for(int i = 0; i < 10;i++){
			mas[i] = i;
			System.out.print(" " + mas[i]);
		}
		System.out.println("  length = " + mas.length);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		strwork();
		massive();
		
	}

}
