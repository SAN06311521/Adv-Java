class Customer {
    int amt = 10000;
    synchronized void withdraw(int amt) {
        System.out.println("Going to withdraw..");
        if(this.amt < amt) {
            System.out.println("Less balance!");
            try{
                wait();
            } catch (Exception e) {

            }
        }
        this.amt -= amt;
        System.out.println("Withdrawal complete..");
    }

    synchronized void deposit(int amt) {
        System.out.println("going to deposit..");
        this.amt += amt;
        System.out.println("Deposit completed..");
        notify();
    }
}

public class TestInterThread {
    public static void main(String[] args) {
        final Customer c = new Customer();
        new Thread() {
            public void run() {
                c.withdraw(1500);
            }
        }.start();
        new Thread() {
            public void run() {
                c.deposit(1000);
            }
        }.start();
    }
}
