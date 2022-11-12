class th implements Runnable {
    public void run() {
        int n = 0;
        while (n < 40) {
            System.out.println(n);
            n++;
        }
    }
}

public class thread_priorty {
    public static void main(String args[]) {
        // we can also take here other thread class object
        th ob1 = new th();
        th ob2 = new th();
        Thread n1 = new Thread(ob1);
        Thread n2 = new Thread(ob2);
        // we can set priorty each thread
        try {
            n1.setPriority(10);
            n2.setPriority(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("number of n1 priorty " + n1.getPriority());
        System.out.println("number of n2 priorty " + n2.getPriority());
        n1.start();
        n2.start();
    }
}
