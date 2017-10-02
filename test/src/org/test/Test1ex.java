package org.test;

public class Test1ex {
	
	static int i=10;

	public static final void main(String[] args) {
		
		Test1 T=new Test1();
		T.increment();
		T.showvalue();

		Test1 K=new Test1();
		K.increment();
		K.showvalue();
		
		ABC.hello();
		Test1ex obj=new Test1ex();
		

	}
	static{
		System.out.println(i);
	}
	{
		System.out.println("hello");	
	}
}
