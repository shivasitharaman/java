import java.util.Scanner;
public class calculator {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a value");
	int a=sc.nextInt();
	System.out.println("enter b value");
	int b=sc.nextInt();
	System.out.println("1.Add 2.Sub 3.Mul 4.Div");
	int ch=sc.nextInt();
	int c;
	switch(ch)
	{
	case 1:
		c=a+b;
		System.out.println("the sum of two nos is:"+c);
		break;
	case 2:
		c=a-b;
		System.out.println("the sub of two nos is:"+c);
		break;
	case 3:
		c=a*b;
		System.out.println("the mul of two nos is:"+c);
		break;
	case 4:
		c=a/b;
		System.out.println("the div of two nos is:"+c);
		break;
	}
}
}
