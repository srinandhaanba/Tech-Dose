import java.util.Scanner;
public class Hello{
    public static long findgcd(long a,long b)
    {
        if(a==0)
        {
            return b;
        }
        return findgcd(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),r=sc.nextInt();
        r=(n-r)<r?(n-r):r;
        long p=1,k=1,gcd;
        while(r!=0)
        {
            p*=n;
            k*=r;
            gcd=findgcd(p,k);
            p/=gcd;
            k/=gcd;
            n--;
            r--;
        }
        System.out.print(p);
   
    }
}
