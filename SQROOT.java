package assignment2;

import java.util.*;
public class SQROOT
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sq=n*n;
		int sqrt=n/2;
		int temp=0;
		while(sqrt!=temp)
		{
			temp=sqrt;
			sqrt = ( n/temp + temp) / 2;
			}
		System.out.println("SQUARE IS :"+sq+" SQUARE ROOT IS:"+sqrt);
		sc.close();
		}
}