
public class insertionSort {
    public static void InsertionSort(int[] arr,int n)
    {
        for(int i=1;i<n;i++)
        {
            int j=i-1,x=arr[i];
            while(j>-1 && arr[j]>x)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=x;
            
        }
    }
    public static void main(String[] args) {
        int[] arr={6,7,3,4,9,1,4};
        InsertionSort(arr,arr.length);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
