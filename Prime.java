import java.io.*;
import java.util.*;
class Prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
boolean b=true;
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
{
b=false;
break;
}
}
if(b==true)
{
System.out.print("yes");
}
else
{
System.out.print("no");
}
}
}
