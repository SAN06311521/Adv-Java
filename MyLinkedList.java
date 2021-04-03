public class MyLinkedList<E> {   //E define for generics
    Node<E> head;
    void add(E data) {
        Node<E> toAdd = new Node(data);
        if(head == null) {
            head = toAdd;
            return;
        }
        Node<E> temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = toAdd;
    }

    void Print() {
        Node<E> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public E removeLast() throws Exception{
        Node<E> temp = head;
        if(temp == null) {
            throw new Exception("Cannot remove as list is empty");
        }
        if(temp.next == null) {
            Node<E> toRemove = head;
            head = null;
            return toRemove.data;
        }
        while(temp.next.next != null) {
            temp = temp.next;
        }
        Node<E> toRemove = temp.next;
        temp.next = null;
        return toRemove.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public E getLast() throws Exception{
        Node<E> temp = head;
        if(temp == null) {
            throw new Exception("Cannot peek as list is empty");
        }
        while(temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }

    static class Node<E> {
        E data;
        Node<E> next;
        public Node(E data) {
            this.data = data;
            next = null;
        }
    }
}


