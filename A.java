public class A {

	void msg()
	{
		System.out.println("hello");
	}
}
	
class B{
	void msg()
	{
		System.out.println("welcome");
	}
}

class C extends A{
	public static void main(String args[]) {
		C obj=new C();
		obj.msg();
	}
}
