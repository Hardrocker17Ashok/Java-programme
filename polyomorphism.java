class base1 {
    void funk1() {
        System.out.println("number is of class base 1");
    }
}

class derived1 extends base1 {
    void funk1() {
        System.out.println("number is of class derived");
    }
}

public class polyomorphism {
    public static void main(String args[]) {
        base1 ob = new derived1(); // its allowed
        // derived ob1 = new base(); //its not allowed because derived class not acces
        // sub class
        ob.funk1();// it's call runtime polyomorphism because decided at the run time that which
                   // function are excutet
                   // and if if having function overloading in dyanimic distpacvth
    }
}
