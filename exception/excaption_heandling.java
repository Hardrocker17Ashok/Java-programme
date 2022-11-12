import java.util.InputMismatchException;
import java.util.Scanner;

public class excaption_heandling {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // if we give integer value ya give 0 value than create excaption
        // save this excaption we use try block for heandle this problem
        try {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("division is = " + num1 / num2);
        }

        // YOU CAN USE MULTIPLE CATCH BLOCK FOR EACH SPECIFIC EXEPTION
        // for specific arithmetic problem
        catch (ArithmeticException e) {
            System.out.println("you given 0 input plz give right input");
        }
        // for specific wrong input problem
        catch (InputMismatchException e) {
            System.out.println("you given only integer input ");
        }
        // for another problem
        catch (Exception e) {
            System.out.println("some another problem created ");
        }
    }
}