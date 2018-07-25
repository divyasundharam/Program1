import java.io.*;
import java.util.*;
class Sum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int K=sc.nextInt();
int a[]=new int[N];
int sum=0;
for(int i=0;i<N;i++)
{
a[i]=sc.nextInt();
}
for(int j=0;j<K;j++)
{
sum=sum+a[j];
}
System.out.print(sum);
}
}
