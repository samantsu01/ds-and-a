package Practice;

public class LL {

    private Node  head;
    private Node tail;

    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirstElement(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size+=1;
    }

    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }
}
