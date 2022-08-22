public class mergeSortRecursion {
    public static void mergeArr(int l,int mid,int h,int[] arr)
    {
        int[] tem=new int[100];
        int i=l,j=mid+1,k=l;
        while(i<=mid && j<=h)
        {
            if(arr[i]<arr[j])
            {
                tem[k++]=arr[i++];
            }
            else
            {
                tem[k++]=arr[j++];
            }
        }
        while(i<=mid)
        {
            tem[k++]=arr[i++];
        }
        while(j<=h)
        {
            tem[k++]=arr[j++];
        }
        for(i=l;i<=h;i++)
        {
            arr[i]=tem[i];
        }
    }
    public static void mergeSort(int[] arr,int l,int h)
    {
        int mid;
        if(l<h)
        {
           mid=(l+h)/2;
           mergeSort(arr,l,mid);
           mergeSort(arr, mid+1, h);
           mergeArr(l,mid,h,arr); 
        }

    }
    public static void main(String[] args) {
        int[] arr={7,5,8,2,1,8,4,3,6};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
