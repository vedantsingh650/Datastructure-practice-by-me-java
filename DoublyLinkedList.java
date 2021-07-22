public class DoublyLinkedList {
    
   private class Node
    {
        Node nxt;
        Node prv;
        int data;
        public Node(int data)
        {
            this.data=data;
        }
    }
    
    static Node head=null;
    static Node tail=null;

    public void Add(int data) {
        Node n=new Node(data);
        if(head==null &&tail==null)
        {
            n.nxt=null;
            n.prv=null;
            head=n;
            tail=n;
        }
        else{
            tail.nxt=n;
            n.prv=tail;
            n.nxt=null;
            tail=n;
        }    
    }

    public void display(Node head) {
        Node current=head;
        if(current==null)
         System.out.println("empty");
        else{
            while(current!=null){ 
                System.out.println("data is " + current.data);
                current=current.nxt;
            }
            
        }
    }

    public void DisplayReverse(Node tail) {
        Node current=tail;
        if(current==null)
         System.out.println("empty");
        else{
            while(current!=null){ 
                System.out.println("data is " + current.data);
                current=current.prv;
            }
            
        }
    }


    public static void main(String[] args) {
        DoublyLinkedList dbl=new DoublyLinkedList();
        dbl.Add(35);
        dbl.Add(5);
        dbl.Add(6);
        System.out.println("executed");
        dbl.DisplayReverse(tail);
       
    }
}
