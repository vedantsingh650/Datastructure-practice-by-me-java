public class searchele {
    

    public static boolean search(int[] a,int n,int i,int searchelement) {
      boolean ans=false;
        if(i!=n)
        {
            if(searchelement==a[i])
            return true;
            else{
                ans=search(a, n, i+1, searchelement);
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,54,59};
        System.out.println(search(a, 5, 0, 3));
    }
}
