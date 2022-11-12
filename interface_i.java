
/* rule of interface class :-
   1):- not create object of interface class
   2):- abstract class keep have only function defenition you can't implement any function in interface class
   3):- and all the method of interface class is complesorry implement in child class
   4):- apart from abstract method you can implement another method in child class
   5):- interface class declare with name of 'interface' instade name of 'class'
   5):- we can implement any function in interface class with 'default' function name as line number "14"
*/
interface base {
    // void funk1() {
    // System.out.println("hello goodmorning i am first method of class of base ");
    // }
    default void check() {
        System.out.println("hello i am default function of interface class ");
    }

    void funk2();

    void funk3();
}

// implement all method in child class who have in interface class
class derived1 implements base {
    void funk1() {
        System.out.println("hello goodmorning i am first method of class of base ");
    }

    public void check() {
        System.out.println("hello i am function of implement  class ");
    }

    public void funk2() {
        System.out.println("number 1 is of class derived");
    }

    public void funk3() {
        System.out.println("number 2 is of class derived");
    }
}

public class interface_i {
    public static void main(String args[]) {
        // base ob = new base(); //it's not allowed because not create object of
        // interface class
        derived1 ob = new derived1();
        ob.funk2();
        ob.funk3();
        ob.funk1();
        ob.check();
    }
}
