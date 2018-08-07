public class A1 {
A1 getA1() {
	return this;
}
void msg() {
	System.out.println("Hello Java");
}

class Test1{
	public void main(String args[]) {
		new A1().getA1().msg();
}
}
}
