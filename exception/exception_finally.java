import java.util.Scanner;

public class exception_finally {
    public static int funk() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter the first number");
            int num1 = sc.nextInt();
            System.out.println("enter the second number");
            int num2 = sc.nextInt();
            int re = num1 / num2; // if sucessfully excuted than return with right number and run also finally
            return re;
        } catch (Exception e) {
            System.out.println("some another problem created whereby programmer have been terminated");
        } finally { // the block of finally will be excuted all time whither exception will come ya
                    // not
            System.out.println("this is finally");
        }
        return -1;
    }

    public static void main(String args[]) {
        int val = funk();
        System.out.println("the result is = " + val);
    }
}