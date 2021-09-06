package practice;
public class recursion {
    
//                          4 X 5 = 20
    public static int mul(int m,int n) {
        if(n==1)
        return m;

        int smallans=mul(m, (n-1))+m;
       return smallans;
    }

    public static int sum_num(int n) {
        //Base Case
        if(n==0)
            return 0; 
        //Recursive call
        int smallans=sum_num(n/10);
        //calculation
        int lasdigit=n%10;
        int answer=smallans+lasdigit;
        return answer;
    }

    public static void main(String[] args) {
     
        System.out.println(sum_num(9999));
    }
}
