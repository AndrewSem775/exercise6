//Andrew Semchishin
//Sun, feb 25
import java.util.Scanner;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
class intTester {
    Scanner input = new Scanner(System.in);
    public void promptInt(String a) {
        System.out.println(a);
        String userInput = input.nextLine();

        int userInt;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = parseInt(userInput);
                isInt = true;
                System.out.println(userInt);
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a integer");
                System.out.println(a);
                userInput = input.nextLine();
            }
        }
    }
}

class doubleTester {
    Scanner input = new Scanner(System.in);
    public void promptDouble(String a) {
        System.out.println(a);
        String userInput = input.nextLine();

        double userDouble;
        boolean isDouble = false;
        while (!isDouble) {
            try {
                userDouble = parseDouble(userInput);
                isDouble = true;
                System.out.println(userDouble);
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a double");
                System.out.println(a);
                userInput = input.nextLine();
            }
        }
    }
}

class stringTester {
    Scanner input = new Scanner(System.in);

    public void promptString(String a) {
        System.out.println(a);
        String userInput = input.nextLine();

        boolean isString = false;
        while (!isString){
            try {
                parseDouble(userInput);
                System.out.println(userInput + " is not a string");
                System.out.println(a);
                userInput = input.nextLine();
            } catch (NumberFormatException e){
                isString = true;
                System.out.println(userInput);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        intTester testInt = new intTester();
        testInt.promptInt("Enter an int");

        doubleTester testDouble = new doubleTester();
        testDouble.promptDouble("Enter a double");

        stringTester testString = new stringTester();
        testString.promptString("Enter a string");
    }
}