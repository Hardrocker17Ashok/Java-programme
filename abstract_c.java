/* rule of abstract class :-
   1):-not create object of abstract class
   2):-abstract class keep have at least one abstract method/function
   3):- and all the abstract method implement is complesorry in child class
   4):- apart from abstract method you can implement another method in child class
   5):- you can access all un_abstract method in abstract class use another un_abstract child class
*/
abstract class base {
    void funk1() {
        System.out.println("hello goodmorning i am first method of class of base ");
    }

    abstract void funk2();

    abstract void funk3();
}

// implement all abstract method in child class who have in abstract class
class derived extends base {
    void funk2() {
        System.out.println("number 1 is of class derived");
    }

    void funk3() {
        System.out.println("number 2 is of class derived");
    }
}

public class abstract_c {
    public static void main(String args[]) {
        // base ob = new base(); //it's not allowed because not create object of
        // abstract class
        derived ob = new derived();
        ob.funk2();
        ob.funk3();
        ob.funk1();
    }
}
