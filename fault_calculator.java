import java.util.Scanner;

public class fault_calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        char op;
        // here println and print two different do work
        // println =>this word print the line and also create new line and space
        // print =>this word print the line only
        System.out.println("enter number 1 and operation and after enter number 2");
        num1 = sc.nextInt();
        op = sc.next().charAt(0);
        num2 = sc.nextInt();
        if (num1 == 10 || num1 == 11 || num1 == 20 || num2 == 100 || num2 == 50 || num2 == 200) {
            // answer with error
            switch (op) {
                case '+':
                    System.out.println("the sum is = " + 100);
                    break;
                case '-':
                    System.out.println("the sub is = " + 100);
                    break;
                case '*':
                    System.out.println("the multiplay is = " + 100);
                    break;
                case '/':
                    System.out.println("the division is = " + 100);
                    break;
                default:
                    System.out.println("plz insert correct value");
            }
        } else {
            switch (op) {
                case '+':
                    System.out.println("the sum is = " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("the sub is = " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("the multiplay is = " + (num1 * num2));
                    break;
                case '/':
                    System.out.println("the division is = " + (num1 / num2));
                    break;
                default:
                    System.out.println("plz insert correct value");
            }
        }
    }
}
