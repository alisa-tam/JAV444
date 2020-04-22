import java.util.ArrayList;
import java.util.Scanner;

	public class Bank{
		
	    private int bank_id;
	    private int borrower_num;
	    
	    private double balance;
	    private double total_assets;
	    private Borrower[] borrower_arr;



	    public Bank(){
	    	
	        bank_id = 0;
	        borrower_num = 0;
	        
	        balance = 0.00;
	        total_assets = 0.00;
	    }


	    public int getBankId() {
	    	
	        return bank_id;
	    }

	    public void setBank_id() {
	    	
	        bank_id = TypeValidation.getInt();
	      
	    }

	    public double getBalance() {
	    	
	        return balance;
	    }

	    public void setBalance() {
	    	
	        balance = TypeValidation.getDouble();
	    }

	    public int getBorrowerNum(){
	    	
	        return borrower_num;
	    }

	    public void setBorrowerNum(){
	    	
	        borrower_num = TypeValidation.getInt();
	    }

	    public double getTotalAssets() {
	    	
	        return total_assets;
	    }

	    public void setTotalAssets() {
	    	
	        if(borrower_num != 0){
	        	
	            double lended = 0;
	            for(int i = 0; i < borrower_num; i++){
	            	
	                lended += borrower_arr[i].getBorrowAmt();
	            }
	            
	            total_assets += balance + lended;
	        }
	    }

	    public void getInput(){
	    	
	    	System.out.print("Enter Bank ID: ");
	        this.setBank_id();
	        
	        System.out.print("Enter Bank Balance: ");
	        this.setBalance();
	        
	        System.out.print("Enter # of Borrowers: ");
	        this.setBorrowerNum();
	        
	        this.borrower_arr = new Borrower[borrower_num];
	        
	        for(int i = 0; i < borrower_num; i++){
	        	
	            this.borrower_arr[i] = new Borrower();
	            this.borrower_arr[i].getInput(this.bank_id);
	        }
	        
	        this.setTotalAssets();

	    }

	    public void calculateTotalAssets(ArrayList b_Banks){
	    	
	        double total = balance;
	        
	        for (Borrower borrower : borrower_arr) {
	        	
	            for (int i = 0; i < b_Banks.size(); i++) {
	            	
	                if (!b_Banks.get(i).equals(borrower.getBorrowId())) {
	                	
	                    total += borrower.getBorrowAmt();
	                    
	                }
	            }
	        }
	        
	        this.total_assets = total;
	    }
	   

	}
