import java.io.*;
import java.util.*;
class progression
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		int D=sc.nextInt();
		int sum=0;
		int add=0;
		for(int i=1;i<=N;i++)
		{
		sum=sum+A;
		add=add+sum;
		}
		System.out.print(add);
	}
}
