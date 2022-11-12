class A {
    int a;

    // constructor
    A() {
        System.out.println("hello i'am constructor of A and default");
    }

    // constructor overloading
    A(int num) {
        a = num;
        System.out.println("hello i'am constructor of A1");
    }

    A(int num, int num2) {
        a = num + num2;
        System.out.println("hello i'am constructor of A2");
    }

    void funk() {
        System.out.println("number is = " + a);
    }
}

// inheritance
class B extends A {
    B(int val, int val2, int val3) {
        // if we can not inisilize any constructure here than the child class called
        // allwayes default constructure
        super(val, val2); // we use super keyword for access particular constructure of parent class
        int sum = val + val2 + val3;
        System.out.println("hello i'am constructor of B and sum of all element is = " + sum);
        // if we want access all element of class A than we should inisilize all element
        // and method of class A is public
    }
}

public class oops {
    public static void main(String args[]) {
        B ob = new B(10, 20, 30);
        ob.funk(); // access metod with class object
    }
}
