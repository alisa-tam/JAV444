import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    	
        boolean valid = false;
        
        do {
            try{
            	
                System.out.print("Enter a seven-digit number: ");
                
                int[] set = FileBuilder.getSevenDigitNumber();
                
                Words newWords = new Words(set);
                
                ArrayList<String> words = newWords.createWordList();
                
                FileBuilder.createFile(set, words);
                
                System.out.println("File Created");
            
            } catch (Exception e){
            	
                valid = true;
                System.out.println(e.getMessage());
            }
            
        } while (valid);
    }
}
