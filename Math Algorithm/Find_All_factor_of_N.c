#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n,i;
    scanf("%d",&n);
    for(i=1;i*i<n;i++){
        if(n%i==0)
        {
          printf("%d %d ",i,n/i);
        }
    }
    if(i*i==n)printf("%d",i);
}
