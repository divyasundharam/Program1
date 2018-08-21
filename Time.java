import java.io.*;
import java.util.*;
class Time
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int minute=sc.nextInt();
if(minute<60)
{
System.out.print("0"+" "+minute);
}
else
{
int a=minute/60;
int b=a*60;
int c=minute-b;
System.out.print(a+" "+c);
}
}
}
