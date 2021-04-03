class Reentrant {
    public synchronized void m() {
        n();
        System.out.println("This is m method");
    }
    public synchronized void n() {
        System.out.println("This is n method");
    }
}

public class ReentrantEg {
    public static void main(String[] args) {
        final Reentrant r = new Reentrant();
        Thread t1 = new Thread() {
            public void run() {
                r.m();
            }
        };
        t1.start();
    }
}
