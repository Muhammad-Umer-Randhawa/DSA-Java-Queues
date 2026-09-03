import java.util.Queue;
import java.util.LinkedList;

public class Remove {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40);
        removeFromQueue(q, 2);
        printQueue(q);
    }
    // removes a value at an index in a queue, index starts from 0
    private static void removeFromQueue(Queue<Integer> q, int idx){
        for(int i=1; i<=idx; i++){
            q.add(q.remove());
        }
        q.remove();
        int n = q.size();
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
