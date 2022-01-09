import java.util.Scanner;
import java.lang.Math; 
public class Hello{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N%2==0)
        {
            System.out.print(2+" ");
            while(N%2==0)
            {
                N/=2;
            }
        }
        for(int i=3;i<=Math.sqrt(N);i+=2)
        {
            if(N%i==0)
            {
                System.out.print(i+" ");
            }
            while(N%i==0)
            {
                N/=i;
            }
        }
        if(N>1)
        {
            System.out.print(N);
        }
    }
}
