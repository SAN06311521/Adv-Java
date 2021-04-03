public class TestInterrupt extends Thread{
    public void run() {
        for(int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestInterrupt t1 = new TestInterrupt();
        t1.start();
        t1.interrupt();
    }
}
