import java.util.ArrayList;

public class Words {

	 private ArrayList<Telephone> Words;

	 public Words(int[] numberSet) throws Exception{
		 
	        Words = new ArrayList<>();
	        
	        for(int i = 0; i < numberSet.length; i++){
	        	
	            try{
	            	
	                Words.add(new Telephone(numberSet[i]));
	                
	            } catch (Exception e){
	            	
	                throw new Exception(e.getMessage());
	            }
	        }
	    }

	    public ArrayList createWordList(){
	    	
	        ArrayList<String> listOfWords = new ArrayList<>();
	        
	        for( char pos1 : Words.get(0).getPhoneLetters() ){
	        	
	            for( char pos2 : Words.get(1).getPhoneLetters()){
	            	
	                for( char pos3 : Words.get(2).getPhoneLetters()){
	                	
	                    for( char pos4 : Words.get(3).getPhoneLetters()){
	                    	
	                        for( char pos5: Words.get(4).getPhoneLetters()){
	                        	
	                            for( char pos6 : Words.get(5).getPhoneLetters()){
	                            	
	                                for ( char pos7 : Words.get(6).getPhoneLetters()){
	                                	
	                                    StringBuilder word = new StringBuilder();
	                                    
	                                    word    .append(pos1)
	                                            .append(pos2)
	                                            .append(pos3)
	                                            .append(pos4)
	                                            .append(pos5)
	                                            .append(pos6)
	                                            .append(pos7);
	                                    
	                                    listOfWords.add(word.toString());
	                                }
	                            }
	                        }
	                    }
	                }
	            }
	        }
	        
	        return listOfWords;
	    }
	}

