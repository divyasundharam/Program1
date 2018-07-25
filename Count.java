import java.io.*;
import java.util.*;
class Count
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int count=0;
String s=String.valueOf(a);
for(int i=0;i<s.length();i++)
{
char c=s.charAt(i);
if(Character.isDigit(c))
{
count=count+1;
}
}
System.out.print(count);
}
}
