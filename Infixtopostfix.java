import java.util.Stack;

public class Infixtopostfix {
    Stack<Character> st=new Stack<Character>();

    public int precedence(char c) {
        if(c=='^')
        {return 3;}
        else if(c=='*'||c=='/')
        {return 2;}
        else if(c=='+'||c=='-')
        {return 1;}
        
        return 0;
    }

    public String conversion(String s) {
        char[] a=s.toCharArray();
        String res="";
        for (char c : a) 
        {
            if(Character.isDigit(c))
            {
                res=res+c;
            }
            else
            {
                if(st.isEmpty()||c=='(')
                {
                    st.push(c);
                }
                else if(c==')')
                {
                    while (!st.isEmpty()&&!(st.peek()=='(')) 
                    {
                        char q=st.pop();
                        res=res+q;
                    }
                    st.pop();
                }
                else if(precedence(c)>precedence(st.peek()))
                {
                    st.push(c);
                }
                else if(precedence(c)<precedence(st.peek()))
                {
                    while (!st.isEmpty()&& precedence(c)<precedence(st.peek())) 
                    {
                        char q=st.pop();
                        res=res+q;
                    }
                    st.push(c);
                }
            }
        }

        while (!st.isEmpty()) 
        {
            char q=st.pop();
            res=res+q;
        }
    return res;
    }
    

    public static void main(String[] args) {
        Infixtopostfix i = new Infixtopostfix();
      
     System.out.println(i.conversion("((4*5)+(7/8))")); 

  //"13^/54*10+"
    }
}
