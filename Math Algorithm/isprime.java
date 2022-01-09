import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=2;i<Math.sqrt(N);i++)
		{
		    if(N%i==0)
		    {
		        System.out.print("Not Prime");
		        System.exit(0);
		    }
		}
		if(N==1)
		System.out.print("Not Prime");
		else
		System.out.print("Prime");
	
	}
}
