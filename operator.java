public class operator {
    public static void main(String args[]) {
        // airtmatic operator
        // like +,-,*,/
        int a = 20;
        int b = 10;
        boolean c = true;
        boolean d = true;
        System.out.println("the sum of these number= ");
        System.out.println(a + b);
        System.out.println("the subtration of these number= ");
        System.out.println(a - b);
        System.out.println("the multiplication of these number= ");
        System.out.println(a * b);
        System.out.println("the division of these number= ");
        System.out.println(a / b);
        // relational operator
        // like <,>,>=,<=,==
        if (a > b) {
            System.out.println("a is big");
        } else {
            System.out.println("b is big");
        }
        // logical operator
        // like &,|,!=
        if (c & d) {
            System.out.println("is correct");
        } else if (c | d) {
            System.out.println("is also correct");
        }
    }
}
