

import java.util.Scanner;
import java.util.Random;


public class Hangman
{
	public static void print(char array[]){
		
        for(int i = 0; i < array.length; i++){ //printing an array 
            System.out.print(array[i] + " ");
        } 
        
        System.out.println();
    }
	
    
    public static boolean isSolved(char[] array){ //checking to see if there are any asterisks to see if it is solved
    	
        boolean solved = true;
        
        for(int i = 0; i < array.length; i++){
        	
            if(array[i] == '*'){
            	
                solved = false;
            }
        }
       
        return solved;
    }
    
    
    public static boolean isValid(char input) { //check to see if char input is valid
    	
    	boolean valid = true;
    	
    	if (input >= 97 && input <= 122){
    		
    		valid = true;
    		
    	} else {
    		
    		valid = false;
    	}
    	
    	return valid;
    	
    	
    } 
    
	
/*******************    MAIN	 ********************/
	
    public static void main(String[] args){
    	
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String words[] = {"workshop","java", "eclipse", "program"};
        
        boolean play = true;
        
        while(play){
        	
            System.out.println("Lets Play Hangman!\n");
            
            int randomNum = random.nextInt(words.length); //generating a random number capped at the length of the word array
            char guessWord[] = words[randomNum].toCharArray(); // parses word being guessed to it's letters
            
            int guessCounter = guessWord.length; //total tries to guess a word.
            char playerGuess[] = new char[guessCounter];
            
            for(int i = 0; i < playerGuess.length; i++){ // Assign empty asterisk at start
                playerGuess[i] =  '*';
            } 
            
            boolean wordIsGuessed = false; //sets the state
            
            int tries = 0;
            //int missed = 0;
            
            
            
            while(!wordIsGuessed){
                
            	System.out.print("\nMystery Word: ");
            	
                print(playerGuess);
                
                System.out.print("Enter a guess: ");
                
                char input = scanner.next().charAt(0);
                tries++;
                
                boolean isLetter = isValid(input);
                
                //boolean isLetter = true;
                
                if (isLetter == false){
                	
                    System.out.println("\nInvalid entry! Please enter only characters!\n");
                    
                    //missed++;
                    
                } else {
                
                for(int i = 0; i < guessWord.length; i++){
                    	
                        if(guessWord[i] == input){
                        	
                            playerGuess[i] = input;
                            
                        } else {
                        	
                        	//missed++;
                        	
                        }
                    }
                	
                	
                }
                
                
                    
                 if(isSolved(playerGuess)){
                	 
                        wordIsGuessed = true;
                        
                        System.out.println("\nCongratulations!");
                        
                        System.out.println("It took you " +  tries + " tries" );
                        
                        //play = false;
                  }
                 
                 
                
            } /* End of wordIsGuessed */
            
            System.out.println("\nWould you like to play again? (y/n) : ");
            
            //scanner.nextLine();
            char choice = scanner.next().charAt(0);
            
            if(choice == 'n' || choice == 'N'){
                
            	System.out.println("\nSee you next time!");
            	
            	play = false;
            	
            	wordIsGuessed = true;
            	
            	
                
                
            } else if (choice == 'y' || choice == 'Y') {
            	
            	
            	play = true;
            	
            	wordIsGuessed = false;
            }
            
           }//end of play
            
            
            
    }
            
            
            
        }/*End*/
        
        
    
    
 
