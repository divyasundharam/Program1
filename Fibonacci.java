import java.io.*;
import java.util.*;
class Fibonacci
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=1,c=0;
System.out.println(b);
for(int i=0;i<a;i++)
{
b=c+b;
c=b;
System.out.print(b);
}
}
}

