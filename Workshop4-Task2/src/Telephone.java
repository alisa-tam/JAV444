public class Telephone {
	
    private int phoneNumber;
    private char[] phoneLetters;

    public Telephone(int number) throws Exception {
    	
        if(number < 2 || number > 9){
        	
            throw new Exception("Not a valid number.");
            
        } else {
        	
            phoneNumber = number;
            
            switch (number){
                case 2:
                    phoneLetters = new char[]{'A', 'B', 'C'};
                    break;
                case 3:
                    phoneLetters = new char[]{'D','E','F'};
                    break;
                case 4:
                    phoneLetters = new char[]{'G','H','I'};
                    break;
                case 5:
                    phoneLetters = new char[]{'J','K','L'};
                    break;
                case 6:
                    phoneLetters = new char[]{'M','N','O'};
                    break;
                case 7:
                    phoneLetters = new char[]{'P','R','S'};
                    break;
                case 8:
                    phoneLetters = new char[]{'T','U','V'};
                    break;
                case 9:
                    phoneLetters = new char[]{'W','X','Y'};
                    break;
            }
        }
    }
    
    public int getPhoneNumber(){
    	
        return phoneNumber;
    }

    public char[] getPhoneLetters(){
    	
        return phoneLetters;
    }

}