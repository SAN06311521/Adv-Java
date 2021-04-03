public class MyLinkedListImplementation {
    public static void main(String[] args) {
        MyLinkedList<String> mll = new MyLinkedList<>();
        mll.add("First");
        mll.add("Second");
        mll.add("Third");
        mll.Print();
        System.out.println();
        MyLinkedList<Integer> ll = new MyLinkedList<>();
        for(int i = 0; i < 10; i++) {
            ll.add(i);
        }
        ll.Print();
    }
}
