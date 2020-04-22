import java.util.ArrayList;
import java.util.Collections;
import java.io.*;

public class Alphabet {
	
    File file;

    public Alphabet(String fileName) throws Exception {
    	
        file = new File(fileName);
    }
    
    public ArrayList createAlphabetArray(){
    	
        ArrayList<Character> array = new ArrayList<>();
        
        for(int i = 0; i < 26; i++){
        	
            array.add((char)(i + 65));
        }
        
        return array;
    }

    public ArrayList count() throws IOException {
    	
        ArrayList<Character> letters = createAlphabetArray();
        ArrayList<Integer> letterCount = new ArrayList<Integer>(Collections.nCopies(letters.size(),0));
        
        try(BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(file))){
        	
            char c;
            
            while((c = (char)buffer.read()) != (char)-1){
            	
                int i = letters.indexOf(Character.toUpperCase(c));
                
                if(i != -1){
                	
                    letterCount.set(i, letterCount.get(i) + 1);
                }
            }
            
        } catch (FileNotFoundException e){
        	
            throw new FileNotFoundException("File Not Found");
        }
        
        return letterCount;
    }

    

}
