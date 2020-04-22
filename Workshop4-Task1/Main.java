import java.util.ArrayList;
import java.util.Scanner;

public class Main {

		    public static void main(String[] args) {
		    	
		        boolean valid = true;
		        
		        Alphabet alpha = null;
		        String fn;
		        
		        do {
		        	
		            try(Scanner sc = new Scanner(System.in)){
		            	
		                System.out.print("Enter the file name: ");
		                fn = sc.nextLine();
		                alpha = new Alphabet(fn);
		                
		                valid = false;
		                
		            } catch (Exception e){
		            	
		                System.out.println("ERROR: Could not create the file!");
		            }
		            
		        } while(valid);
		        

		        ArrayList<Character> letters = alpha.createAlphabetArray();
		        
		        try{
		        	
		            ArrayList<Integer> letterCount = alpha.count();
		            
		            for (int i = 0; i < letterCount.size(); i++){
		            	
		                System.out.println("Number of " + letters.get(i) +"'s: " + letterCount.get(i));
		            }
		        } catch (Exception e){
		        	
		            System.out.println("Could Not Print!");
		        }


		    }
		}




		
		
	

	
