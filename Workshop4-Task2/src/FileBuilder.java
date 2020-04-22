import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class FileBuilder {

	public static int[] getSevenDigitNumber() throws Exception{
		
	        int[] numbers = {0};
	        boolean valid;
	        
	        do {
	        	
	        	valid = false;
	        	
	            Scanner sc = new Scanner(System.in);
	            String temp = sc.nextLine();
	            
	            numbers = new int[temp.length()];
	            
	            for(int i = 0; i < temp.length(); i++){
	            	
	                numbers[i] = temp.charAt(i) - '0';
	            }
	            
	            	
	            if(numbers.length != 7){
	            	
	            	System.out.println("Too short! Input 7 digits: ");
	            	
	                valid = true; 
	                
	            } else {

	            
	           for(int a: numbers){
	            		
	                if( a == 1 || a == 0){
	                	
	                    valid = true; 
	                    
	                    System.out.println("Cannot input 1 or 0");
	                    
	                } 
	                
	                
	                
	              }
	              
	            }
	            
	        } while (valid);
	        
	        
	        return numbers;
	        
	}
	        
	        
	        
	      


	    public static void createFile(int [] set, ArrayList listOfWords) throws Exception{
	    	
	        String fileName = generateFileName(set);
	        
	        try(PrintWriter output = new PrintWriter(new FileWriter(fileName))){
	        	
	            for(int i = 0; i < listOfWords.size(); i++){
	            	
	                output.println("Word number " + (i + 1) + ": " + listOfWords.get(i));
	            }
	            
	        } catch (Exception e){
	        	
	            e.printStackTrace();
	            
	            throw new Exception("Export Error");
	        }
	    }

	    public static String generateFileName(int[] set){
	    	
	        StringBuilder sb = new StringBuilder();
	        
	        for(int i = 0; i < set.length; i++){
	        	
	            sb.append(set[i]);
	        }
	        
	        sb.append(".txt");
	        
	        return sb.toString();
	    }
	}



