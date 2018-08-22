import java.io.*;
import java.util.*;
class Comparision
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String st[]=s1.split(" ");
Arrays.sort(st);
System.out.print(st[st.length-1]);
}
}
