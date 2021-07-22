
class Bsearch{
      public static void main(String[] args) {
        int res,element=856;
        int[] arr={1,2,3,4,5,6,9,88,775,856};
        res=binarySearch(arr, element);
        System.out.println("index is = " + res);
       
   }


public static int binarySearch(int[] arr,int element) {
    
    int low=0,mid,high=arr.length;
    //Sorting for increasing order array
    while (low<=high) {
        mid=(low+high)/2;
        if (arr[mid]==element) {
            return mid;
        }
        else if(arr[mid]>element)
        {
            high=mid-1;
        }
        else 
        {
            low=mid+1;
        }

    }    
    return -1;
}
  

}