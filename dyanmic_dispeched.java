// FUNCTION OVERLOADING

// class base {
//     int a;

//     void funk(int val) {
//         a = val;
//         System.out.println("number is of class base = " + a);
//     }
// }

// // inheritance
// class derived extends base {
//     void funk(int val) {    // this is function/method overloading 
//         a = val;
//         System.out.println("number is of class derived = " + a);
//     }
// }

// DYNAMACALLY DISPETCHED
class base {
    int a;

    void funk1(int val, int val2) {
        a = val + val2;
        System.out.println("number is of class base = " + a);
    }
}

// inheritance
class derived extends base {
    void funk2() { // this is function/method overloading
        System.out.println("number is of class derived");
    }
}

public class dyanmic_dispeched {
    public static void main(String args[]) {
        base ob = new derived(); // its allowed
        // derived ob1 = new base(); //its not allowed because derived class not acces
        // sub class
        ob.funk1(10, 20);
        // ob.funk2(); //its not allowed becase its acces only sub class method
    }
}
