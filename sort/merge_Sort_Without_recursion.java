public class merge {
    public static void mergeArr(int l,int mid,int h,int[] arr)
    {
        int[] tem=new int[h+1];
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

    public static void mergeSort(int[] arr,int n)
    {
        int l,h,mid,p;
        for(p=2;p<=n;p*=2)
        {
            for(int i=0;i+p-1<n;i+=p)
            {
                l=i;
                h=i+p-1;
                mid=(l+h)/2;
                mergeArr(l,mid,h,arr);
            }
        }
        if(p/2<n)
        {
            mergeArr(0,(p/2)-1,arr.length-1, arr);
        }
    }
    public static void main(String[] args) {
        int[] arr={7,5,8,2,1,8,4,3,6};
        mergeSort(arr,arr.length);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
