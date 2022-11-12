import java.util.Scanner;

//  <- THAT IS USE OF THROWS ->
// public class exception_throws_throw {
// public static int get_number(int a, int b) throws ArithmeticException {   // this is call exception throws
//     // it means function of get_number is saying that maybe error can come then you can hendled
//     int re = a / b;
//     return re;
// }

// public static void main(String args[]) {
//     int a, b;
//     Scanner sc = new Scanner(System.in);
//     a = sc.nextInt();
//     b = sc.nextInt();
//     try {
//         int c = get_number(a, b);
//         System.out.println(c);
//     } catch (Exception e) {
//         System.out.println("this is exception");
//     }
// }

//  <- THAT IS USE OF THROW  ->
class myexcepation extends Exception { // we can create exception itself
    public String show_string() {
        return "i am show string function";
    }

    public String get_string() {
        return "i am get string function";
    }
}

public class exception_throws_throw {
    public static void main(String args[]) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a < 10) {
            try {
                throw new myexcepation(); // here we throw this excaption
            } catch (Exception e) {
                System.out.println("this is exception");
            }
        } else {
            System.out.println("okay all right");
        }
    }
}
