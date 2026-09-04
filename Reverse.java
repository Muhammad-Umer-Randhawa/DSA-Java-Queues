import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
public class Reverse {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40);
        System.out.println("Original Queue:");
        printQueue(q);

        System.out.println('\n');

        reverseQueue(q);
        System.out.println("Reversed Queue:");
        printQueue(q);
    }
    private static Queue<Integer> reverseQueue(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        int n = q.size();
        for(int i=1; i<=n; i++){
            s.push(q.remove());
        }
        for(int i=1; i<=n; i++){
            q.add(s.pop());
        }
        return q;
    }
    private static void printQueue(Queue<Integer> q){
        int n = q.size();
        for(int i=1; i<=n; i++){
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
    }
}
