public class GuessANo extends Thread {
    private int no;

    public GuessANo(int no) {
        this.no = no;
    }

    public void run() {
        int counter = 0;
        int guess = 0;
        do {
            guess = (int) (Math.random() * 100 + 1);
            System.out.println(this.getName() + " guesses " + guess);
        }while(guess != no);
        System.out.println("Correct! " + this.getName() + " in " + counter + " guesses.");
    }
}
