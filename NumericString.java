import java.io.*;
import util.*;
class NumericString
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
int count=0;
for(int i=0;i<s1.length();i++)
{
if(Character.isDigit(s1.charAt(i)))
{
count++;
}
}
if(count==s1.length())
{
System.out.print("yes");
}
else
{
System.out.print("No");
}
}
}
