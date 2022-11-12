public class function {
    static void swap_function(int a, int b) {
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("after sweaping value of");
        System.out.println("value of a= " + a + "\nvalue of b= " + b);
    }

    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        System.out.println("value of a= " + a + "\nvalue of b= " + b);
        swap_function(a, b);
    }

}