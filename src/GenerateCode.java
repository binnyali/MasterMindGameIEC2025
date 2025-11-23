
import java.util.Random;
public class GenerateCode {
    //Attributes 
    private final int codeLength=4;
    private final char[] colours = {'R', 'G', 'B', 'Y', 'O', 'P', 'V'};
    private String secretCode;

    private  Random random;

    //Constructor for Random
      public GenerateCode() {
        this.random = new Random();
        secretCode = generate();
    }
    
    //Generating the secret code
    public String generate() {
        StringBuilder secret = new StringBuilder();

        for (int i=0; i<codeLength; i++) {
            int index = random.nextInt(colours.length);
            secret.append(colours[index]);
        }
        return secret.toString();
   }
   public String getSecretCode() {
        return secretCode;
   }
}
