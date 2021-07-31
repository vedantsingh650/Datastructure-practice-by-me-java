public class InserionSort {
    
    public void Isort() {
        int key,j;
        int arr[]={1,5,3,6,9,78};
        for (int i = 1; i < arr.length-1; i++) {
            key=arr[i];j=i-1;
            while (j>=0&& arr[j]>key) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

        System.out.println(" "+arr);
    }

    public static void main(String[] args) {
        InserionSort n=new InserionSort();
        n.Isort();
    }
}
