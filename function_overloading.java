public class function_overloading {
    void sum(int a, int b) {
        int c;
        c = a + b;
        System.out.println("value of c= " + c);
    }

    void sum(int a, int b, int d) {
        int c;
        c = a + b + d;
        System.out.println("value of c= " + c);
    }

    void sum(int a, int b, int d, int e) {
        int c;
        c = a + b + d + e;
        System.out.println("value of c= " + c);
    }

    void sum(int a, int b, int d, int e, int f) {
        int c;
        c = a + b + d + e + f;
        System.out.println("value of c= " + c);
    }

    public static void main(String args[]) {
        // that is functio function_overloading
        // if function not have static than we create class object see below
        function_overloading obj = new function_overloading();
        obj.sum(12, 11);
        obj.sum(12, 11, 1);
        obj.sum(12, 11, 100, 200);
        obj.sum(12, 11, 10, 20, 30);
    }
}
