class Table1 {
    synchronized void printTable(int n) {       //method is NOT synchronized
        for(int i = 1; i <= 5; i++) {
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e + " .. error!");
            }
        }
    }
}

class MyThread11 extends Thread {
    Table1 t1;
    MyThread11(Table1 t1) {
        this.t1 = t1;
    }
    public void run() {
        t1.printTable(5);
    }
}

class MyThread22 extends Thread {
    Table1 t2;
    MyThread22(Table1 t2) {
        this.t2 = t2;
    }
    public void run() {
        t2.printTable(10);
    }
}

public class TestSynchronize {
    public static void main(String[] args) {
        Table1 ob = new Table1();
        MyThread11 t1 = new MyThread11(ob);
        MyThread22 t2 = new MyThread22(ob);
        t1.start();
        t2.start();
    }
}
