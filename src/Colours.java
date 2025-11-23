public class Colours {

    public static final String RESET  = "\u001B[0m";
    public static final String RED    = "\u001B[31m";
    public static final String GREEN  = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE   = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN   = "\u001B[36m";
    public static final String WHITE  = "\u001B[37m";

    // Method that prints ONE coloured letter
    public static void printColour(char c) {
        c = Character.toUpperCase(c);

        switch (c) {
            case 'R': System.out.print(RED    + "R" + RESET + " "); break;
            case 'G': System.out.print(GREEN  + "G" + RESET + " "); break;
            case 'B': System.out.print(BLUE   + "B" + RESET + " "); break;
            case 'Y': System.out.print(YELLOW + "Y" + RESET + " "); break;
            case 'O': System.out.print(RED   + "O" + RESET + " "); break;
            case 'P': System.out.print(PURPLE + "P" + RESET + " "); break;
            case 'V': System.out.print(PURPLE  + "V" + RESET + " "); break;
            default:
                System.out.print("? ");
        }
    }
}
