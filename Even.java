import java.io.*;
import java.util.*;
class Even
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>=1&&a<=100000)
		{
			if(a%2==0)
			{
				System.out.print("Even");
			}
			else
			{
				System.out.print("Odd");
			}
		}
		else
		{
			System.out.print("invalid");
		}
    }
    }
		
