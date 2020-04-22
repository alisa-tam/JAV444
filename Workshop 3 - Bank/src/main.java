
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class main {
	
	static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
    	
        ArrayList<Integer> borrower_banks = new ArrayList<>();

        boolean flag = true;
        while(flag) {
        	
        	flag = false;
        	
        	
        		
        System.out.print("Enter # of Banks: ");
        int num_banks = TypeValidation.getInt();
        
        
        
        
        System.out.print("Enter asset limit: ");
        double asset_limit = TypeValidation.getDouble();


        Bank[] banks = new Bank[num_banks];
        
        for(int i = 0; i < num_banks; i++){
        	
            System.out.println("\n*******Information for Bank #" + (i + 1) + "*******");
            banks[i] = new Bank();
            banks[i].getInput();
        }
        
        System.out.println("\n*******Unsafe Banks*******");
        flag = true;
        while(flag){
        	
            int changed = 0;
            
            for(Bank a: banks){
            	
                if(a.getTotalAssets() < asset_limit && flag){
                	if(!borrower_banks.contains(a.getBankId())) {
                		borrower_banks.add(a.getBankId());
                		
                		changed++;
                		
                		banks = TypeValidation.recalculateAssets(banks, borrower_banks);
                	}
                	
                    
                    
                    //borrower_banks.add(a.getBankId());
                    
                    
                }
            }
            
            if(changed == 0){
            	
                flag = false;
            }
        }
        
        for(int a : borrower_banks){
        	
            System.out.println("Bank id: " + a);
        }



    }
    }
}
