import java.io.*;
import java.util.*;
class CountingCharacter
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String st[]=s1.split(" ");
int sum=0;
for(int i=0;i<st.length;i++)
{
int a=st[i].length();
sum=sum+a;
}
System.out.print(sum);
}
}
