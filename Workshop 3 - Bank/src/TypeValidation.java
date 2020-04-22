import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TypeValidation {
	
	    public static int getInt() {
	    	
	    	Scanner sc = new Scanner(System.in);
	    	int validInt = 0;
	    	boolean flag = true;
	    	
	    	while(flag) {
	    		
	    		flag = false;
	    	
	    	try {
	    		
	        validInt = sc.nextInt();
	        
	        if(validInt < 0 || validInt > 10) {
	        	
	        	throw new IllegalArgumentException();
	        }
	        
	    	} catch(IllegalArgumentException e) {
	    		
	    		System.out.println("Input is not valid! Please enter a valid number: ");
	    		flag = true;
	    	}
	    	
	    }
	    	
	    	return validInt;
	    }
	    
	    

	    public static double getDouble(){
	    	

	    	Scanner sc = new Scanner(System.in);
	    	double validDouble = 0;
	    	boolean flag = true;
	    	
	    	while(flag) {
	    		
	    		flag = false;
	    	
	    	try {
	    		
	        validDouble = sc.nextDouble();
	        
	        if(validDouble < 0) {
	        	
	        	throw new IllegalArgumentException();
	        }
	        
	    	} catch(IllegalArgumentException e) {
	    		
	    		flag = true;
	    		
	    		System.out.println("Input is not valid! Please enter a valid number: ");
	    	}
	    	
	    }
	    	
	    	return validDouble;
	    } 

	    
	    public static double getAmount() {
	    	
	        double balance = 0.0;
	        boolean flag;
	        
	        do{
	            flag = true;
	            
	            try {
	            	
	                balance = TypeValidation.getDouble();
	                
	            } catch (Exception e){
	            	
	                System.out.print("Input is not valid! Please enter a valid number: ");
	                flag = false;
	            }
	            
	        } while(!flag);
	        
	        return balance;
	    }
	    
	    public static Bank[] recalculateAssets(Bank[] banks, ArrayList unsafeBanks){
	    	
	        for (Bank b: banks) {
	        	
	            b.calculateTotalAssets(unsafeBanks);
	        }
	        
	        return banks;
	    }



	    

}
