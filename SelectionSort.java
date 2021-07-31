public class SelectionSort {
  //O(n^2)
    public void ssort(int[] arr) {
       int j;
        
        for (int i = 0; i < arr.length-1; i++) {
            int indexofmin=i;
            for ( j = i; j < arr.length; j++) {
                if(arr[indexofmin]>arr[j])
                {
                    indexofmin=j;
                }   
            }
            if(i!=j){
            int tmp=arr[indexofmin];
            arr[indexofmin]=arr[i];
            arr[i]=tmp;
        }
        }
        
    }
  
  
  
    public static void main(String[] args) {
        SelectionSort s=new SelectionSort();
        int arr[]={9,8,7,6,5,4,3,2,1};
        s.ssort(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
