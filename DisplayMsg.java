class DisplayMsg implements Runnable{
    private String msg;
    public DisplayMsg(String msg) {
        this.msg = msg;
    }
    public void run() {
        while(true) {
            System.out.println(msg);
        }
    }
}
