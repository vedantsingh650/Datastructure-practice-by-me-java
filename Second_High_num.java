public class Second_High_num {


public static int secondh(int[] arr) {
    int secnum=Integer.MIN_VALUE,highest=Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
        
        if(arr[i]>highest)
        {
            secnum=highest;
            highest=arr[i];
        }
       else if(arr[i]>secnum && arr[i]<highest){
            secnum=arr[i];
        }
    }
    return secnum;
}

    public static void main(String[] args) {
        
        int[] arr= {2,9,67,34,67,55,1,4,3};
       System.out.println( secondh(arr));

    }
    
}
