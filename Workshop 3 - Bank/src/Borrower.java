import java.util.Scanner;

public class Borrower {
	
    private int borrower_id;
    private double borrower_amt;

    public Borrower(){
    	
        borrower_id = 0;
        borrower_amt = 0.0;
    }

    public int getBorrowId() {
    	
        return borrower_id;
    }

    public void setBorrowId(int id) {
    	
        borrower_id = id;
    }

    public double getBorrowAmt() {
    	
        return borrower_amt;
    }

    public void setBorrowAmt(double ba) {
    	
        this.borrower_amt = ba;
    }

    public void getInput(int bank_id){
    	
    	Scanner sc = new Scanner(System.in);
    	int id;
    	
        System.out.print("Enter Borrower ID: ");
        
        boolean flag = true;
        do {
        	
        	flag = false;
        	
        	id = sc.nextInt();
        
        	if (id == bank_id) {
        	
        	System.out.println("Bank cannot borrow from itself! Please enter a different bank id!");
        	flag = true;
        	
        	}
        	
        } while(flag);
        
        this.setBorrowId(id);
        
        System.out.print("Enter borrowed amount: ");
        double ba = sc.nextDouble();
        this.setBorrowAmt(ba);
    }
}
