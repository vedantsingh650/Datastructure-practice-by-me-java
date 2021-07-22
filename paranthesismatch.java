import java.util.*;
public class paranthesismatch {

    Stack<Character> s=new Stack<Character>();
  

    public boolean parentmatch(String exp) {
        char[] d=exp.toCharArray();

    for (char c : d) 
    {
        if(c=='{'||c=='('||c=='[') 
        {
            s.push(c);
        }       
        else if (!s.isEmpty() && s.peek()=='{' && c=='}')
        {
            s.pop();
        }
        else if (!s.isEmpty() && s.peek()=='(' && c==')')
        {
            s.pop();
        }
        else if (!s.isEmpty() && s.peek()=='[' && c==']')
        {
            s.pop();
        }
        else {return false;}
    }
    if(s.isEmpty())
        {
            return true;
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        
        paranthesismatch p=new paranthesismatch();
        System.out.println("matching = " + p.parentmatch("{w}"));
       
    }
    
}
