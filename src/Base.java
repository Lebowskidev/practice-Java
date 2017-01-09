import java.util.Collections;
import java.util.Scanner;
import gpack.Game;
import java.util.ArrayList;
import java.io.*;

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
	
	public static void listcreate(){
		ArrayList testdata = new ArrayList();
		System.out.println("Create new name");
		String name = in.next();
		testdata.add(name);
		testdata.add("qwerty");
		testdata.add("asd");
		System.out.println(testdata);
		System.out.println("size = " + testdata.size());
		Collections.sort(testdata);
		System.out.print("sort = " + testdata);
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game gobject = new Game();
		gobject.game();
	    strwork();
		massive();
		listcreate();
		
	}

}
