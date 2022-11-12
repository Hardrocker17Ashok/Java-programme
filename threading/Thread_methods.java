class th implements Runnable {
    public void run() {
        int n = 0;
        while (n < 10) {
            // we can find current thread name (method no. 1)
            System.out.println(n + " " + Thread.currentThread().getName());
            n++;
            // we can stop thread for particular time (method no. 2)
            // try {
            // Thread.sleep(1000);
            // } catch (Exception e) {
            // System.out.println(e);
            // }
        }
    }
}

public class Thread_methods {
    public static void main(String args[]) {
        th ob1 = new th();
        th ob2 = new th();

        // we can give name of particular thread_function
        // Thread n1 = new Thread(ob1, "first");
        // Thread n2 = new Thread(ob2, "second");

        Thread n1 = new Thread(ob1);
        Thread n2 = new Thread(ob2);
        // we can also use this for given thread name
        // (method no 3)
        n1.setName("ashok");
        n2.setName("sharma");

        // this check that thread is alive ya not (method no. 5)
        System.out.println(n1.isAlive());
        System.out.println(n2.isAlive());

        n1.start();
        // we can stop thread for until the first thread is complete (method no. 4)
        // we use when we want excuted all thread before it
        // try {
        // n1.join();
        // } catch (Exception e) {
        // System.out.println(e);
        // }
        n2.start();
        // after check
        System.out.println(n1.isAlive());
        System.out.println(n2.isAlive());
    }
}
