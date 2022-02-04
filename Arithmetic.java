package com.assignments;
import java.util.Scanner;

public class Arithmetic {
	public void add( int a,int b)
	{
		   int result =a+b;
		System.out.println(" addition of two num "+result);
	}
	public void mul(int a,int b)
	{
		 int result =a*b;
		System.out.println(" multiplication  of two num "+result);
	}
	public void div(int a, int b)
	{
	     int result =a/b;
		System.out.println(" div of two num "+result);
	}
	public void sub(int a,int b)
	{
		 int result=a-b;
		System.out.println(" substraction of two num "+result);
	}
	public static void main(String[] args) {
		Arithmetic obj=new Arithmetic();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the secand num");
		int b=sc.nextInt();
		obj.add(a,b);
		obj.mul(a,b);
		obj.div(a,b);
		obj.sub(a,b);
		
	}
	
}

