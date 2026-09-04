class Node{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}
public class LinkedListImplementation {
    Node head;
    Node tail;
    int size = 0;
    public void add(int val){
        Node temp = new Node(val);
        if(head == null){
            head = temp;
            tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    public int remove(){
        int front = head.val;
        if(head == null){
            return -1;
        }
        head = head.next;
        size--;
        return front;
    }
    public int peek(){
        if(head == null){
            return -1;
        }
        return head.val;
    }
    public void display(){
        if(head == null){
            System.out.println("Queue is empty");
            return;
        }
        else{
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LinkedListImplementation list = new LinkedListImplementation();
        list.add(1);
        list.add(2);
        list.add(3);

        list.display();
    }
}
