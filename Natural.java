import java.io.*;
import java.util.*;
class Natural
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int sum=0;
for(int i=1;i<=a;i++)
{
sum=sum+i;
}
System.out.print(sum);
}
}
