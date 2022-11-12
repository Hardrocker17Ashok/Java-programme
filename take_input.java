import java.util.Scanner;

public class take_input {
    public static void main(String args[]) {
        System.out.print("take a input from user\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first input\n");
        int a = sc.nextInt();
        System.out.print("enter second input\n");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("the sum of two number=>");
        System.out.print(sum);

    }
}
