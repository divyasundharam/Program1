import java.io.*;
import java.util.*;
import java.lang.Math;
class Amstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int sum=0;
int d=0;
for(int i=a+1;i<b;i++)
{
String s=String.valueOf(i);
for(int j=0;j<s.length();j++)
{
int b1=Integer.parseInt(String.valueOf(s.charAt(j)));
sum=sum+(int)Math.pow(b1,3);
d=1;
}
if(i==sum)
{
System.out.println(i);
}
}
}
}
