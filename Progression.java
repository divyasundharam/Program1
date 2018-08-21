import java.io.*;
import java.util.*;
class Progression
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
		add=A+D;
		A=add;
		}
		System.out.print(add);
	}
}
