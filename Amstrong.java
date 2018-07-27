import java.io.*;
import java.util.*;
import java.lang.Math;
class Amstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int sum=0;
String s=String.valueOf(a);
for(int i=0;i<s.length();i++)
{
int b=Integer.parseInt(String.valueOf(s.charAt(i)));
sum=sum(int)+Math.pow(b,3);
}
if(a==sum)
{
System.out.print("yes");
}
else
{
System.out.print("no");
}
}
}
