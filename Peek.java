import java.util.Queue;
import java.util.LinkedList;

public class Peek {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40);
        peek(q, 2);
    }
    // peeks at a specific index in a queue, index starts from 0
    private static void peek(Queue<Integer> q, int idx){
        for(int i=1; i<=idx; i++){
            q.add(q.remove());
        }
        System.out.println(q.peek());
        int n = q.size();
        for(int i=1; i<=n-idx; i++){
            q.add(q.remove());
        }
    }
}
