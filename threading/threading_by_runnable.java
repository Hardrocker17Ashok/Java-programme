class th implements Runnable {
    public void run() {
        int n = 0;
        while (n < 20) {
            System.out.println(n);
            n++;
        }
    }
}

public class threading_by_runnable {
    public static void main(String args[]) {
        // we can also take here other thread class object
        th ob1 = new th();
        th ob2 = new th();
        Thread n1 = new Thread(ob1);
        Thread n2 = new Thread(ob2);
        n1.start();
        n2.start();
    }
}
