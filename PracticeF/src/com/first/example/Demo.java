package com.first.example;

public class Demo
{
	int x=20;//instance
	static String name="lina";//static
	public static void main(String[] args)
	{
		Demo obj=new Demo();
		
		System.out.println("a is "+obj.x);
		

		double salary=90000 ;//local variable
		
		
		System.out.println(name);
		System.out.println(obj.name);//object refer
		System.out.println(Demo.name);//class refer
		System.out.println(salary);

		
	}


}
