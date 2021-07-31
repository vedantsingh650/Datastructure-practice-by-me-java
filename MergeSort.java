public class MergeSort {

    public void Merge(int[] arr,int low,int mid,int high) {
        int i=low,j=mid+1,k=low;
        int[] b=new int[high+1];

        while(i<=mid && j<=high)
        {
            if(arr[i]>arr[j]){
                b[k]=arr[j];
                k++;j++;
            }
            else {
                b[k]=arr[i];
                k++;i++;
            }
        }

        while (i<=mid) {
            b[k]=arr[i];
            k++;i++;
        }
        while (j<=high) {
            b[k]=arr[j];
            k++;j++;
        }
        for (int l = low; l <= high; l++) {
            arr[l]=b[l];
        }
    }

public void MergeS(int[] arr,int low,int high) {
    
    if(low<high)
    {
        int mid=(low+high)/2;
        MergeS(arr, low ,mid);
        MergeS(arr, mid+1 ,high);
        Merge(arr, low, mid, high);
    }

}
public void display(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
    
}

    public static void main(String[] args) {
        MergeSort m=new MergeSort();
        int arr[]={9,9,8,57,6,54,4,3,32,1};
        m.MergeS(arr, 0, arr.length-1);
        m.display(arr);   
      
    }
    
}
