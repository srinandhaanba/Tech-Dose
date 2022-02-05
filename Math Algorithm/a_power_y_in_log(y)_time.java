import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		long res=1;
		while(b>0)
        {
            if(b%2==1)
            {
                res*=a;
            }
            a*=a;
            b>>=1;
        }
        System.out.print(res);

	}
}
