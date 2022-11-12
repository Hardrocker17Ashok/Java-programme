import java.util.Scanner;

import java.util.Scanner;

class myexcepation extends Exception { // we can create exception itself
    public String show_string() {
        return "i am show string function";
    }

    public String get_string() {
        return "i am get string function";
    }
}

public class excaption_userdefined {
    public static void main(String args[]) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a < 10) {
            try {
                throw new myexcepation(); // here calling user defined exception
            } catch (Exception e) {
                System.out.println("this is exception");
            }
        } else {
            System.out.println("okay all right");
        }
    }
}
