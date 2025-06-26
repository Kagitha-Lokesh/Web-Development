class Demo
{
	int a=10,b=20;
	void add()
	{
		System.out.println(a+b);
	}
	void add(int a)
	{
		System.out.println(a+b);
	}
}
class Demo1 extends Demo 
{
	void add()
	{
		//Override the add() from Demo. So output will null.

	}
	void sub()
	{
		System.out.println(b-a);
	}
}
class SimpleInheritane
{
	public static void main(String[] args)
	{
		Demo1 d = new Demo1();
		d.add();
		d.add(20);
		d.sub();
	}
}