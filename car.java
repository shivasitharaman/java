public class car {

	void run() {
		System.out.println("vehicle is running");
	}
}

class car2 extends car{
	void run() {
		System.out.println("car is running safely");
	}
public static void main(String args[]) {

	car2 obj=new car2();
	obj.run();
}
}