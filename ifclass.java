import java.util.Scanner;
public class ifclass {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of A");
	int a=sc.nextInt();
	System.out.println("enter the value of B");
	int b=sc.nextInt();
	if(a<b)
	{
		System.out.println("b is greater");
	}
	else {
		System.out.println("a is greater");
	}
}
}
