class Main{
    public static void main(String[] args) {
        int n=30;
        boolean[] arr=new boolean[n+1];
        for(int i=2;i<=Math.sqrt(n);i++){
            if (arr[i]==false){
                for(int j=2;i*j<=n;j++){
                    arr[i*j]=true;
                }
            }
        }
        for(int i=2;i<n;i++){
            if (arr[i]==false)
                System.out.print(i+" ");
        }

    }
}
