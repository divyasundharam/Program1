import java.io.*;
import java.util.*;
class Vowel
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2="aeiou";
		String s3="bcdfghjklmnpqrstvwxyz";
		if(s2.contains(s1))
		{
			System.out.print("vowel");
		}
		else if(s3.contains(s1))
		{
			System.out.print("consonant");
		}
		else
		{
			System.out.print("invalid");
		}
    }
    }
