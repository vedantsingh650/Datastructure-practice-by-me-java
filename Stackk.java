  public class Stackk {

        int size;
        int top;
        int[] arr;

        public Stackk(int size){
            this.top=-1;
            this.size=size;
            this.arr = new int[size];
        }
    

    public boolean isEmpty() {
        return top==-1;   
    }

    public boolean isFull() {
        return top>=size-1;
            
    }

    public void push(int data) {
        if(isFull())
        {
          System.out.printf("Stack is Full element %d not pushed",data);
        }else{  
            top++;
            arr[top]=data;
        }
    }
    public int pop() {
        int value;
        if(isEmpty())
        {
            System.out.println("empty");
            return -1;
        }
        else{
            value=arr[top];
            top--;
            return value;
        }
    }

    public int peek() {
        if(!isEmpty())
        {
            return arr[top];
        }
        return -1;
    }
    public static void main(String[] args) {
        Stackk s=new Stackk(5);
        s.push(2);
        s.push(12);
        s.push(245);
        s.push(105);
        s.push(25);
        s.push(245);

        // System.out.println("stack is empty " + s.isEmpty());
        // System.out.println("stack is full " + s.isFull());
        // System.out.println("peek element " + s.peek());
        // System.out.println("pop element " + s.pop());
    }
    
}
