public class var_arg_and_for_each {
    // it's var_args wereby we can use multiple function peremiter
    // static void sum(int... arr) {
    // it meant one argument have peremetrize complsory
    static void sum(int a, int... arr) {
        int sum = 0;
        // it's for_each loop that trevarsal each element of the loop
        for (int val : arr) {
            sum += val;
        }
        System.out.println("value of c= " + sum + a);
    }

    public static void main(String args[]) {
        // that is functio function_overloading
        sum(12, 11);
        sum(12, 11, 1);
        sum(12, 11, 100, 200);
        sum(12, 11, 10, 20, 30);
    }
}
