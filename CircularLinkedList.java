
public class CircularLinkedList {

    private class Node{
          int data;
          Node nxt;

        public Node(int data){
            this.data=data;
        }
    }
    public Node head = null;  
    public Node tail = null;  

    public void Add(int data) {
        Node n=new Node(data);

        if(head==null)
        {
            head=n;
            tail=n;
            n.nxt=head;
        }
        else
        {
            tail.nxt=n;
            tail=n;
            tail.nxt=head;
        }
        
    }

    public int Length()
    {
        int i=0;
        if(head!=null&&tail!=null)
        {
            Node current=head;
            i=1;
            while(current != tail)
            {
                current =current.nxt;
                i++;
            }
        }
        return i;
    }


    public void AddAtIndex(int index,int data){
        Node n=new Node(data);
        Node current=head;
        if(head==null)
        {
            head=n;
            tail=n;
            n.nxt=head;
        }
        else{
            int i=0;
            while (i<index-1) {
            
                current =current.nxt;
                i++;
            }
            n.nxt=current.nxt;
            current.nxt=n;
        }

    }

    public void BeginAdd(int data){
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            tail=n;
            n.nxt=head;
        }
        else{
            n.nxt=head;
            head=n;
            tail.nxt=head;
        }

    }

    public void display() {
        Node current=head;
        if(head==null)
        {System.out.println("EMPTY");}
     else{ 
        do
        { 
            System.out.println("data  "+current.data);
            current =current.nxt;
        }while(current != head); 

        // System.out.println("data  "+current.data);
        // current =current.nxt;         
        // while(current != head)
        // {      
        //     System.out.println("data  "+current.data);
        //     current =current.nxt;
        // }
     }
    }

    // public void delete(int element) {
        

    // }

    public static void main(String[] args) {
        CircularLinkedList c = new CircularLinkedList();
        
        System.out.println("Before " );
        // c.Add(2);
        // c.Add(4);
        // c.Add(23);
        // c.Add(26);
        // c.Add(123);
        // c.display();
        int l =c.Length() ;
        System.out.println("Afterr "+l);
    //    c.BeginAdd(99);
    //    c.AddAtIndex(2,55);
    //    c.AddAtIndex(23,965);
    //    c.display();
        
    }
    
}
