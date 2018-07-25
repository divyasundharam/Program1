import java.io.*;
import java.util.*;
class Palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
String s=String.valueOf(a);
StringBuffer ab=new StringBuffer(s);
String s1=String.valueOf(ab.reverse());
if(s.equals(s1))
{
System.out.print("yes");
}
else
{
System.out.print("no");
}
}
}
