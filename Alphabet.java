import java.io.*;
import java.util.*;
class Alpha
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char c=s.charAt(0);
if(Character.Letter(c))
{
System.out.print("Alphabet");
}
else
{
System.out.print("No");
}
}
}
