public class CircularQueue {
    
 int rear,front;
 int[] arr;

 public CircularQueue(int size){
     this.front=-1;
     this.rear=-1;
    this.arr=new int[size];
 }
 public void enque(int data) {
     if(front==-1&&rear==-1)
     {
         front=0;rear=0;
         arr[rear]=data;
     }
     else if(((rear+1)%arr.length)==front)
     {
         System.out.println("queue is full");
     }
     else{
        rear=(rear+1)%arr.length;
         arr[rear]=data;
     }
     
 }

 public void deque() {
    if(front==-1 && rear==-1){
        System.out.println("Empty CircularQueue");
    }
   else if(front==rear)
   {
    System.out.println("Dequed data = "+ arr[front]);   
       front=-1;rear=-1;
   }
   else{
    System.out.println("Dequed data = "+ arr[front]); 
    front=(front+1)%arr.length; 
   }
 }

public void display() {
    int h=front;
    while(!(h==rear)){
        System.out.println(arr[h]);
        h=(h+1)%arr.length;   
    }System.out.println(arr[h]);

}
    public static void main(String[] args) {
     CircularQueue c=new CircularQueue(4);
     c.enque(3);
     c.enque(13);
     c.enque(35);
     c.enque(73);
     c.display();
     c.deque();  c.deque();  c.deque();
     System.out.println("----------------------------------");
    
     c.enque(56); c.display();
    }
}
