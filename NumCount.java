import java.io.*;
import java.util.*;
class NumCount
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
int count=0;
for(int i=0;i<s1.length();i++)
{
char ch=s1.charAt(i);
if(Character.isDigit(ch))
{
count++;
}
}
System.out.print(count);
}
}
