import java.util.*;
public class ReverseFirstKElements {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
        int k = 3;
        System.out.println("Original Queue:");
        printQueue(q);

        System.out.println('\n');

        reverseFirstKElements(q, k);
        System.out.println("Queue after reversing first " + k + " elements:");
        printQueue(q);
    }
    private static Queue<Integer> reverseFirstKElements(Queue<Integer> q, int k){
        Stack<Integer> st = new Stack<>();
        for(int i=1; i<=k; i++){
            st.push(q.remove());
        }
        while(st.size() > 0){
            q.add(st.pop());
        }
        int n = q.size();
        for(int i=1; i<=n-k; i++){
            q.add(q.remove());
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
