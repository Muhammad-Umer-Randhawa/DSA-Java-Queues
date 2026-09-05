public class CircularArrayImplementation { //using a circular array
    int[] arr;
    int f;
    int r;
    int size;
    CircularArrayImplementation(int size){
        arr = new int[size];
    }
    public void add(int val){
        if(size == arr.length){
            System.out.println("Queue is full");
            return;
        }
        arr[r++] = val;
        if(r == arr.length){
            r = 0;
        }
        size++;
    }
    public int remove(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        int front = arr[f++];
        if(f == arr.length){
            f = 0;
        }
        size--;
        return front;
    }
    public int peek(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[f];
    }
    public void display(){
        if(size == 0){
            System.out.println("Queue is empty");
            return;
        }
        if(f>=r){
            for(int i=f;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
            for(int i=0;i<r;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        else{
            for(int i=f; i<r; i++){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        CircularArrayImplementation list = new CircularArrayImplementation(5);
        list.add(1);
        list.add(2);
        list.add(3);

        list.display();
    }
}
