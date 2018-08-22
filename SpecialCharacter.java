import java.io.*;
import java.util.*;
class SpecialCharacter
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
int special=0;
for(int i=0;i<s1.length();i++)
{
char ch=s1.charAt(i);
if(!Character.isLetter(ch)&&!Character.isDigit(ch))
{
special++;
}
}
System.out.print(special);
}
}
