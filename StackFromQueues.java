import java.util.*;
public class StackFromQueues {
    Queue<Integer> q = new LinkedList<>();
    public StackFromQueues() {
        
    }
    // pop and top efficient but push is costly
    public void push(int x) { //  O(n)
        // q ke front pe add karna
        q.add(x);
        int n = q.size();
        for(int i=1;i<=n-1;i++){
            q.add(q.remove());
        }
    }
    
    public int pop() { //  O(1)
        return q.remove();
    }
    
    public int peek() { //  O(1)
        return q.peek();
    }

    // pop and top costly but push is efficient
    // public void push(int x) { //  O(1)
    //     q.add(x);
    // }
    
    // public int pop() { //  O(n)
    //     int n = q.size();
    //     for(int i=1;i<=n-1;i++){
    //         q.add(q.remove());
    //     }
    //     return q.remove();
    // }
    
    // public int peek() { //  O(n)
    //     int n = q.size();
    //     for(int i=1;i<=n-1;i++){
    //         q.add(q.remove());
    //     }
    //     int p = q.peek();
    //     q.add(q.remove()); // imp
    //     return p;
    // }
    
    public boolean empty() {
        return (q.size()==0);
    }
}