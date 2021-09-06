public class arraySum {
    
public static int sum(int[] a,int n) {
    if(n==1)
    return a[0];
    int sum =0;
    sum = a[n-1]+sum(a, n-1);
    return sum;
}

public static void main(String[] args) {
    int[] a={1,2,3,4,5};
    System.out.println(sum(a, 5 ));
}

}
