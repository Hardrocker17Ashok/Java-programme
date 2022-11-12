class th extends Thread {
    public void run() {
        int n = 0;
        while (n < 20) {
            System.out.println(n);
            n++;
        }
    }
}

public class threading_by_threadclass {
    public static void main(String args[]) {
        th ob1 = new th();
        th ob2 = new th();
        ob1.start();
        ob2.start();
    }
}
