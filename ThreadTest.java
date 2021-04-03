public class ThreadTest {
    public static void main(String[] args) {
        PrintDemo PD = new PrintDemo();
        ThreadDemo1 T1 = new ThreadDemo1("Thread - 1", PD);
        ThreadDemo1 T2 = new ThreadDemo1("Thread - 2", PD);
        T1.start();
        T2.start();
        try {
            T1.join();
            T2.join();
        } catch(Exception e) {
            System.out.println("Interrupted");
        }
    }
}
