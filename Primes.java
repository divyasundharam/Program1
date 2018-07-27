import java.io.*;
import java.util.*;
class Primes
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int aa=sc.nextInt();
int b=sc.nextInt();
  int a=aa+1;
while(a<b)
{
  boolean b=false;
for(int i=2;i<=a/2;i++)
{
if(a%i==0)
{
b=true;
break;
}
}
if(!b)
{
System.out.print(a);
}
a++;
}
}
}
