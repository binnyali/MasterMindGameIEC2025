/*
MasterMind Game: A simple applicaton replicating the classic game of MasterMind
Group Members: Binny Ali, Ali Noor.
Date: November 23rd, 2025.
 */

//Importing packages
import java.util.*;

public class App { // start of app class
    public static void main(String[] args) throws Exception { //start of main class
    Scanner in = new Scanner(System.in); //Scanner

    //Variables
    String guess = "", playAgain = "", code = "", statement = "";
    int choice;

    //Objects
    Menu menu = new Menu();


    do{ //start of do-while loop that loops game
        //Display Menu
        choice = menu.displayMenu();
        
        //Check choice
        if(choice==1){
            GenerateCode gen = new GenerateCode(); // Generating new generatorcode object
            CheckCode check = new CheckCode(); // Generating new checkcode object
            code = gen.getSecretCode(); //Getting secret code

            for(int i = 0; i < 10; i++){
                statement = ""; // Resetting statement
                System.out.print("\n\n=---------------------------=\nGUESS ATTEMPT " + (i+1) + "/10\n=---------------------------=\n");
                System.out.print("\nEnter your guess (4 letters --> ");
                char[] allowed = {'R', 'G', 'B', 'Y', 'O', 'P', 'V'};

            for (char c : allowed) {
            Colours.printColour(c);
            }
            System.out.print("): ");

                //Validating guess
                do{
                    guess = in.nextLine().toUpperCase(); // Getting user guess and converting to uppercase
                    if (!isValidGuess(guess)) {
                        System.out.print("\n" + Colours.RED + "Invalid guess. Try again." + Colours.RESET);
                        System.out.print("\nEnter your guess (4 letters --> ");
                        char[] allow = {'R', 'G', 'B', 'Y', 'O', 'P', 'V'};

                        for (char c : allow) {
                            Colours.printColour(c);
                        }
            System.out.print("): ");
                    }
                }while(!isValidGuess(guess)); // end of validating guess

                statement = check.guessCode(gen.getSecretCode(), guess); //Checking guess
                System.out.print(statement); // Displaying result

                if(check.getIsCorrect()){ // Checking if guess is correct
                    System.out.print("\nCONGRATULATIONS! The secret code was: ");
                        for (int j = 0; j < code.length(); j++) {
                        Colours.printColour(code.charAt(j));
                         }
                    System.out.println();
                    System.out.println("and you got it after " + (i+1) + " attempt(s). \n");
                    i=10; //Exiting loop
                } // end of checking if guess is correct

                else if(i==9){ // If user has used all attempts
                    System.out.println("\nGAME OVER! You've used all your attempts.\nThe correct code was: " + code + "\nBetter luck next time!\n");
                } // end of If user has used all attempts
            }
        }
        else if(choice==2){
            menu.displayInstructions();
        }
        else{
            System.out.println("Exiting the game. Goodbye!");
            choice = 0;
        }
    }while(choice != 0); // end of do-while loop that loops game

    } // end of main class


    public static boolean isValidGuess(String guess){
        //check if user even inputted anything and if so that it is 4 characters long.
        if (guess == null || guess.length() != 4){
            return false;
        }

        String allowed = "RGBYOPV";

        for(int i = 0; i < guess.length(); i++){
            char c = Character.toUpperCase(guess.charAt(i));
            if (allowed.indexOf(c) == -1){
                return false;
            }
        }
        return true; //passed everything


    }

} // end of app class
