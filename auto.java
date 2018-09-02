public class auto {

	int speed=50;
}
class bike3 extends auto{
	int speed=100;
	void display() {
		System.out.println(speed);
}

public static void main(String args[]) {	
	bike3 b=new bike3();
	b.display();
}
}
