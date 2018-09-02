public class person {

	void msg() {
		System.out.println("welcome");
	}
}
class student16 extends person{
	void msg() {
		System.out.println("welcome to java!");
	}
	void display() {
		msg();
		super.msg();
	}
	public static void main(String[] args) {
		student16 s=new student16();
		s.display();
	}
}
