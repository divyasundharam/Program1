import java.io.*;
import java.util.*;
class TimeHour
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[2];
int b[]=new int[2];
for(int i=0;i<2;i++)
{
a[i]=sc.nextInt();
}
for(int j=0;j<2;j++)
{
b[i]=sc.nextInt();
}
int hour=Math.abs(a[0]-b[0]);
int minute=Math.abs(a[1]-b[1]);
System.out.print(hour+" "minute);
}
}
