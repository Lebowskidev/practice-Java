import java.util.Scanner;
import java.util.Random;

public class Base {

	/**
	 * @param args
	 */
	
	private static Scanner in = new Scanner(System.in);
	
	public static void strwork(){
		String str = "";
		System.out.println("Write your name");
		str = in.nextLine();
		System.out.println("Hello "+ str);
		System.out.println(str.length());
		System.out.println(str.concat(" boss"));
	}
	
	public static void massive(){
		int[] mas = new int [10];
		
		for(int i = 0; i < 10;i++){
			mas[i] = i;
			System.out.print(" " + mas[i]);
		}
		System.out.println("  length = " + mas.length);		
	}
	
	public static void randomgames(){
		Random random = new Random();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		strwork();
		massive();
		
	}

}
