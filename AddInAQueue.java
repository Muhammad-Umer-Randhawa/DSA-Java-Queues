import java.util.Queue;
import java.util.LinkedList;

public class AddInAQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40);
        addInQueue(q, 25, 2);
        printQueue(q);
    }
    private static void addInQueue(Queue<Integer> q, int val, int idx){
        int n = q.size();
        for(int i=1; i<=idx; i++){
            q.add(q.remove());
        }
        q.add(val);
        for(int i=1; i<=n-idx; i++){
            q.add(q.remove());
        }
    }
    private static void printQueue(Queue<Integer> q){
        int n = q.size();
        for(int i=1; i<=n; i++){
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
    }
}
