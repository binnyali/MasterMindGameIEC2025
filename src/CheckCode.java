
public class CheckCode {

    //Attributes
    private final int CODE_LENGTH = 4;
    private int blackpegs;
    private int whitepegs;
    private boolean isCorrect;

    //Method to check if guess is equal to code
    public String guessCode(String code, String guess){
        this.blackpegs = 0;
        this.whitepegs = 0;

        //Check for black pegs
        for(int i = 0; i < CODE_LENGTH; i++){
            if(guess.charAt(i) == code.charAt(i)){
                blackpegs++;
            }
        }

        //Check for white pegs
        for(int i = 0; i < CODE_LENGTH; i++){
            for(int j = 0; j < CODE_LENGTH; j++){
                if(i != j && guess.charAt(i) == code.charAt(j)){
                    whitepegs++;
                }
            }
        }

        if(code.equals(guess)){
            isCorrect = true;
        }

        //Returning statement
        return blackpegs + " Black Pegs, " + whitepegs + " White Pegs";
    }
    
    public CheckCode(){ // constructor
        isCorrect = false;
        blackpegs = 0;
        whitepegs = 0;
    }

    public boolean getIsCorrect(){
        return isCorrect;
    } // end of getIsCorrect method


}
