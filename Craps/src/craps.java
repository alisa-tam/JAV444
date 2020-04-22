
//import java.util.Scanner;
import java.util.Random;


public class craps {
	
	static Random rand = new Random();
	
	
	public static int roll() {
		
		int temp = rand.nextInt(6);
		
		while (temp == 0) {
			
			temp = rand.nextInt(6);
		}
		
		return temp;
		
	}
	
	public static int sum(int one, int two) {
		
		int sum = one + two;
		
		return sum;
		
	}
	
	public static void main(String[] args){
		
		int dice_one, dice_two, result;
		int setPoint= 0;
		int points = 0;
		
		System.out.println("Let's Play Craps!");
		
		boolean play = true;
		
		while (play) {
		
		dice_one = roll();
		dice_two = roll();
		
		result = sum(dice_one, dice_two);
		
		setPoint = result;
		
		if (setPoint == 2  || setPoint == 3 || setPoint == 12){
			
			System.out.println("\nYou rolled " + dice_one + " + " + dice_two + " = " + result);
	        System.out.println("Craps, you lose");
	        
	        play = false;
	        break;
	        
		} else if(setPoint == 7 || setPoint == 11) {
			
			System.out.println("\nYou rolled " + dice_one + " + " + dice_two + " = " + result);
			System.out.println("Natural, you win!");
			
			play = false;
			break;
	     
		} else {
			
			System.out.println("\nYour set point is: " + setPoint);
			
		}
		
		
		
		boolean playing = true;
		
		while(playing) {
			
			dice_one = roll();
			dice_two = roll();
			
			points = sum(dice_one, dice_two);
			
			if (setPoint == points) {
				
				System.out.println("\nYou rolled " + dice_one + " + " + dice_two + " = " + points);
				System.out.println("Same as set point, you win!");
				
				playing = false;
				
			} else if(points == 7) {
				
				System.out.println("\nYou rolled " + dice_one + " + " + dice_two + " = " + points);
				System.out.println("You rolled 7, you lose");
				
				playing = false;
				
			} else {
				
				System.out.println("\nYou rolled " + dice_one + " + " + dice_two + " = " + points);
				
				
				//play = false;
				
			}
			
			play = false;
		}
		
		
		
	}
		
			
		
	}

}
