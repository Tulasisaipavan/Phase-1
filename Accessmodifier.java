package com.assignments;

public class Accessmodifier {
	private int add(int a, int b)
	{
		return a+b;
	}
	
	protected int sub(int a, int b)
	{
		return a-b;
	}
	
	public int mul(int a, int b)
	{
		return a*b;
	}

	public static void main(String[] args) {
		Accessmodifier a = new Accessmodifier();
		System.out.println(a.add(3,1));
		System.out.println(a.sub(3,1));
		System.out.println(a.mul(3,1));
	}
}

