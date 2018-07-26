import java.io.*;
import java.util.*;
class Primes
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
boolean b=true;
for(int j=a+1;j<b;j++)
{
for(int i=2;i<j/2;i++)
{
if(j%i==0)
{
b=false;
break;
}
}
if(b==true)
{
System.out.print(j);
}
}
}
}
