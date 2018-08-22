import java.io.*;
import java.util.*;
class Fibonacci
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b[]=new int[a];
b[0]=1;
b[1]=1;
for(int i=2;i<a;i++)
{
b[i]=b[i-2]+b[i-1];
}
for(int i=0;i<a;i++)
{
System.out.println(b[i]);
}
}
}

