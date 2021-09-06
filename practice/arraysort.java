public class arraysort {

    public static boolean isSorted(int a[], int n,int i){
    if(n==0 || n==1){
     return true;
    }
    if(a[i] > a[i+1]){
     return false;
    }
    return isSorted(a , n-1,++i);
 
 }

//  public static boolean isSorted2(int a[],int n){
//     if(n==0 || n==1){
//        return true;
//    }
//    boolean isSmallerSorted = isSorted2(a , n-1);
//    if(!isSmallerSorted){
//     return false;
//    }
//    if(a[0] > a[1]){
//     return false;
//    }else{
//      return true;
//    }
// }

public static boolean isSorted3(int a[],int n){
    if(n==0 || n==1){
        return true;
    }
    if(a[n-2] > a[n-1]){
     return false;
    }
    return isSorted3(a,n-1);
 }

 public static void main(String[] args) {
    int a[] = {1,2,3,54,59};
    if(isSorted(a,5,0)){
      System.out.println("Sorted");
    }else{
     System.out.println("Not Sorted");
    }
 }
    
}





