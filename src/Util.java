import java.util.Scanner;

public class Util {

 private static final Scanner scanner = new Scanner(System.in);
    
    public static boolean getConfirmation(String message) {
        System.out.println(message);
        String input;
        boolean result = false;
        boolean shouldContinue = true;
        while (shouldContinue) {
            input = scanner.nextLine();
            if (input.equals("")) {
                input = scanner.nextLine();
            }
            input.toLowerCase();
            if (input.equals("yes") || input.equals("y")) {
                result = true;
                shouldContinue = false;
            } else if (input.equals("no") || input.equals("n")) {
                shouldContinue = false;
            } else {
                System.out.println("Input is not correct");
            }
        }
        return result;
    }
}
