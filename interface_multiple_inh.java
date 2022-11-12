interface base {
    void funk1();

    void funk2();
}

// extends base by derived
interface derived extends base {
    void funk3();

    void funk4();
}

// implement all method who have in all upper interface classess
class combination implements derived {
    void function() {
        System.out.println("hello goodmorning i am first method of class of base ");
    }

    public void funk1() {
        System.out.println("number 1 is of class derived");
    }

    public void funk2() {
        System.out.println("number 2 is of class derived");
    }

    public void funk3() {
        System.out.println("number 3 is of class derived");
    }

    public void funk4() {
        System.out.println("number 4 is of class derived");
    }
}

public class interface_multiple_inh {
    public static void main(String args[]) {
        // interface class
        combination ob = new combination();
        ob.funk1();
        ob.funk2();
        ob.funk3();
        ob.funk4();
        ob.function();
    }
}
