//Scanner
import java.util.*;
import java.util.InputMismatchException;

public class Menu { //start of menu class
    
    public int displayMenu(){ // displaymenu method
        Scanner in = new Scanner(System.in);
        int choice;

            try{ // start of try-catch}
                System.out.println("=============================");
                Thread.sleep(1000);
                System.out.println("        MASTERMIND");
                Thread.sleep(1000);
                System.out.println("=============================");
                Thread.sleep(1000);
                System.out.println("1. PLAY");
                Thread.sleep(1000);
                System.out.println("2. INSTRUCTIONS");
                Thread.sleep(1000);
                System.out.println("3. EXIT");
                Thread.sleep(1000);
                System.out.print("\nEnter your choice: ");
            }catch(InterruptedException e){
                System.out.println("An error occurred while displaying the menu.");
            } // end of try-catch

            //Validating choice input
            do{
                try{ //start of try-catch
                choice = in.nextInt();
                if(choice < 1 || choice > 3){
                        System.out.print("\nInvalid. Please enter 1, 2, or 3: ");
                }
                }catch(InputMismatchException e){
                    System.out.print("\nPlease enter an INTEGER!");
                    in.next(); // flush
                    choice = 0; // reset choice to invalid value
                } // end of try-catch
            }while(choice < 1 || choice > 3); // end of choice validation

        return choice;

    }

    public void displayInstructions(){ // displayInstructions method
        try{ // start of try-catch
        System.out.print("\n=========== INSTRUCTIONS ===========\n");
        Thread.sleep(1000);
        System.out.print("Mastermind is a code-breaking puzzle game.\n");
        Thread.sleep(200);
        System.out.print("You must guess a hidden 4-digit code.\n\n");
        Thread.sleep(200);
        System.out.print("Feedback after each guess:\n");
        Thread.sleep(200);
        System.out.print(" - Black Peg: correct letter in correct position\n");
        Thread.sleep(200);
        System.out.print(" - White Peg: correct letter in wrong position\n\n");
        Thread.sleep(200);
        System.out.print("Try to guess the code in 10 attempts!\n");
        Thread.sleep(200);
        System.out.print("=====================================\n");
        Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("An error occurred while displaying instructions.");
        } // end of try-catch
    } // end of displayInstructions method
        
    public Menu(){} // constructor


} // end of menu class