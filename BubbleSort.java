public class BubbleSort {

//O(n^2)
    public void Bsort(int[] arr) {
        boolean isSorted;
        for (int i = 0; i < arr.length-1; i++) {
                isSorted=true;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    isSorted=false;
                }
            }
            if(isSorted) break;

        }
    }

    public void display(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arrr={1,3,5,2,7,51,33,21,99};
        BubbleSort b=new BubbleSort();
        b.Bsort(arrr);
        b.display(arrr);
        
    }
}
