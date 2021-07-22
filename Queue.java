//Limitation we cant use previous empty 'front' to store the value until it set to empty
public class Queue 
{
    int front,rear;
    int[] arr;
       public Queue(int size){
        this.front=-1; this.rear=-1;
        this.arr = new int[size];
       }

public void enque(int ele) 
{
    if(front==-1 && rear==-1){
        front+=1;
        rear+=1;
        arr[rear]=ele;
    }
    else if(rear <arr.length-1){
        rear+=1;
        arr[rear]=ele;
    }
    else
    {
        System.out.println("Queue is full");
    }

}

public void deque() {
    if(front==-1 && rear==-1){
        System.out.println("Queue is empty");
    }
    else if(rear==front){
        front=-1;rear=-1;
    }
    else{
        front+=1;
    } 
}
   
    public static void main(String[] args) {
        Queue q=new Queue(4);
        q.enque(3);
        q.enque(31);
        q.enque(3);
        q.enque(3);
        q.deque();
        q.deque();
        q.deque();
        q.enque(10);
        q.deque();
        q.deque();
    
    }
}



