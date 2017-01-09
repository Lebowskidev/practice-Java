package gpack;
import java.util.Random;
import java.util.Scanner;


public class Game {
	private static Scanner in = new Scanner(System.in);
	
	public void randomgames(){
		Random random = new Random();
	    int randomnumber = random.nextInt(9);
	    System.out.println("Pleas input numer");
	    int number = in.nextInt();
	    
	    if(number == randomnumber){
	    	System.out.println(number + "=>"+randomnumber + "Win!!!");
	    }else
	    	if(number < randomnumber ){
	    	System.out.println("Your number is small");
	    }else
	    	if(number > randomnumber){
	    	System.out.println("Your number is big");
	    } else if(number != randomnumber){
	    	System.out.println("Game Over =>"+randomnumber);	    	
	    }    	
	}
	
	public void game(){
		System.out.println(" 1. Start game");
		System.out.println(" 2. Exit");
		System.out.println("Input number of menu");
		int casse = in.nextInt();
		switch(casse){
		case 1: randomgames();
		case 2: System.exit(1);
		}
	}
}
